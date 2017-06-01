package vision;

import dao.UserDao;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import model.User;
import util.LoggedUser;
import util.SceneBuilder;
import util.SourcesLoader;

public class Login_ScreenController {

	@FXML
	private Button login;

	@FXML
	private TextField usuario;

	@FXML
	private PasswordField senha;

	@FXML
	private Pane background;

	@FXML
	private Label error;

	private User remote = new User();

	@FXML
	public void initialize() {
		SourcesLoader.LoadBackground(background);
	}

	@FXML
	public void LoginHandler() {

		if (login()) {
			LoggedUser.setUserLogged(remote);
			SceneBuilder.loadHomeScreen();
		}
	}

	@FXML
	public void CadastroHandler() {
		SceneBuilder.loadNewAccount();
	}

	public boolean login() {
		UserDao ud = new UserDao();
		User local, remote;

		local = new User();
		local.setNome(usuario.getText());
		local.setSenha(senha.getText());

		remote = ud.getUserByName(local.getNome());

		if (UserDao.comparePassword(local, remote)) {
			this.remote = remote;
			return true;
		} else {
			error.setText("Usuario ou senha incorreto");
			return false;
		}
	}

}
