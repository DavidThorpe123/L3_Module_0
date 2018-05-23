package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	TextUndoRedo() {
	frame = new JFrame();
	panel = new JPanel();
	label = new JLabel();
	frame.add(panel);
	panel.add(label);
	frame.setVisible(true);
	frame.addKeyListener(this);
	frame.pack();
	
	
	}
	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	Stack<Character> letters = new Stack<Character>();
	String sentence = " ";
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String newString = "";
		char key = e.getKeyChar();
		sentence += key;
	label.setText(sentence);
	if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		letters.push(sentence.charAt(sentence.length() - 2));
	sentence = sentence.substring(0, sentence.length() - 2);
	label.setText(sentence);
		//System.out.println(sentence.substring(0, sentence.length() - 2));
	}
	if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
		sentence += letters.pop();
		System.out.println(letters.pop());
		System.out.println("Test");
	}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
