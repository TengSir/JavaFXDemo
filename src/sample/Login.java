package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group  g=new Group();//布局
        Scene  s=new Scene(g,400,300);//舞台

        Button  b=new Button("test");

        g.getChildren().add(b);

        TextField  t=new TextField();

        g.getChildren().add(t);


        primaryStage.setScene(s);//场景
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
