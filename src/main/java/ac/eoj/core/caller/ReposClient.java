package ac.eoj.core.caller;

import ac.eoj.proto.repos.Repos;
import ac.eoj.proto.repos.ReposServiceGrpc;
import ac.eoj.core.util.settings.Settings;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.concurrent.TimeUnit;

@Component
@CommonsLog
public class ReposClient {
	private final ManagedChannel channel;
	private final ReposServiceGrpc.ReposServiceBlockingStub stub;

	@Autowired
	protected ReposClient() {
		String target = Settings.REPOS.hosts[0] + ":" + Settings.REPOS.port;
		channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
		stub = ReposServiceGrpc.newBlockingStub(channel);
	}

	public Repos.CreateRepoResp createRepo(Repos.CreateRepoReq req) {
		return stub.createRepo(req);
	}

	public Repos.FetchRepoResp fetchRepo(Repos.FetchRepoReq req) {
		return stub.fetchRepo(req);
	}

	public Repos.UpdateRepoResp updateRepo(Repos.UpdateRepoReq req) {
		return stub.updateRepo(req);
	}

	@PreDestroy
	public void destroy() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
}
