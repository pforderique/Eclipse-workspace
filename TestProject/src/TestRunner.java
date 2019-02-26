import java.util.*;
import javax.swing.JOptionPane;
import SnakeGame.Entity; //class from another package within the project = packageName.className   
import MathPacket.Gcf;  //In order to use a class from another project, you have to put the project in the java path dependency
public class TestRunner {
	
	public static void main(String[] args) {
		System.out.println(16%3.3); //2.8
		System.out.println(3%3.3); //3.0
		System.out.println(4/2/5); //0
		System.out.println((int)4.0); //4
		System.out.println(1 + (double)3); //4.0
		System.out.println(1+5.0); //6.0
		System.out.println((int)Math.pow(2, 4)%3/(float)1.0); //1.0
	}
}
