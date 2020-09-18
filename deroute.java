import java.util.Scanner;

public class deroute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String Email;
        int phoneNumber;
        System.out.println(" Key in email: ");
        Email= sc.next();

        System.out.println(" Key in phoneNumber");
        phoneNumber= sc.nextInt();

        System.out.println("Login credentials: ");
        System.out.println(Email);
        System.out.println(phoneNumber);

    }
}
