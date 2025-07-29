package br.com.amy.exerc30;

public class SobreClasseAbstrata {
    public static void main(String[] args) {
        Account conta1 = new AdminAccount("Admin12","233442");
        Account conta2 = new NormalAccount("Alee","434277");
//      var conta3 = new Account();

        System.out.println(conta1.isAdmin());
        System.out.println(conta2.isAdmin());
        System.out.println(conta1.getCredentials());
        System.out.println(conta2.getCredentials());
    }
}
