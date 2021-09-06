package StartPoint;

import Support.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConfigFile configFile = new ConfigFile();
        GUI gui = new GUI();
        Sort sort = new Sort(configFile.readGames(configFile.readGamesLocation()));

    }
}
