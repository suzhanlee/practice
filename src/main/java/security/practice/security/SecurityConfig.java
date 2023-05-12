package security.practice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .httpBasic().disable()
            .csrf().disable()
            .authorizeHttpRequests().anyRequest().authenticated();

        http.formLogin()
            .permitAll();

        return http.build();

    }

//    @Bean
//    JsonUsernamePasswordAuthenticationFilter jsonUsernamePasswordAuthenticationFilter() {
//        return new JsonUsernamePasswordAuthenticationFilter();
//    }
//
//    @Bean
//    UsernamePasswordAuthenticationFilter usernamePasswordAuthenticationFilter() {
//        return new UsernamePasswordAuthenticationFilter();
//    }

}
