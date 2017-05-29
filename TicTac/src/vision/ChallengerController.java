package vision;

import javafx.fxml.FXML;
import util.SceneBuilder;

public class ChallengerController {

	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadHomeScreen();
	}

}
