package ac.eoj.core.object.response;

import ac.eoj.core.object.entity.Submission;
import ac.eoj.core.web.serializer.TimestampLocalDateTimeSerializer;
import ac.eoj.proto.common.Common;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class BaseSubmissionResponse {
	private Integer id;
	private Integer uid;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String username;
	private Integer pid;
	private Integer lid;
	@JsonSerialize(using = TimestampLocalDateTimeSerializer.class)
	private LocalDateTime submittedAt;
	private Common.SubmissionStatus status;

	public BaseSubmissionResponse(Submission submission) {
		BeanUtils.copyProperties(submission, this);
	}
}
