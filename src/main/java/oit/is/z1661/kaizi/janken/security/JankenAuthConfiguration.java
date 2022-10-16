package oit.is.z1661.kaizi.janken.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class JankenAuthConfiguration {
  /**
   * @return
   */
  @Bean
  public InMemoryUserDetailsManager userDetailsService() {
    UserBuilder users = User.builder();

    UserDetails user1 = users
        .username("user1")
        .password("$2y$10$scGjOiWt9VrOeOqUeKJ1mukvTBTkxa/yYm3iMx2PmjlrcLxmLiP3C")
        .roles("USER")
        .build();

    UserDetails user2 = users
        .username("user2")
        .password("$2y$10$/TOf0aFl4W56lgzyzBbwNONW8pj5Xn8BGg1rnSgiw/Emn5btkIGc.")
        .roles("USER")
        .build();

    return new InMemoryUserDetailsManager(user1, user2);
  }

  /**
   * @param http
   * @return
   * @throws Exception
   */
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.formLogin();
    http.authorizeHttpRequests()
        .mvcMatchers("/janken/**").authenticated();

    http.logout().logoutSuccessUrl("/");
    return http.build();
  }

  /**
   * @return
   */
  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
