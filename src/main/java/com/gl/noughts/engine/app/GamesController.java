package com.gl.noughts.engine.app;

import com.gl.noughts.engine.resource.Games;
import com.gl.noughts.engine.resource.GamesImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    Games games;

    @RequestMapping(path="/games", method = RequestMethod.GET)
    public HttpEntity<Games> viewGames() {

        games.getList();
//        games.add(linkTo(methodOn(GamesController.class).viewGames()).withSelfRel());
        return new ResponseEntity<>(games, HttpStatus.OK);
    }
}
