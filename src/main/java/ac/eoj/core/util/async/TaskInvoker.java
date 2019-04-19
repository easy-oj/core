package ac.eoj.core.util.async;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@CommonsLog
@Component
public class TaskInvoker {
	public void invoke(Task task) {
		if (task == null) {
			return;
		}
		try {
			task.invoke();
		} catch (Exception e) {
			log.error("invoke task error: " + e.getMessage());
		}
	}

	@FunctionalInterface
	public interface Task {
		void invoke();
	}
}
