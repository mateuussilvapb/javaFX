package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label lblTitulo = new Label("Contator");
		Label lblNumero = new Label("0");
		lblNumero.getStyleClass().add("numero");
		lblTitulo.getStyleClass().add("titulo");

		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.getChildren().add(lblTitulo);
		boxConteudo.getChildren().add(lblNumero);

		Button btnIncremento = new Button("+");
		Button btnDecremento = new Button("-");
		btnIncremento.getStyleClass().add("botao");
		btnDecremento.getStyleClass().add("botao");
		btnIncremento.setOnAction(e -> {
			contador++;
			atualizarLabel(lblNumero);
		});
		btnDecremento.setOnAction(e -> {
			contador--;
			atualizarLabel(lblNumero);
		});

		HBox boxBotoes = new HBox();
		boxBotoes.getChildren().add(btnDecremento);
		boxBotoes.getChildren().add(btnIncremento);
		boxConteudo.getChildren().add(boxBotoes);

		boxConteudo.setAlignment(Pos.CENTER);
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxConteudo.setSpacing(10);

		String caminhoCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();

	}

	private void atualizarLabel(Label lbl) {
		lbl.setText(Integer.toString(contador));
		lbl.getStyleClass().remove("positivo");
		lbl.getStyleClass().remove("negativo");
		lbl.getStyleClass().remove("numero");
		if (contador > 0) {
			lbl.getStyleClass().add("positivo");
		} else if (contador < 0) {
			lbl.getStyleClass().add("negativo");
		} else {
			lbl.getStyleClass().add("numero");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
