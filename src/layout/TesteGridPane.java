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
		 * Caso true, as linhas da grade serão visíveis
		 */
		setGridLinesVisible(true);

		/*
		 * Adiciona as colunas no painel de grade. A quantidade de colunas irá
		 * variar de acordo com a quantidade de parâmetros passados.
		 */
		getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
		/*
		 * Adiciona as linhas no painel de grade. A quantidade de linhas irá
		 * variar de acordo com a quantidade de parâmetros passados.
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
		 * O primeiro parâmetro é o nó que será adicionado. 
		 * O segundo, é a posicão na coluna.
		 * O terceiro, é a posição na linha.
		 * --- É possível deixar o método apenas com esses três parâmetros ---
		 * O quarto, é a quantidade de espaços que o nó ocupará nas colunas.
		 * O quinto, a quantidade de espaços que o nó ocupará nas linhas.
		 */
		add(c1, 0, 0, 2, 2);
		add(c2, 1, 1, 2, 2);
		add(c3, 2, 2, 2, 2);
		add(c4, 3, 3, 2, 2);
		
	}

	/*
	 * Esse método serve para criar colunas.
	 */
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		/*
		 * Seta o tamanho, em porcentagem, que a coluna irá ocupar.
		 */
		cc.setPercentWidth(20);
		/*
		 * Caso verdadeiro, a coluna irá se adequar ao tamanho da tela.
		 */
		cc.setFillWidth(true);
		return cc;
	}
	
	/*
	 * Esse método serve para criar colunas.
	 */
	private ColumnConstraints fcc() {
		ColumnConstraints cc = new ColumnConstraints();
		/*
		 * Seta o tamanho, em porcentagem, que a coluna irá ocupar.
		 */
//		cc.setPercentWidth(20);
		/*
		 * Seta o tamanho mínimo da coluna como sendo 200px
		 */
		cc.setMinWidth(200);
		/*
		 * Seta o tamanho máximo da coluna como sendo 200px
		 */
		cc.setMaxWidth(200);
		/*
		 * Caso verdadeiro, a coluna irá se adequar ao tamanho da tela.
		 */
		cc.setFillWidth(true);
		return cc;
	}

	/*
	 * Esse método serve para criar linhas.
	 */
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		/*
		 * Seta o tamanho, em porcentagem, que a coluna irá ocupar.
		 */
		rc.setPercentHeight(20);
		/*
		 * Caso verdadeiro, a linha irá se adequar ao tamanho da tela.
		 */
		rc.setFillHeight(true);
		return rc;
	}
}
