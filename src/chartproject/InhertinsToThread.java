/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartproject;

/**
 *
 * @author Alawi
 */
public class InhertinsToThread extends Thread{
    @Override
    public void run(){ /// lama a7t start lazm yjy hoon
        for (int i = 0; i < 10; i++) {
            System.out.println("this is thread # 3 " + i);
        }
    }
}
