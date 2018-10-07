package com.gl.noughts.engine.resource;

import com.gl.noughts.engine.service.GameService;
import com.gl.noughts.engine.service.GameServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GameServiceTest {
    @InjectMocks
    private GameService gameService = new GameServiceImpl();

    @Mock
    Games games;

    @Test
    public void createGameReturnsGame() {
        assertThat(gameService.createGame(),is(notNullValue()));
    }
}