/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubi.projecto;

/**
 *
 * @author xremi
 */
import com.ubi.myinputs.Myinputs.Ler;
import java.time.LocalDate;
import java.util.ArrayList;

public class Circo {

    public static void main(String[] args) {

        // * Instaciar os Ojectos da classe e definir variavéis
        ArrayList<Artista> listaArtista;
        ArrayList<Espetaculo> listaEspetaculo;
        ArrayList<Bilhete> listaBilhete;

        // * Variavéis de instância do Menu Artista
        Pessoa pessoa = new Pessoa(); //* a ajustar
        Artista artista;
        artista = new Artista(pessoa); //* a ajustar

        // * Variavéis de instância de Espetaculo
        Espetaculo espetaculo;//* a ajustar
        espetaculo = new Espetaculo();

        // * Variavéis de instância de Bilhete
        Bilhete bilhete;//* a justar
        bilhete = new Bilhete();

        // * Variavel da Esolha de menu
        int op = 1;

        while (op != 0) {
            System.out.println("..................................................");
            System.out.println("|            GESTOR DE  CIRCO                    |");
            System.out.println("..................................................");
            System.out.println("| 1 -> Artista                                   |");
            System.out.println("| 2 -> Espetáculo                                |");
            System.out.println("| 3 -> Bilhete                                   |");
            System.out.println("| 4 -> Tenda                                     |");
            System.out.println("| 0 -> Sair                                      |");
            System.out.println("..................................................");
            System.out.println("| Escolha uma Opção:                              ");

            op = Ler.umInt();

            switch (op) {
                case 1:

                    System.out.println("..................................................");
                    System.out.println("|                 ARTISTA                        |");
                    System.out.println("..................................................");
                    System.out.println("| 1 -> Inserir novo Artista                      |");
                    System.out.println("| 2 -> Modificar Artista                         |");
                    System.out.println("| 3 -> Remover Artista                           |");
                    System.out.println("| 4 -> Aumentar o salário do Artista             |");
                    System.out.println("| 5 -> Diminuir o salário do Artista             |");
                    System.out.println("| 6 -> Consultar Artista                         |");
                    System.out.println("| 0 -> Verificar o conteúdo entre Artistas       |");
                    System.out.println("| 4 -> Clonar Artista                            |");
                    System.out.println("| 0 -> Voltar para menu principal                |");
                    System.out.println("..................................................");
                    System.out.println("| Escolha uma Opção:                              ");

                    op = Ler.umInt();

                    // **************************************************************
                    // * Menu Artista
                    // * Inserir Novo Artista
                    // * Modificar Artista
                    // * Remover Artista
                    // * Aumentar o salário do Artista 
                    // * Diminuir o salário do Artista
                    // * Consultar Artista
                    // * Verificar o conteúdo entre Artistas
                    // * Clonar Artista
                    while (op != 0) {
                        switch (op) {
                            case 1:
                                System.out.println("..................................................");
                                System.out.println("|               INSERIR NOVO ARTISTA             |");
                                System.out.println("..................................................");
                                System.out.println("Número de identificação do o Artista");
                                artista.setID(Ler.umInt());
                                System.out.println("Nome do Artista");
                                artista.setNome(Ler.umaString());
                                System.out.println("Data de nascimento"); //* a ajustar
                                artista.setDataNascimento(Ler.umaString());
                                System.out.println("Sexo");
                                artista.setSexo(Ler.umaString());
                                System.out.println("Tipo de Artista");
                                artista.setTipo(Ler.umaString());
                                System.out.println("Salário");
                                artista.setSalario(Ler.umDouble());

                                listaArtista.add(artista);
                                break;

                            case 2: //* a ser modificado
                                System.out.println("..................................................");
                                System.out.println("|                MODIFICAR ARTISTA               |");
                                System.out.println("..................................................");
                                System.out.println("Insira o nome do Artista que deseja Modificar");
                                modificarArtista(Ler.umaString());
                                break;

                            case 3:
                                System.out.println("..................................................");
                                System.out.println("|                  REMOVER ARTISTA               |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Artista que deseja remover");
                                removerArtista(Ler.umaString());
                                System.out.println(artista.toString());
                                break;

                            case 4:
                                System.out.println("..................................................");
                                System.out.println("|        AUMENTAR SALÁRIO DO ARTISTA             |");
                                System.out.println("..................................................");
                                System.out.println("Percentagem do Aumento de Salário do Artista");
                                artista.aumentarSalarioArtista(Ler.umDouble());
                                System.out.println(artista.toString);
                                break;

                            case 5:
                                System.out.println("..................................................");
                                System.out.println("|          DIMINUIR SALÁRIO DO ARTISTA           |");
                                System.out.println("..................................................");
                                System.out.println("Percentagem de diminuição de Salário do Artista");
                                artista.diminuirSalarioArtista(Ler.umDouble());
                                System.out.println(artista.toString);
                                break;

                            case 6:
                                System.out.println("..................................................");
                                System.out.println("|               CONSULTAR ARTISTA                |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Artista que deseja consultar");
                                artista.consultarArtista(Ler.umaString());
                                System.out.println(artista.toString());
                                break;

                            case 7: //* a ajustar
                                System.out.println("..................................................");
                                System.out.println("|       VERIFICAR O CONTEUDO ENTRE ARTISTA       |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Artista que deseja verificar");
                                break;

                            case 8:
                                System.out.println("..................................................");
                                System.out.println("|                 CLONAR ARTISTAS                 |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Artista que deseja clonar");
                                artista.clone();
                                System.out.println(artista.toString);
                                break;
                            default:
                                System.out.println("A opção escolhida é inválida!");
                        }//*fim do switch op submenu Artista
                    }// fim do while op submenu Artista
                    break;
                case 2:

                    while (op != 0) {
                        System.out.println("..................................................");
                        System.out.println("|                 ESPETÁCULO                     |");
                        System.out.println("..................................................");
                        System.out.println("| 1 -> Adicionar novo Espetáculo                 |");
                        System.out.println("| 2 -> Modificar Espetáculo                      |");
                        System.out.println("| 3 -> Remover Espetáculo                        |");
                        System.out.println("| 4 -> Consultar Espetáculo                      |");
                        System.out.println("| 6 -> Verificar o conteúdo entre Espetáculos    |");
                        System.out.println("| 7 -> Clonar Espetáculo                         |");
                        System.out.println("| 0 -> Voltar para o menu principal              |");
                        System.out.println("..................................................");
                        System.out.println("| Escolha uma Opção:                              ");
                        op = Ler.umInt();

                        //*************************************************************
                        // * Inserir novo Espetáculo
                        // * Modificar Espetaculo
                        // * Remover Espetáculo
                        switch (op) {
                            case 1:
                                System.out.println("..................................................");
                                System.out.println("|               INSERIR NOVO ESPETACULO             |");
                                System.out.println("..................................................");
                                System.out.println("Número de identificação do Espetaculo ");
                                espetaculo.setID(Ler.umInt());
                                System.out.println("Nome do Espetáculo");
                                espetaculo.setTipo(Ler.umaString());
                                System.out.println("Duração do Espetáculo"); //* a ajustar
                                espetaculo.setDuracao(Ler.umInt());
                                System.out.println("Data do Espetáculo");
                                espetaculo.setData(Ler.umaString());
                                System.out.println("Hora de inicio do Espetáculo");
                                espetaculo.setHoraInicio(Ler.umaString());
                                System.out.println("Hora de fim do Espetáculo");
                                espetaculo.setHoraFim(Ler.umaString());
                                System.out.println("Local do Espetáculo");
                                espetaculo.setLocal(Ler.umaString());

                                listaEspetaculo.add(espetaculo);
                                break;

                            case 2:
                                System.out.println("..................................................");
                                System.out.println("|             MODIFICAR ESPETÁCULO               |");
                                System.out.println("..................................................");
                                System.out.println("Insira o nome do Espetáculo que deseja Modificar");
                                modificarEspetaculo(Ler.umaString());
                                
                             
                                break;

                            case 3:
                                System.out.println("..................................................");
                                System.out.println("|                  REMOVER ESPETACULO              |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Espetáculo que deseja remover");
                                removerEspetaculo(Ler.umaString());
                                System.out.println(espetaculo.toString());
                                break;

                            case 4:
                                System.out.println("..................................................");
                                System.out.println("|              CONSULTAR ESPETÁCULO              |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Espetáculo que deseja consultar");
                                espetaculo.consultarEspetaculo(Ler.umaString());      
                                System.out.println(espetaculo.toString());
                                break;

                            case 5: //* a ajustar
                                System.out.println("..................................................");
                                System.out.println("|     VERIFICAR O CONTEUDO ENTRE ESPETÁCULOS     |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Espetáculo que deseja verificar");
                                break;

                            case 6:
                                System.out.println("..................................................");
                                System.out.println("|               CLONAR ESPETÁCULOS               |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Espetáculo que deseja clonar");
                                espetaculo.clone();
                                System.out.println(espetaculo.toString);
                                break;
                            default:
                                System.out.println("A opção escolhida é inválida!");
                        } //* fim do switch op submenu espetaculo
                    }//* fim do while op submenu espetaculo
                    break;
                case 3:

                    while (op != 0) {
                        System.out.println("..................................................");
                        System.out.println("|                 BILHETEIRA                     |");
                        System.out.println("..................................................");
                        System.out.println("| 1 -> Comprar Bilhete                           |");
                        System.out.println("| 2 -> Desconto do Bilhete                       |");
                        System.out.println("| 3 -> Reservar Bilhete                          |");
                        System.out.println("| 4 -> Verificar o conteúdo entre Bilhetes       |");
                        System.out.println("| 5 -> Clonar Bilhete                            |");
                        System.out.println("| 0 -> Voltar para o menu principal              |");
                        System.out.println("..................................................");
                        System.out.println("| Escolha uma Opção:                              ");

                        op = Ler.umInt();

                        // *********************************************************
                        // * Comprar Bilhete
                        // * Desconto do Bilhete
                        // * Reservar Bilhete
                        // * Verificar o conteudo entre Bilhetes
                        // * Clonar Bilhete
                        switch (op) {
                            case 1:
                                System.out.println("..................................................");
                                System.out.println("|               COMPRAR BILHETE                  |");
                                System.out.println("..................................................");
                                System.out.println("Quantos bilhetes deseja comprar");
                                bilhete.comprarBilhete(Ler.umInt());
                                System.out.println(bilhete.toString());
                                break;

                            case 2://* a ajustar
                                System.out.println("..................................................");
                                System.out.println("|               DESCONTO DO BILHETE              |");
                                System.out.println("..................................................");
                                System.out.println("Desconto do Bilhete");
                                bilhete.descontoDoBilhete(Ler.umDouble());
                                System.out.println(bilhete.toString());
                                break;

                            case 3://* a ajustar
                                System.out.println("..................................................");
                                System.out.println("|               RESERVA DO BILHETE               |");
                                System.out.println("..................................................");
                                System.out.println("Nome da pessoa para reserva de Bilhete");
                                bilhete.reservarBilhete(Ler.umaString());
                                System.out.println(bilhete.toString());
                                break;

                            case 4: //* a ajustar
                                System.out.println("..................................................");
                                System.out.println("|      VERIFICAR O CONTEUDO ENTRE BILHETES       |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Bilhete que deseja verificar");
                                break;

                            case 5:
                                System.out.println("..................................................");
                                System.out.println("|                 CLONAR BILHETES                |");
                                System.out.println("..................................................");
                                System.out.println("Numero de identificação do Bilhete que deseja clonar");
                                bilhete.clone();
                                System.out.println(bilhete.toString);
                                break;

                            default:
                                System.out.println("A opção escolhida é inválida!");
                        }//* fim do switch op Bilheteira  
                    }//* fim do while op Bilheteira
                    break;

                case 4:

                    while (op != 0) {
                        System.out.println("...................................................");
                        System.out.println("|                     TENDA                       |");
                        System.out.println("...................................................");
                        System.out.println("| 1  -> Número de Bilhetes                        |");
                        System.out.println("| 2  -> Verificar Lugares                         |");
                        System.out.println("| 3  -> Consultar o número de lugares disponivéis |");
                        System.out.println("| 4  -> Consultar o horário do Espetáculo         |");
                        System.out.println("| 5  -> Espetáculo mais visto                     |");
                        System.out.println("| 6  -> Total de Bilhetes Disponivéis             |");
                        System.out.println("| 7  -> Total de Bilhetes Vendidos                |");
                        System.out.println("| 8  -> Total de Artistas                         |");
                        System.out.println("| 9  -> Total de Espetáculos realizados           |");
                        System.out.println("| 10 -> Total de Lucro obtido                     |");
                        System.out.println("| 11 -> Total de de Despesa obtida                |");
                        System.out.println("| 12 -> Histórico de vendas                       |");
                        System.out.println("| 13 -> Sair                                      |");
                        System.out.println("...................................................");
                        System.out.println("| Escolha uma Opção:                               ");

                        op = Ler.umInt();

                        // *********************************************************
                        // * Numero de Bilhetes
                        // * Verificar Lugares
                        // * Consultar o numero de lugares disponiveis
                        // * Consultar o horário do Espetáculo 
                        // * Espetáculo mais visto
                        // * Total de Bilhetes Disponivéis 
                        // * Total de Bilhetes Vendidos
                        // * Total de Artistas
                        // * Total de Espetáculos realizados
                        // * Total de Lucro obtido
                        // * Total de de Despesa obtida
                        // * Histórico de vendas
                        switch (op) {
                            case 1: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|               NÚMERO DE BILHETES                |");
                                System.out.println("...................................................");
                                System.out.println("Número de bilhetes para um espetáculo");
                                numeroDeBilhetes(Ler.umaString());
                                System.out.println(bilhete.toString());
                                break;

                            case 2: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|                VERIFICAR LUGARES                |");
                                System.out.println("...................................................");
                                break;

                            case 3: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|    CONSULTAR O NÚMERO DE LUGARES DISPONIVÉIS    |");
                                System.out.println("...................................................");
                                System.out.println("Nome do Espetáculo");
                                break;

                            case 4: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|        CONSULTAR O HORÁRIO DO ESPETACULO        |");
                                System.out.println("...................................................");
                                System.out.println("Nome do Espetáculo");
                                break;

                            case 5:
                                System.out.println("...................................................");
                                System.out.println("|              ESPETACULO MAIS VISTO              |");
                                System.out.println("...................................................");
                                System.out.println("Espetáculo mais visto");
                                System.out.println(espetaculoMaisVisto());
                                break;

                            case 6: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|         TOTAL DE BILHETES DISPONIVÉIS           |");
                                System.out.println("...................................................");
                                System.out.println("Total de Bilhetes Disponíveis");
                                break;

                            case 7: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|           TOTAL DE BILHETES VENDIDOS            |");
                                System.out.println("...................................................");
                                System.out.println("Total de Bilhetes Vendidos");
                                break;

                            case 8:
                                System.out.println("...................................................");
                                System.out.println("|                 TOTAL DE ARTISTAS               |");
                                System.out.println("...................................................");
                                System.out.println("Total de Artistas");
                                System.out.println(totalDeArtistasContratados());
                                break;

                            case 9:
                                System.out.println("...................................................");
                                System.out.println("|         TOTAL DE ESPETACULOS REALIZADOS         |");
                                System.out.println("...................................................");
                                System.out.println("Total de Espetáculos");
                                System.out.println(totalDeEspetaculosRealizados());
                                break;

                            case 10: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|      TOTAL DE LUCRO OBTIDO POR ESPETÁCULO       |");
                                System.out.println("...................................................");
                                System.out.println("Total de Lucro Obtido por Espetáculo");
                                break;

                            case 11: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|      TOTAL DE DESPESA OBTIDA POR ESPETÁCULO       |");
                                System.out.println("...................................................");
                                System.out.println("Total de despesa obtida por Espetáculo");
                                break;

                            case 12: // * a ajustar
                                System.out.println("...................................................");
                                System.out.println("|                HISTÓRICO DE VENDAS              |");
                                System.out.println("...................................................");
                                System.out.println("Histórico de vendas");
                                break;

                            default:
                                System.out.println("A opção escolhida é inválida!");
                        }//* fim do switch op submenu Tenda 
                    }//* fim do while op submenu Tenda
                    break;

                default:
                    System.out.println("A opção escolhida é inválida!");
            }

        }
    }

