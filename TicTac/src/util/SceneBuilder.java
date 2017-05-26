package util;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import vision.Main;

public class SceneBuilder {
	
	private static AnchorPane pane;
	private static Stage primaryStage;
	private static Dimension dimension;
	
	
	public static void setPrimaryStage(Stage stage) {
		primaryStage = stage;
	
	}
	
	public static void setDimensions(){
		dimension = Toolkit.getDefaultToolkit().getScreenSize();
		dimension.height -= 35;
		dimension.width += 5;
		
	}
	
	public static Object getComponent(String path) {

		setDimensions();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource(path));

		try {
			return loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public static void removePaneComponent(Node removed) {
		pane.getChildren().remove(removed);
	}
	
	
	/*public static void loadSettings(){
		ScreenBuilder.load_stage(pane, primaryStage);
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);
	}*/
	
	//--------------------------------------------renderização dos senarios
	public static void loadLoginScreen(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderLoginScreen();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);
	}

	public static void loadHomeScreen(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderHomePage();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);		
	}
	
	public static void loadSearchMatch(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderSearchMatchPage();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);	
	}
	
	public static void loadLeague(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderLeague();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);	
	}
	
	public static void loadNewMatch(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderNewMatch();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);	
	}

	public static void loadOldResults(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderOldResults();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);	
	}

	public static void loadChallenger(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderChallenger();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);
	}
	
	public static void loadConfig(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderConfig();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);
	}
	
	public static void loadUserView(){
		ScreenBuilder.load_stage(pane, primaryStage);
		
		ScreenBuilder.renderUserView();
		
		primaryStage.setWidth(dimension.width);
		primaryStage.setHeight(dimension.height);
	}

}

