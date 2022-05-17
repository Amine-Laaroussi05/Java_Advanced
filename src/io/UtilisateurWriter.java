package io;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Classe qui permet d'écrire des utilisateurs sous forme CSV
 * numero, genre, nom, prenom
 * @author amine
 */
public class UtilisateurWriter {

    // chemin racine ou je vais écrire mon fichier de sortie
    private static String ROOT;
    // le séparateur pour le fichier CSV
    public static final String SEPARATEUR = ";";





    /**
     * permet de renseigner le chemin où sera créer mon fichier de sortie
     * @param aRoot : String
     */
    public static void setROOT(String aRoot){
        UtilisateurWriter.ROOT = aRoot;
    }


    /**
     * Permet d'écrire dans un fichier
     * @param nomDeFichier
     * @param noms
     * @param prenoms
     * @param combien de ligne à insérer
     */
    public static void writerUtilisateur(String nomDeFichier, List<String> noms, List<String> prenoms, int combien) throws IOException {

        // Etape 1 : vérifier si le fichier existe sinon le créer
        File fileOut = new File(UtilisateurWriter.ROOT, nomDeFichier);
        fileOut.createNewFile(); // si le fichier n'existe pas, le fichier est crée
        if(!fileOut.exists() || !fileOut.canWrite()){
            throw new IOException("Problème écriture du fichier " + fileOut);
        }

        // Etape 2 : on mélange les noms et les prénoms
        Collections.shuffle(noms);
        Collections.shuffle(prenoms);

        // Préparer les générateurs (éléments random)
        Random randomNom = new Random();
        Random randomPrenom = new Random();
        Random randomGenre = new Random();

        // Préparer mon fichier de sortie, mon writer et mon buffer
        FileOutputStream fos = null;
        OutputStreamWriter osw = null; // celui qui va écrire en flux de sortie
        BufferedWriter bufferedWriter = null;


        try{
            fos = new FileOutputStream(fileOut); // où l'écrire
            osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); // dans quelle langue l'écrire
            bufferedWriter = new BufferedWriter(osw);

            // Etape d'écriture
            final String nl = System.getProperty("line.separator");
            for (int i=0; i<combien; i++){
                String nom = noms.get(randomNom.nextInt(noms.size()));
                String prenom = prenoms.get(randomPrenom.nextInt(prenoms.size()));
                String genre = randomGenre.nextBoolean()? "Mm": "Mr";
                StringBuilder ligne = new StringBuilder();
                ligne.append(i+1).append(UtilisateurWriter.SEPARATEUR); // séparateur pour passer à la colonne suivante
                ligne.append(genre).append(UtilisateurWriter.SEPARATEUR);
                ligne.append(nom).append(UtilisateurWriter.SEPARATEUR);
                ligne.append(prenom).append(nl);
                bufferedWriter.write(ligne.toString());
            }
            bufferedWriter.flush(); // envoie son flux de donnée au writer // le fait une seule fois avec une seule commande
        } catch(Exception e){
            throw new IOException("Problème lors de l'écriture " + fileOut + "erreur: " + e);
        } finally {
            // fermer tous les éléments ouverts
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
            if (osw != null){
                osw.close();
            }
            if (fos != null){
                fos.close();
            }
        }
    }



}
