package ac.eoj.core.service;

import ac.eoj.core.caller.ReposClient;
import ac.eoj.core.data.cache.CacheHolder;
import ac.eoj.core.data.dao.ProblemDAO;
import ac.eoj.core.data.dao.RepoDAO;
import ac.eoj.core.data.dao.SubmissionDAO;
import ac.eoj.core.data.entity.Language;
import ac.eoj.core.data.entity.Repo;
import ac.eoj.core.object.SubmissionVO;
import ac.eoj.core.util.Assert;
import ac.eoj.core.web.request.SubmitRequest;
import ac.eoj.proto.base.Base;
import ac.eoj.proto.repos.Repos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class CodeService {
	private static final String PATH_PREFIX = "/";

	private final ProblemDAO problemDAO;
	private final RepoDAO repoDAO;
	private final SubmissionDAO submissionDAO;
	private final CacheHolder cacheHolder;
	private final ReposClient reposClient;

	@Autowired
	public CodeService(ProblemDAO problemDAO, RepoDAO repoDAO, SubmissionDAO submissionDAO, CacheHolder cacheHolder, ReposClient reposClient) {
		this.problemDAO = problemDAO;
		this.repoDAO = repoDAO;
		this.submissionDAO = submissionDAO;
		this.cacheHolder = cacheHolder;
		this.reposClient = reposClient;
	}

	public String fetch(int uid, int pid, int lid) {
		Assert.notNull(problemDAO.findById(pid));
		Language language = cacheHolder.getLanguageMap().get(lid);
		Assert.notNull(language);
		Repo repo = repoDAO.findByUidAndPidAndLid(uid, pid, lid);
		if (repo == null) {
			return language.getTemplateContent();
		}
		Repos.FetchRepoReq req = Repos.FetchRepoReq.newBuilder()
				.setBaseReq(Base.BaseReq.newBuilder().build())
				.setUuid(repo.getUuid()).build();
		Repos.FetchRepoResp resp = reposClient.fetchRepo(req);
		String path = PATH_PREFIX + language.getTemplateName();
		return resp.getContentMap().getOrDefault(path, language.getTemplateContent());
	}

	public SubmissionVO submit(int uid, SubmitRequest submitRequest) {
		int pid = submitRequest.getPid(), lid = submitRequest.getLid();
		Assert.notNull(problemDAO.findById(pid));
		Language language = cacheHolder.getLanguageMap().get(lid);
		Assert.notNull(language);
		String path = PATH_PREFIX + language.getTemplateName();
		Map<String, String> content = Collections.singletonMap(path, submitRequest.getContent());
		Repo repo = repoDAO.findByUidAndPidAndLid(uid, pid, lid);
		if (repo != null) {
			Repos.UpdateRepoReq req = Repos.UpdateRepoReq.newBuilder()
					.setBaseReq(Base.BaseReq.newBuilder().build())
					.setUuid(repo.getUuid()).putAllContent(content).build();
			Repos.UpdateRepoResp resp = reposClient.updateRepo(req);
			return new SubmissionVO(submissionDAO.findById(resp.getSid()));
		}
		Repos.CreateRepoReq req = Repos.CreateRepoReq.newBuilder()
				.setBaseReq(Base.BaseReq.newBuilder().build())
				.setUid(uid).setPid(pid).setLid(lid).putAllContent(content).build();
		Repos.CreateRepoResp resp = reposClient.createRepo(req);
		return new SubmissionVO(submissionDAO.findById(resp.getSid()));
	}
}
