package User;

import java.io.File;
import java.util.Scanner;


public class Login {

    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter


        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String id = input.nextLine();
        boolean CheckExist = true;
        boolean TryAgain = true;
        while (TryAgain){

            try {
                File file = new File("C:\\Users\\halil\\Desktop\\Journal\\Accounts\\" + id + "\\" + id + ".txt");
                CheckExist = file.exists();
            } catch (Exception e) {
                CheckExist = false;
            }
            if (CheckExist) {
                TryAgain = false;
            } else {
                System.out.println("Account does not exist.");
                System.out.print("Username: ");
                id = input.nextLine();

            }
        }


        File file = new File("C:\\Users\\halil\\Desktop\\Journal\\Accounts\\" + id + "\\" + id + ".txt");
        Scanner sc = new Scanner(file);
        String idCheck = sc.nextLine();

        if (id.equals(idCheck)) {
            System.out.print("Password: ");
            String password = input.nextLine();
            String passCheck = sc.nextLine();
            if (password.equals(passCheck)) {
                System.out.println("Welcome " + idCheck);
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Invalid ID ");
        }


    }

}

