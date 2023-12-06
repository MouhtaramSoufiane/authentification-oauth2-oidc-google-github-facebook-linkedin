package ma.esnet.inventoryservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig {
    private JwtAuthConverter jwtAuthConverter;

    public SecurityConfig(JwtAuthConverter jwtAuthConverter) {
        this.jwtAuthConverter = jwtAuthConverter;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(ar->ar.requestMatchers("/h2-console/**").permitAll())
                .oauth2ResourceServer(ol->ol.jwt(jwt->jwt.jwtAuthenticationConverter(jwtAuthConverter)))
                .headers(hd->hd.frameOptions(fo->fo.disable()))

                .csrf(cs->cs.ignoringRequestMatchers("/h2-console/**").disable())
                .authorizeHttpRequests(ar-> ar.anyRequest().authenticated())


                .build();
    }
}
