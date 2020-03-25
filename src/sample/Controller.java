package sample;

import java.awt.*;

import javax.swing.*;

import javafx.event.ActionEvent;

public class Controller {

    public javafx.scene.control.Label labelOne;
    public javafx.scene.control.Label labelCount;
    int count = 0;

    public void sayHello(ActionEvent actionEvent) {
        count += 1;

        labelCount.setText( String.valueOf(count) );

        if(count==3)
            labelOne.setText("Alhamdulillah!");
    }
}
