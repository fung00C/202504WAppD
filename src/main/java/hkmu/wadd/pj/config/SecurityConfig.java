package hkmu.wadd.pj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public UserDetailsService jdbcUserDetailsService() {
        String usersByUsernameQuery
                = "SELECT username, password, true FROM users WHERE username=?";
        String authsByUsernameQuery
                = "SELECT username, role FROM user_roles WHERE username=?";
        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
        users.setUsersByUsernameQuery(usersByUsernameQuery);
        users.setAuthoritiesByUsernameQuery(authsByUsernameQuery);
        return users;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)
            throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        //.requestMatchers("/editPolling", "/editPolling/**", "/addComment", "/editMaterial", "/editMaterial/**", "/addLecture", "/removeLecture", "addUser").hasRole("ADMIN")
                        //.requestMatchers("/mc","/mcerror","/votesuccess","/mc/vote", "/", "/index", "/upload", "/lectures", "/lectures/**").hasRole("USER")

                        .requestMatchers( "/mc","/mcerror","/votesuccess","/mc/vote").hasAnyRole("USER", "ADMIN")
                        .requestMatchers("/", "/download/**", "/index", "/upload", "/register", "/lectures", "/lectures/**", "/editMaterial", "/editMaterial/**", "/addLecture", "/editPolling", "/editPolling/**", "/addComment").permitAll()
                        .requestMatchers("register").permitAll()
                        .anyRequest().permitAll()
                )
                .formLogin(form -> form
                        .loginPage("/index")
                        .loginProcessingUrl("/perform_login") // Explicitly set the login processing URL
                        .defaultSuccessUrl("/index", true)
                        .failureUrl("/index?error")
                        .usernameParameter("username")
                        .passwordParameter("password")
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/index?logout")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                        .permitAll()
                )
                .httpBasic(withDefaults());
        return http.build();
    }
}