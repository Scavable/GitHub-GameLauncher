import javax.swing.*;
import java.awt.*;

public class GUI {
    /*
     Declarations and Initializations
     */
    private JFrame frame = new JFrame("Games Launcher");
    private JPanel panelGames = new JPanel();
    private JScrollPane scrollPane = new JScrollPane(panelGames);
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu("File");
    private JMenu menuEdit = new JMenu("Edit");
    private JMenuItem itemExit = new JMenuItem("Exit");
    private JMenu menuSort = new JMenu("Sort");
    private JMenuItem itemAsc = new JMenuItem("Ascending");
    private JMenuItem itemDesc = new JMenuItem("Descending");

    GUI() {
        /*
        Get users desktop screen size and set frame size
         */
        Dimension defaultScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension(defaultScreenSize.width / 2, defaultScreenSize.height / 2);

        panelGames.setLayout(new GridLayout(0, 4, 5, 5));

        //Set frame icon
        frame.setIconImage(new ImageIcon("D:\\Users\\UnRea\\Desktop\\temp.png").getImage());

        setMenuBar();

        //Set action. Declare item name in action declaration as param
        itemExit.setAction(GamesLauncherActions.itemExitAction());
        itemAsc.setAction(GamesLauncherActions.itemAscAction());
        itemDesc.setAction(GamesLauncherActions.itemDescAction());

        //Add scrollpane/jpanel to content pane
        frame.getContentPane().add(scrollPane);

        //Frame behavior
        frame.setPreferredSize(frameSize);
        frame.setLocation(frameSize.width / 2, frameSize.height / 2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setMenuBar() {
        //Set frame menu bar
        frame.setJMenuBar(menuBar);

        //Add menus to menu bar
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuSort);

        //Add items to menus
        menuFile.add(itemExit);
        menuSort.add(itemAsc);
        menuSort.add(itemDesc);
    }
}
