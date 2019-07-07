package eu.theritual.tester;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML Button butt;

    @FXML
    public void onButtonClick() {
        System.out.println(butt.getText());
    }

}
