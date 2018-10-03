package com.gl.noughts.engine.resource;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void gameWillHaveNonNullId() {
        Game game = new Game();
        assertThat(game.getIdString(), is(notNullValue()));
    }

}