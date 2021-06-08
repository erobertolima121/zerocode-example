package br.com.robligo;

public class User {
    private String id;
    private String primeiroNome;
    private String segundoNome;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void primeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void segundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }
}
