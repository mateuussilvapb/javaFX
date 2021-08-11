package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane {

	public TesteAnchorPane() {

		Quadrado q1 = new Quadrado();
		/*
		 * Seta a posição do elemento na esquerda, com espaço de distância da borda de
		 * 10.0 px.
		 */
		setLeftAnchor(q1, 10.0);
		/*
		 * Seta a posição do elemento no topo, com espaço de distância da borda de 10.0
		 * px.
		 */
		setTopAnchor(q1, 10.0);

		Quadrado q2 = new Quadrado();
		/*
		 * Seta a posição do elemento no topo, com espaço de distância da borda de 10.0
		 * px.
		 */
		setTopAnchor(q2, 10.0);
		/*
		 * Seta a posição do elemento na direita, com espaço de distância da borda de
		 * 10.0 px.
		 */
		setRightAnchor(q2, 10.0);

		Quadrado q3 = new Quadrado();
		/*
		 * Seta a posição do elemento na parte de baixo, com espaço de distância da
		 * borda de 10.0 px.
		 */
		setBottomAnchor(q3, 10.0);
		/*
		 * Seta a posição do elemento na esquerda, com espaço de distância da borda de
		 * 10.0 px.
		 */
		setLeftAnchor(q3, 10.0);

		Quadrado q4 = new Quadrado();
		/*
		 * Seta a posição do elemento na parte de baixo, com espaço de distância da
		 * borda de 10.0 px.
		 */
		setBottomAnchor(q4, 10.0);
		/*
		 * Seta a posição do elemento na direita, com espaço de distância da borda de
		 * 10.0 px.
		 */
		setRightAnchor(q4, 10.0);

		Quadrado q5 = new Quadrado();

		/*
		 * Cria uma caixa horizontal
		 */
		HBox centro = new HBox();
		/*
		 * Seta o alinhamento da caixa no centro
		 */
		centro.setAlignment(Pos.CENTER);
		/*
		 * Define a posição que a caixa irá ocupar. Nesse caso, aplicando uma distância
		 * de 110px de cada borda
		 */
		setTopAnchor(centro, 110.0);
		setBottomAnchor(centro, 110.0);
		setLeftAnchor(centro, 110.0);
		setRightAnchor(centro, 110.0);

		/*
		 * Adiciona o quadrado q5 a caixa
		 */
		centro.getChildren().add(q5);

		/*
		 * Adiciona todos os elementos criados anteriormente ao AnchorPane
		 */
		getChildren().addAll(q1, q2, q3, q4, centro);
	}

}
