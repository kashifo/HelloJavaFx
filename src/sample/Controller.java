package sample;

import java.awt.*;

import javax.swing.*;

import javafx.event.ActionEvent;

public class Controller {

    public javafx.scene.control.Label labelOne;

    public void sayHello(ActionEvent actionEvent) {
        labelOne.setText("Alhamdulillah!");
    }
}
