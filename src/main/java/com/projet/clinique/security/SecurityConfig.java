package com.projet.clinique.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource datasourceBean;
		

	public DataSource getDatasourceBean() {
		return datasourceBean;
	}

	public void setDatasourceBean(DataSource datasourceBean) {
		this.datasourceBean = datasourceBean;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(datasourceBean).
		usersByUsernameQuery(" select username , password , activated , id_role from users where username=?").
		authoritiesByUsernameQuery(
				" select u.username , r.rolename from users u , roles r where u.id_role = r.id_role and u.username=?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.httpBasic().and().authorizeRequests().
		antMatchers("/HeadMaster").hasAuthority("MASTER");
		http.formLogin().loginPage("/login").passwordParameter("password").
		usernameParameter("username").defaultSuccessUrl("/").failureUrl("/erreur");
	}	

}
