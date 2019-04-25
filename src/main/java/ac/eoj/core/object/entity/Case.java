package ac.eoj.core.object.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_case")
public class Case {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Basic
	@Column(name = "pid", nullable = false)
	private Integer pid;

	@Basic
	@Column(name = "example", nullable = false)
	private Boolean example;

	@Basic
	@Column(name = "input", nullable = false, columnDefinition = "TEXT NOT NULL")
	private String input;

	@Basic
	@Column(name = "output", nullable = false, columnDefinition = "TEXT NOT NULL")
	private String output;
}
