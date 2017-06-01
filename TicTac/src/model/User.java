package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import annotation.ColumnNameInView;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ColumnNameInView(index = 0, text = "id")
	private long idUser;

	@Column(name = "nome")
	private String nome;

	@Column(name = "senha")
	private String senha;

	@Column(name = "email")
	private String Email;

	@Lob
	@Column(name = "foto")
	private byte[] foto;

	@Column(name = "maxStreak")
	private int maxStreak;

	//private Calendar lastAcess;

	@Column(name = "lastLeague")
	private int lastLeague;
	
	@Column(name = "pontuacao")
	private int pontuacao;
	
	@Column(name = "maxPontuacao")
	private int maxPontuacao;
	
	
	//------------------------------------methods----------------------------//

	public User(){
		
		//TODO esta dando problema no maxPontuação = null
		maxPontuacao = 0;
		pontuacao = 0;
		maxStreak = 0;
	}
	
	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public int getMaxStreak() {
		return maxStreak;
	}

	public void setMaxStreak(int maxStreak) {
		this.maxStreak = maxStreak;
	}


	public int getLastLeague() {
		return lastLeague;
	}

	public void setLastLeague(int lastLeague) {
		this.lastLeague = lastLeague;
	}
	
	public int getPontuacao(){
		return pontuacao;
	}
	
	public void setPontuacao(int p){
		pontuacao = p;
	}
	
	public int getMaxPontuacao(){
		return maxPontuacao;
	}
	
	public void setMaxPontuacao(int p){
		maxPontuacao = p;
	}
	
}
