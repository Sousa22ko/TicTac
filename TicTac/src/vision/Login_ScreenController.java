package vision;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import util.SceneBuilder;

public class Login_ScreenController {
	
	@FXML
	private Button login;
	
	@FXML
	private TextField usuario;
	
	@FXML
	private PasswordField senha;
	
	@FXML
	public void OnLoginHandler(){
		SceneBuilder.loadHomeScreen();
	}
	
	@FXML
	public void OnCadastroHandler(){
		SceneBuilder.loadHomeScreen();
	}

	}
