package entity;

import java.util.ArrayList;

public class Viagem {
	
	private int qtdAluno;
	private ArrayList<Aluno> alunos;
	private Motorista motorista;
	private Van van;
	
	public int getQtdAluno() {
		return qtdAluno;
	}
	public void setQtdAluno(int qtdAluno) {
		this.qtdAluno = qtdAluno;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public Van getVan() {
		return van;
	}
	public void setVan(Van van) {
		this.van = van;
	}
	
	
	
	
	

}
