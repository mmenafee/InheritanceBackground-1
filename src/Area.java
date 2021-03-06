import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;


public class Area extends JPanel  {

  // The trees that are scattered around the area.
  protected Shark sharks[];

  // The area tile map.
  protected int tiles[][];
  
  // To hide this parameter from being passed around.
  private Graphics2D g2; //we do not have access to private attributes in subclasses
  
  // Define some constants.
  protected static final int grass = 0; //static makes it so that you don't have to create an object. You can just do Area.grass.
  protected static final int stone = 1;
  protected static final int fire = 2;
  protected static final int ocean = 3;
  protected static final int beach = 4;
  protected static final int shark = 5;
  protected static final int boat = 6;
  protected static final int tree = 7;
  protected static final int numTilesX = Window.WIDTH / 64;
  protected static final int numTilesY = Window.HEIGHT / 64;
  protected static final double maxTreeX = Window.WIDTH - Tree.WIDTH;
  protected static final double maxTreeY = Window.HEIGHT - Tree.HEIGHT;
  protected static final double maxSharkX = Window.WIDTH - Shark.WIDTH;
  protected static final double maxSharkY = Window.HEIGHT - Shark.HEIGHT;
  
  // The constructor for the Area class.
  public Area() {
    g2 = null;
    setBackground(Color.BLACK);
    setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
    
  }
  
  protected void drawTile(Tile t, int i, int j) {
    t.draw(g2, i , j);
  }

  protected void drawShark(int s)
{
	  if(sharks != null){
		  sharks[s].draw(g2);
	  }
} 

	  
  
  
  // Overridden function from JPanel, which allows us to
  // write our own paint method which draws our area.
  @Override
  public void paint(Graphics g) {
    // This calls JPanel's paintComponent method to handle
    // the lower-level details of drawing in a window.
    super.paint(g);
    
    g2 = (Graphics2D)g;
    
    drawTiles();
    drawSharks();
    drawBoats();
    // Sync for cross-platform smooth rendering.
    Toolkit.getDefaultToolkit().sync();
  }
  
 protected void drawSharks()
{
	// TODO Auto-generated method stub
	
}

protected void drawTiles() {
    // TODO: Implement in a child class.
  }
protected void drawBoats(){
	Boat b = new Boat(300,500);
	b.draw(g2);
}

}
