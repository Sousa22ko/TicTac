package util;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ScreenBuilder {
	
	public static String path;
	public static String title;
	private static AnchorPane pane;
	private static Stage primaryStage;
	
	//carrega o pane e o stage
	public static void load_stage(AnchorPane paneout, Stage primaryStageout){
		pane = paneout;
		primaryStage = primaryStageout;
	} 
	
	//------------------------------ cria as telas
	public static void renderLoginScreen(){
		
		path = "Login_Screen.fxml";
		title = "Login";
		buildScreen();

	}
	
	
	public static void renderHomePage(){
		
		path = "Home.fxml";
		title = "Home";
		buildScreen();

	}	
	
	
	public static void renderSearchMatchPage(){
		
		path = "SearchMatch.fxml";
		title = "Procurar partida";
		buildScreen();

	}
	
	public static void renderLeague(){
		
		path = "League.fxml";
		title = "Liga atual";
		buildScreen();

	}
	
	public static void renderNewMatch(){
		
		path = "NewMatch.fxml";
		title = "Criar partida";
		buildScreen();

	}
	
	
	public static void renderOldResults(){
		
		path = "OldResults.fxml";
		title = "Resultados anteriores";
		buildScreen();

	}
	
	public static void renderChallenger(){
		
		path = "Challenger.fxml";
		title = "Desafiar jogador";
		buildScreen();

	}
		
	public static void renderConfig(){
		
		path = "Config.fxml";
		title = "Configurações";
		buildScreen();

	}
	
	public static void renderUserView(){
		
		path = "UserView.fxml";
		title = "Usuario";
		buildScreen();

	}
	
	
	//-----------------------------------constroi as telas
	
	public static void buildScreen(){
		pane = (AnchorPane) SceneBuilder.getComponent(path);
		primaryStage.setTitle(title);
		
		
		primaryStage.setMaximized(true);
		primaryStage.setResizable(false);
		primaryStage.setScene(new Scene(pane));
		
		primaryStage.show();
		
	}

}
