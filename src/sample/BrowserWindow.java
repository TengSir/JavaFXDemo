package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class BrowserWindow extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent  p= FXMLLoader.load(getClass().getResource("browser.fxml"));
            Scene s=new Scene(p,800,600, Color.GRAY);
            primaryStage.setScene(s);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
