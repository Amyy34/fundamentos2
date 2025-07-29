package br.com.amy.exerc30;

public abstract class Account {

    public boolean isAdmin(){
        return false;
    }

    public abstract String getCredentials();
}