    // * Funções Static
    // ************************************************
    // * Adiciona um Artista
    // * Modifica um Artista
    // * Remove um Artista
    // * Total de Artistas Contratados
    public static void adicionarArtista(Artista artista) {
        if (listaArtista.isEmpty() || !listaArtista.contains(artista)) {
            listaArtista.add(artista);
        }
    }

    /* public void modificarArtista(Artista artista) {
        for (int i = 0; i < listaArtista.size(); i++) {
            if (this.listaArtista.get(i).equals(artista)) {
                listaArtista.remove(artista);
            }
        }

    }*/
    public static void removerArtista(Artista artista) {
        if (listaArtista.contains(artista)) {
            listaArtista.remove(artista);
        }
    }

    public static double totalDeArtistasContratados() {
        double total = 0;
        for (int i = 0; i < listaArtista.size(); i++) {
            total += listaArtista.get(i);
        }
        return total;
    }

    // ************************************************
    // * Adiciona um Espetáculo
    // * Modifica um Espetáulo
    // * Remove um Espetáculo
    // * Total de Espetáculos Realizados
    // * Espetáculo mais visto
    public static void adicionarEspetaculo(Espetaculo espetaculo) {
        if (listaEspetaculo.isEmpty() || !listaEspetaculo.contains(espetaculo)) {
            listaEspetaculo.add(espetaculo);
        }
    }

