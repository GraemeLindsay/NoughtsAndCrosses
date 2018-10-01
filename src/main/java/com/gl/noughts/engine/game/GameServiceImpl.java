package com.gl.noughts.engine.game;

import org.springframework.stereotype.Component;

public class GameServiceImpl implements GameService {
    public Game createGame() {
        return new Game();
    }
}
