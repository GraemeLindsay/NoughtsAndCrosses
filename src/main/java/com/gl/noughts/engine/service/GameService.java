package com.gl.noughts.engine.service;

import com.gl.noughts.engine.resource.Game;

public interface GameService {
    Game createGame();

    Game getGame(String id);
}
