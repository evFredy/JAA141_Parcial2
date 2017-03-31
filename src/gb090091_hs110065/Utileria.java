/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gb090091_hs110065;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author wilver
 */
public class Utileria {    
    public static void abriVentana(JInternalFrame internalFrame, JDesktopPane jdpContenedor)
    {
        jdpContenedor.add(internalFrame);
        //Dimension desktopSize = jdpContenedor.getSize();
        Dimension desktopSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension jInternalFrameSize = internalFrame.getSize();
        int width=(desktopSize.width - jInternalFrameSize.width)/2;
        int height=(desktopSize.height-40- jInternalFrameSize.height)/2;
        internalFrame.setLocation(width, height);
        internalFrame.setVisible(true);
    }
}
