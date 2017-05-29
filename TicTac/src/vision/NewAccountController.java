package vision;

import java.io.File;

import org.apache.commons.validator.routines.EmailValidator;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import model.User;
import util.SceneBuilder;

public class NewAccountController {

	@FXML
	private TextField nome;

	@FXML
	private PasswordField senha;

	@FXML
	private TextField email;

	private User novo = new User();
	File file = null;

	public void createUser() {
		if (nome.getText() != null && nome.getText().length() < 30) {
			novo.setNome(nome.getText());
		}

		if (EmailValidator.getInstance().isValid(email.getText())) {
			novo.setEmail(email.getText());
		}

		novo.setSenha(senha.getText());
		
		
		byte [] fot = new byte[1024];
		if (file != null) {
			novo.setFoto(fot);//new ImageIcon(file.getAbsolutePath()));
		}
		else{
			novo.setFoto(fot); // padrão
		}
			
		// novo.setLastAcess(new Date()); TODO get server time
		novo.setMaxStreak(0);
		novo.setLastLeague(0);
		// novo.setIdUser(); TODO
	}

	@FXML
	public void handlerCadastrar() {
		createUser();
	}

	@FXML
	public void handlerFoto() {

		FileChooser fc = new FileChooser();
		file = new File("");

		file = fc.showOpenDialog(SceneBuilder.getStage());
	}

	@FXML
	public void handlerCancelar() {
		SceneBuilder.loadUserView();
	}

	@FXML
	public void handlerVoltar() {
		SceneBuilder.loadLoginScreen();
	}

}
