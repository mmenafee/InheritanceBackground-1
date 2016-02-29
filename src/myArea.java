import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class myArea extends Area implements ActionListener {
  
  /*
  // The trees that are scattered around the area.
  Shark sharks[];
  
  // The area tile map, with each tile represented as an integer.
  int tiles[][];
  
  // The tile values for grass (0) and stone (1) tiles.
  int grass;
  int stone;
  
  // The number of tiles on the x-axis, and y-axis.
  int numTilesX;
  int numTilesY;
  
  // The maximum position of a tree on the x-axis and y-axis.
  // Note: The minimum is simply (0, 0).
  double maxTreeX;
  double maxTreeY;
  */
  
  // The constructor for OurArea. It takes in a parameter for the
  // number of trees to place in the area.
	
	private Timer clock = new Timer(10, (ActionListener) this);
	private int p;
	
  public myArea(int numberOfSharks) {
    super(); // A magic function. I wonder what it does? 
    clock.start();
    //* Exercise #1. Setup the tree objects at random locations.
    sharks = new Shark[numberOfSharks];
    for (int i = 0; i < numberOfSharks; i++) {
      sharks[i] = new Shark((int)(Math.random()), (int)(Math.random()));
    }

    //*/
    
    //* Exercise #3. Initialize the tiles.
    tiles = new int[numTilesX][numTilesY]; //default value is grass because grass equals 0
    // Example: Draw specific at specific locations.
 
 
  }
  protected void drawSharks() {
	    //* Exercise #2. Draw the trees.
	    for (int i = 0; i < sharks.length; i++) {
	      
	      drawShark(i);
	    }
  }
	    //*/

  protected void drawTiles() {
    //* Exercise #4. Draw the tiles.
	
    for (int i = 0; i < numTilesX; i++) {
      for (int j = 0; j < numTilesY; j++) {
        	Ocean o = new Ocean("frame_"+ p + "_delay-0.1s.gif");
        	drawTile(o,i,j);
        
      }
    }
  }

@Override
public void actionPerformed(ActionEvent e)
{
	if (e.getSource() == clock){
   	 p++;
    	if(p == 10){
    		p = 1;
     	}
   }
	
   	repaint();
	
}
  
}
  