    // * a ajustar
     public static void modificarEspetaculo(Espetaculo espetaculo) {
        for (int i = 0; i < listaEspetaculo.size(); i++) {
            if (listaEspetaculo.get(i).equals(espetaculo)) {
                listaEspetaculo.get(i).setId(espetaculo.getId());
                listaEspetaculo.get(i).setTipo(espetaculo.getTipo());
                listaEspetaculo.get(i).setDuracao(espetaculo.getDuracao());
                listaEspetaculo.get(i).setHoraInicio(espetaculo.getHoraInicio());
                listaEspetaculo.get(i).setHoraFim(espetaculo.getHoraFim());
                listaEspetaculo.get(i).setLocal(espetaculo.getLocal());
            }
        }

    }
    public static int totalDeEspetaculosRealizados() {
        double total = 0;
        for (int i = 0; i < listaEspetaculo.size(); i++) {
            total += listaEspetaculo.get(i);
        }
        return total;
    }

    public static void removerEspetaculo(Espetaculo espetaculo) {
        if (this.listaEspetaculo.contains(espetaculo)) {
            listaEspetaculo.remove(espetaculo);
        }
    }

    public static String espetaculoMaisVisto() {
        int max = 0;
        int pos = 0;

        for (int i = 0; i < listaEspetaculo.size(); i++) {
            if (listaEspetaculo.get(i).totalDeEspetaculosRealizados() > max) {
                max = listaEspetaculo.get(i).totalEspetaculosRealizados();
                pos = i;
            }
        }
        return listaEspetaculo.get(pos).getTipo();
    }

