package com.gl.noughts.engine.app;

import com.gl.noughts.engine.game.GamesImpl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class GamesController {
    @RequestMapping(path="/games", method = RequestMethod.GET)
    public HttpEntity<GamesImpl> viewGames() {
        GamesImpl games = new GamesImpl();

        games.add(linkTo(methodOn(GamesController.class).viewGames()).withSelfRel());
        return new ResponseEntity<>(games, HttpStatus.OK);
    }
}
