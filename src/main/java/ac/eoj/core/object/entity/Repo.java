package ac.eoj.core.object.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_repo")
public class Repo {
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
	@Column(name = "uuid", nullable = false)
	private String uuid;
}
