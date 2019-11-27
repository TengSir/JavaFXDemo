package com.oracle.chat.control;

import com.oracle.chat.view.ModalWindow;
import com.oracle.chat.view.Head;
import com.oracle.chat.view.Login;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author tengsir
 */
public class RegisterControl implements Initializable {
    @FXML
    private Button submitRegister,selectImage;
    @FXML
    private Button backLogin;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        submitRegister.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ModalWindow.showModalDialog("温馨提示","准备注册");
            }
        });
        backLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Login l=new Login();
                l.start(new Stage());
                backLogin.getScene().getWindow().hide();
            }
        });
        selectImage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Head h=new Head();
                h.start(new Stage());
            }
        });
    }
}
