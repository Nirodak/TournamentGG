package ru.netology.tournament;

public class NoRegisteredException extends RuntimeException{
    public NoRegisteredException (String s){
        super(s);
    }
}
