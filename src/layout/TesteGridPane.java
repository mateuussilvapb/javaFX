package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {

	public TesteGridPane() {

		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		/*
		 * Caso true, as linhas da grade ser�o vis�veis
		 */
		setGridLinesVisible(true);

		/*
		 * Adiciona as colunas no painel de grade. A quantidade de colunas ir�
		 * variar de acordo com a quantidade de par�metros passados.
		 */
		getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
		/*
		 * Adiciona as linhas no painel de grade. A quantidade de linhas ir�
		 * variar de acordo com a quantidade de par�metros passados.
		 */
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc());
		
		/*
		 * Seta as colunas com 10px
		 */
		setVgap(10);
		/*
		 * Seta as linhas com 10px
		 */
		setHgap(10);
		
		/*
		 * O primeiro par�metro � o n� que ser� adicionado. 
		 * O segundo, � a posic�o na coluna.
		 * O terceiro, � a posi��o na linha.
		 * --- � poss�vel deixar o m�todo apenas com esses tr�s par�metros ---
		 * O quarto, � a quantidade de espa�os que o n� ocupar� nas colunas.
		 * O quinto, a quantidade de espa�os que o n� ocupar� nas linhas.
		 */
		add(c1, 0, 0, 2, 2);
		add(c2, 1, 1, 2, 2);
		add(c3, 2, 2, 2, 2);
		add(c4, 3, 3, 2, 2);
		
	}

	/*
	 * Esse m�todo serve para criar colunas.
	 */
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		/*
		 * Seta o tamanho, em porcentagem, que a coluna ir� ocupar.
		 */
		cc.setPercentWidth(20);
		/*
		 * Caso verdadeiro, a coluna ir� se adequar ao tamanho da tela.
		 */
		cc.setFillWidth(true);
		return cc;
	}
	
	/*
	 * Esse m�todo serve para criar colunas.
	 */
	private ColumnConstraints fcc() {
		ColumnConstraints cc = new ColumnConstraints();
		/*
		 * Seta o tamanho, em porcentagem, que a coluna ir� ocupar.
		 */
//		cc.setPercentWidth(20);
		/*
		 * Seta o tamanho m�nimo da coluna como sendo 200px
		 */
		cc.setMinWidth(200);
		/*
		 * Seta o tamanho m�ximo da coluna como sendo 200px
		 */
		cc.setMaxWidth(200);
		/*
		 * Caso verdadeiro, a coluna ir� se adequar ao tamanho da tela.
		 */
		cc.setFillWidth(true);
		return cc;
	}

	/*
	 * Esse m�todo serve para criar linhas.
	 */
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		/*
		 * Seta o tamanho, em porcentagem, que a coluna ir� ocupar.
		 */
		rc.setPercentHeight(20);
		/*
		 * Caso verdadeiro, a linha ir� se adequar ao tamanho da tela.
		 */
		rc.setFillHeight(true);
		return rc;
	}
}
