/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightsoutmoorebatard;

import java.util.Random;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



/**
 *
 * @author Administrateur
 */
public class interfaceLightsOut extends javax.swing.JFrame {

    private Grille grilleInterface = new Grille();

    /**
     * Creates new form interfaceLightsOut
     */
    public interfaceLightsOut() {
        initComponents();
        //boardPage.setVisible(false);
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                celluleGraph cellGraph = new celluleGraph(grilleInterface.retournerCase(i, j));
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cellule c = cellGraph.celluleAssociee;
                        grilleInterface.celluleClicked(c.coordX, c.coordY);
                        boardPage.repaint();
                        compteur.setText(Integer.toString(grilleInterface.cmpt));

                        if (grilleInterface.grilleEteinte() == false) {
                            classement(grilleInterface.getJoueur(), grilleInterface.cmpt);
                        }
                    }
                });

                boardPage.add(cellGraph);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startPage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        boardPage = new javax.swing.JPanel();
        titlePage = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        infoPage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        compteur = new javax.swing.JLabel();
        messageFin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startPage.setBackground(new java.awt.Color(102, 255, 102));
        startPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Débuter une partie: ");
        startPage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 6, -1, 20));

        jLabel2.setText("prénom:");
        startPage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        startPage.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, -1));

        start.setText("Démarrer");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        startPage.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        getContentPane().add(startPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 420, 140));

        boardPage.setBackground(new java.awt.Color(0, 0, 0));
        boardPage.setPreferredSize(new java.awt.Dimension(340, 340));
        boardPage.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(boardPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 360));

        titlePage.setBackground(new java.awt.Color(102, 255, 102));
        titlePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Krungthep", 0, 24)); // NOI18N
        jLabel5.setText("Let's play Lights Out !");
        titlePage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(titlePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2, 420, 60));

        infoPage.setBackground(new java.awt.Color(204, 255, 204));
        infoPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("Informations sur la partie");
        infoPage.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel4.setText("nombre de coups:");
        infoPage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        compteur.setText("0");
        infoPage.add(compteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));
        infoPage.add(messageFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 190, -1));

        getContentPane().add(infoPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 420, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        String nom = name.toString();
        Joueur joueur = new Joueur(nom);
        setOn();
        grilleInterface.setJoueur(joueur);
        boardPage.repaint();
    }//GEN-LAST:event_startActionPerformed

    public void setOn() {
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int ligne = r.nextInt(0, 5);
            int colonne = r.nextInt(0, 5);
            if (grilleInterface.caseAllumer(ligne, colonne) == false) {
                grilleInterface.allumerCase(ligne, colonne);
            } else {
                i -= 1;
            }
        }
    }

    public void classement(Joueur newJoueur, int score) {    // code pris d'internet et adapté à notre utilisation
        JSONParser jsonParser = new JSONParser();
        String bestScoreStr = null;
        int bestScore = 0;
        try ( FileReader reader = new FileReader("/Users/Administrateur/NetBeansProjects/LightsOut/LightsOutMooreBatard/src/lightsoutmoorebatard/highscore.json")) // vérifie la présence du fichier, sinon renvoie l'erreur dans catch
        {

            Object obj = jsonParser.parse(reader); //lit le JSON file et le stocke dans obj  
            JSONObject jsonObject = (JSONObject) obj;   // précise le type d'objet ? 
            System.out.println(jsonObject);     //simple test 
            bestScoreStr = (String) jsonObject.get("score"); // stocke le highscore du fichier JSON dans bestScore
            bestScore = Integer.parseInt(bestScoreStr);
        } catch (FileNotFoundException e) {     //renvoie le type d'erreur reconctré si jamais 
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (score < bestScore) {
            JSONObject sampleObject = new JSONObject();
            sampleObject.put("name", newJoueur.nom);
            sampleObject.put("score", Integer.toString(score));
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceLightsOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceLightsOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceLightsOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceLightsOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceLightsOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPage;
    private javax.swing.JLabel compteur;
    private javax.swing.JPanel infoPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel messageFin;
    private javax.swing.JTextField name;
    private javax.swing.JButton start;
    private javax.swing.JPanel startPage;
    private javax.swing.JPanel titlePage;
    // End of variables declaration//GEN-END:variables
}
