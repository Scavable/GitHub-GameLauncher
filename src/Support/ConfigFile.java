package Support;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;

public class ConfigFile {

    private final String documentsPath;
    private final File folderRoot;
    private final File folderInstall;
    private static File fileConfig;

    public ConfigFile() throws IOException {
        documentsPath = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        folderRoot = new File(documentsPath + "\\Scavables");
        folderInstall = new File(folderRoot + "\\Game Launcher");
        fileConfig = new File(folderInstall + "\\config.txt");
        //-------------------------------------------------------------------------------------------------------------
        if (!folderRoot.exists()) {
            if (folderRoot.mkdir()) {
                System.out.println("Root folder created at: " + folderRoot.getAbsoluteFile());
                new ConfigFile(); }}

        if (!folderInstall.exists()) {
            if (folderInstall.mkdir()) {
                System.out.println("Install Folder created at: " + folderInstall.getAbsoluteFile());
                new ConfigFile(); }}

        if (!fileConfig.exists()) {
            if (fileConfig.createNewFile()) {
                System.out.println("Config file created at: " + fileConfig.getAbsoluteFile());
                new ConfigFile(); }}
        else {
            FileReader reader = new FileReader(fileConfig);
            BufferedReader bufferedReader = new BufferedReader(reader);
            if (!bufferedReader.ready() || bufferedReader.readLine().isEmpty()) {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnValue = chooser.showOpenDialog(null);
                if(returnValue == JFileChooser.APPROVE_OPTION){
                    FileWriter writer = new FileWriter(fileConfig);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    bufferedWriter.write("Games Folder Location: " + chooser.getSelectedFile().getAbsolutePath());
                    bufferedWriter.close();
                    writer.close(); }}
            bufferedReader.close();
            reader.close();
        }
        //-------------------------------------------------------------------------------------------------------------
    }

    public static String readGamesLocation() throws IOException {
        FileReader reader = new FileReader(fileConfig);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String temp = bufferedReader.readLine();
        String gamesFolderLocation = null;

        if(temp.contains("Games Folder Location:")){
            gamesFolderLocation = temp.substring(temp.indexOf(":")+1).strip();
        }

        System.out.println(gamesFolderLocation);
        bufferedReader.close();
        reader.close();
        return gamesFolderLocation;
    }

    public File[] readGames(String gamesFolder) {
        if(gamesFolder == null || gamesFolder.isBlank()){
            return null;
        }else
            return new File(gamesFolder).listFiles();
    }

    public String getDocumentsPath() {
        return documentsPath;
    }

    public File getRootFolder() {
        return folderRoot;
    }

    public File getInstallFolder() {
        return folderInstall;
    }

    public File getConfigFile() {
        return fileConfig;
    }

}
