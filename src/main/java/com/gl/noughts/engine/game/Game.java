package com.gl.noughts.engine.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.hateoas.ResourceSupport;

import java.util.UUID;

public class Game extends ResourceSupport {
    private final String id;

    @JsonCreator
    public Game() {
        id = UUID.randomUUID().toString();
    }

    public String getLink() {
        return "http://localhost:8080/game?id="+this.id;
    }

    public String getScore() {return "The sccore is 100";}

//    public String getId() {
//        return this.id;
//    }
}
