import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Recursion extends JPanel implements ActionListener{
	
	/* this method should recursive draw concentric rings */
	public void concentricCircles(Graphics g, int width, int x, int y) {
		 if(width == 0) {
			 return;
		 } else {
			 
			 int red = (int)(Math.random()*256);
			 int green = (int)(Math.random()*256);
			 int blue = (int)(Math.random()*256);
			 g.setColor(new Color(red, green, blue));
			 g.drawOval(x, y, width, width);
			 
			 concentricCircles(g, width-4, x + 2, y + 2);
		 }
		
		
		
	}
	public void slinky(Graphics g, int width, int x, int y) {
		 if(width <= 0) {
			 return;
		 } else {
			 
			 int red = (int)(Math.random()*256);
			 int green = (int)(Math.random()*256);
			 int blue = (int)(Math.random()*256);
			 g.setColor(new Color(red, green, blue));
			 g.drawOval(x, y, width, width);
			 
		 }
		 }
	
	public void squares(Graphics g, int width, int x, int y) {
		//add the additional parameters (arguments) so that you can call
		//on the method recursively
		if(width == 0) {
			return;
		} else {
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.fillRect(x, y, width, width);
			
			this.squares(g, width/3, x+width/3, y-2*width/3);
			this.squares(g, width/3, x+width/3, y+4*width/3);
			this.squares(g, width/3, x-2*width/3, y+width/3);
			this.squares(g, width/3, x+4*width/3, y+1*width/3);
			this.squares(g, width/3, x+4*width/3, y-2*width/3);
			this.squares(g, width/3, x-2*width/3, y-2*width/3);
			this.squares(g, width/3, x+4*width/3, y+4*width/3);
			this.squares(g, width/3, x-2*width/3, y+4*width/3);
		}
		
		
		
	}
	
	
	
	
	public void clover(Graphics g, int width, int x, int y) { //What additional variables will you need to draw the shape?
		
		
	
		
		//focus on 1 quadrant - get the shape for top left quadrant
		
		if(width >= 200) {
			return;
		}
		else {
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			
			
			g.drawOval(x, y, width, width);
			g.drawOval(x- width, y, width, width);
			g.drawOval(x, y - width, width, width);
			g.drawOval(x - width, y - width, width, width);
			
			clover(g, width + 4, x, y);
			
			
			
			
		}
		
		
		
	}
	public void snowFlake(Graphics g, int length, int x, int y) {
		 
		 if(length <= 0) {
			 return;
		 } else {
			 int red = (int)(Math.random()*256);
			 int green = (int)(Math.random()*256);
			 int blue = (int)(Math.random()*256);
			 g.setColor(new Color(red, green, blue));
			 
			 g.drawLine(x, y, x + length-length/3, y + length);
			 g.drawLine(x, y, x + length + length/3, y);
			 g.drawLine(x, y, x - length+length/3, y + length);
			 g.drawLine(x, y, x - length+length/3, y - length);
			 g.drawLine(x, y, x + length-length/3, y - length);
			 g.drawLine(x, y, x - length - length/3, y);
			 
			 snowFlake(g, length/4, x + length-length/3, y + length);
			 snowFlake(g, length/4, x + length + length/3, y);
			 snowFlake(g, length/4, x - length+length/3, y + length);
			 snowFlake(g, length/4, x - length+length/3, y - length);
			 snowFlake(g, length/4, x + length-length/3, y - length);
			 snowFlake(g, length/4, x - length - length/3, y);
			 
			 
			 
			 
			 
		 }
			
			 
    }
	


	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 2000, 2000);
		
		//this.concentricCircles(g, 200, 50, 50);
		
		this.clover(g, 0, 1000, 400);
		this.squares(g, 200, 1505, 200);
		snowFlake(g, 100, 400, 400);
		

	} //my code should go above this bracket unless I know about classes
	
	public static void main(String[] arg) {
		
		// line of code to create a MethodPractice object
		Recursion m = new Recursion();
	
	}// end of main method body 
	
	
	//constructor for the class
	//kind of looks like a method but no return type!!!
	public Recursion() {
		JFrame f = new JFrame("Recursive Methods");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(1920,1800);
 		t.start();
		f.add(this);
		f.setVisible(true);
		
	}
	Timer t = new Timer(100, this);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}//last curly - do not delete