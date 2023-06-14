package com.example;

public class Acao {
    public String runAction(AcaoType actionType, String PlayerName){
        return actionType.exec(PlayerName);
    }
}