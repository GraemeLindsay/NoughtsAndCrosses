package com.gl.noughts.engine.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GamesImpl extends ResourceSupport implements Games {

    Map<String,Game> games = new HashMap<>();

    @JsonCreator
    public GamesImpl() {

    }

    public List<Game> getList() {
        return new ArrayList<Game>(this.games.values());
    }

    @Override
    public void add(Game game) {
        this.games.put(game.getIdString(), game);
    }
}
