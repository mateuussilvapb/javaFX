package layout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

/*
 * Todos os espacinhos possuem o mesmo tamanho.
 * Os espa�os s�o definidos pela pr�pria classe.
 */
public class TesteTilePane extends TilePane {

	public TesteTilePane() {

		List<Quadrado> quadrados = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}

		/*
		 * Seta a posi��o do objeto dentro do tile na parte de baixo do lado direito.
		 */
		setTileAlignment(Pos.BOTTOM_RIGHT);

		getChildren().addAll(quadrados);
	}
}
