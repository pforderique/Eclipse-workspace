package MathPacket;
/**
* Use this class to find the greatest common factor of two numbers
* Program uses the Euclidean Algorithm
* 
* @author Piero Orderique
* @version 1
* @date 2/13/19
*
*/
import javax.swing.JOptionPane;
public class Gcf {
	private static int gcf;
	private static String input1,input2;
	
	public Gcf(int a, int b) {
		gcf = calculateGcf(a,b);
		System.out.println(gcf);
	}
	
	public static int calculateGcf(int a, int b) {
		int temp;
		if(a<b) {
			temp = a;
			a = b;
			b = temp;
		}
		while(a%b != 0) {
			temp = a;
			a = b;
			b = temp%b;
		}
		return b;
	}
	public int getGcf() {
		return gcf;
	}

	//Only runs if you run this class
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Finds the greatest common factor of two numbers");
		input1 = JOptionPane.showInputDialog(null, "first number: ");
		input2 = JOptionPane.showInputDialog(null, "second number: ");
		JOptionPane.showMessageDialog(null, "GCF: " + calculateGcf(Integer.parseInt(input1),Integer.parseInt(input2)));
	}
}