    //*a ajustar
    /* public static void consultarHorarioDoEspetaculo(Espetaculo espetaculo) {
          for (int i = 0; i < listaEspetaculo.size(); i++) {
              if(listaEspetaculo.get(i).equals(espetaculo.getNome())){
                 listaEspetaculo.get(i).espetaculo.getData(); 
              }
          }
      }*/
    // ************************************************
    // * Total de Bilhetes Disponivéis
    // * Numero de Bilhetes
    public static double totalDeBilhetesDisponiveis() {
        double total = 0;
        for (int i = 0; i < listaBilhete.size(); i++) {
            total += listaBilhete.get(i);
        }
        return total;
    }

    public static void numeroDeBilhetes(Bilhete bilhete) {
        listaBilhete = new ArrayList<>(bilhete);
    }
    

    // ************************************************
    // * Total de Lucro Obtido
    // * Total de numero de lugares
    
   /* public void reservarBilhete(Bilhete bilhete, String nome, int idade, long nss){
        bilhete = new Bilhete();
        for (int i = 0; i < bilhete.size(); i++) {
            
        }
        if(listaReserva.isEmpty() || !listaReserva.contains(nome)){
            listaReserva.add(nome, idade, nss, bilhete);
        }
    } */
    
    public static void consultarNumeroTotalLugares() {
    
    }
 
    
}//* Fim da Classe Circo
