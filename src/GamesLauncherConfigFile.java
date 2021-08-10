import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.ArrayList;

public class GamesLauncherConfigFile {

    String documentsPath;
    File folderRoot, folderInstall, fileConfig;

    GamesLauncherConfigFile() throws IOException {
        documentsPath = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        folderRoot = new File(documentsPath + "\\Scavables");
        folderInstall = new File(folderRoot + "\\Game Launcher");
        fileConfig = new File(folderInstall + "\\config.txt");
        //-------------------------------------------------------------------------------------------------------------
        if (!folderRoot.exists()) {
            System.out.println("Root folder");
            if (folderRoot.mkdir()) {
                System.out.println("Root folder created at: " + folderRoot.getAbsoluteFile());
                new GamesLauncherConfigFile();
            }
        }
        if (!folderInstall.exists()) {
            System.out.println("Install folder");
            if (folderInstall.mkdir()) {
                System.out.println("Install Folder created at: " + folderInstall.getAbsoluteFile());
                new GamesLauncherConfigFile();
            }
        }
        if (!fileConfig.exists()) {
            if (fileConfig.createNewFile()) {
                System.out.println("Config file created at: " + fileConfig.getAbsoluteFile());
                new GamesLauncherConfigFile();
            }
        } else {
            System.out.println("File exist, determine if empty file");
            FileReader reader = new FileReader(fileConfig);
            BufferedReader bufferedReader = new BufferedReader(reader);
            if (!bufferedReader.ready() || bufferedReader.readLine().isEmpty()) {
                System.out.println("Empty or null text in file");
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnValue = chooser.showOpenDialog(null);
                if(returnValue == JFileChooser.APPROVE_OPTION){
                    FileWriter writer = new FileWriter(fileConfig);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    bufferedWriter.write(chooser.getSelectedFile().getAbsolutePath());
                    bufferedWriter.close();
                    writer.close();
                }
            }
            bufferedReader.close();
            reader.close();
        }
        //-------------------------------------------------------------------------------------------------------------
    }

    public void readConfig() {

    }

    ArrayList<String> readGames() {
        ArrayList<String> games = new ArrayList<>();

        return games;
    }

    String getDocumentsPath() {
        return documentsPath;
    }

    File getRootFolder() {
        return folderRoot;
    }

    File getInstallFolder() {
        return folderInstall;
    }

    File getConfigFile() {
        return fileConfig;
    }

}
