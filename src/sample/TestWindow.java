package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.awt.*;

public class TestWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane  p=new GridPane();
        Scene scene=new Scene(p,200,200,Color.GRAY);
        Line  l=new Line();
        l.setStartX(0);
        l.setStartY(0);
        l.setEndX(100);
        l.setEndY(100);
        l.setStroke(Color.RED);
        p.getChildren().add(l);
        Button  b=new Button();
        b.setId("button1");;
        b.setText("test");
        b.setPrefWidth(100);
        b.setPrefHeight(20);
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("click this button");
                TestMain  t=new TestMain();
                try {
                    t.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                primaryStage.hide();
            }
        });
        p.getChildren().add(b);
        primaryStage.setScene(scene);
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
