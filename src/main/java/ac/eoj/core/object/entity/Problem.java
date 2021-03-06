package ac.eoj.core.object.entity;

import ac.eoj.core.data.converter.LidLimitMapConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;

@Data
@Entity
@Table(name = "tb_problem")
public class Problem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Basic
	@Column(name = "name", unique = true, nullable = false)
	private String name;

	@Basic
	@Column(name = "description", nullable = false, columnDefinition = "TEXT NOT NULL")
	private String description;

	@Basic
	@Column(name = "special_limits", columnDefinition = "JSON NOT NULL")
	@Convert(converter = LidLimitMapConverter.class)
	private Map<Integer, Limit> specialLimits;

	@Basic
	@Column(name = "submitted_count", nullable = false)
	private Integer submittedCount = 0;

	@Basic
	@Column(name = "accepted_count", nullable = false)
	private Integer acceptedCount = 0;

	@Data
	@NoArgsConstructor
	public static class Limit {
		@JsonProperty("time_limit")
		private Integer timeLimit;
		@JsonProperty("mem_limit")
		private Integer memLimit;
	}
}
