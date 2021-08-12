package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

/*
 * Esse gerenciador � em forma de pilha. Ou seja, os objetos que s�o adicionados 
 * a ele s�o empilhados.
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
		 * Esse m�todos serve para detectar quando o mouse for clicado no painel. Repare
		 * que o evento est� sendo atribuido ao StackPane. Ou seja, esse evento est�
		 * relacionado ao painel. O 'this' antes do m�todo � opcional.
		 */
		this.setOnMouseClicked(e -> {
			/*
			 * O trecho de c�digo abaixo serve para verificar se o usu�rio clicou de um lado
			 * ou do outro lado na tela. 'e.getSceneX()' coleta as informa��es do eixo x da
			 * cena. � poss�vel tamb�m coletar as informa��es do eixo y, bem como as
			 * informa��es de toda a tela, n�o apenas da cena. A segunda parte
			 * 'getScene().getWidth() / 2' coleta as informa��es da cena, depois coleta a
			 * largura da tela e divide por dois. Isso serve para saber se o usu�rio clicou
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
		 * Mata a thread quando a aplica��o � fechada. Caso contr�rio, mesmo se a
		 * aplica��o for fechada, a Thread continua executando.
		 */
		t.setDaemon(true);
		t.start();
	}
}
