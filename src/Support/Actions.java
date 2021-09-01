package Support;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Actions {

    public static Action itemExitAction(){
        //Item exit action. Exit is the name shown on item button
        return new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
    }

    public static Action itemAscAction() {
        return new AbstractAction("Ascending") {
            @Override
            public void actionPerformed(ActionEvent e) {Sort.ascSort();}
        };
    }

    public static Action itemDescAction() {
        return new AbstractAction("Descending") {
            @Override
            public void actionPerformed(ActionEvent e) {Sort.descSort();}

        };
    }
}
