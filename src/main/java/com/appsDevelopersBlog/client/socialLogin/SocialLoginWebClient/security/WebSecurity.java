package com.appsDevelopersBlog.client.socialLogin.SocialLoginWebClient.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurity {
    @Bean
    public SecurityFilterChain configure(HttpSecurity httpSecurity)  throws Exception{
        httpSecurity.authorizeHttpRequests(authorizeRequests ->
                authorizeRequests
                        .requestMatchers(new AntPathRequestMatcher("/"))
                        .permitAll()
                        .anyRequest()
                        .authenticated()
        ).oauth2Client(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
//