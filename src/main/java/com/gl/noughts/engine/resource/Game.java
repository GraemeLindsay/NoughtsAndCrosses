package com.gl.noughts.engine.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import java.util.UUID;

public class Game extends ResourceSupport {
    private final String id;

    @JsonCreator
    public Game() {
        id = UUID.randomUUID().toString();
    }

    public Link getId() { return Link.valueOf(this.id); }

    public String getLink() {
        return "http://localhost:8080/game?id="+this.id;
    }

    public String getScore() {return "The sccore is 100";}

    @JsonIgnore
    public String getIdString() {
        return this.id;
    }
}
