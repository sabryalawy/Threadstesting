/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Alawi
 */
public class ThreadTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Thread task = new Thread(new Runnable() {//we can do it in diffrint way
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("this is thread # 2 " + i);
                }
            }
        });
        task.start();
        
        InhertinsToThread h=new InhertinsToThread();
        h.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("this is thread # 1 " + i);
        }
    }

}
