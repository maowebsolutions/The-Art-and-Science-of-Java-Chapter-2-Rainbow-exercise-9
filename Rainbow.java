/* Create a rainbow with
* red , orange, yellow, green,
* blue, and magenta, respectively
* and cyan makes a lovely color for the sky
*/


import acm.program.*;
import acm.graphics.*;
import java.awt.*;

  public class Rainbow extends GraphicsProgram{
		
		public void init(){
			GOval cyan1Circle = new GOval(((getWidth()-1200)/2),((getHeight()-1200)/2),1200,1200);
			cyan1Circle.setColor(Color.CYAN);
			cyan1Circle.setFilled(true);
			add(cyan1Circle);
			GOval redCircle = new GOval(((getWidth()-800)/2),((getHeight()-800)/2+200),800,800);
			redCircle.setColor(Color.RED);
			redCircle.setFilled(true);
			add(redCircle);
			GOval orangeCircle = new GOval(((getWidth()-800)/2),((getHeight()-800)/2+220),800,800);
			orangeCircle.setColor(Color.ORANGE);
			orangeCircle.setFilled(true);
			add(orangeCircle);
			GOval yellowCircle = new GOval(((getWidth()-800)/2),((getHeight()-800)/2+240),800,800);
			yellowCircle.setColor(Color.YELLOW);
			yellowCircle.setFilled(true);
			add(yellowCircle);
			GOval greenCircle = new GOval(((getWidth()-800)/2),((getHeight()-800)/2+260),800,800);
			greenCircle.setColor(Color.GREEN);
			greenCircle.setFilled(true);
			add(greenCircle);
			GOval blueCircle = new GOval(((getWidth()-800)/2),((getHeight()-800)/2+280),800,800);
			blueCircle.setColor(Color.BLUE);
			blueCircle.setFilled(true);
			add(blueCircle);
			GOval magentaCircle = new GOval(((getWidth()-800)/2),((getHeight()-800)/2+300),800,800);
			magentaCircle.setColor(Color.MAGENTA);
			magentaCircle.setFilled(true);
			add(magentaCircle);
			GOval cyanCircle = new GOval(((getWidth()-800)/2),((getHeight()-800)/2+320),800,800);
			cyanCircle.setColor(Color.CYAN);
			cyanCircle.setFilled(true);
			add(cyanCircle);
		}
