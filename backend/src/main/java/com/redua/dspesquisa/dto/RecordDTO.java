package com.redua.dspesquisa.dto;

import com.redua.dspesquisa.entities.Platform;
import com.redua.dspesquisa.entities.Record;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecordDTO implements Serializable {
    private static final long serialVersionUID = 1l;

    private Long id;
    private String name;
    private Integer age;
    private Instant moment;
    private String gameTitle;
    private Platform gamePlatform;
    private String genreName;

    public RecordDTO(Record entity){
        id = entity.getId();
        name = entity.getName();
        age = entity.getAge();
        moment = entity.getMoment();
        gameTitle = entity.getGame().getTitle();
        gamePlatform = entity.getGame().getPlatform();
        genreName = entity.getGame().getGenre().getName();
    }
}
