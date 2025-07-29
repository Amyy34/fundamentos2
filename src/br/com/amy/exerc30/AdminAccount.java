package br.com.amy.exerc30;

public class AdminAccount extends Account{
    private final String login;
    private final String password;

    public AdminAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean isAdmin(){
        return true;
    }

    @Override
    public String getCredentials(){
        return login + "-" + password ;

    }
}
