package ac.eoj.core.service;

import ac.eoj.core.data.dao.CaseDAO;
import ac.eoj.core.object.CaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CaseService {
	private final CaseDAO caseDAO;

	@Autowired
	public CaseService(CaseDAO caseDAO) {
		this.caseDAO = caseDAO;
	}

	public List<CaseVO> retrieveExampleByPid(int pid) {
		return caseDAO.findByPidAndExampleTrue(pid).stream().map(CaseVO::new).collect(Collectors.toList());
	}
}
