package com.gl.noughts.engine.app;

import com.gl.noughts.engine.resource.Games;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamesController {
    @Autowired
    Games games;

    @Autowired (required = false)
    private Logger logger;

    @RequestMapping(path="/games", method = RequestMethod.GET)
    public HttpEntity<Games> viewGames() {
        logger.debug("Requesting games");

        games.getList();
        logger.debug("Returning " + games.getList().size() + " games");
//        games.add(linkTo(methodOn(GamesController.class).viewGames()).withSelfRel());
        return new ResponseEntity<>(games, HttpStatus.OK);
    }
}
