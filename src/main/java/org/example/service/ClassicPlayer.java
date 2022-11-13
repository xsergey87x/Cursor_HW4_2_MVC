package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.example.model.MusicTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@ToString
@Data
@AllArgsConstructor
@Component("classicMusicPlayer")
public class ClassicPlayer {


    ArrayList<MusicTrack> classicTrackList = new ArrayList<>();

    @PostConstruct
    public void fillTrackList() {
        classicTrackList.add(new MusicTrack("Ноктюрн 2", "Шопен"));
        classicTrackList.add(new MusicTrack("Симфония номер 5", "Бетховен"));
    }

    public String playTrack(int numberTrack) {
        return "Now track number" + numberTrack + "is playing" + "Track information:  " + classicTrackList.get(numberTrack);
    }
}
