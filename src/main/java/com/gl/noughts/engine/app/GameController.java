package com.gl.noughts.engine.app;

import com.gl.noughts.engine.resource.Game;
import com.gl.noughts.engine.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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

        game.add(linkTo(methodOn(GameController.class).viewGame(game.getGameId())).withSelfRel());
        return new ResponseEntity<>(game, HttpStatus.CREATED);
    }

    @RequestMapping(path="/game/{id}", method = RequestMethod.GET)
    public HttpEntity<Game> viewGame(@PathVariable("id") String id) {
        Game game = gameService.getGame(id);
        if (game == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        game.add(linkTo(methodOn(GamesController.class).viewGames()).withSelfRel());
        return ResponseEntity.status(HttpStatus.OK).body(game);
    }
}
