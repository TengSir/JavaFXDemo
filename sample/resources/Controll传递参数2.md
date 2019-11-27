JAVAFX 相关知识点总结
===
2.控制器之间相互传递数据
---
***
可以设计一个静态全局的key-value容器类，每个控制器初始化的时候都将控制器
对象本身放入到容器类，在任何需要用到其他控制器的地方直接从全局的容器里获得
想要使用的控制器对象即可。





####  示例：
***
**公共集合类**

 public class ControlCollection {
     public final  static Map<Class,Object> controls=new HashMap<>();
 }

***

**A窗口的Controller类**
    
   public class AControl implements Initializable {
       private User  user;
   
       @Override
       public void initialize(URL location, ResourceBundle resources) {
   
       }
       @FXML
       public void button1(ActionEvent e){
           System.out.println("button1");
           user =new User("tengsir","123456");
           ControlCollection.controls.put(getClass(),this);//这里将当前的control存储到统一的集合中
           B b=new B();
           b.start(new Stage());
           button1.getScene().getWindow().hide();
   
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        AControl  a=(AControl)ControlCollection.controls.get(AControl.class);//B窗口控制器中直接从公共的集合中取出A的控制器，获取A控制器对象中的属性
        this.user=a.getUser();
        System.out.println(a.getUser());
    }
  

}
