package com.example;

public class AcaoTypePular implements AcaoType{
    public String exec(String playerName) {
        return "Player: " + playerName + " Deu um pulo";
    }
}