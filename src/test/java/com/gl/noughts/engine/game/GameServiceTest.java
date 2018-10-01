package com.gl.noughts.engine.game;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


public class GameServiceTest {
    private GameService gameService;

    @Before
    public void setUp() {
        gameService = new GameServiceImpl();
    }

    @Test
    public void createGameReturnsGame() {
        assertThat(gameService.createGame(),is(notNullValue()));
    }
}