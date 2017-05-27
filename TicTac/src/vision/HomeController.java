package vision;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import util.SceneBuilder;
import util.SourcesLoader;

public class HomeController {

	@FXML
	private Label nome;
	
	@FXML 
	private Label pontuacao;
	
	@FXML
	private Pane background;
	
	@FXML
	private Button liga;
	
	
	@FXML
	public void initialize(){
		//TO-DO
		//load nome pontuação league
		
		SourcesLoader.LoadBackground(background);
	}
	
	@FXML
	public void handlerUserButton(){
		SceneBuilder.loadUserView();
	}
	
	@FXML
	public void handlerConfigButton(){
		SceneBuilder.loadConfig();
	}
	
	@FXML
	public void handlerLeagueButton(){
		SceneBuilder.loadLeague();
	}
	
	@FXML
	public void handlerSearchMatchButton(){
		SceneBuilder.loadSearchMatch();
	}
	
	@FXML
	public void handlerNewMatch(){
		SceneBuilder.loadNewMatch();	
	}
	
	@FXML
	public void handlerOldResults(){
		SceneBuilder.loadOldResults();
	}
	
	@FXML
	public void handlerChallenger(){
		SceneBuilder.loadChallenger();
	}
}
