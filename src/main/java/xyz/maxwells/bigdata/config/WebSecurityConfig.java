package xyz.maxwells.bigdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.web.cors.CorsUtils;
import xyz.maxwells.bigdata.exception.RestAuthenticationAccessDeniedHandler;
import xyz.maxwells.bigdata.exception.RestAuthenticationFailureHandler;
import xyz.maxwells.bigdata.security.CustomUserService;
/**
 * Created by wuzusheng on 2018/3/9.
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Bean
    UserDetailsService customUserService(){
        return new CustomUserService();
    }
    @Bean
    AccessDeniedHandler getAccessDeniedHandler(){
        return new RestAuthenticationAccessDeniedHandler();
    }
    @Bean
    AuthenticationFailureHandler getFailureHandler(){return new RestAuthenticationFailureHandler();}
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService());
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
//                .authorizeRequests()
                .authorizeRequests()
               .antMatchers("/*").permitAll()
                .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()

//                .hasRole("USER")
                .and()
                .formLogin()
                .loginPage("/login_page")
//                登录url
                .loginProcessingUrl("/login")
                .usernameParameter("username").passwordParameter("password").permitAll()
//                登录成功后的url
                .defaultSuccessUrl("/succeed")
//                登录失败后的URl
                .failureHandler(getFailureHandler())
                .permitAll()
//                注销url及注销后续处理的url
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutsucceed").permitAll()
//                关闭csrf
                .and().csrf().disable().exceptionHandling().accessDeniedHandler(getAccessDeniedHandler());


    }
}
