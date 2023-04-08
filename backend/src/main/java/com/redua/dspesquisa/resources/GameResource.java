package com.redua.dspesquisa.resources;

import com.redua.dspesquisa.dto.GameDTO;
import com.redua.dspesquisa.repositories.GameRepository;
import com.redua.dspesquisa.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameDTO>> fidAll(){
        List<GameDTO> list = gameService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
