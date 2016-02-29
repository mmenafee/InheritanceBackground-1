import java.util.Random;

public class InheritanceDriver {
  
  // The main driver method.
  public static void main(String args[]) {
    
	
    OurArea area = new OurArea();
   
    myArea oceansharks = new myArea(15);
    
    
    // Use our area, and show the window.
    Window window = new Window("Shark Attack");
    window.add(area);
    //window.add(oceansharks);
    window.setVisible(true);
  }
  
}
 