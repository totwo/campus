/**
 * 
 */
package Other.XianJing;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 无用的设置Button大小
 */

class CustomButton extends Button{
    public CustomButton(String title){
        super(title); 
//        setSize(100, 100);
        System.out.println("Size of button is : " + this.getSize());
    }
    
    public Dimension getMinimumSize(){ 
    	return new Dimension(100,100); 
	}
    
    public Dimension getPreferredSize(){ 
    	return getMinimumSize(); 
	}
}


public class BadSetSize extends Frame{   
    TextArea status;
    public BadSetSize(){
        super("Bad Set Size");
        setLayout(new GridLayout(2,0,2,2));
        Panel p = new Panel();
        CustomButton button = new CustomButton("Press Me");
        p.add(button);
        add(p);
        status = new TextArea(3, 50);
        status.append("Button size before display: " + button.getSize() + "\n");
        add(status);
        addWindowListener(new WindowAdapter(){
                            public void windowClosing(WindowEvent we){
                            	System.exit(1); 
                        	}
                          });
        setLocation(100,100);
        pack();
        setVisible(true);
        status.append("Button size after display: " + button.getSize());        
    }
    public static void main(String args []){
        new BadSetSize();          
    }
}
