package com.example;

public class Player {

    private String name;
    private String lastAction;

    public String getName(){
        return this.name;
    }

    public String getLastAction(){
        return this.lastAction;
    }

    public Player(String name){
        this.name = name;
    }

    public void correr(){
        Acao acao = new Acao();
        this.lastAction = acao.runAction(new AcaoTypeCorrer(), this.name);
    }

    public void pular(){
        Acao acao = new Acao();
        this.lastAction = acao.runAction(new AcaoTypePular(), this.name);
    }

    public void reproduzir(){
        Acao acao = new Acao();
        this.lastAction = acao.runAction(new AcaoTypeReproduzir(), this.name);
    }
}