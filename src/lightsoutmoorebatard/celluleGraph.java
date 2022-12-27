/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoutmoorebatard;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Administrateur
 */
public class celluleGraph extends JButton{
    cellule celluleAssociee;
    ImageIcon imgOff = new javax.swing.ImageIcon(getClass().getResource("/images/caseEteinte.png"));
    ImageIcon imgOn = new javax.swing.ImageIcon(getClass().getResource("/images/caseAllumer.png"));
    
    public celluleGraph(cellule uneCellule){
        celluleAssociee = uneCellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        if(celluleAssociee.isOn()){
            setIcon(imgOn);
        }else if(celluleAssociee.isOn()==false){
            setIcon(imgOff);
        }
        
        
    }
    
    
    
}

