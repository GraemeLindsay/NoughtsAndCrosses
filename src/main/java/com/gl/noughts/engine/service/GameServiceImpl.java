package com.gl.noughts.engine.service;

import com.gl.noughts.engine.resource.Game;
import com.gl.noughts.engine.resource.Games;
import org.springframework.beans.factory.annotation.Autowired;

public class GameServiceImpl implements GameService {
    @Autowired
    private Games games;

    public Game createGame() {
        Game game = new Game();
        games.add(game);
        return game;
    }
}
