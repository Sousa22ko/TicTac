package vision;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import util.SceneBuilder;

public class UserViewController {
	
	@FXML
	public Label nome;
	
	@FXML
	public Label email;
	
	@FXML
	public Label criada;
	
	@FXML
	public Label utlimoA;
	
	@FXML
	public Label maiorL;
	
	@FXML
	public Label maiorP;
	
	@FXML
	public Label maiorS;
	
	@FXML
	public Label lastL;
	
	@FXML
	public Label foto;
	
	@FXML
	public Pane backFoto;
	
	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadHomeScreen();
	}
	
	@FXML
	public void handlerEdit(){
		//TO-DO
		//tela de edit
	}
	
	@FXML
	public void initialize(){
		//TO-DO
		//Carregar o fundo da foto e as informações
	}

}
