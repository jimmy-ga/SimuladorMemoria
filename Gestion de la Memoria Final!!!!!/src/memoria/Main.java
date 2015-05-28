
package memoria;
import javax.swing.*;
public class Main {
  
    public static void main(String[] args) {
      MDI v = new   MDI ();
       v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       v.setExtendedState(JFrame.MAXIMIZED_BOTH);
       v.show();
    }
   
}
