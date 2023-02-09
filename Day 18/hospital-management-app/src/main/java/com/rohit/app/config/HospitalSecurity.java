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
                .antMatchers(HttpMethod.POST,"/doctor/save").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.GET,"/doctor/doctorappointment").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.POST,"/patient/Save").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.GET,"/patient/myappointment").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.POST,"/prescription/saveprescription").hasAnyRole("DOCTOR","PATIENT")
                .antMatchers(HttpMethod.GET,"/prescription/viewprescription").hasAnyRole("DOCTOR","PATIENT")
                .antMatchers(AUTH_WHITE_LIST).hasAnyRole("DOCTOR","PATIENT").and().csrf().disable().headers()
                .frameOptions().disable();
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication().withUser("Doctor1").password("{noop}password").roles("DOCTOR").and()
                //.withUser("Doctor2").password("{noop}password").roles("DOCTOR").and()
                .withUser("Patient1").password("{noop}password")
                .roles("PATIENT");//withUser("Patient2").password("{noop}password").roles("PATIENT");
    }
}
