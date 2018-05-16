package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
ArrayList<String> names = new ArrayList<String>();

	GuestBook() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		button2 = new JButton();
		button.setText("Add Name");
		button2.setText("View Names");
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String name = JOptionPane.showInputDialog("Enter a name");
			names.add(name);
			
		}
		if (e.getSource() == button2) {
			String n = "";
			for (int i = 0; i < names.size(); i++) {
			n += "Guest #" + (i + 1) + names.get(i) + "\n";
			
			}
			JOptionPane.showMessageDialog(null, n);
		}
		
	}
}
