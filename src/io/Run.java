package io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        System.out.println("========= debut de mon programme ================");
        final String root = "/home/amine/Documents/dev/Languages/Java/Java_Advanced/src/ressources"; // dans windows : D:workspace/courIb/src/ressources // dossier de ressources
        // linux : use readlink -f file_name.txt
        final String fichierResultat = "resultat.csv";  // fichier de résultat
        NomPrenomReaderIO.setROOT(root);
        UtilisateurWriter.setROOT(root);

        try {
            List<String> noms = NomPrenomReaderIO.readNom();
            List<String> prenoms = NomPrenomReaderIO.readPrenom();
            UtilisateurWriter.writerUtilisateur(fichierResultat, noms, prenoms, 50);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("========= fin de mon programme ================");
    }
}

