import javax.swing.*;
import java.awt.*;

public class GUI {
    GUI(){
        Dimension defaultScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension(defaultScreenSize.width/2,defaultScreenSize.height/2);

        JFrame frame = new JFrame("Games Launcher");
        JPanel panelGames = new JPanel();
        JScrollPane jScrollPane = new JScrollPane(panelGames);

        frame.getContentPane().add(jScrollPane);

        frame.setPreferredSize(frameSize);
        frame.setLocation(frameSize.width/2, frameSize.height/2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
