package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Data
@AllArgsConstructor
@Component("musicTrack")
public class MusicTrack {

    private String name;
    private String author;

}
