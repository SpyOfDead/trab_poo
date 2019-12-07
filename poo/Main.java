package poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Espetaculo> listaEspetaculo = new ArrayList<Espetaculo>();
        ArrayList<Artista> listaArtista = new ArrayList<Artista>();

        menus(listaEspetaculo, listaArtista);

    }

    public static void menus(ArrayList<Espetaculo> listaEspetaculo, ArrayList<Artista> listaArtista) {

        // Variaveis usadas

        int id, idp, ano, mes, dia, duracaoH, duracaoM, horaInicioH, horaInicioM, horaFimH, horaFimM, tamanho, op = 1, count = 0;
        String nome, primeiroNome, segundoNome, sexo, tipo, paisOrigem, local;
        double salario, countSalario = 0, countPreco = 0;
        LocalDate dataNascimento;
        boolean erro = true;

        // Preencher ambos ArrayLists com dados gravados em ficheiros

        listaArtista = Database.lerArtistas(listaArtista);
        listaEspetaculo = Database.lerEspetaculos(listaEspetaculo);

        // Loop principal da aplicacao

        while (op != 0) {

            Menu.menuPrincipal();
            op = Ler.umInt();
            switch (op) {
                case 1:
                    Menu.menuArtista();
                    switch (Ler.umInt()) {
                        case 1:
                            while (erro == true) {
                                try {
                                    System.out.println("ID do Artista");
                                    id = Ler.umInt();
                                    System.out.println("Primeiro nome do Artista");
                                    primeiroNome = Ler.umaString();
                                    System.out.println("Segundo nome do Artista");
                                    segundoNome = Ler.umaString();
                                    System.out.println("Sexo do Artista");
                                    sexo = Ler.umaString();
                                    System.out.println("Pais de origem do Artista");
                                    paisOrigem = Ler.umaString();
                                    System.out.println("Data de nascimento: ");
                                    System.out.println("Ano:");
                                    ano = Ler.umInt();
                                    System.out.println("Mes:");
                                    mes = Ler.umInt();
                                    System.out.println("Dia");
                                    dia = Ler.umInt();
                                    System.out.println("Tipo do Artista");
                                    tipo = Ler.umaString();
                                    System.out.println("Salario do Artista");
                                    salario = Ler.umDouble();
                                    Pessoa p1 = new Pessoa(id, primeiroNome, segundoNome, sexo, paisOrigem, ano, mes, dia);
                                    Artista novoArtista = new Artista(p1, tipo, salario);
                                    Database.adicionarArtista(listaArtista, novoArtista);
                                    System.out.println(novoArtista.toString());
                                    System.out.println("Artista criado com sucesso!");
                                    Database.guardarDados(listaArtista, listaEspetaculo);
                                    erro = false;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 2:
                            while (erro == true) {
                                try {
                                    if (listaArtista.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    System.out.println("ID do Artista que quer modificar");
                                    idp = Ler.umInt();
                                    Artista mod = Database.acharArtistaPorID(listaArtista, idp);
                                    System.out.println("Novo ID do Artista");
                                    mod.setId(Ler.umInt());
                                    System.out.println("Primeiro nome do Artista");
                                    mod.setPrimeiroNome(Ler.umaString());
                                    System.out.println("Segundo nome do Artista");
                                    mod.setSegundoNome(Ler.umaString());
                                    System.out.println("Sexo do Artista");
                                    mod.setSexo(Ler.umaString());
                                    System.out.println("Pais de origem do Artista");
                                    mod.setPaisDeOrigem(Ler.umaString());
                                    System.out.println("Data de nascimento: ");
                                    System.out.println("Ano:");
                                    ano = Ler.umInt();
                                    System.out.println("Mes:");
                                    mes = Ler.umInt();
                                    System.out.println("Dia");
                                    dia = Ler.umInt();
                                    dataNascimento = LocalDate.of(ano, mes, dia);
                                    mod.setDataNascimento(dataNascimento);
                                    System.out.println("Tipo do Artista");
                                    mod.setTipo(Ler.umaString());
                                    System.out.println("Salario do Artista");
                                    mod.setSalario(Ler.umDouble());
                                    System.out.println(mod.toString());
                                    System.out.println("Artista modificado com sucesso!");
                                    Database.guardarDados(listaArtista, listaEspetaculo);
                                    erro = false;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;

                        case 3:
                            while (erro == true) {
                                try {
                                    if (listaArtista.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    System.out.println("ID do Artista que quer remover");
                                    idp = Ler.umInt();
                                    Database.removerArtistaID(listaArtista, Database.acharArtistaPorID(listaArtista, idp));
                                    System.out.println("Artista de ID:" + idp + " removido com sucesso!");
                                    Database.guardarDados(listaArtista, listaEspetaculo);
                                    erro = false;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 4:
                            while (erro == true) {
                                try {
                                    if (listaArtista.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    System.out.println("ID do Artista que quer aumentar o salario");
                                    idp = Ler.umInt();
                                    Artista mod = Database.acharArtistaPorID(listaArtista, idp);
                                    System.out.println("Em quantos % deseja aumentar o salario? ");
                                    mod.aumentarSalario(Ler.umDouble());
                                    System.out.println("Salario do artista " + mod.getId() + " alterado com sucesso!\nNovo salario: " + mod.getSalario() + "$");
                                    Database.guardarDados(listaArtista, listaEspetaculo);
                                    erro = false;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 5:
                            while (erro == true) {
                                try {
                                    if (listaArtista.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    System.out.println("ID do Artista que quer diminuir o salario");
                                    idp = Ler.umInt();
                                    Artista mod = Database.acharArtistaPorID(listaArtista, idp);
                                    System.out.println("Em quantos % deseja diminuir o salario? ");
                                    mod.diminuirSalario(Ler.umDouble());
                                    System.out.println("Salario do artista " + mod.getId() + " alterado com sucesso!\nNovo salario: " + mod.getSalario() + "$");
                                    Database.guardarDados(listaArtista, listaEspetaculo);
                                    erro = false;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 6:
                            while (erro == true) {
                                try {
                                    if (listaArtista.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    System.out.println("ID do Artista que deseja consultar");
                                    idp = Ler.umInt();
                                    Artista mod = Database.acharArtistaPorID(listaArtista, idp);
                                    System.out.println(mod.toString());
                                    erro = false;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 7:
                            while (erro == true) {
                                try {
                                    if (listaArtista.size() < 1) {
                                    System.out.println("A base de dados se encontra vazia!");
                                    erro = false;
                                    break;
                                    }
                                    for (Artista i : listaArtista ) {
                                        System.out.println(i.toString());
                                        System.out.println("--------");
                                    }
                                    erro = false;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
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
                                            while (erro == true) {
                                                try {
                                                    System.out.println("ID do Comprador");
                                                    id = Ler.umInt();
                                                    System.out.println("Primeiro Nome");
                                                    primeiroNome = Ler.umaString();
                                                    System.out.println("Ultimo Nome");
                                                    segundoNome = Ler.umaString();
                                                    Bilhete bilhete = new Bilhete(id, primeiroNome, segundoNome);
                                                    i.adicionarBiblete(bilhete);
                                                    erro = false;
                                                    System.out.println("\nBilhete comprado com sucesso!");

                                                } catch (Exception e) {
                                                    erro = true;
                                                    System.out.println("Dados introduzidos incorretos!" + e.getMessage());
                                                }
                                            }
                                            System.out.println("Digite algo para continuar!");
                                            Ler.umaString();
                                            erro = true;
                                            break;
                                        case 2:
                                            while (erro == true) {
                                                try {
                                                    System.out.println("ID do Comprador");
                                                    id = Ler.umInt();
                                                    System.out.println("Primeiro Nome");
                                                    primeiroNome = Ler.umaString();
                                                    System.out.println("Ultimo Nome");
                                                    segundoNome = Ler.umaString();
                                                    System.out.println("Ano");
                                                    ano = Ler.umInt();
                                                    System.out.println("Mês");
                                                    mes = Ler.umInt();
                                                    System.out.println("Dia");
                                                    dia = Ler.umInt();
                                                    primeiroNome = Ler.umaString();
                                                    Bilhete bilhete = new Bilhete(id, primeiroNome, segundoNome, ano, mes, dia);
                                                    i.adicionarBiblete(bilhete);
                                                    erro = false;
                                                    System.out.println("\nBilhete com desconto comprado com sucesso!");

                                                } catch (Exception e) {
                                                    erro = true;
                                                    System.out.println("Dados introduzidos incorretos!" + e.getMessage());
                                                }
                                            }
                                            System.out.println("Digite algo para continuar!");
                                            Ler.umaString();
                                            erro = true;
                                            break;
                                        case 3:

                                            for (Bilhete a : i.getBilhetes()) {
                                                System.out.println("\n" + a);
                                            }
                                            System.out.println("Digite algo para continuar!");
                                            Ler.umaString();
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
                            while (erro == true) {
                                try {
                                    if (listaEspetaculo.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    System.out.println("ID do Espetaculo que pretende consultar os bilhetes");
                                    idp = Ler.umInt();
                                    Espetaculo mod = Database.acharEspetaculoPorID(listaEspetaculo, idp);
                                    System.out.println("O espetaculo de ID " + idp + " tem " + (mod.getTamanho() - mod.getBilhetes().size()) + " bilhetes disponiveis");
                                    erro = false;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            while (erro == true) {
                                try {
                                    if (listaEspetaculo.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    for (Espetaculo i : listaEspetaculo) {
                                        for (Bilhete b : i.getBilhetes()){
                                            count++;
                                        }
                                    }
                                    System.out.println("No total, o circo ja vendeu " + count + " bilhetes!");
                                    erro = false;
                                    count = 0;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 5:
                            if (listaArtista.size() == 0) {
                                System.out.println("No momento, nenhum artista trabalha no circo!");
                            } else {
                                System.out.println(listaArtista.size() > 1 ? "No momento trabalham " + listaArtista.size() + " artistas no circo"
                                        : "No momento, apenas 1 artista trabalha no circo");
                            }
                            break;
                        case 6:
                            break;
                        case 7:
                            while (erro == true) {
                                try {
                                    if (listaEspetaculo.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    for (Espetaculo e : listaEspetaculo) {
                                        for (Bilhete b : e.getBilhetes()){
                                            countPreco += b.getPreco();
                                        }
                                    }

                                    System.out.println("Neste mes, o circo gastou " + countSalario + " $ em despezas!");
                                    erro = false;
                                    countSalario = 0;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 8:
                            while (erro == true) {
                                try {
                                    if (listaArtista.size() < 1) {
                                        System.out.println("A base de dados se encontra vazia!");
                                        erro = false;
                                        break;
                                    }
                                    for (Artista a : listaArtista) {
                                        countSalario += a.getSalario();
                                    }

                                    System.out.println("Neste mes, o circo gastou " + countSalario + " $ em despezas!");
                                    erro = false;
                                    countSalario = 0;
                                } catch (Exception e) {
                                    erro = true;
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Digite algo para continuar!");
                            Ler.umaString();
                            erro = true;
                            break;
                        case 9:
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 0:
                    Database.guardarDados(listaArtista, listaEspetaculo);
                    System.out.println("| Fim do programa! |");
                    System.exit(0);
                    break;

            }
        }
    }

}
