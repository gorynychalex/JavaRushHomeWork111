package test;
import javax.swing.JFrame;

/**
 * Created by Administrator on 27.10.2015.
 */
public class MyWindowApp extends JFrame
{
    public MyWindowApp(){
        super("My First Window");
        setBounds(100, 100, 300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        MyWindowApp app = new MyWindowApp();
        app.setVisible(true);
    }

}
