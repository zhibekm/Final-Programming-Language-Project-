import javax.swing.JFrame;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ColorChoose colorWindow = new ColorChoose();
		colorWindow.setTitle("Color for Snake");
		colorWindow.setSize(400, 65);
		colorWindow.setLayout(new FlowLayout());//Set layout to be FlowLayout explicitly.
		colorWindow.setLocationRelativeTo(null);
		colorWindow.setVisible(true);
		colorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorWindow.stopOnWindow();
		String color = colorWindow.getColor();
		colorWindow.dispose();

		int width = 0;
		int height = 0;
		long speed = 0;

		try {
			File myObj = new File("settings.txt");
			Scanner myReader = new Scanner(myObj);

			int count = 1;
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if (count == 1) {
					width = Integer.parseInt(data);
				} else if (count == 2) {
					height = Integer.parseInt(data);
				} else if (count == 3) {
					speed = Integer.parseInt(data);
				}
				count++;

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		System.out.println("Window width is " + width);
		System.out.println("Window height is " + height);

		Window f1= new Window(speed, color);

		f1.setTitle("Snake");
		f1.setSize(width, height);
		f1.setLocationRelativeTo(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
