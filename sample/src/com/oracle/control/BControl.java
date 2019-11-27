package com.oracle.control;

import com.oracle.model.ControlCollection;
import com.oracle.model.User;
import com.oracle.view.B;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class BControl implements Initializable {
    private User user;

    public User getUser() {
        return user;
    }

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        AControl  a=(AControl)ControlCollection.controls.get(AControl.class);
        this.user=a.getUser();
        System.out.println(a.getUser());
    }
    @FXML
    public void button1(ActionEvent e){
        System.out.println(this.user);
    }
    @FXML
    public void button2(ActionEvent e){

    }

}
