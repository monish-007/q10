import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(user.equals("admin") && pass.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}
