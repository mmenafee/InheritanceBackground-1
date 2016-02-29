import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class OurArea extends Area implements ActionListener {
  
  /*
  // The trees that are scattered around the area.
  Tree trees[];
  
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
  Boat b = new Boat(5,5);
	
  public OurArea() {
    super();
    Boat b = new Boat(5,5);
    this.addKeyListener(b);    
    clock.start();
    
    //*/
    
    //* Exercise #3. Initialize the tiles.
    tiles = new int[numTilesX][numTilesY]; //default value is grass because grass equals 0
    // Example: Draw specific at specific locations.
   
    //printing tiles over area
    for(int x = 0; x < 10; x++){
    	for(int y = 2;y < 5;y++){
    	tiles[x][y] = beach;
    	}
    }
    for(int x = 0; x < 10; x++){
    	for(int y = 5;y < 10;y++){
    		tiles[x][y] = ocean;
    	}
    }
    for(int x = 0; x < 10; x++){
    	for(int y = 0;y < 3;y++){
    		tiles[x][y] = tree;
    	}
    }
    
    
    //*/
  }
  
  
  protected void drawBoats() {
	    
	  Boat b = new Boat(5,5);
	  
}
  protected void drawTiles() {
    //* Exercise #4. Draw the tiles.
	
	Tile t = null;
    for (int i = 0; i < numTilesX; i++) {
      for (int j = 0; j < numTilesY; j++) {
    	 
        if (tiles[i][j] == grass) {
        	t = new Grass();
        	
        } 
        else if (tiles[i][j] == stone) {
         	t = new Stone();
        	
        }
        else if (tiles[i][j] == fire) {
        	t = new Fire();
         	
        }
        else if (tiles[i][j] == ocean){
        	t = new Ocean("frame_"+ p + "_delay-0.1s.gif");
        	
        }
        else if (tiles[i][j] == beach){
        
        	t = new Beach();
    	
        }
        else if (tiles[i][j] == tree){
        	drawTile(new Grass(), i, j);
        	t = new Tree();
        }
        	
        drawTile(t,i,j);
      }
    }
    //*/
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
