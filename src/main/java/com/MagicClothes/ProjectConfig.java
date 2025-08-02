package com.MagicClothes;

import org.springframework.context.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

@Configuration
@EnableWebSecurity
public class ProjectConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Exponer el AuthenticationManager para que puedas inyectarlo en servicios si lo necesitas
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(auth -> auth
            .requestMatchers(
                "/", 
                "/index/", 
                "/login", 
                "/registro/**", 
                "/camisas/**", 
                "/detalles/**", 
                "/css/**", 
                "/js/**", 
                "/images/**",
                "/pantalones/**",
                "/vestidos/**",
                "/contacto/**",
                "/oferta-mujer/**",
                "/accesorios/**",
                "/webjars/**"
            ).permitAll()
            .anyRequest().authenticated()
        )
        .formLogin(form -> form
            .loginPage("/login")
            .permitAll()
        )
        .logout(logout -> logout.permitAll())
        .csrf(csrf -> csrf.disable());  // Solo si usas API REST o tienes problemas con CSRF

    return http.build();
}
}