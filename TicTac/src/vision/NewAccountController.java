package vision;

import javax.persistence.NoResultException;

import org.apache.commons.validator.routines.EmailValidator;

import dao.UserDao;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import model.User;
import util.SceneBuilder;
import util.SourcesLoader;

public class NewAccountController {

	@FXML
	private TextField nome;

	@FXML
	private PasswordField senha;

	@FXML
	private TextField email;

	@FXML
	private Pane background;

	@FXML
	private Label error;

	private User novo = new User();
	private UserDao ud = new UserDao();

	private boolean erru = false;
	private boolean erre = false;

	@FXML
	public void initialize() {
		SourcesLoader.LoadBackground(background);
	}

	public void createUser() {

		if (nome.getText() != null && nome.getText().length() < 30) {
			if (checkUni()) {
				novo.setNome(nome.getText());
				erru = false;
			} else {
				erru = true;
				error.setText("Usuario indisponivel");
			}
		} else {
			erru = true;
			error.setText("Usuario vazio ou muito grande (maximo 30 caracteres)");
		}

		if (EmailValidator.getInstance().isValid(email.getText())) {
			novo.setEmail(email.getText());
			erre = false;
		} else {
			erre = true;
			error.setText("Email invalido");
		}

		novo.setSenha(senha.getText());

		// novo.setLastAcess(new Date()); TODO get server time
		novo.setMaxStreak(0);
		novo.setLastLeague(0);

		if (erre == false && erru == false) {
			ud.adicionar(novo);// persiste no bd
			SceneBuilder.loadLoginScreen();
		}
	}

	// checa se o usuario tem um login unico
	private boolean checkUni() {
		UserDao ud = new UserDao();

		try {
			User check = ud.getUserByName(nome.getText());
		} catch (NoResultException e) {
			return true;
		}
		return false;
	}

	@FXML
	public void handlerCadastrar() {
		createUser();
	}

	@FXML
	public void handlerVoltar() {
		SceneBuilder.loadLoginScreen();
	}

}
