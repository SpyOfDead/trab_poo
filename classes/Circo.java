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
import com.ubi.projecto.Exceptions.ListaVaziaException;
import com.ubi.projecto.Exceptions.DescontoNegativoException;
import com.ubi.projecto.Exceptions.ValoresRepetidosException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

public class Circo {

    public static void main(String[] args) {

        // * Variavéis
        int id, ano, mes, dia, duracaoH, duracaoM, horaInicioH, horaInicioM, horaFimH, horaFimM;
        String nome, primeiroNome, segundoNome, sexo, tipo, paisOrigem, local;
        double salario;
        boolean erro = true;

        // * Instaciar os Ojectos da classe e definir variavéis
        ArrayList<Artista> listaArtista = new ArrayList<>();
        ArrayList<Espetaculo> listaEspetaculo = new ArrayList<>();
        ArrayList<Bilhete> listaBilhete = new ArrayList();

        Pessoa pessoa = new Pessoa(999, "Benjamin", "Oliveira", "Masculino", "Brazil", 1970, 6, 11);
        Artista artista = new Artista(pessoa, "Palhaço", 3700);
        // * Variavéis de instância do Menu Artista
        Pessoa pessoa1 = new Pessoa(1000, "Loco", "Brusca", "Masculino", "Argentina", 1964, 10, 1); //* a ajustar
        Pessoa pessoa2 = new Pessoa(1001, "Avner", "Eisenberg", "Masculino", "América", 1948, 8, 26); //* a ajustar
        Pessoa pessoa3 = new Pessoa(1002, "Julie", "Goell", "Femenino", "América", 1950, 8, 26); //* a ajustar
        Pessoa pessoa4 = new Pessoa(1003, "Oscar", "Zimmerman", "Masculino", "Chile", 1910, 4, 21); //* a ajustar
        Pessoa pessoa5 = new Pessoa(1003, "Gardi", "Hutter", "Femenino", "Suiça", 1953, 3, 12); //* a ajustar

        Artista artista1 = new Artista(pessoa1, "Bailarino", 3000);
        Artista artista2 = new Artista(pessoa2, "Mimica e teatro Fisico", 4000);
        Artista artista3 = new Artista(pessoa3, "Teatro fisico e Cantora", 3000);
        Artista artista4 = new Artista(pessoa4, "Musico", 5000);
        Artista artista5 = new Artista(pessoa5, "Teatro", 4500);

        listaArtista.add(artista1);
        listaArtista.add(artista2);
        listaArtista.add(artista3);
        listaArtista.add(artista4);
        listaArtista.add(artista5);

        Espetaculo espetaculo = new Espetaculo();
        Espetaculo espetaculo1 = new Espetaculo("O Homem Esquizofrênico", "Madrid", LocalTime.of(1, 50), LocalDate.of(2017, 2, 18), LocalTime.of(15, 00), LocalTime.of(17, 00));
        Espetaculo espetaculo2 = new Espetaculo("Exceptions to Gravity", "New York", LocalTime.of(1, 50), LocalDate.of(2018, 4, 20), LocalTime.of(17, 40), LocalTime.of(18, 20));
        Espetaculo espetaculo3 = new Espetaculo("Schaubude", "Berlin", LocalTime.of(1, 50), LocalDate.of(2016, 7, 15), LocalTime.of(14, 00), LocalTime.of(16, 00));
        Espetaculo espetaculo4 = new Espetaculo("Interlochen Arts Academy", "Amesterdam", LocalTime.of(1, 50), LocalDate.of(2015, 5, 13), LocalTime.of(18, 00), LocalTime.of(20, 00));
        Espetaculo espetaculo5 = new Espetaculo("Joana D'arpo", "Rio de Janeiro", LocalTime.of(1, 50), LocalDate.of(2019, 12, 28), LocalTime.of(19, 00), LocalTime.of(21, 00));

        listaEspetaculo.add(espetaculo1);
        listaEspetaculo.add(espetaculo2);
        listaEspetaculo.add(espetaculo3);
        listaEspetaculo.add(espetaculo4);
        listaEspetaculo.add(espetaculo5);

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
                                while (erro == true) {
                                    try {
                                        System.out.println("Número de identificação do o Artista");
                                        id = Ler.umInt();
                                        artista.setId(id);
                                        System.out.println("Primeiro nome do Artista");
                                        primeiroNome = Ler.umaString();
                                        artista.setPrimeiroNome(primeiroNome);
                                        System.out.println("Segundo nome do Artista");
                                        segundoNome = Ler.umaString();
                                        artista.setSegundoNome(segundoNome);
                                        System.out.println("Sexo");
                                        sexo = Ler.umaString();
                                        artista.setSexo(sexo);
                                        System.out.println("País de Origem");
                                        paisOrigem = Ler.umaString();
                                        artista.setPaisDeOrigem(paisOrigem);
                                        System.out.println("Data de nascimento"); //* a ajustar
                                        System.out.println("Ano de Nascimento");
                                        ano = Ler.umInt();
                                        System.out.println("Mês de Nascimento");
                                        mes = Ler.umInt();
                                        System.out.println("Dia de Nascimento");
                                        dia = Ler.umInt();
                                        artista.setDataNascimento(LocalDate.of(ano, mes, dia));
                                        System.out.println("Tipo de Artista");
                                        tipo = Ler.umaString();
                                        artista.setTipo(tipo);
                                        System.out.println("Salário");
                                        salario = Ler.umDouble();
                                        artista.setSalario(salario);
                                        artista = new Artista(pessoa, tipo, salario);
                                        adicionarArtista(listaArtista, artista);
                                    } catch (NullPointerException e) {
                                        erro = false;
                                        System.out.println("Os campos não podem ser nulos!" + e.getMessage());
                                    } catch (ValoresRepetidosException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                break;

                            case 2: //* a ser modificado
                                System.out.println("..................................................");
                                System.out.println("|                MODIFICAR ARTISTA               |");
                                System.out.println("..................................................");

                                while (erro == true) {
                                    try {
                                        System.out.println("Insira o nome do Artista que deseja Modificar");
                                        nome = Ler.umaString();
                                        for (int i = 0; i < listaArtista.size(); i++) {
                                            if (listaArtista.get(i).getPrimeiroNome().equals(nome)) {
                                                System.out.println("Número de identificação do o Artista");
                                                id = Ler.umInt();
                                                artista.setId(id);
                                                System.out.println("Primeiro nome do Artista");
                                                primeiroNome = Ler.umaString();
                                                artista.setPrimeiroNome(primeiroNome);
                                                System.out.println("Segundo nome do Artista");
                                                segundoNome = Ler.umaString();
                                                artista.setSegundoNome(segundoNome);
                                                System.out.println("Sexo");
                                                sexo = Ler.umaString();
                                                artista.setSexo(sexo);
                                                System.out.println("País de Origem");
                                                paisOrigem = Ler.umaString();
                                                artista.setSexo(paisOrigem);
                                                System.out.println("Data de nascimento"); //* a ajustar
                                                System.out.println("Ano de Nascimento");
                                                ano = Ler.umInt();
                                                System.out.println("Mês de Nascimento");
                                                mes = Ler.umInt();
                                                System.out.println("Dia de Nascimento");
                                                dia = Ler.umInt();
                                                artista.setDataNascimento(LocalDate.of(ano, mes, dia));
                                                System.out.println("Tipo de Artista");
                                                tipo = Ler.umaString();
                                                artista.setTipo(tipo);
                                                System.out.println("Salário");
                                                salario = Ler.umDouble();
                                                artista.setSalario(salario);

                                                artista = new Artista(pessoa, tipo, salario);
                                                modificarArtista(listaArtista, artista);
                                            }
                                        }

                                    } catch (NullPointerException e) {
                                        erro = false;
                                        System.out.println("Os campos não podem ser nulos!" + e.getMessage());
                                    } catch (ValoresRepetidosException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }

                                break;

                            case 3:
                                System.out.println("..................................................");
                                System.out.println("|                  REMOVER ARTISTA               |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Artista que deseja remover");
                                nome = Ler.umaString();
                                artista.setPrimeiroNome(nome);
                                try {
                                    removerArtista(listaArtista, artista);
                                    System.out.println(artista.toString());
                                } catch (ListaVaziaException e) {
                                    System.out.println(e.getMessage());
                                }

                                break;

                            case 4:
                                System.out.println("..................................................");
                                System.out.println("|        AUMENTAR SALÁRIO DO ARTISTA             |");
                                System.out.println("..................................................");
                                System.out.println("Qual é o nome do Artista");
                                //falta completar
                                System.out.println("Percentagem do Aumento de Salário do Artista");
                                try {
                                    artista.aumentarSalario(Ler.umDouble());
                                } catch (PercentagemException e) {
                                    System.out.println(e.getMessage());
                                }
                                System.out.println(artista.toString());
                                break;

                            case 5:
                                System.out.println("..................................................");
                                System.out.println("|          DIMINUIR SALÁRIO DO ARTISTA           |");
                                System.out.println("..................................................");
                                //falta completar
                                System.out.println("Percentagem de diminuição de Salário do Artista");
                                try {
                                    artista.diminuirSalario(Ler.umDouble());
                                } catch (PercentagemException e) {
                                    System.out.println(e.getMessage());
                                }
                                System.out.println(artista.toString());
                                break;

                            case 6:
                                System.out.println("..................................................");
                                System.out.println("|               CONSULTAR ARTISTAS                |");
                                System.out.println("..................................................");
                                System.out.println("Resultados de consulta  Artista");
                                //falta completar
                                System.out.println(artista.toString());
                                break;

                            case 7: //* a ajustar
                                System.out.println("..................................................");
                                System.out.println("|       VERIFICAR O CONTEUDO ENTRE ARTISTA       |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Artista que deseja verificar");
                                System.out.println(artista.equals(Ler.umaString()));

                                break;

                            case 8:
                                System.out.println("..................................................");
                                System.out.println("|                 CLONAR ARTISTAS                 |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Artista que deseja clonar");
                                System.out.println(artista.clone());
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
                                while (erro == true) {
                                    try {
                                        System.out.println("Nome do Espetáculo");
                                        tipo = Ler.umaString();
                                        espetaculo.setTipo(tipo);
                                        System.out.println("Local do Espetáculo");
                                        local = Ler.umaString();
                                        espetaculo.setLocal(local);
                                        System.out.println("Duração do Espetáculo"); //* a ajustar
                                        System.out.println("Insira a Hora");
                                        duracaoH = Ler.umInt();
                                        System.out.println("Insira os Minutos");
                                        duracaoM = Ler.umInt();
                                        espetaculo.setDuracao(LocalTime.of(duracaoH, duracaoM));
                                        System.out.println("Data do Espetáculo");
                                        System.out.println("Ano");
                                        ano = Ler.umInt();
                                        System.out.println("Mês");
                                        mes = Ler.umInt();
                                        System.out.println("Dia");
                                        dia = Ler.umInt();
                                        espetaculo.setData(LocalDate.of(ano, mes, dia));
                                        System.out.println("Hora de Inicio do Espetáculo");
                                        horaInicioH = Ler.umInt();
                                        System.out.println("Minutos de Inicio do Espetáculo");
                                        horaInicioM = Ler.umInt();
                                        espetaculo.setHoraInicio(LocalTime.of(horaInicioH, horaInicioM));
                                        System.out.println("Hora de fim do Espetáculo");
                                        horaFimH = Ler.umInt();
                                        System.out.println("Minutos de fim do Espetáculo");
                                        horaFimM = Ler.umInt();
                                        espetaculo.setHoraFim(LocalTime.of(horaFimH, horaFimM));
                                        adicionarEspetaculo(listaEspetaculo, espetaculo);
                                    } catch (NullPointerException e) {
                                        erro = false;
                                        System.out.println("Os campos não podem ser nulos!" + e.getMessage());
                                    } catch (ValoresRepetidosException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("..................................................");
                                System.out.println("|             MODIFICAR ESPETÁCULO               |");
                                System.out.println("..................................................");
                                while (erro == true) {
                                    try {
                                        System.out.println("Insira o nome do Espetáculo que deseja Modificar");
                                        nome = Ler.umaString();
                                        for (int i = 0; i < listaArtista.size(); i++) {
                                            if (listaArtista.get(i).getPrimeiroNome().equals(nome)) {
                                                System.out.println("Nome do Espetáculo");
                                                String nomeEsp = Ler.umaString();
                                                espetaculo.setTipo(nomeEsp);
                                                System.out.println("Local do Espetáculo");
                                                local = Ler.umaString();
                                                espetaculo.setLocal(local);
                                                System.out.println("Duração do Espetáculo"); //* a ajustar
                                                System.out.println("Insira a Hora");
                                                duracaoH = Ler.umInt();
                                                System.out.println("Insira os Minutos");
                                                duracaoM = Ler.umInt();
                                                espetaculo.setDuracao(LocalTime.of(duracaoH, duracaoM));
                                                System.out.println("Data do Espetáculo");
                                                System.out.println("Ano");
                                                ano = Ler.umInt();
                                                System.out.println("Mês");
                                                mes = Ler.umInt();
                                                System.out.println("Dia");
                                                dia = Ler.umInt();
                                                espetaculo.setData(LocalDate.of(ano, mes, dia));
                                                System.out.println("Hora de Inicio do Espetáculo");
                                                horaInicioH = Ler.umInt();
                                                System.out.println("Minutos de Inicio do Espetáculo");
                                                horaInicioM = Ler.umInt();
                                                espetaculo.setHoraInicio(LocalTime.of(horaInicioH, horaInicioM));
                                                System.out.println("Hora de fim do Espetáculo");
                                                horaFimH = Ler.umInt();
                                                System.out.println("Minutos de fim do Espetáculo");
                                                horaFimM = Ler.umInt();
                                                espetaculo.setHoraFim(LocalTime.of(horaFimH, horaFimM));

                                                espetaculo = new Espetaculo(nomeEsp, local, LocalTime.of(duracaoH, duracaoM), LocalDate.of(ano, mes, dia),
                                                        LocalTime.of(horaInicioH, horaInicioM), LocalTime.of(horaFimH, horaFimM));
                                                modificarEspetaculo(listaEspetaculo, espetaculo);

                                            }
                                        }
                                    } catch (NullPointerException e) {
                                        erro = false;
                                        System.out.println("Os campos não podem ser nulos!" + e.getMessage());
                                    } catch (ValoresRepetidosException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }

                                break;

                            case 3:
                                System.out.println("..................................................");
                                System.out.println("|                  REMOVER ESPETACULO            |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Espetáculo que deseja remover");
                                tipo = Ler.umaString();
                                espetaculo.setTipo(tipo);
                                try {
                                    removerEspetaculo(listaEspetaculo, espetaculo);
                                } catch (ListaVaziaException e) {
                                    System.out.println(e.getMessage());
                                }
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
                                System.out.println(espetaculo.equals(Ler.umaString()));
                                break;

                            case 6:
                                System.out.println("..................................................");
                                System.out.println("|               CLONAR ESPETÁCULOS               |");
                                System.out.println("..................................................");
                                System.out.println("Nome do Espetáculo que deseja clonar");
                                espetaculo.clone();
                                System.out.println(espetaculo.toString());
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

                            case 2:
                                System.out.println("..................................................");
                                System.out.println("|               DESCONTO DO BILHETE              |");
                                System.out.println("..................................................");
                                System.out.println("Desconto do Bilhete");
                                try {
                                    bilhete.descontoDoBilhete(Ler.umDouble());
                                    System.out.println(bilhete.toString());
                                } catch (DescontoNegativoException e) {
                                    System.out.println(e.getMessage());
                                }

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
                                System.out.println(bilhete.toString());
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
                        // * Metdos a discutir
                        System.out.println("| 2  -> Verificar Lugares                         |");
                        System.out.println("| 3  -> Consultar o número de lugares disponivéis |");
                        //..............
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
                                System.out.println(totalDeArtistasContratados(listaArtista));
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
    public static void adicionarArtista(ArrayList<Artista> listaArtista, Artista artista) throws ValoresRepetidosException {
        if (!listaArtista.contains(artista)) {
            listaArtista.add(artista);
        } else {
            throw new ValoresRepetidosException("Os valores já se encontram inseridos na lista!");
        }
    }

    public static void modificarArtista(ArrayList<Artista> listaArtista, Artista artista) {
        for (int i = 0; i < listaArtista.size(); i++) {
            listaArtista.get(i).setId(artista.getId());
            listaArtista.get(i).setPrimeiroNome(artista.getPrimeiroNome());
            listaArtista.get(i).setSegundoNome(artista.getSegundoNome());
            listaArtista.get(i).setSexo(artista.getSexo());
            listaArtista.get(i).setPaisDeOrigem(artista.getPaisDeOrigem());
            listaArtista.get(i).setDataNascimento(LocalDate.of(i, Month.MARCH, i));
            listaArtista.get(i).setTipo(artista.getTipo());
            listaArtista.get(i).setSalario(artista.getSalario());

        }
    }

    public static void removerArtista(ArrayList<Artista> listaArtista, Artista artista) throws ListaVaziaException {
        if (listaArtista.contains(artista)) {
            listaArtista.remove(artista);
        } else {
            throw new ListaVaziaException("A lista encontra-se vazia!");
        }
    }

    public static double totalDeArtistasContratados(ArrayList<Artista> listaArtista) {
        return listaArtista.size();
    }

    // ************************************************
    // * Adiciona um Espetáculo
    // * Modifica um Espetáulo
    // * Remove um Espetáculo
    // * Total de Espetáculos Realizados
    // * Espetáculo mais visto
    public static void adicionarEspetaculo(ArrayList<Espetaculo> listaEspetaculo, Espetaculo espetaculo) throws ValoresRepetidosException {
        if (!listaEspetaculo.contains(espetaculo)) {
            listaEspetaculo.add(espetaculo);
        }else {
            throw new ValoresRepetidosException("Os valores já se encontram inseridos na lista!");
        }
    }

    // * a ajustar
    public static void modificarEspetaculo(ArrayList<Espetaculo> listaEspetaculo, Espetaculo espetaculo) {
        for (int i = 0; i < listaEspetaculo.size(); i++) {
            listaEspetaculo.get(i).setTipo(espetaculo.getTipo());
            listaEspetaculo.get(i).setLocal(espetaculo.getLocal());
            listaEspetaculo.get(i).setDuracao(espetaculo.getDuracao());
            listaEspetaculo.get(i).setData(espetaculo.getData());
            listaEspetaculo.get(i).setHoraInicio(espetaculo.getHoraInicio());
            listaEspetaculo.get(i).setHoraFim(espetaculo.getHoraFim());
        }
    }

    public static void removerEspetaculo(ArrayList<Espetaculo> listaEspetaculo, Espetaculo espetaculo) throws ListaVaziaException {
        if (listaEspetaculo.contains(espetaculo)) {
            listaEspetaculo.remove(espetaculo);
        } else {
            throw new ListaVaziaException("A lista encontra-se vazia!");
        }
    }

    public static int totalDeEspetaculosRealizados(ArrayList<Espetaculo> listaEspetaculo) {
        return listaEspetaculo.size();
    }

    public static String espetaculoMaisVisto(ArrayList<Espetaculo> listaEspetaculo) {
        int max = 0;
        int posMax = 0;
        int contador = 0;

        for (int i = 0; i < listaEspetaculo.size(); i++) {
            while (listaEspetaculo.get(i) != null) {
                contador++;
            }
            if (contador > max) {
                max = contador;
                posMax = i;
            }
        }
        return listaEspetaculo.get(posMax).toString();
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
    public static int totalDeBilhetesDisponiveis(ArrayList<Bilhete> listaBilhete, String nome) {
        int total = 0;
        for (int i = 0; i < listaBilhete.size(); i++) {
            if (listaBilhete.get(i).getId() < numeroDeBilhetes(listaBilhete, nome)) {
                total += listaBilhete.get(i).getId();
            }
        }
        return total;
    }

    public static void numeroDeBilhetes(ArrayList<Bilhete> listaBilhete, int bilhete) {
        listaBilhete = new ArrayList<>(bilhete);
    }

    public int totalDeBilhetesVendidos(ArrayList<Bilhete> listaBilhete) {
        int total = 0;
        for (int i = 0; i < listaBilhete.size(); i++) {
            total += listaBilhete.get(i).getId();
        }
        return total;
    }

    public void reservarBilhete(ArrayList<Bilhete> listaBilhete, ArrayList<String> listaReserva, int id, String nome) {
        for (int i = 0; i < listaBilhete.size(); i++) {
            if (listaBilhete.get(i).getId() != id) {
                listaReserva.add(listaBilhete.get(i) + nome);
            }
        }
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
}//* Fim da Classe Circo
