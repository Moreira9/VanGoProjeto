package entity;

public class Aluno extends Usuario {
	
	private String numeroMatricula;
	private String curso;
	private int anoEntrada;
	private String instituicaoQueEstuda;
	
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAnoEntrada() {
		return anoEntrada;
	}
	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	public String getInstituicaoQueEstuda() {
		return instituicaoQueEstuda;
	}
	public void setInstituicaoQueEstuda(String instituicaoQueEstuda) {
		this.instituicaoQueEstuda = instituicaoQueEstuda;
	}
	
	

}
