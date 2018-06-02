package com.studenty.animalsforyouranimals.config;
import javax.persistence.EntityManager;

import com.studenty.animalsforyouranimals.service.HibernateSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Sławomir Wójcik on 2018-05-31.
 */
@Configuration
@EnableAutoConfiguration
public class HibernateSearchConfiguration {
    //Autowired
   // private EntityManager bentityManager;

    @Bean
    int hibernateSearchService() {
        //HibernateSearchService hibernateSearchService = new HibernateSearchService(bentityManager);
        //hibernateSearchService.initializeHibernateSearch();
        return 1;
    }
}
