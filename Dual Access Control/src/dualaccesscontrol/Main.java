/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dualaccesscontrol;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */
public class Main {
    public static void main(String[] args) 
    {        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try
        {                    			
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                                                
            LoginPage hp=new LoginPage();
            hp.setTitle("Login Page");
            hp.setVisible(true);
            hp.setResizable(false);
            System.out.println();
	}
	catch (Exception ex)
	{            
            //System.out.println(ex);
	}   
    }
}


