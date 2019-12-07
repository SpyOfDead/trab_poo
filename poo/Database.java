package poo;

import java.io.*;
import java.util.ArrayList;
import poo.Exceptions.*;


public class Database {

    public static void guardarDados(ArrayList<Artista> listaArtista, ArrayList<Espetaculo> listaEspetaculo) {

        try {
            ObjectOutputStream osA = new ObjectOutputStream(new FileOutputStream("./artistasDB.dat"));
            ObjectOutputStream osE = new ObjectOutputStream(new FileOutputStream("./espetaculosDB.dat"));

            osA.writeObject(listaArtista);
            osE.writeObject(listaEspetaculo);

            osA.flush();
            osE.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Artista> lerArtistas(ArrayList<Artista> listaArtista) {

        try {

            ObjectInputStream is = new ObjectInputStream(new FileInputStream("./artistasDB.dat"));
            listaArtista = (ArrayList<Artista>) is.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
        return listaArtista;
    }

    public static ArrayList<Espetaculo> lerEspetaculos(ArrayList<Espetaculo> listaEspetaculo) {

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("./espetaculosDB.dat"));
            listaEspetaculo = (ArrayList<Espetaculo>) is.readObject();

        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
        return listaEspetaculo;
    }


    public static ArrayList<Artista> adicionarArtista(ArrayList<Artista> listaArtistas, Artista a) throws ArtistaDuplicadoException {
        for (int i = 0; i < listaArtistas.size(); i++) {
            if (listaArtistas.get(i).getId() == a.getId()) {
                throw new ArtistaDuplicadoException("O artista que tentou adicionar ja existe!!");
            }
        }
        listaArtistas.add(a);
        return listaArtistas;
    }

    public static Artista acharArtistaPorID(ArrayList<Artista> listaArtistas, int id) throws ArtistaNaoEncontradoException {
        for (int i = 0; i < listaArtistas.size(); i++) {
            if(listaArtistas.get(i).getId() == id) {
                return listaArtistas.get(i);
            }
        }
        throw new ArtistaNaoEncontradoException("O artista que procura nao existe!");
    }

    public static ArrayList<Artista> removerArtistaID(ArrayList<Artista> listaArtistas, Artista a) throws ArtistaNaoEncontradoException {

        if (listaArtistas.indexOf(a) != -1) {
            listaArtistas.remove(listaArtistas.indexOf(a));
            return listaArtistas;
        } else {
            throw new ArtistaNaoEncontradoException("O artista que esta tentando remover nao existe!");
        }

    }

    public static ArrayList<Espetaculo> adicionarEspetaculo(ArrayList<Espetaculo> listaEspetaculos, Espetaculo e) throws EspetaculoDuplicadoException {
        for (int i = 0; i < listaEspetaculos.size(); i++) {
            if (listaEspetaculos.get(i).getId() == e.getId()) {
                throw new EspetaculoDuplicadoException("O espetaculo que tentou adicionar ja existe!!");
            }
        }
        listaEspetaculos.add(e);
        return listaEspetaculos;
    }

    public static Espetaculo acharEspetaculoPorID(ArrayList<Espetaculo> listaEspetaculos, int id) throws EspetaculoNaoEncontradoException {
        for (int i = 0; i < listaEspetaculos.size(); i++) {
            if(listaEspetaculos.get(i).getId() == id) {
                return listaEspetaculos.get(i);
            }
        }
        throw new EspetaculoNaoEncontradoException("O espetaculo que procura nao existe!");
    }

    public static ArrayList<Espetaculo> removerEspetaculoID(ArrayList<Espetaculo> listaEspetaculos, Espetaculo a) throws EspetaculoNaoEncontradoException {

        if (listaEspetaculos.indexOf(a) != -1) {
            listaEspetaculos.remove(listaEspetaculos.indexOf(a));
            return listaEspetaculos;
        } else {
            throw new EspetaculoNaoEncontradoException("O espetaculo que esta tentando remover nao existe!");
        }
    }
}
