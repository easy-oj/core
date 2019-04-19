package ac.eoj.core.web.security;

import ac.eoj.core.web.security.authentication.AuthenticationHandler;
import ac.eoj.core.web.security.authentication.CustomAuthenticationEntryPoint;
import ac.eoj.core.web.security.userdetails.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.AuthenticationEntryPoint;

import static ac.eoj.core.web.WebConfiguration.API_PREFIX;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	private static final String ROLE_PREFIX = "ROLE_";

	public static final String STUDENT_ROLE = "STUDENT";
	public static final String STAFF_ROLE = "STAFF";

	public static final GrantedAuthority STUDENT_AUTHORITY = new SimpleGrantedAuthority(ROLE_PREFIX + STUDENT_ROLE);
	public static final GrantedAuthority STAFF_AUTHORITY = new SimpleGrantedAuthority(ROLE_PREFIX + STAFF_ROLE);

	private final AuthenticationHandler authenticationHandler;
	private final AuthenticationEntryPoint authenticationEntryPoint;
	private final UserDetailsService userDetailsService;

	@Autowired
	public WebSecurityConfiguration(AuthenticationHandler authenticationHandler, CustomAuthenticationEntryPoint authenticationEntryPoint, CustomUserDetailsService userDetailsService) {
		this.authenticationHandler = authenticationHandler;
		this.authenticationEntryPoint = authenticationEntryPoint;
		this.userDetailsService = userDetailsService;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers(API_PREFIX + "/register").permitAll()
				.antMatchers(API_PREFIX + "/**").authenticated()
				.anyRequest().permitAll()
				.and()
				.exceptionHandling()
				.authenticationEntryPoint(authenticationEntryPoint)
				.and()
				.formLogin()
				.loginProcessingUrl(API_PREFIX + "/authenticate").permitAll()
				.successHandler(authenticationHandler)
				.failureHandler(authenticationHandler)
				.and()
				.rememberMe()
				.rememberMeParameter("remember")
				.userDetailsService(userDetailsService)
				.rememberMeCookieName("REMEMBER")
				.tokenValiditySeconds(7 * 24 * 60 * 60)
				.useSecureCookie(true)
				.and()
				.csrf().disable()
				.cors();
	}
}
