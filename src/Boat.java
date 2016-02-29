import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Boat extends Thing implements KeyListener
{

	public Boat(int x, int y){
		super(x,y,"boat.png");
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
				System.out.println("press");
				
			case KeyEvent.VK_DOWN:
				
			case KeyEvent.VK_RIGHT:
				
			case KeyEvent.VK_LEFT:
				
				
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
