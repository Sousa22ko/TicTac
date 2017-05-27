package vision;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import util.SceneBuilder;
import util.SourcesLoader;

public class UserViewController {
	
	@FXML
	private Label nome;
	
	@FXML
	private Label email;
	
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
	private Pane backFoto;
	
	@FXML
	private Pane background;
	
	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadHomeScreen();
	}
	
	@FXML
	public void handlerEdit(){
		//TODO
		//tela de edit
		SceneBuilder.loadUserViewEdit();
	}
	
	@FXML
	public void initialize(){
		//TODO
		//Carregar o fundo da foto e as informações
		SourcesLoader.LoadBackground(background);
	}

}
