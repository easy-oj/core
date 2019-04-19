package ac.eoj.core.data.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import ac.eoj.core.data.converter.LidLimitMapConverter;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;

@Data
@Entity
@Table(name = "ENTITY__PROBLEM")
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
	private Integer submittedCount;

	@Basic
	@Column(name = "accepted_count", nullable = false)
	private Integer acceptedCount;

	@Data
	@NoArgsConstructor
	public static class Limit {
		@JsonProperty("time_limit")
		private Integer timeLimit;
		@JsonProperty("mem_limit")
		private Integer memLimit;
	}
}
