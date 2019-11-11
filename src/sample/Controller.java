package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private WebView webview;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("test");
        WebEngine  engine=webview.getEngine();
        engine.load("https://www.baidu.com");
    }

}
