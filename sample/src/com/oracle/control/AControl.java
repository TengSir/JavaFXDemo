package com.oracle.control;

import com.oracle.model.ControlCollection;
import com.oracle.model.User;
import com.oracle.view.B;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AControl implements Initializable {
    private User  user;

    public User getUser() {
        return user;
    }

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void button1(ActionEvent e){
        System.out.println("button1");
        user =new User("tengsir","123456");
        ControlCollection.controls.put(getClass(),this);
        B b=new B();
        b.start(new Stage());
        button1.getScene().getWindow().hide();

    }
    @FXML
    public void button2(ActionEvent e){
        System.out.println("button2");
    }
    public void test(){
        System.out.println("test");
    }
}
