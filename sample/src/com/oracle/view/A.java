package com.oracle.view;

import com.oracle.control.AControl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class A extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            /**
             * javaFX如何在Main窗口中获取controller组件对象
             */
            FXMLLoader  f=new FXMLLoader();
            f.setLocation(getClass().getClassLoader().getResource("fxml/A.fxml"));
            f.setBuilderFactory(new JavaFXBuilderFactory());
            Group  group= f.load();
            AControl c=f.getController();
            c.test();

            Scene  s=new Scene(group,300,400, Color.LIGHTGRAY);
            primaryStage.setTitle("A");
            primaryStage.setScene(s);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
