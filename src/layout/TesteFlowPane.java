package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();

		/*
		 * Seta a distância entre os elementos na horizontal de 20px
		 */
		setHgap(20);
		/*
		 * Seta a distância entre os elementos na vertical de 20px
		 */
		setVgap(20);
		/*
		 * Seta a distância da borda em 10px para todos os elementos
		 */
		setPadding(new Insets(10));
		/*
		 * Seta a orientação dos objetos com sendo Vertical
		 */
		setOrientation(Orientation.VERTICAL);
		/*
		 * Seta a orientação dos objetos com sendo Vertical (essa é a orientação padrão,
		 * porém foi adicionada apenas para ilustração)
		 */
		setOrientation(Orientation.HORIZONTAL);
		/*
		 * Posicionaos elementos no centro
		 */
		setAlignment(Pos.CENTER);

		/*
		 * Adiciona todos os elementos ao FlowPane
		 */
		getChildren().addAll(q1, q2, q3, q4, q5);

	}
}
