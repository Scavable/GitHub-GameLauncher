import javax.swing.*;
import java.awt.event.ActionEvent;

public class GamesLauncherActions {

    static Action itemExitAction(){
        //Item exit action. Exit is the name shown on item button
        return new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
    }
}
