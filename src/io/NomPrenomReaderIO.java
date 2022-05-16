package io;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui permet de lire noms et prenoms
 * @author amine laaroussi
 */

public class NomPrenomReaderIO {

    // Chemin racine vers mes fichiers sources
    private static String ROOT;
    private static final String FICHIER_NOM = "nom.txt";
    private static final String FICHIER_PRENOM = "prenom.txt";





    /**
     * Indique le chemin d'acces d emes fichiers
     * @param aRout : String le chemin racine
     */
    public static void setROOT(String aRout){
        NomPrenomReaderIO.ROOT = aRout;
    }





    private static List<String> readFichier(String nomDeFichier) throws IOException {

        List<String> resultat = new ArrayList<>();
        // sécurité

        // Etape 1 & 2: préparer la lecture du fichier
        try{
            // mon file reader (objet de lecture)
            // mon buffer reader (memoire tampons de lecture)
            FileReader fileReader = new FileReader(nomDeFichier);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // traitement de ma lecture
            String ligne;
            do{
                ligne = bufferedReader.readLine();
                ligne = ligne != null?  ligne.trim() : null;
                if(ligne != null && !ligne.isEmpty()){
                    resultat.add(ligne);
                }
            } while(ligne != null);

        } catch(Exception e){
            throw new IOException("Erreur de lecture du fichier: " + nomDeFichier + "erreur: " + e);
        } /*finally {
            try{

            }
        }*/

        return resultat;
    }




}
