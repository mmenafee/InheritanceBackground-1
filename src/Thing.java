import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;


public class Thing {
  
  // The x-y location of the tree in pixels.
  // For our purposes, the region is 640 by 480.
  private int x;
  private int y;
  
  // The size of the tree. For our purposes, this is
  // known to be the size of the tree image.
  public static final int WIDTH = 128;
  public static final int HEIGHT = 128;
  
  // The image of the tree.
  private BufferedImage thingImage;
  
  // The constructor for the Tree class. This allows
  // the user to specify the location of a tree.
  public Thing(int x, int y, String thingName) {
    try {
      thingImage = ImageIO.read(new URL("file:" + thingName));
    } catch (IOException e) {
      System.out.println("Failed to load " +  thingName);
    }
    
    set_location(x, y);
  }
  
  // Set the location of the tree.
  public void set_location(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  // Get the x-axis location of the tree.
  public int get_x() {
    return this.x;
  }
  
  // Get the y-axis location of the tree.
  public int get_y() {
    return this.y;
  }
  
  // Draw the tree at its location in the window.
  public void draw(Graphics2D g2) {
    g2.drawImage(thingImage, null, x, y);
  }
  
}