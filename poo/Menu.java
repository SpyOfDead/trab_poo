package poo;

public class Menu {

    public static void menuPrincipal() {

        System.out.println("..................................................");
        System.out.println("|            GESTOR DE  CIRCO                    |");
        System.out.println("..................................................");
        System.out.println("| 1 -> Artista                                   |");
        System.out.println("| 2 -> Espetáculo(Bilhetes)                      |");
        System.out.println("| 3 -> Tenda                                     |");
        System.out.println("| 0 -> Sair                                      |");
        System.out.println("..................................................");
        System.out.println("| Escolha uma Opção:                              ");

    }

    public static void menuTenda() {

        System.out.println("...................................................");
        System.out.println("|                     TENDA                       |");
        System.out.println("...................................................");
        System.out.println("| 1  -> Número de Bilhetes                        |");
        System.out.println("| 2  -> Consultar o horário do Espetáculo         |");
        System.out.println("| 3  -> Espetáculo mais visto                     |");
        System.out.println("| 4  -> Total de Bilhetes Vendidos                |");
        System.out.println("| 5  -> Total de Artistas                         |");
        System.out.println("| 6  -> Total de Espetáculos realizados           |");
        System.out.println("| 7  -> Total de Lucro obtido                     |");
        System.out.println("| 8  -> Total de de Despesa obtida                |");
        System.out.println("| 9  -> Histórico de vendas                       |");
        System.out.println("| 0  -> Sair                                      |");
        System.out.println("...................................................");
        System.out.println("| Escolha uma Opção:	      					  |");

    }

    public static void menuEspetaculo() {

        System.out.println("..................................................");
        System.out.println("|                 ESPETÁCULO                     |");
        System.out.println("..................................................");
        System.out.println("| 1 -> Adicionar novo Espetáculo                 |");
        System.out.println("| 2 -> Modificar os Bilhetes do Espetaculo       |");
        System.out.println("| 3 -> Remover Espetáculo                        |");
        System.out.println("| 4 -> Consultar Espetáculo                      |");
        System.out.println("| 5 -> Clonar Espetáculo                         |");
        System.out.println("| 0 -> Voltar para o menu principal              |");
        System.out.println("..................................................");
        System.out.println("| Escolha uma Opção:                              ");

    }
    public static void menuAdicionarEspetaculo() {

        System.out.println("..................................................");
        System.out.println("|            INSERIR NOVO ESPETACULO             |");
        System.out.println("..................................................");
    }

    public static void menuArtista() {

        System.out.println("..................................................");
        System.out.println("|                 ARTISTA                        |");
        System.out.println("..................................................");
        System.out.println("| 1 -> Inserir novo Artista                      |");
        System.out.println("| 2 -> Modificar Artista                         |");
        System.out.println("| 3 -> Remover Artista                           |");
        System.out.println("| 4 -> Aumentar o salário do Artista             |");
        System.out.println("| 5 -> Diminuir o salário do Artista             |");
        System.out.println("| 6 -> Consultar Artista                         |");
        System.out.println("| 7 -> Listar  Artistas                          |");
        System.out.println("| 0 -> Voltar para menu principal                |");
        System.out.println("..................................................");
        System.out.println("| Escolha uma Opção:                              ");

    }

    public static void menuBilheteria() {
        System.out.println("..................................................");
        System.out.println("|                 BILHETEIRA                     |");
        System.out.println("..................................................");
        System.out.println("| 1 -> Comprar Bilhete                           |");
        System.out.println("| 2 -> Desconto do Bilhete                       |");
        System.out.println("| 3 -> Consultar Bilhete                         |");
        System.out.println("| 4 -> Clonar Bilhete                            |");
        System.out.println("| 0 -> Voltar para o menu principal              |");
        System.out.println("..................................................");
        System.out.println("| Escolha uma Opção:                              ");
    }
    public static void menuEspetaculoModificar() {
        System.out.println("..................................................");
        System.out.println("|             MODIFICAR ESPETÁCULO               |");
        System.out.println("..................................................");
        System.out.println("ID do Espetáculo que deseja modificar");
    }
    public static void menuEspetaculoRemover() {
        System.out.println("..................................................");
        System.out.println("|                  REMOVER ESPETACULO            |");
        System.out.println("..................................................");
        System.out.println("ID do Espetáculo que deseja remover");
    }
    public static void menuEspetaculoClonar() {
        System.out.println("..................................................");
        System.out.println("|               CLONAR ESPETÁCULOS               |");
        System.out.println("..................................................");
        System.out.println("ID do Espetáculo que deseja clonar");

    }
    public static void menuBilheteComprar() {
        System.out.println("..................................................");
        System.out.println("|               COMPRAR BILHETE                  |");
        System.out.println("..................................................");
        System.out.println("Quantos bilhetes deseja comprar");
    }
    public static void menuBilheteDesconto() {
        System.out.println("..................................................");
        System.out.println("|               DESCONTO DO BILHETE              |");
        System.out.println("..................................................");

    }
    public static void menuBilheteConsultar() {
        System.out.println("..................................................");
        System.out.println("|      		      	CONSULTAR                    |");
        System.out.println("..................................................");
        System.out.println("ID do Bilhete que deseja verificar");
    }
    public static void menuBilheteClonar() {
        System.out.println("..................................................");
        System.out.println("|                 CLONAR BILHETES                |");
        System.out.println("..................................................");
        System.out.println("ID do Bilhete que deseja clonar");
    }
}
