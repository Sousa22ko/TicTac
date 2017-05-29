package model;


import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import annotation.ColumnNameInView;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ColumnNameInView(index = 0, text = "id")
	private long idUser;

	private String nome;

	private String senha;

	private String Email;

	private byte[] foto;

	private int maxStreak;

	private Calendar lastAcess;

	private int lastLeague;

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

	public Calendar getLastAcess() {
		return lastAcess;
	}

	public void setLastAcess(Calendar lastAcess) {
		this.lastAcess = lastAcess;
	}

	public int getLastLeague() {
		return lastLeague;
	}

	public void setLastLeague(int lastLeague) {
		this.lastLeague = lastLeague;
	}
	
	
	
	
}
