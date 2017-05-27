package vision;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import model.Salas;
import model.User;
import util.SceneBuilder;
import util.SourcesLoader;

public class NewMatchController {
	
	// -------------------------------------- tudo errado ----------------------------------------------//
	@FXML
	private ListView<Salas> salas;
	
	@FXML
	private ListView<User> amigos;
	
	@FXML
	private ListView<User> liga;
	
	@FXML
	private Pane background;
	
	@FXML
	public void initialize(){
		//TODO adicionar informação as listas
		SourcesLoader.LoadBackground(background);
		
	}
	
	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadHomeScreen();
	}
	
	@FXML
	public void handlerFastMatch(){
		
		//TODO insanidades
		//procurar jogador aleatório
		//renderizar tela de jogo
		//iniciar a sala da partida
	}

}
