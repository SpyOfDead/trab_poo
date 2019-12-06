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


    public static ArrayList<Artista> adicionarArtista(ArrayList<Artista> listaArtistas, Artista a) throws artistaDuplicadoException {
        for (int i = 0; i < listaArtistas.size(); i++) {
            if (listaArtistas.get(i).getId() == a.getId()) {
                throw new artistaDuplicadoException("O artista que tentou adicionar ja existe!!");
            }
        }
        listaArtistas.add(a);
        return listaArtistas;
    }

    public static Artista acharArtistaPorID(ArrayList<Artista> listaArtistas, int id) throws artistaNaoEncontrado {
        for (int i = 0; i < listaArtistas.size(); i++) {
            if(listaArtistas.get(i).getId() == id) {
                return listaArtistas.get(i);
            }
        }
        throw new artistaNaoEncontrado("O artista que procura nao existe!");
    }




}
