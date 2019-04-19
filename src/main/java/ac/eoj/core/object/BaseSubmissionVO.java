package ac.eoj.core.object;

import ac.eoj.core.data.entity.Submission;
import ac.eoj.core.web.serializer.TimestampLocalDateTimeSerializer;
import ac.eoj.proto.common.Common;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class BaseSubmissionVO {
	private Integer id;
	private Integer uid;
	private Integer pid;
	private Integer lid;
	@JsonSerialize(using = TimestampLocalDateTimeSerializer.class)
	private LocalDateTime submittedAt;
	private Common.SubmissionStatus status;

	public BaseSubmissionVO(Submission submission) {
		BeanUtils.copyProperties(submission, this);
	}
}
