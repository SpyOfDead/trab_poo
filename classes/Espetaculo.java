package projetoCompleto;

import java.io.Serializable;
import java.time.*;
import java.util.ArrayList;

public class Espetaculo implements Serializable {

	private LocalTime horaInicio, horaFim;
	private static int total = 100;
	private String local, tipo;
	private LocalDate data;
	private int id;
	private int tamanho;
	private ArrayList<Bilhete> bilhetes = new ArrayList<Bilhete>(tamanho);

	public Espetaculo() {

		total = total - 1;
		data = LocalDate.of(1, 1, 1);
		local = "Não definido!";
		horaInicio = LocalTime.of(0, 0);
		horaFim = LocalTime.of(0, 0);
		tamanho = 100;
		id = 1000 + total;

	}

	public Espetaculo(String tipo, String local, LocalDate data, LocalTime horaInicio, LocalTime horaFim, int tamanho) {

		total = total - 1;
		this.tamanho = tamanho;
		this.local = local;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		id = 1000 + total;

	}

	public void adicionarBiblete(Bilhete bilhete) {

		bilhetes.add(bilhete);

	}

	public Bilhete procurarBilhete(Pessoa pessoa) {

		for (Bilhete i : bilhetes) {

			if (pessoa.equals(i.getPessoa())) {

				return i;

			}

		}
		System.out.println("Não encontrado o bilhete comprado!\n");
		return null;

	}

	public void removerBilhete(Pessoa pessoa) {

		for (Bilhete i : bilhetes) {

			if (pessoa.equals(i.getPessoa())) {

				bilhetes.remove(i);

				System.out.println("Removido com sucesso!\n");
				return;

			}

		}

		System.out.println("Não foi possivel remover,pois não exite este bilhete!\n");

	}

	public String toString() {

		return "Total de Espetaculos: " + total + "\nID:  " + id + "\nLocal: " + local + "\nData: " + data
				+ "\nHora de Início: " + horaInicio + "\nHora do Fim: " + horaFim;

	}

	public Object clone() {

		Espetaculo aux = new Espetaculo(tipo, local, data, horaInicio, horaFim, tamanho);
		aux.setId(this.id);
		return aux;

	}

	public boolean equals(Object espetaculo) {
		if (espetaculo != null && this.getClass() == espetaculo.getClass()) {

			Espetaculo aux = (Espetaculo) espetaculo;

			return this.id == aux.id && this.local == aux.local && this.data == aux.data && this.horaFim == aux.horaFim
					&& this.horaInicio == aux.horaInicio && this.tipo == aux.tipo && this.tamanho == aux.tamanho;

		}

		return false;

	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public ArrayList<Bilhete> getBilhetes() {
		return bilhetes;
	}

	public void setBilhetes(ArrayList<Bilhete> bilhetes) {
		this.bilhetes = bilhetes;
	}

	public static int getTotal() {
		return total;
	}

}
