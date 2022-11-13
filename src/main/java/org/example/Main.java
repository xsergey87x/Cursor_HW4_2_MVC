package org.example;

import org.example.service.MusicPlayerServiceImpl;
import org.example.utils.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext contextApp = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MusicPlayerServiceImpl musicPlayer = contextApp.getBean("musicPlayer", MusicPlayerServiceImpl.class);

        System.out.println(musicPlayer.playRockMusic(0));
        System.out.println(musicPlayer.playClassicMusic(1));
    }
}