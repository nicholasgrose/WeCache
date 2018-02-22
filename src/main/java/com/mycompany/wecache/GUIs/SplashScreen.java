/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wecache.GUIs;

import javax.swing.*;
import java.awt.*;

public class SplashScreen
{
    
    private SplashScreen() throws Exception
    {
        throw new Exception("SplashScreen cannot be instantiated.");
    }

    private static JWindow splashScreen = new JWindow();
    private static Image favicon;


    public static void showSplash()
    {

        JPanel content = new JPanel()
        {
            @Override
            public void paintComponent(Graphics g)
            {
                Image img = new ImageIcon("Splash image.png").getImage();
                Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
                setPreferredSize(size);
                setMinimumSize(size);
                setMaximumSize(size);
                setSize(size);
                setLayout(null);
                g.drawImage(img, 0, 0, null);
            }
        };
        favicon = Toolkit.getDefaultToolkit().getImage("RSquared_Logo.png");
        double hWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double hHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        splashScreen.setContentPane(content);

        //favicon = Toolkit.getDefaultToolkit().getImage("RSquared_Logo.png");
        //splashScreen.getContentPane().add( iconHolder);
        //splashScreen.getContentPane().add(new JLabel("RSquared Cryptocurrency Trading App"));
        //splashScreen.getContentPane().add(new JLabel("Automate your trades today",SwingConstants.));
        //splashScreen.getContentPane().add(new JLabel("RESTRICTED ALPHA"), SwingConstants.RIGHT);
        splashScreen.setBounds(((int)hWidth)/2-(240), (((int)hHeight)/2-160), 480, 320);
        splashScreen.setIconImage(favicon);
        splashScreen.setVisible(true);


    }

    public static void hideSplash()
    {

        splashScreen.setVisible(false);

    }
}