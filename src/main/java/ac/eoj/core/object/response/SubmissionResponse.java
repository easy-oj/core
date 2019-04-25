package ac.eoj.core.object.response;

import ac.eoj.core.object.entity.Submission;
import ac.eoj.proto.common.Common;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SubmissionResponse extends BaseSubmissionResponse {
	private String compileError;
	private List<Execution> executions;

	public SubmissionResponse(Submission submission) {
		BeanUtils.copyProperties(submission, this);
		this.executions = submission.getExecutions().stream().map(Execution::new).collect(Collectors.toList());
	}

	@Data
	public static class Execution {
		private Integer cid;
		private Common.ExecutionStatus status;
		private Integer memUsed;
		private Integer timeUsed;
		private Integer extraData;

		public Execution(Submission.Execution execution) {
			BeanUtils.copyProperties(execution, this);
		}
	}
}
