package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	
	static JButton button = new JButton();
	static JTextField answer = new JTextField(20);
	static JLabel label = new JLabel();
	
	public static void main(String[] args) {
	binaryConverter b = new binaryConverter();
	b.button1();	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setVisible(true);
	frame.add(panel);
	panel.add(answer);
	panel.add(button);
	panel.add(label);
	frame.pack();
	button.setText("Convert");
	}
	void button1(){
	button.addActionListener(this);
	
}


String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 String h = convert(answer.getText());
	 label.setText(h);
	 
}	
}


