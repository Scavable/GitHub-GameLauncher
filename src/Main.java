import com.sun.security.auth.login.ConfigFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GamesLauncherConfigFile configFile = new GamesLauncherConfigFile();
        GUI gui = new GUI();
        Sort sort = new Sort(gui.panelGames, configFile.readGames(configFile.readConfig()));

    }
}
