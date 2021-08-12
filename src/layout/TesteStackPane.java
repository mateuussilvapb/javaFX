package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

/*
 * Esse gerenciador é em forma de pilha. Ou seja, os objetos que são adicionados 
 * a ele são empilhados.
 */
public class TesteStackPane extends StackPane {

	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		getChildren().addAll(c2, c3, c4, c5, c6, c1);

		/*
		 * Esse métodos serve para detectar quando o mouse for clicado no painel. Repare
		 * que o evento está sendo atribuido ao StackPane. Ou seja, esse evento está
		 * relacionado ao painel. O 'this' antes do método é opcional.
		 */
		this.setOnMouseClicked(e -> {
			/*
			 * O trecho de código abaixo serve para verificar se o usuário clicou de um lado
			 * ou do outro lado na tela. 'e.getSceneX()' coleta as informações do eixo x da
			 * cena. É possível também coletar as informações do eixo y, bem como as
			 * informações de toda a tela, não apenas da cena. A segunda parte
			 * 'getScene().getWidth() / 2' coleta as informações da cena, depois coleta a
			 * largura da tela e divide por dois. Isso serve para saber se o usuário clicou
			 * do lado direito da tela.
			 */
			if (e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();
			} else {
				getChildren().get(5).toBack();
			}
		});

		Thread t = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
				} catch (Exception e1) {
				}
			}
		});

		/*
		 * Mata a thread quando a aplicação é fechada. Caso contrário, mesmo se a
		 * aplicação for fechada, a Thread continua executando.
		 */
		t.setDaemon(true);
		t.start();
	}
}
