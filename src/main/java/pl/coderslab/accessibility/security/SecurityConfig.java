package pl.coderslab.accessibility.security;

import  org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pl.coderslab.accessibility.service.SpringDataUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN")
                .and()
                .withUser("inst")
                .password("inst")
                .roles("USER");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/addQuestion").hasRole("ADMIN")
                .antMatchers("/institutions/add").hasAnyRole("USER","ADMIN")
                .antMatchers("/institutions/answers").hasAnyRole("USER","ADMIN")
                .antMatchers("/register").permitAll()
                .antMatchers("/").permitAll()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/user").hasAnyRole("USER","ADMIN")

                .and().formLogin().loginPage("/login")
                .and().logout().logoutSuccessUrl("/").permitAll();
    }

    @Bean
    public SpringDataUserDetailsService customUserDetailsService() {
        return new SpringDataUserDetailsService();
    } //bean ktory wstrzykiwany jest do znalezienia usera w NASZEJ bazie danych


    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    } //bean do szyfrowania hasla usera rejestrujacego sie
}