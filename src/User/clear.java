package User;
import java.io.IOException;
public class clear {
    public static void main(String[] args) throws IOException{
        System.out.print("Everything on the console will cleared");
        Runtime.getRuntime().exec("cls");
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
}}
