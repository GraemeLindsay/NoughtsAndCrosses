package com.gl.noughts.engine.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.hateoas.ResourceSupport;

import java.util.UUID;

public class Game extends ResourceSupport {
    private final String gameId;

    @JsonCreator
    public Game() {
        gameId = UUID.randomUUID().toString();
    }

    public String getGameId() {
        return this.gameId;
    }
}
