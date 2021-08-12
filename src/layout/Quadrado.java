package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/*
 * A diferen�a entre o quadrado e a caixa � que o quadrado n�o se adapta
 * ao tamanho.
 */
public class Quadrado extends Rectangle {

	private static int i = 0;

	public String[] cores = { "#c33c5e", "#39aac6", "#28d79a", "#fb750e", "#6657a8", "#f9060e" };

	public Quadrado() {
		this(100);
	}

	public Quadrado(int tamanho) {
		
		setWidth(tamanho);
		setHeight(tamanho);
		
		setFill(Color.web(cores[i]));
		
		i++;
		if (i == 6) {
			i = 0;
		}
	}

}
