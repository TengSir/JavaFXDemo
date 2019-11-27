JAVAFX 相关知识点总结
===
1.控制器之间相互传递数据
---
***
***可以在view层(Application层)使用api获取controller对象，
然后A窗口 的 controller在事件方法里直接new B的view对象，然后将    
参数通过B的view类中定义好的set方法或者构造器方式传给B的view类         
B的view类中可以通过api直接读取获得B的controller，然后将参数再次     
通过controller的set方法，将参数注入给B的Controller***     

####  示例：
***
**A窗口的controll类**
  
   public class AControl implements Initializable {

    private User  user;//这个对象属性即为要传递的数据
    @FXML
    private Button button1;//窗口上的button组件
    
      @FXML //Button1的点击事件映射的事件方法
        public void button1(ActionEvent e){
            user =new User("tengsir","123456");//实例化user对象
            B b=new B();//初始化B窗口的view对象
            b.start(new Stage());//显示B窗口
            b.setUser(user);//讲user对象通过set方法，注入到B窗口类中
            
            //或者设计构造器传参，如下
             B b=new B(user);//初始化B窗口的view对象
             b.start(new Stage());//显示B窗口
    
        }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
   
    }
    }
***
**B窗口的View类**

    public class B extends Application {
    private User user;
    public void setUser(User user){
     this.user=user;
    }

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
              f.setLocation(getClass().getClassLoader().getResource("fxml/B.fxml"));
              f.setBuilderFactory(new JavaFXBuilderFactory());
              Group  group= f.load();
              BControl c=f.getController();//通过FXMLLoader 对象即可获得当前view的控制器对象
              
              //接下来就可以直接调用控制器类中的set方法来注入要传递的属性
              c.setUser(user);//将本类中的user对象传入控制器对象中
              
                Scene  s=new Scene(group,300,400, Color.LIGHTGRAY);
                primaryStage.setTitle("B");
                primaryStage.setScene(s);
                primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
***
**B窗口的Controller类**
    
    public class BControl implements Initializable {
        private User user;
    
        public User getUser() {
            return user;
        }
         public void setUser(User user){
             this.user=user;
            }
    
        @FXML
        private Button button1;
        @FXML
        private Button button2;
        @Override
        public void initialize(URL location, ResourceBundle resources) {
            //B的controller类中可以直接使用本类中的user对象，
            //因为在b窗口打开之前已经由A的控制器传入给了B的view，B的view又通过方法注入进来
            
            System.out.println(user);
        }
        @FXML
        public void button1(ActionEvent e){
            System.out.println(this.user);
        }
        @FXML
        public void button2(ActionEvent e){
    
        }
    
    }
