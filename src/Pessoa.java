import java.util.Calendar;

public class Pessoa {
	private int id;
		
	private String nome;
	private String sobrenome;	
	private Calendar data;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
} 