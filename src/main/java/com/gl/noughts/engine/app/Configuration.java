package com.gl.noughts.engine.app;

import com.gl.noughts.engine.game.GameService;
import com.gl.noughts.engine.game.GameServiceImpl;
import com.gl.noughts.engine.game.Games;
import com.gl.noughts.engine.game.GamesImpl;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
class AppConfig {

    @Bean
    GameService gameService() { return new GameServiceImpl(); }

    @Bean
    Games games() { return new GamesImpl(); }

}
