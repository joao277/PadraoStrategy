package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldBeCallRunActionPlayer(){
        Player player = new Player("Douglas");
        player.correr();
        assertEquals("Player: Douglas Está correndo", player.getLastAction());
    }

    @Test
    void shouldBeCallJumpActionPlayer(){
        Player player = new Player("XxRodriguingoxX");
        player.pular();
        assertEquals("Player: XxRodriguingoxX Deu um pulo", player.getLastAction());
    }

    @Test
    void shouldBeCallSleepActionPlayer(){
        Player player = new Player("Douglas");
        player.reproduzir();
        assertEquals("Player: Douglas Está reproduzindo.", player.getLastAction());
    }
}