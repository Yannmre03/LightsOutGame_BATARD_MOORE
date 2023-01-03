/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoutmoorebatard;

/**
 *
 * @author Administrateur
 */
public class Grille {
    cellule[][] grille = new cellule[5][5];
    int cmpt= 0;
    Joueur joueurNouv;

    public Grille() {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                grille[i][j] = new cellule(i, j);
            }
        }
    }
    
    public cellule retournerCase(int i, int j){
        return grille[i][j];
    }

    public void celluleClicked(int i, int j) {
        cmpt +=1;
        grille[i][j].changeState();
        if (i < 4) {
            grille[i + 1][j].changeState();
        }
        if (j < 4) {
            grille[i][j + 1].changeState();
        }
        if (j > 0) {
            grille[i][j - 1].changeState();
        }
        if (i > 0) {
            grille[i - 1][j].changeState();
        }
        
        // au max 9 cases changent de status      
    }
    public boolean grilleEteinte(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (grille[i][j].isOn()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void allumerCase(int ligne, int colonne){
        grille[ligne][colonne].turnOn();
    }
    public void eteindreCase(int ligne, int colonne){
        grille[ligne][colonne].turnOff();
    }
    
    public boolean caseAllumer(int ligne, int colonne){
        return grille[ligne][colonne].isOn();
    }
    
    public void setJoueur(Joueur addJoueur){
        joueurNouv = addJoueur;
    }
    public Joueur getJoueur(){
        return joueurNouv;
    }
}
