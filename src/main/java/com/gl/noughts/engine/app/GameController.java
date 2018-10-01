package com.gl.noughts.engine.app;

import com.gl.noughts.engine.game.Game;
import com.gl.noughts.engine.game.GameService;
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
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping(path="/game", method = RequestMethod.POST)
    public HttpEntity<Game> createGame() {
        Game game = gameService.createGame();

        game.add(linkTo(methodOn(GamesController.class).viewGames()).withSelfRel());
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @RequestMapping(path="/game", method = RequestMethod.GET)
    public HttpEntity<Game> viewGame() {
        Game game = new Game();

        game.add(linkTo(methodOn(GamesController.class).viewGames()).withSelfRel());
        return new ResponseEntity<>(game, HttpStatus.OK);
    }
}
