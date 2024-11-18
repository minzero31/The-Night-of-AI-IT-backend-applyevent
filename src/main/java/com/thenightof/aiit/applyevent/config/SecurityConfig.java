package com.thenightof.aiit.applyevent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // CORS를 위한 설정 추가
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // 모든 엔드포인트에 대해
                        .allowedOrigins("http://localhost:3000")  // React 앱이 실행되는 주소
                        .allowedMethods("GET", "POST", "PUT", "DELETE")  // 허용할 HTTP 메소드
                        .allowCredentials(true);  // 자격 증명(COOKIE 등)을 허용할지 여부
            }
        };
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .anyRequest().permitAll()  // 모든 요청에 대해 인증 없이 접근 허용
                .and()
                .cors();  // CORS 설정 활성화

        return http.build();
    }
}
