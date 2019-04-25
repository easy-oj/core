package ac.eoj.core.web.security.userdetails;

import ac.eoj.core.object.entity.User;
import ac.eoj.core.web.security.WebSecurityConfiguration;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;
import java.util.Set;

@Data
public class CustomUserDetails implements UserDetails {
	private Integer id;
	private String username;
	private String password;
	private Set<GrantedAuthority> authorities;

	CustomUserDetails(User user) {
		BeanUtils.copyProperties(user, this);
		switch (user.getRole()) {
			case STUDENT:
				authorities = Collections.singleton(WebSecurityConfiguration.STUDENT_AUTHORITY);
				break;
			case STAFF:
				authorities = Collections.singleton(WebSecurityConfiguration.STAFF_AUTHORITY);
				break;
			default:
				throw new UsernameNotFoundException(username);
		}
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
