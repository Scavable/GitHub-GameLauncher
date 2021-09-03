package Support;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
    private static File[] gameFiles;
    private static JPanel panel;
    private static Dimension panelSize;

    public Sort(File[] files){
        gameFiles = files;
        GUI.gamesPanelAdd(gameFiles);
    }
    public static void descSort(){
        Arrays.sort(gameFiles);
        GUI.gamesPanelAdd(gameFiles);
    }
    public static void ascSort(){
        Arrays.sort(gameFiles, Collections.reverseOrder());
        GUI.gamesPanelAdd(gameFiles);
    }
}
