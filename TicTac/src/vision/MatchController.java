package vision;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import util.SceneBuilder;
import util.SourcesLoader;

public class MatchController {

	@FXML
	private Pane background;
	
	@FXML
	public void initialize(){
		SourcesLoader.loadBackground(background);
	}
	
	
	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadSearchMatch();
	} 
	
	@FXML
	public void handlerVoltarInicio(){
		SceneBuilder.loadHomeScreen();
	}
	
}
