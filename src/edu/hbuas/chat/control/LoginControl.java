package edu.hbuas.chat.control;

import edu.hbuas.chat.view.Login;
import edu.hbuas.chat.view.Main;
import edu.hbuas.chat.view.ModalWindow;
import edu.hbuas.chat.view.Register;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
/**
 * @author tengsir
 */
public class LoginControl implements Initializable {

    private User user;

    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;
    @FXML
    private TextField  usernameText;
    @FXML
    private PasswordField passwordText;
    @FXML
    private void processLogin(ActionEvent e){
        System.out.println(user.usernameProperty().get());
        Main m=new Main();
        m.start(new Stage());
        loginButton.getScene().getWindow().hide();
       // ModalWindow.showModalDialog("温馨提示","处理用户登陆功能");
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /**
         * 控制器默认的初始化方法，用来执行一些组件额外的初始化业务，这个方法会在ui组件渲染打开前执行。
         */
        user=new User();
        user.usernameProperty().bind(usernameText.textProperty());
        user.passwordProperty().bind(passwordText.textProperty());


        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Register  r=new Register();
                r.start(new Stage());
                registerButton.getScene().getWindow().hide();
            }
        });

//        loginButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println(user.toString());
//                Main m=new Main();
//                m.start(new Stage());
//                loginButton.getScene().getWindow().hide();
//               // ModalWindow.showModalDialog("温馨提示","处理用户登陆功能");
//            }
//        });

    }
}
