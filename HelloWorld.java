package entrega1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		Date data = new Date();
	    String formato = "HH:mm:ss";
	    DateFormat dateFormat = new SimpleDateFormat(formato);
	    String dataFormatada = dateFormat.format(data);
		return "São " + dataFormatada + ", Hello World " + nome + "!";
	}
}
