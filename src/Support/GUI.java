package Support;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GUI {
    /*
     Declarations and Initializations
     */
    private final JFrame frame = new JFrame("Games Launcher");
    public static JPanel panelGames = new JPanel();
    private final JScrollPane scrollPane = new JScrollPane(panelGames);
    private final JMenuBar menuBar = new JMenuBar();
    private final JMenu menuFile = new JMenu("File");
    private final JMenu menuEdit = new JMenu("Edit");
    private final JMenuItem itemExit = new JMenuItem("Exit");
    private final JMenu menuSort = new JMenu("Sort");
    private final JMenuItem itemAsc = new JMenuItem("");
    private final JMenuItem itemDesc = new JMenuItem("");

    public GUI() {
        gamesPanelBehavior();
        scrollPaneBehavior();
        setMenuBar();
        setActions();
        frameBehavior();
    }

    private void frameBehavior() {
        /*
        Get users desktop screen size and set frame size
         */
        Dimension defaultScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension(defaultScreenSize.width / 2, defaultScreenSize.height / 2);

        //Add scrollpane/jpanel to content pane
        frame.getContentPane().add(scrollPane);

        frame.setPreferredSize(frameSize);
        frame.setLocation(frameSize.width / 2, frameSize.height / 2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set frame icon
        frame.setIconImage(new ImageIcon("D:\\Users\\UnRea\\Desktop\\temp.png").getImage());
    }

    private void scrollPaneBehavior() {
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }

    private void gamesPanelBehavior(){
        //Panel Layout
        panelGames.setLayout(new GridLayout(0,4,4,4));
    }

    public static void gamesPanelAdd(File[] games){
        panelGames.removeAll();
        panelGames.setSize(0,0);
        panelGames.updateUI();
        for(File file: games){
            JButton button = new JButton(file.getName());
            button.setPreferredSize(new Dimension((int)panelGames.getSize().getWidth()/4-2, (int)panelGames.getSize().getHeight()/4-2));
            panelGames.add(button);
        }
        panelGames.updateUI();
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

    private void setActions() {
        //Set action. Declare item name in action declaration as param
        itemExit.setAction(Actions.itemExitAction());
        itemAsc.setAction(Actions.itemAscAction());
        itemDesc.setAction(Actions.itemDescAction());
    }

    //Getters
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
