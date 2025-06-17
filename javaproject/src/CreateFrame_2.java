import javax.swing.*;
import java.awt.*;

public class CreateFrame_2 extends JFrame {

    CreateFrame_2() {
        this.setTitle("JFrame window");  // title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);  // prevents resizing
        this.setSize(420, 420);  // dimensions
        this.setVisible(true);   // make visible

        ImageIcon image = new ImageIcon("javaimg.png");
        this.setIconImage(image.getImage());  // set window icon

        this.getContentPane().setBackground(Color.RED);  // set background color
    }


}
