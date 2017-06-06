package vision;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.User;
import util.LoggedUser;
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
	
	private User user;
	
	@FXML
	public void initialize(){
		user = LoggedUser.getLoggedUser();

		nome.setText(user.getNome());
		pontuacao.setText(""+user.getPontuacao());
		
		//TODO colocar ft no bt 
		//TODO carregar cor da liga no bt
		
		SourcesLoader.loadBackground(background);
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
