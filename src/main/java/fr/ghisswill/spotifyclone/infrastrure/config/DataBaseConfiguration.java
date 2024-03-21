package fr.ghisswill.spotifyclone.infrastrure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"fr.ghisswill.spotifyclone.usercontext.repository", "fr.ghisswill.spotifyclone.catalogcontext.repository"})
@EnableTransactionManagement
@EnableJpaAuditing
public class DataBaseConfiguration {
}
