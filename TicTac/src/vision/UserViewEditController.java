package vision;

import java.io.IOException;
import java.nio.file.Files;

import javax.persistence.NoResultException;

import org.apache.commons.validator.routines.EmailValidator;

import dao.UserDao;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import model.User;
import util.LoggedUser;
import util.SceneBuilder;
import util.SourcesLoader;

public class UserViewEditController {

	@FXML
	private TextField nome;

	@FXML
	private TextField email;

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
	private Label error;

	@FXML
	private Pane backFoto;

	@FXML
	private Pane background;

	private User user;
	
	private boolean erru = false;
	private boolean erre = false;

	@FXML
	public void handlerVoltar() {
		SceneBuilder.loadHomeScreen();
	}

	@FXML
	public void handlerFoto() {

		FileChooser fc = new FileChooser();
		try {
			byte[] foto = Files.readAllBytes(fc.showOpenDialog(SceneBuilder.getStage()).toPath());
			user = LoggedUser.getLoggedUser();
			user.setFoto(foto);

			SourcesLoader.loadUserPhoto(this.foto, foto);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FXML
	public void handlerSalvar() {

		if (nome.getText() != null && nome.getText().length() < 30) {
			if (checkUni(nome.getText())) {
				user.setNome(nome.getText());
				erru = false;
			} else if(nome.getText().equals(user.getNome())){
				erru = false;
			} else{
				erru = true;
				error.setText("Usuario indisponivel");
			}
		} else {
			erru = true;
			error.setText("Usuario vazio ou muito grande (maximo 30 caracteres)");
		}

		if (EmailValidator.getInstance().isValid(email.getText())) {
			user.setEmail(email.getText());
			erre = false;
		} else {
			erre = true;
			error.setText("Email invalido");
		}
		
		if (erre == false && erru == false) {
			UserDao ud = new UserDao();
			ud.atualizar(user);// persiste no bd
			SceneBuilder.loadHomeScreen();
		}

	}
	
	// checa se o usuario tem um login unico
	private static boolean checkUni(String nome) {
		UserDao ud = new UserDao();

		try {
			User check = ud.getUserByName(nome);
		} catch (NoResultException e) {
			return true;
		}
		return false;
	}

	@FXML
	public void handlerCancelar() {
		SceneBuilder.loadUserView();
	}

	@FXML
	public void initialize() {
		user = LoggedUser.getLoggedUser();

		nome.setText(user.getNome());
		email.setText(user.getEmail());
		maiorS.setText("" + user.getMaxStreak());
		pontuacao.setText("" + user.getPontuacao());
		maiorP.setText("" + user.getMaxPontuacao());

		// System.out.println(user.getFoto().length);
		/*
		 * if (user.getFoto().length > 1) { try {
		 * SourcesLoader.loadUserPhoto(foto, user.getFoto()); } catch
		 * (IOException e) { error.setText("erro ao carregar imagem"); } }
		 */
		SourcesLoader.loadBackground(background);
	}

}
