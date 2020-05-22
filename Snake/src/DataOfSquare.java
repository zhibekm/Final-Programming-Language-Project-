import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {


	ArrayList<Color> C =new ArrayList<Color>();
	int color;
	SquarePanel square;
	public DataOfSquare(int col, String snakeColor){

		if (snakeColor.equals("blue")) {
			C.add(Color.blue);
		} else if (snakeColor.equals("green")) {
			C.add(Color.green);
		} else if (snakeColor.equals("darkGrey")) {
			C.add(Color.darkGray);
		}

		C.add(Color.red);
		C.add(Color.white);
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
