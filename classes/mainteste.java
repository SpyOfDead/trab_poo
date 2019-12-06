package projetoCompleto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		
		ArrayList<Espetaculo> listaEspetaculo = new ArrayList<Espetaculo>();
		ArrayList<Artista> listaArtista = new ArrayList<Artista>();
		
        menus(listaEspetaculo,listaArtista);

	}
	
	public static void menus(ArrayList<Espetaculo> listaEspetaculo,ArrayList<Artista> listaArtista) {
		
		//Variaveis usadas
		
        int id, ano, mes, dia, duracaoH, duracaoM, horaInicioH, horaInicioM, horaFimH, horaFimM,tamanho;
        String nome, primeiroNome, segundoNome, sexo, tipo, paisOrigem, local;
        double salario;
        boolean erro = true;
		
		Menu.menuPrincipal();  
		int op = Ler.umInt();
		switch (op) {

		case 1:
			Menu.menuArtista();
			switch(Ler.umInt()) {
			case 1:
				//Chamar a função de inserir novo artista
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

				menus(listaEspetaculo,listaArtista);
				break;
			}
			break;

		case 2:
			Menu.menuEspetaculo();
			switch(Ler.umInt()) {

			case 1:
				
				Menu.menuAdicionarEspetaculo();         
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
                      	
                      	
                      	
                      	System.out.println("Espetaculo criado com sucesso!\nDeseja voltar para o Menu Principal\n1-Sim  2-Não");
                      	if(Ler.umInt() == 1) {
                      		menus(listaEspetaculo,listaArtista);
                      	}else {
                      		
                      	}
                      	
                      	
                    } catch (NullPointerException e) {
                      erro = true;
                        System.out.println("Os campos não podem ser nulos!" + e.getMessage());
                    }
                }
                erro= true;
				break;
				
			case 2:
				
				//Modeificar espetaculo, aqui entra no menu do bilhete
				break;
				
			case 3:
				
				
				break;
				
			case 4:
				
				for( Espetaculo i : listaEspetaculo) {
					
					System.out.println(i);
					
				}
				menus(listaEspetaculo,listaArtista);
				break;
				
			case 5:			
				break;

			case 0:

				menus(listaEspetaculo,listaArtista);
				break;
			}

			break;

		case 3:
			Menu.menuTenda();
			
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
				
			case 6:
				
				break; 
				
			case 7:

				break;

			case 8:

				break;

			case 9:
				break;

			case 0:

				menus(listaEspetaculo,listaArtista);
				break;
			}

			break;

		case 0:
			
			//colocar no banco de dados os dados salvos
			System.out.println("| Fim do programa! |");
			System.exit(0);
			break;

		}
	}
	
}
