package com.gl.noughts.engine.resource;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class GameTest {

    @Test
    public void gameWillHaveNonNullId() {
        Game game = new Game();
        assertThat(game.getGameId(), is(notNullValue()));
    }

    @Test
    public void gameIdIsValidUUID() {
        Game game = new Game();
        assertThat(game.getGameId(), is(validUUID()));
    }

    @Test
    public void gameInitialStateIsAllNulls() {
        Game game = new Game();
        assertThat(game.getState(), is(equalTo(
                Arrays.asList(
                        null, null, null,
                        null, null, null,
                        null, null, null)
        )));
    }

    private BaseMatcher validUUID() {
        return new BaseMatcher() {

            @Override
            public void describeTo(Description description) {
                description.appendText("valid UUID string");
            }

            @Override
            public boolean matches(Object item) {
                String regex = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";
                return ((String)item).matches(regex);
            }
        };
    }

}