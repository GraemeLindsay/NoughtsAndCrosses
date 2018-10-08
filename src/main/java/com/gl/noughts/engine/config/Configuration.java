package com.gl.noughts.engine.config;

import com.gl.noughts.engine.resource.Games;
import com.gl.noughts.engine.resource.GamesImpl;
import com.gl.noughts.engine.service.GameService;
import com.gl.noughts.engine.service.GameServiceImpl;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
class AppConfig {

    @Bean
    GameService gameService() {
        return new GameServiceImpl();
    }

    @Bean
    Games games() {
        return new GamesImpl();
    }

}
