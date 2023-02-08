package com.rohit.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class HospitalSecurity extends WebSecurityConfigurerAdapter
{
    private static final String[] AUTH_WHITE_LIST = {
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/v2/api-docs/**",
            "/swagger-resources/**"
    };
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.POST,"/doctor/save").hasAnyRole("user")
                .antMatchers(HttpMethod.GET,"/doctor/doctorappointment").hasAnyRole("user")
                .antMatchers(HttpMethod.POST,"/patient/Save").hasAnyRole("user")
                .antMatchers(HttpMethod.GET,"/patient/myappointment").hasAnyRole("user")
                .antMatchers(HttpMethod.POST,"/prescription/saveprescription").hasAnyRole("user")
                .antMatchers(HttpMethod.GET,"/prescription/viewprescription").hasAnyRole("user")
                .antMatchers(AUTH_WHITE_LIST).permitAll().and().csrf().disable().headers()
                .frameOptions().disable();
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication().withUser("user123").password("{noop}password").roles("user");
    }
}
