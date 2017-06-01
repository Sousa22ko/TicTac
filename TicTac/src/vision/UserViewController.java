package vision;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.User;
import util.LoggedUser;
import util.SceneBuilder;
import util.SourcesLoader;

public class UserViewController {
	
	@FXML
	private Label nome;
	
	@FXML
	private Label email;
	
	@FXML
	private Label criada;
	
	@FXML
	private Label utlimoA;
	
	@FXML
	private Label maiorL;
	
	@FXML
	private Label maiorP;
	
	@FXML
	private Label maiorS;
	
	@FXML
	private Label lastL;
	
	@FXML
	private Label foto;
	
	@FXML
	private Label pontuacao;
	
	@FXML
	private Pane backFoto;
	
	@FXML
	private Pane background;
	
	private User user;
	
	@FXML
	public void handlerVoltar(){
		SceneBuilder.loadHomeScreen();
	}
	
	@FXML
	public void handlerEdit(){
		SceneBuilder.loadUserViewEdit();
	}
	
	@FXML
	public void initialize(){
		user = LoggedUser.getLoggedUser();
		
		nome.setText(user.getNome());
		email.setText(user.getEmail());
		maiorS.setText("" + user.getMaxStreak());
		pontuacao.setText(""+ user.getPontuacao()); // TODO colocar o label na tela
		maiorP.setText("" + user.getMaxPontuacao());
		
		SourcesLoader.LoadBackground(background);
	}

}
