package com.artiushenko.springTutorial.configuration;

import com.artiushenko.springTutorial.Instrumentalist;
import com.artiushenko.springTutorial.Juggler;
import com.artiushenko.springTutorial.PoeticJuggler;
import com.artiushenko.springTutorial.Sonnet29;
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
