package util;

import javafx.scene.layout.Pane;

public class SourcesLoader {
	
	
	public static void LoadBackground(Pane background){
		
		background.setStyle("-fx-background-image: url(sources/Background.jpg);-fx-background-position: center center;" + 
	               "-fx-background-repeat: stretch; -fx-background-size : cover;");
	}

}
