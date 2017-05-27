package vision;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
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
	public void initialize(){
		SourcesLoader.LoadBackground(background);
	}
	
	@FXML
	public void LoginHandler(){
		SceneBuilder.loadHomeScreen();
	}
	
	@FXML
	public void CadastroHandler(){
		SceneBuilder.loadNewAccount();
	}

	}
