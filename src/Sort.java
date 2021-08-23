import javax.swing.*;
import java.io.File;

public class Sort {
    Sort(JPanel panel, File[] files){
        for(File file: files){
            panel.add(new JButton(file.getName()));
        }
    }
}
