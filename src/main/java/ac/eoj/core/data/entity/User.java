package ac.eoj.core.data.entity;

import ac.eoj.core.util.enums.UserRole;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ENTITY__USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Basic
	@Column(name = "email")
	private String email;

	@Basic
	@Column(name = "username")
	private String username;

	@Basic
	@Column(name = "password")
	private String password;

	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private UserRole role;
}
