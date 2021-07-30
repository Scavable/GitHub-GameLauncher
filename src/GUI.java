import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    GUI(){
        /*
        Get users desktop screen size and set frame size
         */
        Dimension defaultScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension(defaultScreenSize.width/2,defaultScreenSize.height/2);

        /*
        Declarations and Initializations
         */
        JFrame frame = new JFrame("Games Launcher");
        JPanel panelGames = new JPanel();
        JScrollPane scrollPane = new JScrollPane(panelGames);
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenuItem itemExit = new JMenuItem();

        panelGames.setLayout(new GridLayout(0,4,5,5));

        //Set frame icon
        frame.setIconImage(new ImageIcon("D:\\Users\\UnRea\\Desktop\\temp.png").getImage());

        //Set frame menu bar
        frame.setJMenuBar(menuBar);

        //Add menus to menu bar
        menuBar.add(menuFile);
        menuBar.add(menuEdit);

        //Add items to menus
        menuFile.add(itemExit);

        //Set action. Declare item name in action declaration as param
        itemExit.setAction(GamesLauncherActions.itemExitAction());

        //Add scrollpane/jpanel to content pane
        frame.getContentPane().add(scrollPane);

        //Frame behavior
        frame.setPreferredSize(frameSize);
        frame.setLocation(frameSize.width/2, frameSize.height/2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
