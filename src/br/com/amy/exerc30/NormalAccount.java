package br.com.amy.exerc30;

public class NormalAccount extends Account{
    private final String login;
    private final String password;

    public NormalAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String getCredentials() {
        return login + "-" + password;
    }
}
