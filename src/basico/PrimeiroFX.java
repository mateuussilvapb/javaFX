package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		/*
		 * Cria um botão
		 */
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		botaoA.setOnAction(e -> {
			System.out.println("A");
			System.exit(0);
		});
		botaoB.setOnAction(e -> {
			System.out.println("B");
			System.exit(0);
		});
		botaoC.setOnAction(e -> {
			System.out.println("C");
			System.exit(0);
		});
		/*
		 * Cria uma caixa Vertical para armazenar objetos (botões, por exemplo). Para
		 * horizontal, HBox.
		 */
		VBox box = new VBox();
		/*
		 * Alinha a caixa no centro.
		 */
		box.setAlignment(Pos.CENTER);
		/*
		 * Seta espaço entre os objetos.
		 */
		box.setSpacing(10);
		/*
		 * Adiciona os objetos a caixa
		 */
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		/*
		 * Adiciona a caixa a cena
		 */
		Scene cena = new Scene(box, 100, 150);
		/*
		 * Seta a cena no palco.
		 */

		primaryStage.setScene(cena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
