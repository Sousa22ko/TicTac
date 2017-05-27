package vision;

import java.io.File;

import org.apache.commons.validator.routines.EmailValidator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import util.SceneBuilder;
import util.SourcesLoader;

public class UserViewEditController {
	
	@FXML
	private TextField nome;
	
	@FXML
	private TextField email;
	
	@FXML
	private Label foto;
	
	@FXML
	private Pane background;
	
	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadHomeScreen();
	}
	
	@FXML
	public void handlerFoto(){
		
		FileChooser fc = new FileChooser();
		File file = new File("");
		
		file = fc.showOpenDialog(SceneBuilder.getStage());
		//TODO persistir file;
		file = file.getAbsoluteFile();
	}
	
	@FXML
	public void handlerSalvar(){
		if(nome.getText() != null && nome.getText().length() < 30){
			if(EmailValidator.getInstance().isValid(email.getText())){
				//TODO persistir informações		
			}
			else{
				//TODO mensagem de erro email invalido
			}
		}else{
			//TODO mensagem de erro nome muito grande
		}
	}
	
	@FXML
	public void handlerCancelar(){
		SceneBuilder.loadUserView();
	}
	
	@FXML
	public void initialize(){
		//TODO
		//Carregar o as informações
		//inclusive nos labels
		
		nome.setText("testando nome");
		email.setText("testando email");
		
		SourcesLoader.LoadBackground(background);
	}

}
