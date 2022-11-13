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
@Component("rockMusicPlayer")
public class RockPlayer {


    ArrayList<MusicTrack> rockTrackList = new ArrayList<>();

    @PostConstruct
    public void fillTrackList() {
        rockTrackList.add(new MusicTrack("Nothing else matters", "Metallica"));
        rockTrackList.add(new MusicTrack("Wind of change", "Scorpions"));
    }

    public String playTrack(int numberTrack) {
        return "Now track number" + numberTrack + "is playing" + "Track information:  " + rockTrackList.get(numberTrack);
    }
}
