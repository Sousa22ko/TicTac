package vision;

import javafx.fxml.FXML;
import util.SceneBuilder;

public class LeagueController {
	
	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadHomeScreen();
	}

}
