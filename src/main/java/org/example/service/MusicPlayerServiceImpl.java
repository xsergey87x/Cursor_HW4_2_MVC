package org.example.service;

import lombok.ToString;
import org.springframework.stereotype.Service;

@ToString
@Service("musicPlayer")
public class MusicPlayerServiceImpl implements MusicPlayerService {

    public MusicPlayerServiceImpl(ClassicPlayer classicalPlayerService, RockPlayer rockPlayerService) {
        this.classicalPlayerService = classicalPlayerService;
        this.rockPlayerService = rockPlayerService;
    }

    private final ClassicPlayer classicalPlayerService;
    private final RockPlayer rockPlayerService;


    @Override
    public String playClassicMusic(int trackNumber) {
        return classicalPlayerService.playTrack(trackNumber);
    }

    @Override
    public String playRockMusic(int trackNumber) {
        return rockPlayerService.playTrack(trackNumber);
    }


}
