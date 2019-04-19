package ac.eoj.core.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ENTITY__LANGUAGE")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Basic
	@Column(name = "name", nullable = false)
	private String name;

	@Basic
	@Column(name = "highlight", nullable = false)
	private String highlight;

	@Basic
	@Column(name = "version", nullable = false)
	private String version;

	@Basic
	@Column(name = "template_name", nullable = false)
	private String templateName;

	@Basic
	@Column(name = "template_content", nullable = false)
	private String templateContent;

	@Basic
	@Column(name = "compile_cmd", nullable = false)
	private String compileCmd;

	@Basic
	@Column(name = "time_limit", nullable = false)
	private Integer timeLimit;

	@Basic
	@Column(name = "mem_limit", nullable = false)
	private Integer memLimit;
}
