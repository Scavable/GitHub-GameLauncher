import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
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
        if(!folderRoot.exists()){
            if(folderRoot.mkdir()) {
                System.out.println("Root folder created at: " + folderRoot.getAbsoluteFile());
                new GamesLauncherConfigFile();
            }
            if(!folderInstall.exists()){
                if(folderInstall.mkdir()){
                    System.out.println("Install Folder created at: " + folderInstall.getAbsoluteFile());
                    new GamesLauncherConfigFile();
                }
                if(!fileConfig.exists()){
                    if(fileConfig.createNewFile()) {
                        System.out.println("Config file created at: " + fileConfig.getAbsoluteFile());
                        new GamesLauncherConfigFile();
                    }
                }
            }
        }
        //-------------------------------------------------------------------------------------------------------------
    }

    public void readConfig(){

    }

    ArrayList<String> readGames(){
        ArrayList<String> games = new ArrayList<String>();

        return games;
    }

    String getDocumentsPath(){
        return documentsPath;
    }

    File getRootFolder(){
        return folderRoot;
    }

    File getInstallFolder(){
        return folderInstall;
    }

    File getConfigFile(){
        return fileConfig;
    }

}
