import java.io.*;
import java.time.*;
import java.util.ArrayList;

//Vinicius Rodrigues Silva Costa, a40681
//Fiz alguns comentarios para explicar a classe, se ficar muito poluido excluí

public class Espetaculo implements Serializable {

	private LocalTime duracao, horaInicio, horaFim; 	// A quantidade de tempo em horas e minuto, horarios de começo e fim do espetaculo
	private static int total = 0; 						// o total de espetaculos
	private String tipo, local; 						// Tipo de espetaculo que vai ocorrer, e o local onde vai ocorrer o espetaculo
	private LocalDate data;								// A data que vai ocorrer o espetaculo
	private int id; 									// Gera um id automatico ao cria
	ArrayList<Espetaculo> espetaculo = new ArrayList();
	
	public Espetaculo() {

		total = total + 1;
		tipo = "Não Definido!";
		data = LocalDate.of(1, 1, 1); 					// Ano, mes, dia obs: Não consegui colocar a zero pois (ano) so vai de 1 a infinito, (mes)
		local = tipo; 									// vai de 1 a 12 e dia depede do mes mas geralmente de 0 a 30
		duracao = LocalTime.of(0, 0);
		horaInicio = LocalTime.of(0, 0);
		horaFim = LocalTime.of(0, 0);
		id = 1000 + total; 								// Gera um id automatico ao cria pode ser mudado se quiser

	}

														//Achei melhor so colocar dois contructors pois o main teria um monte de opcoes e 
														// daria mais trabalho para coloca no main entao preferi criar so dois

	public Espetaculo(String tipo, String local, LocalTime duracao, LocalDate data, LocalTime horaInicio,LocalTime horaFim) {

		total = total + 1;
		this.duracao = duracao;
		this.tipo = tipo;
		this.local = local;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		id = 1000 + total;

	}

	public LocalTime getDuracao() {
		return duracao;
		
	}

	public void setDuracao(int hora,int min) {
		
		duracao = LocalTime.of(hora, min);
		
	}

	public LocalTime getHoraInicio() {
		
		return horaInicio;
		
	}

	public void setHoraInicio(int hora,int min) {
		
		horaInicio = LocalTime.of(hora, min);
		
	}

	public LocalTime getHoraFim() {
		
		return horaFim;
		
	}

	public void setHoraFim(int hora,int min) {
		
		horaFim = LocalTime.of(hora, min);
		
	}

	public String getTipo() {
		
		return tipo;
		
	}

	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
	}

	public String getLocal() {
		
		return local;
		
	}

	public void setLocal(String local) {
		
		this.local = local;
		
	}

	public LocalDate getData() {
		
		return data;
		
	}

	public void setData(int ano,int mes, int dia) {
		
		data = LocalDate.of(ano,mes,dia);
		
	}

	public int getId() {
		
		return id;
		
	}

	public void setId(int id) {
		
		this.id = id;
		
	}

	public static int getTotal() {
		
		return total;
		
	}

	public String toString() {
		
		return "Total de Espetaculos: " + total +", ID:  "+ id + ", Duração: " + duracao + ", Tipo: " + tipo + ", Local: " + local + ", Data: " + data
				+ ", Hora de Início: " + horaInicio + ", Hora do Fim: " + horaFim;
		
	}													// quebrei a linha para não ficar muito grande mas funciona do mesmo jeito

	public Object clone() {
		
		Espetaculo aux = new Espetaculo(tipo, local, duracao, data, horaInicio, horaFim);
		aux.setId(this.id);
		return aux;
		
	}
	

	public boolean equals(Object espetaculo) {
		if ( espetaculo != null && this.getClass() == espetaculo.getClass() ) {
			
			Espetaculo aux = (Espetaculo) espetaculo;
		
			return this.id == aux.id && this.local == aux.local && this.data == aux.data 
					&& this.duracao == aux.duracao && this.horaFim == aux.horaFim 
					&& this.horaInicio == aux.horaInicio && this.tipo == aux.tipo;
			
		}// quebrei a linha para não ficar muito grande mas funciona do mesmo jeito
		
		return false;
		
	}

}
