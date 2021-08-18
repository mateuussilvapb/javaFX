package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
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

		boolean emailValido = campoEmail.getText().equals("mateuussilvapb@gmail.com");
		boolean senhaValida = campoSenha.getText().equals("12345678");

		if (emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.showInformation();
		} else {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Usu�rio e/ou senha inv�lido(s)!")
			.showError();
		}
	}
}
