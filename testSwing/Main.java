package testSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame("Swing Test Window");
      var1.setSize(400, 300);
      var1.setDefaultCloseOperation(3);
      JLabel var2 = new JLabel("Hello, Swing!", 0);
      var1.add(var2);
      var1.setVisible(true);
   }

   
}
