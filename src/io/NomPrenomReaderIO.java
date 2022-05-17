package io;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
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
     * Indique le chemin d'accées de mes fichiers
     * @param aRout : String le chemin racine
     * @exception IOException si un problème survient
     */
    public static void setROOT(String aRout){
        NomPrenomReaderIO.ROOT = aRout;
    }





    private static List<String> readFichier(String nomDeFichier) throws IOException {

        List<String> resultat = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        // sécurité
        File monFichier = new File(NomPrenomReaderIO.ROOT, nomDeFichier);
        if (!monFichier.exists() || !monFichier.canRead()){
            throw new IOException("Problème d'acces au fichier: " + monFichier);
        }

        // Etape 1 & 2: préparer la lecture du fichier
        try{
            // mon file reader (objet de lecture)
            // mon buffer reader (memoire tampons de lecture)
            fileReader = new FileReader(monFichier);
            bufferedReader = new BufferedReader(fileReader);

            // traitement de la lecture
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
        } finally {
            // closes
            try{
                bufferedReader.close();
                fileReader.close();
            } catch(IOException ioe){
                throw new IOException("Fermeture impossible: " + ioe);
            }
        }

        return resultat;
    }



    /**
     * Permet de lire le fichier nom et de récupérer la liste de ses valeurs en string
     * @return List en String
     * @throws IOException
     */
    public static List<String> readNom() throws IOException{
        return NomPrenomReaderIO.readFichier(NomPrenomReaderIO.FICHIER_NOM);
    }




    /**
     * Permet de lire le fichier prenom et de récupérer la liste de ses valeurs en string
     * @return List en String
     * @throws IOException
     */
    public static List<String > readPrenom() throws IOException{
        return NomPrenomReaderIO.readFichier(NomPrenomReaderIO.FICHIER_PRENOM);
    }



}
