package User;

import javax.swing.filechooser.FileSystemView;
import java.io.File;


public class Launch {
    public static void main(String args[]) {


        File docsDirectory = new File(String.valueOf(FileSystemView.getFileSystemView().getDefaultDirectory().getPath())+"\\promemoria");
        if (!docsDirectory.exists()){
            docsDirectory.mkdirs();
            System.out.println("Initiating first launch");
            File crateToDo = new File(String.valueOf(docsDirectory)+"\\Active_Tasks");
            File crateArchive = new File(String.valueOf(docsDirectory)+"\\Archive");


        }
        else{
            System.out.println("System directory found preparing for launch");

        }

    }
}
