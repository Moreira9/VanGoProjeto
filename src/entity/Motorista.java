package entity;

import java.util.Date;

public class Motorista {
	
	private int numeroCnh;
	private String categoriaCnh;
	private Date validadeCnh;
	private String instituicaoQueAtende;
	
	public int getNumeroCnh() {
		return numeroCnh;
	}
	public void setNumeroCnh(int numeroCnh) {
		this.numeroCnh = numeroCnh;
	}
	public String getCategoriaCnh() {
		return categoriaCnh;
	}
	public void setCategoriaCnh(String categoriaCnh) {
		this.categoriaCnh = categoriaCnh;
	}
	public Date getValidadeCnh() {
		return validadeCnh;
	}
	public void setValidadeCnh(Date validadeCnh) {
		this.validadeCnh = validadeCnh;
	}
	public String getInstituicaoQueAtende() {
		return instituicaoQueAtende;
	}
	public void setInstituicaoQueAtende(String instituicaoQueAtende) {
		this.instituicaoQueAtende = instituicaoQueAtende;
	}
	
	

}
