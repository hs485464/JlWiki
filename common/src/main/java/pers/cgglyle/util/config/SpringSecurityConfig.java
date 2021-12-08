package pers.cgglyle.util.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author cgglyle
 * @date 2021/12/7
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()// 对请求授权
                .antMatchers("/doc.html"
                        ,"/webjars/**"
                        ,"/img.icons/**"
                        ,"/**"
                        ,"/swagger-resources/**"
                        ,"/v2/api-docs").permitAll()
                .anyRequest() // 任何请求
                .authenticated()// 需要身份认证
                .and().csrf().disable();
    }
}