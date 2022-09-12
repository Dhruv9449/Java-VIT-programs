// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Email {
    public static void main(String[] args) {
        String email = "dhruvshahrds@gmail.com";

        int i = email.indexOf("@");
        String username = email.substring(0, i);
        String domain = email.substring(i + 1);
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        int j = domain.indexOf(".");
        String domainName = domain.substring(0, j);
        System.out.println(domainName.equals("gmail"));

    }
}
