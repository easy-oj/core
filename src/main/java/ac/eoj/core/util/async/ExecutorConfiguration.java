package ac.eoj.core.util.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Configuration
@EnableScheduling
public class ExecutorConfiguration {
	private static final int PROCESSOR_THREAD = Runtime.getRuntime().availableProcessors();
	private static final int MAX_THREAD = 16;

	@Bean
	public ScheduledExecutorService scheduledExecutorService() {
		return Executors.newScheduledThreadPool(Math.min(2 * PROCESSOR_THREAD, MAX_THREAD));
	}
}
