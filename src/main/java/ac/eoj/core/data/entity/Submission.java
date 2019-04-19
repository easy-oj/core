package ac.eoj.core.data.entity;

import ac.eoj.core.data.converter.ExecutionListConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import ac.eoj.proto.common.Common;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "ENTITY__SUBMISSION")
public class Submission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Basic
	@Column(name = "uid", nullable = false)
	private Integer uid;

	@Basic
	@Column(name = "pid", nullable = false)
	private Integer pid;

	@Basic
	@Column(name = "lid", nullable = false)
	private Integer lid;

	@Basic
	@Column(name = "rid", nullable = false)
	private Integer rid;

	@Basic
	@Column(name = "submitted_at", nullable = false)
	private LocalDateTime submittedAt;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false)
	private Common.SubmissionStatus status;

	@Basic
	@Column(name = "compile_error", nullable = false)
	private String compileError;

	@Basic
	@Column(name = "executions", columnDefinition = "JSON NOT NULL")
	@Convert(converter = ExecutionListConverter.class)
	private List<Execution> executions;

	@Data
	public static class Execution {
		private Integer cid;
		private Common.ExecutionStatus status;
		@JsonProperty("mem_used")
		private Integer memUsed;
		@JsonProperty("time_used")
		private Integer timeUsed;
		@JsonProperty("extra_data")
		private Integer extraData;
	}
}
