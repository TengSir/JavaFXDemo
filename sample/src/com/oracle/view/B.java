package com.oracle.view;

import com.oracle.model.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class B extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Group  group= FXMLLoader.load(getClass().getClassLoader().getResource("fxml/B.fxml"));

            Scene  s=new Scene(group,300,400, Color.LIGHTGRAY);
            primaryStage.setTitle("B");
            primaryStage.setScene(s);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
