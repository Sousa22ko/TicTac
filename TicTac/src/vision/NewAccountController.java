package vision;

import javafx.fxml.FXML;
import util.SceneBuilder;

public class NewAccountController {
	
	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadLoginScreen();
	}

}
