package com.redua.dspesquisa.dto;

import com.redua.dspesquisa.entities.Game;
import com.redua.dspesquisa.entities.Platform;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameDTO implements Serializable {
    private static final long serialVersionUID = 1l;
    private Long id;
    private String title;
    private Platform platform;

    public GameDTO(Game entity){
        id = entity.getId();
        title = entity.getTitle();
        platform = entity.getPlatform();
    }
}
