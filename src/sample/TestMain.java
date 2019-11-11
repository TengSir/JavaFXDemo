package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Accordion  a=new Accordion();
        Group  g=new Group();
        Scene  s=new Scene(a,300,200, Color.LIGHTSKYBLUE);
        TitledPane  t1=new TitledPane("面板1",new Button("button1"));
        TitledPane  t2=new TitledPane("面板2",new Button("button2"));
        TitledPane  t3=new TitledPane("面板3",new Button("button3"));
        TitledPane  t4=new TitledPane("面板4",new Button("button4"));
        a.getPanes().addAll(t1,t2,t3,t4);
        primaryStage.setTitle("主窗口");
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
