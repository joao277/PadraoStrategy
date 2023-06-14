package com.example;

public class AcaoTypeReproduzir implements AcaoType{
    public String exec(String playerName) {
        return "Player: " + playerName + " Está reproduzindo.";
    }
}