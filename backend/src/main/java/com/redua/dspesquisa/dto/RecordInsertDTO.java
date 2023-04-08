package com.redua.dspesquisa.dto;

import com.redua.dspesquisa.entities.Game;
import com.redua.dspesquisa.entities.Platform;
import com.redua.dspesquisa.entities.Record;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecordInsertDTO implements Serializable {
    private static final long serialVersionUID = 1l;
    private Long gameId;
    private String name;
    private Integer age;

    public RecordInsertDTO(Record entity){
        gameId = entity.getId();
        name = entity.getName();
        age = entity.getAge();
    }
}
