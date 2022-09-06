package PROMEMORIA;

import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.Scanner;

public class Main {
    static void Launch(){
        File docsDirectory = new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\promemoria");
        if(!docsDirectory.exists()){
            docsDirectory.mkdirs();
            System.out.println("Initiating first launch");
            File usersPath = new File(docsDirectory+ "\\Users");
            usersPath.mkdirs();
        }
        //else {}
    }
    static String startApp()throws IOException{
        System.out.print("\n(Enter \"Sign\" to Sign in.)\nEnter user name: ");
        Scanner id = new Scanner(System.in);
        String ID =id.next();
        //System.out.println(ID);

        if(ID.equals("Sign")){
            System.out.println("\nEnter desired user name: ");
            id = new Scanner(System.in);
            ID = id.next();
            File createUserFile = new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath()+ "\\promemoria\\Users\\" + ID);
            if (!createUserFile.mkdir()) {
                System.out.println("Invalid User Name");
            }
            //else {}
            try {
                File createUserData = new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath()+ "\\promemoria\\Users\\" + ID + "\\" + ID + ".txt");
                if (createUserData.createNewFile()) {
                    System.out.println("Account created successfully. ");
                    try {
                        FileWriter passWriter = new FileWriter(FileSystemView.getFileSystemView().getDefaultDirectory().getPath()+ "\\promemoria\\Users\\" + ID+ "\\" + ID + ".txt");
                        System.out.println("\nPlease enter desired password: ");
                        Scanner passCreate = new Scanner(System.in);
                        String oldTasks = passCreate.next();
                        passWriter.write(oldTasks);
                        passWriter.close();
                        System.out.println("Password successfully created.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("Account already exists.");
                    startApp();
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                startApp();
            }
        }

        try {
            File userFile = new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath()+ "\\promemoria\\Users\\" + ID + "\\" + ID + ".txt");
            userFile.exists();
            if(!userFile.exists()){System.out.println("Account does not exist");}
            }
        catch (Exception e) {
            System.out.println("Account does not exist");
        }

        return ID;
    }
    private class User {


        public String SecurityQuestion(String ID){
            File file = new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath()+ "\\promemoria\\Users\\" + ID + "\\" + ID + ".txt");
            Scanner sc;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
                return sc.nextLine();
        }
    }

    public static void main(String[] args)throws IOException {
        Main launchApp = new Main();
        Launch();
        launchApp.passwordReader();



    }
    boolean passwordReader() throws IOException{
        User password = new User();
        String ID = Main.startApp();
        int inPass = password.SecurityQuestion(ID).length();
        int random = (int) Math.floor(Math.random() * (inPass+1));
        System.out.println("Please enter " + (random+1) + "th character of your password.");
        Scanner passChar = new Scanner(System.in);
        String sKey =passChar.next();
        char key = sKey.charAt(0);
        char trueKey = password.SecurityQuestion(ID).charAt(random);
        if(key==trueKey){
            System.out.println("Correct!");
            return true;
        }
        else {
            System.out.println("Incorrect");
            passwordReader();
            return false;
        }

    }
}




