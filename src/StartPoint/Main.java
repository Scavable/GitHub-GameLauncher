package StartPoint;

import Support.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConfigFile configFile = new ConfigFile();
        new GUI();
        new Sort(configFile.readGames(ConfigFile.readGamesLocation()));
    }
}
