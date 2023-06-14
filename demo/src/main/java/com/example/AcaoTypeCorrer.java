package com.example;

public class AcaoTypeCorrer implements AcaoType{
    public String exec(String playerName) {
        return "Player: " + playerName + " Está correndo";
    }
}