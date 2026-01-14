package com.xworkz.bloodbank.jpaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;
@Configuration
@ComponentScan(basePackages = "com.xworkz.bloodbank")
public class RedCrossConfiguration {

    @Bean
    public DataSource getDataSource() {

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springmvc");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Darshu@9019");
        return driverManagerDataSource;

    }
    public Properties getJpaProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        properties.setProperty("hibernate.show_sql", "true");
properties.setProperty("hibernate.hbm2ddl.auto","update");
        return properties;


    }
    @Bean
    public LocalContainerEntityManagerFactoryBean getEntitiFactoryBean(){
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean=new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(getDataSource());
        localContainerEntityManagerFactoryBean.setPackagesToScan("com.xworkz.bloodbank.entity");
        localContainerEntityManagerFactoryBean.setJpaProperties(getJpaProperties());
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return localContainerEntityManagerFactoryBean;
    }


}
