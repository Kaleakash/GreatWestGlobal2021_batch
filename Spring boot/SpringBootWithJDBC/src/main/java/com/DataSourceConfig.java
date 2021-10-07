//package com;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DataSourceConfig {
//	    @Bean
//	    public DataSource datasource() {
//	        return DataSourceBuilder.create()
//	          .driverClassName("oracle.jdbc.driver.OracleDriver")
//	          .url("jdbc:oracle:thin:@localhost:1521/orcl")
//	          .username("scott")
//	          .password("tiger")
//	          .build();	
//	    }
//	}
//
