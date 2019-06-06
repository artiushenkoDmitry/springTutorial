package com.artiushenko.springTutorial.configuration;

import com.artiushenko.springTutorial.*;
import com.artiushenko.springTutorial.interfaces.Performer;
import com.artiushenko.springTutorial.interfaces.Poem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringTutorialConfig {

    @Bean
    public Performer duke(){
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }

    @Bean
    public Audience audience(){
        Audience audience = new Audience();
        return audience;
    }

//    @Bean
//    public Poem sonnet29(){
//        return new Sonnet29();
//    }
//
//    @Bean
//    public Performer poeticDuke(){
//        return new PoeticJuggler(sonnet29());
//    }
}
