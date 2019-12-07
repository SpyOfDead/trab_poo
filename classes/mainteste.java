package projetoCompleto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {

		ArrayList<Espetaculo> listaEspetaculo = new ArrayList<Espetaculo>();
		ArrayList<Artista> listaArtista = new ArrayList<Artista>();

		menus(listaEspetaculo, listaArtista);

	}

	public static void menus(ArrayList<Espetaculo> listaEspetaculo, ArrayList<Artista> listaArtista) {

		// Variaveis usadas

		int id, ano, mes, dia, duracaoH, duracaoM, horaInicioH, horaInicioM, horaFimH, horaFimM, tamanho, op = 1;
		String nome, primeiroNome, segundoNome, sexo, tipo, paisOrigem, local;
		double salario;
		boolean erro = true;

		while (op != 0) {

			Menu.menuPrincipal();
			op = Ler.umInt();
			switch (op) {

			case 1:
				Menu.menuArtista();
				switch (Ler.umInt()) {
				case 1:
					// Chamar a função de inserir novo artista
					break;

				case 2:
					break;

				case 3:
					break;

				case 4:
					break;

				case 5:
					break;

				case 6:
					break;

				case 7:
					break;

				case 0:

					break;
				}
				break;

			case 2:
				Menu.menuEspetaculo();
				switch (Ler.umInt()) {
				case 1:
					while (erro == true) {
					    try {
					    	System.out.println("Quantos Ingressos");
					        tamanho = Ler.umInt(); 
					        System.out.println("Nome do Espetáculo");
					        tipo = Ler.umaString();                                        
					        System.out.println("Local do Espetáculo");
					        local = Ler.umaString();       
					        System.out.println("Data do Espetáculo");
					        System.out.println("Ano");
					        ano = Ler.umInt();
					        System.out.println("Mês");
					        mes = Ler.umInt();
					        System.out.println("Dia");
					        dia = Ler.umInt();
					        System.out.println("Hora de Inicio do Espetáculo");
					        horaInicioH = Ler.umInt();
					        System.out.println("Minutos de Inicio do Espetáculo");
					        horaInicioM = Ler.umInt();
					        System.out.println("Hora de fim do Espetáculo");
					        horaFimH = Ler.umInt();
					        System.out.println("Minutos de fim do Espetáculo");
					        horaFimM = Ler.umInt();
					        Espetaculo espetaculo = new Espetaculo(tipo, local, LocalDate.of(ano, mes, dia), LocalTime.of(horaInicioH, horaInicioM), LocalTime.of(horaFimH, horaFimM), tamanho);
					        listaEspetaculo.add(espetaculo);
					      	erro = false;	
					      	System.out.println("\nEspetaculo criado com sucesso!");

					                                        	
					    } catch (Exception e) {
					      erro = true;
					        System.out.println("Os campos não podem ser nulos!" + e.getMessage());
					    }
					}
					System.out.println("Digite algo para continuar!");
					Ler.umaString();
					erro = true;
					break;
				case 2:
					System.out.println("O ID do Espetaculo:");
					id = Ler.umInt();
					for (Espetaculo i : listaEspetaculo) {
						if(i.getId() == id) {
							Menu.menuBilheteria();
							switch(Ler.umInt()) {
								case 1:
									break;
								case 2:
									break;
								case 3:
									break;
								case 4:
									break;
								case 5:
									break;
								case 0:
									break;
								}
						}
					}
					break;
				case 3:
					
					Menu.menuEspetaculoRemover();
					id = Ler.umInt();
					for (Espetaculo i : listaEspetaculo) {
						if(i.getId() == id) {
							listaEspetaculo.remove(i);
							System.out.println("O espetaculo de ID " + id + " foi removido com sucesso!");
							break;
						}
					}
					break;
					
				case 4:
					for (Espetaculo i : listaEspetaculo) {
						System.out.println("\n" + i);
					}
					System.out.println("Digite algo para continuar!");
					Ler.umaString();
					break;
				case 5:
					
					Menu.menuEspetaculoClonar();
					id = Ler.umInt();
					for (Espetaculo i : listaEspetaculo) {
						if(i.getId() == id) {
							listaEspetaculo.add((Espetaculo) i.clone());
							System.out.println("O espetaculo de ID " + id + " foi clonado com sucesso!");
							break;
						}
					}
					break;
					
				case 0:
					break;
				}
				break;
			case 3:
				Menu.menuTenda();
				switch (Ler.umInt()) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 0:
					break;
				}
				break;
			case 0:
				// colocar no banco de dados os dados salvos
				System.out.println("| Fim do programa! |");
				System.exit(0);
				break;

			}
		}
	}

}
