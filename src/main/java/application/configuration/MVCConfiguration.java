package application.configuration;

import application.controllers.Echo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Стрела on 24.01.2017.
 */
@Configuration
@EnableWebMvc //(как раз не optional, а required  )
public class MVCConfiguration {
    /*@Bean
    public Echo createBean(){
        return new Echo();
    }*/
}
