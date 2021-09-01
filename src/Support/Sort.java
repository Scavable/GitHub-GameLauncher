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

    public Sort(JPanel panel, File[] files){
        gameFiles = files;
        Sort.panel = panel;
        panelSize = panel.getSize();
        for(File file: gameFiles){
            JButton button = new JButton(file.getName());
            button.setPreferredSize(new Dimension((int)panel.getSize().getWidth()/4-2, (int)panel.getSize().getHeight()/4-2));
            panel.add(button);
        }
        Sort.panel.updateUI();
    }
    public static void descSort(){
        Arrays.sort(gameFiles);
        panel.removeAll();
        panel.setSize(panelSize);
        for(File file: gameFiles){
            JButton button = new JButton(file.getName());
            button.setPreferredSize(new Dimension((int)panel.getSize().getWidth()/4-2, (int)panel.getSize().getHeight()/4-2));
            panel.add(button);
        }
        panel.updateUI();
    }
    public static void ascSort(){
        Arrays.sort(gameFiles, Collections.reverseOrder());
        panel.removeAll();
        panel.setSize(panelSize);
        for(File file: gameFiles){
            JButton button = new JButton(file.getName());
            button.setPreferredSize(new Dimension((int)panel.getSize().getWidth()/4-2, (int)panel.getSize().getHeight()/4-2));
            panel.add(button);
        }
        panel.updateUI();
    }
}
