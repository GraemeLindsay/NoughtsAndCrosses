package com.gl.noughts.engine.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.hateoas.ResourceSupport;

public class GamesImpl extends ResourceSupport implements Games {
    @JsonCreator
    public GamesImpl() {

    }
}
