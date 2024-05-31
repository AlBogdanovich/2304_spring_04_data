package by.itclass._02_spring_jpa.config;

import by.itclass._02_spring_jpa.entities.Airplane;
import by.itclass._02_spring_jpa.entities.Passenger;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.util.List;

@EnableJpaRepositories(basePackages = "by.itclass._02_spring_jpa.repositories")
public class AppConfig {
    @Bean
    public JpaVendorAdapter vendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean factory(JpaVendorAdapter vendorAdapter) {
        var container = new LocalContainerEntityManagerFactoryBean();
        container.setJpaVendorAdapter(vendorAdapter);
        container.setPackagesToScan("by.itclass._02_spring_jpa.entities");
        return container;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        var transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

    @Bean
    public Airplane boeing736() {
        return new Airplane("Boeing-736", 150);
    }
    @Bean
    public List<Passenger> passengers() {
        return List.of(
                new Passenger("Vasia Pupkin"),
     new Passenger("Ivan Dulin"),
        new Passenger("Rafshan Ibragimov")
                );
    }
}
