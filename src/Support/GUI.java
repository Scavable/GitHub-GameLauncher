package Support;

import javax.swing.*;
import java.awt.*;

public class GUI {
    /*
     Declarations and Initializations
     */
    private JFrame frame = new JFrame("Games Launcher");
    public  JPanel panelGames = new JPanel();
    private JScrollPane scrollPane = new JScrollPane(panelGames);
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu("File");
    private JMenu menuEdit = new JMenu("Edit");
    private JMenuItem itemExit = new JMenuItem("Exit");
    private JMenu menuSort = new JMenu("Sort");
    private JMenuItem itemAsc = new JMenuItem("");
    private JMenuItem itemDesc = new JMenuItem("");

    public GUI() {
        //Panel Layout
        panelGames.setLayout(new GridLayout(0, 4, 4, 4));

        //Set frame icon
        frame.setIconImage(new ImageIcon("D:\\Users\\UnRea\\Desktop\\temp.png").getImage());

        scrollPanePolicy();
        setMenuBar();
        setActions();

        //Add scrollpane/jpanel to content pane
        frame.getContentPane().add(scrollPane);

        frameBehavior();
    }

    private void frameBehavior() {
        /*
        Get users desktop screen size and set frame size
         */
        Dimension defaultScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension(defaultScreenSize.width / 2, defaultScreenSize.height / 2);

        //Frame behavior
        frame.setPreferredSize(frameSize);
        frame.setLocation(frameSize.width / 2, frameSize.height / 2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setActions() {
        //Set action. Declare item name in action declaration as param
        itemExit.setAction(Actions.itemExitAction());
        itemAsc.setAction(Actions.itemAscAction());
        itemDesc.setAction(Actions.itemDescAction());
    }

    private void scrollPanePolicy() {
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

    public JFrame getFrame() {
        return frame;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public JPanel getPanelGames() {
        return panelGames;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public JMenu getMenuFile() {
        return menuFile;
    }

    public JMenu getMenuEdit() {
        return menuEdit;
    }

    public JMenu getMenuSort() {
        return menuSort;
    }

    public JMenuItem getItemExit() {
        return itemExit;
    }

    public JMenuItem getItemAsc() {
        return itemAsc;
    }

    public JMenuItem getItemDesc() {
        return itemDesc;
    }
}
