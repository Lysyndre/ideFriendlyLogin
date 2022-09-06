package User;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Create {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\halil\\Desktop\\Journal\\Accounts\\"; //bu okumayı kendi yapması lazım!
        //Using Scanner class to get the folder name from the user
        System.out.println("Enter user name: ");
        String ID = sc.next();
        path = path + ID;
        //Instantiate the File class
        File f1 = new File(path);
        //Creating a folder using mkdir() method
        boolean bool = f1.mkdir();
        if (bool) {
            System.out.println("Folder is created successfully");
        } else {
            System.out.println("Invalid User Name");
        }

        try {
            File myObj = new File(path + "\\" + ID + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("Account already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner ps = new Scanner(System.in);
        System.out.println("Enter password: ");
        String NewPassword = ps.next();


        // Assigning the content of the file ///////////////////////////////////////////////////////////////////////////////////////
        String text
                = ID + "\n" + NewPassword;

        // Defining the file name of the file
        Path fileName = Path.of(
                path + "\\" + ID + ".txt"); //path + "\\" + ID + ".txt"

        // Writing into the file
        Files.writeString(fileName, text);

        // Reading the content of the file
        String file_content = Files.readString(fileName);

        // Printing the content inside the file
        System.out.println("Account" + file_content + "created successfully");
    }

}
