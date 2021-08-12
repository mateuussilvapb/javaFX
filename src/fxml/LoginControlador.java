package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	/*
	 * A marca��o 'FXML' serve para realizar o mapeamento, indicando que esses
	 * campos est�o relacionados ao arquivo FXML.
	 */
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;

	public void entrar() {
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
	}
}
