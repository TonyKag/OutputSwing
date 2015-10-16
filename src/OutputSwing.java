import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class OutputSwing {

	public static String inEditableArea = "in editable area";

	public static String labelButton1 = "Button1";
	public static String labelButton2 = "Button2";
	public static String labelButton3 = "Button3";

	public static String onTitleBar = "on title bar";
	private static int button1DimensionX = 80;
	private static int button1DimensionY = 25;
	private static int button1LocationX = 200;
	private static int button1LocationY = 200;
	private static int button2DimensionX = 80;
	private static int button2DimensionY = 25;
	private static int button2LocationX = 400;
	private static int button2LocationY = 200;
	private static int button3DimensionX = 80;
	private static int button3DimensionY = 25;
	private static int button3LocationX = 600;
	private static int button3LocationY = 200;

	private static int frameDimensionX = 700;
	private static int frameDimensionY = 500;
	private static int frameLocationX = 400;
	private static int frameLocationY = 200;

	public static void main(String[] args) {
		running();
	}

	/**
	 * 
	 */
	public static void running() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// on title bar
				JFrame frame = new JFrame(onTitleBar);
				// in editable area
				JTextArea text = new JTextArea(inEditableArea);
				// Button's Label
				// JButton button = new JButton(onButton);

				// frame.setLayout(new FlowLayout());
				frame.setLayout(null);

				frame.setPreferredSize(new Dimension(frameDimensionX, frameDimensionY));
				frame.setLocation(frameLocationX, frameLocationY);

				// frame.setLocationRelativeTo(null); // center the app
				// frame.setSize(30, 20);
				// frame.add(button).setSize(80, 90);
				frame.add(text);
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

				// frame.setLayout(new BorderLayout());

				JButton button1 = new JButton(labelButton1);

				button1.setPreferredSize(new Dimension(button1DimensionX, button1DimensionY));
				button1.setLocation(50, 10);
				button1.setBounds(40, 100, 100, 60);
				frame.add(button1);

				JButton button2 = new JButton(labelButton2);

				button2.setPreferredSize(new Dimension(button2DimensionX, button2DimensionY));
				button2.setBounds(80, 130, 150, 160);
				frame.add(button2, BorderLayout.PAGE_START);

				JButton button3 = new JButton(labelButton3);

				button3.setPreferredSize(new Dimension(button3DimensionX, button3DimensionY));
				button3.setBounds(20, 300, 10, 40);
				frame.add(button3, BorderLayout.PAGE_START);

			}
		});

	}

}