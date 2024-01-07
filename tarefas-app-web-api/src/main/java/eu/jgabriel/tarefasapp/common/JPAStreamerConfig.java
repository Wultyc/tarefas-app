package eu.jgabriel.tarefasapp.common;

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JPAStreamerConfig {

    private final EntityManagerFactory entityManagerFactory;

    @Autowired
    public JPAStreamerConfig(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Bean
    public JPAStreamer jpaStreamer() {
        return JPAStreamer.of(entityManagerFactory);
    }

}