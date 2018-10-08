package com.gl.noughts.engine.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.hateoas.ResourceSupport;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Game extends ResourceSupport {
    private static final String[] DEFAULT_STATE =
            {null, null, null, null, null, null, null, null, null};
    private final String gameId;
    private List<String> state;

    @JsonCreator
    public Game() {
        gameId = UUID.randomUUID().toString();
        state = Arrays.asList(DEFAULT_STATE);
    }

    public String getGameId() {
        return this.gameId;
    }

    public List<String> getState() {
        return this.state;
    }
}
