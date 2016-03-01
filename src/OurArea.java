import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;

import javax.swing.Timer;

public class OurArea extends Area implements ActionListener , KeyListener{
  
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
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
// The constructor for OurArea. It takes in a parameter for the
  // number of trees to place in the area.
  private Timer clock = new Timer(1, this);
  Ocean[] frames = new Ocean[11];
  private int p;
  int numberOfBoats = 1;
  //(a,b) position of boat sprite
  int a = 300;
  int b = 500;
  boolean upKey = false;
  boolean downKey = false;
  boolean rightKey = false;
  boolean leftKey = false;
  
	
  public OurArea() {
    super();
    addKeyListener(this);
    setFocusable(true);
    
    clock.start();
    
    boats = new Boat[numberOfBoats];
    for (int i = 0; i < numberOfBoats; i++) {
    	boats[i] = new Boat(a,b);
    	
    }
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
    		//preloads frames so gif isn't so slow
    for(int i=0;i<11;i++){
    	 frames[i] = new Ocean("frame_"+ i + "_delay-0.1s.gif");
    	    }
    	}
    }
    
    //*/
  }
  protected void drawBoats() {
	    //* Exercise #2. Draw the trees.
	    for (int i = 0; i < boats.length; i++) {
	      drawBoat(i);
	    }
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
        	t = frames[p];
        	
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
	// if for frames in gif, calling each frame in array
	if (e.getSource() == clock){
	 p++;
 	if(p == 11){
 		p = 1;
  	}
 	//checking if boolean are true every 20 milliseconds
 	if(e.getSource() == clock){
 		if(upKey == true){
 			Boat.set_location(boats[0].get_x(),boats[0].get_y()-5);
 		}
 		if(downKey == true){
 			Boat.set_location(boats[0].get_x(),boats[0].get_y()+5);
 		}
 		if(rightKey == true){
 			Boat.set_location(boats[0].get_x()+5,boats[0].get_y());
 		}
 		if(leftKey == true){
 			Boat.set_location(boats[0].get_x()-5,boats[0].get_y());
 		}
 		
 	}
}
	repaint();
}



@Override
public void keyTyped(KeyEvent e)
{
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e)
{
	// TODO Auto-generated method stub
	switch(e.getKeyCode()){
		
		case KeyEvent.VK_UP:
			upKey = true;
			break;
		case KeyEvent.VK_DOWN:
			downKey = true;
			break;
		case KeyEvent.VK_RIGHT:
			rightKey = true;
			break;
		case KeyEvent.VK_LEFT:
			leftKey = true;
			break;
			
	}
	repaint();
}

@Override
public void keyReleased(KeyEvent e)
{
	// TODO Auto-generated method stub
	switch(e.getKeyCode()){
	case KeyEvent.VK_UP:
		upKey = false;
		break;
	case KeyEvent.VK_DOWN:
		downKey = false;
		break;
	case KeyEvent.VK_RIGHT:
		rightKey = false;
		break;
	case KeyEvent.VK_LEFT:
		leftKey = false;
		break;
	}
	repaint();
}

}
