//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Example 1
        EmailInfo emailInfo = extractEmailInformation("joao.silva23@yahoo.com.br");
        System.out.println("Usuario: " + emailInfo.username);
        System.out.println("Dominio: " + emailInfo.domain);
        System.out.println("Brasileiro: " + (emailInfo.isBrazilian ? "sim" : "nao"));

        System.out.println("-------------------");

        //Example 2
        EmailInfo emailInfo2 = extractEmailInformation("maria123@gmail.com");
        System.out.println("Usuario: " + emailInfo2.username);
        System.out.println("Dominio: " + emailInfo2.domain);
        System.out.println("Brasileiro: " + (emailInfo2.isBrazilian ? "sim" : "nao"));
    }

    public static EmailInfo extractEmailInformation(String email) {
        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];

        boolean isBrazilian = domain.endsWith(".br");

        return new EmailInfo(username, domain, isBrazilian);
    }
}

class EmailInfo {
    String username;
    String domain;
    boolean isBrazilian;

    public EmailInfo(String username, String domain, boolean isBrazilian) {
        this.username = username;
        this.domain = domain;
        this.isBrazilian = isBrazilian;
    }
}