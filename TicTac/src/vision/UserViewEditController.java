package vision;

import java.io.File;

import org.apache.commons.validator.routines.EmailValidator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import model.User;
import util.LoggedUser;
import util.SceneBuilder;
import util.SourcesLoader;

public class UserViewEditController {

	@FXML
	private TextField nome;
	
	@FXML
	private TextField email;
	
	@FXML
	private Label criada;
	
	@FXML
	private Label utlimoA;
	
	@FXML
	private Label maiorL;
	
	@FXML
	private Label maiorP;
	
	@FXML
	private Label maiorS;
	
	@FXML
	private Label lastL;
	
	@FXML
	private Label foto;
	
	@FXML
	private Label pontuacao;
	
	@FXML
	private Pane backFoto;
	
	@FXML
	private Pane background;
	
	private User user;

	@FXML
	public void handlerVoltar() {
		SceneBuilder.loadHomeScreen();
	}

	@FXML
	public void handlerFoto() {

		FileChooser fc = new FileChooser();
		File file = new File("");

		file = fc.showOpenDialog(SceneBuilder.getStage());
		// TODO persistir file;
		file = file.getAbsoluteFile();
	}

	@FXML
	public void handlerSalvar() {
		if (nome.getText() != null && nome.getText().length() < 30) {
			if (EmailValidator.getInstance().isValid(email.getText())) {
				// TODO persistir informações
			} else {
				// TODO mensagem de erro email invalido
			}
		} else {
			// TODO mensagem de erro nome muito grande
		}
	}

	@FXML
	public void handlerCancelar() {
		SceneBuilder.loadUserView();
	}

	@FXML
	public void initialize() {
		user = LoggedUser.getLoggedUser();

		nome.setText(user.getNome());
		email.setText(user.getEmail());
		maiorS.setText("" + user.getMaxStreak());
		pontuacao.setText("" + user.getPontuacao());
		maiorP.setText("" + user.getMaxPontuacao());

		SourcesLoader.LoadBackground(background);
	}

}
