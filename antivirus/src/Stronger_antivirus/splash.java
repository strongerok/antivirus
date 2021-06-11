package Stronger_antivirus;

import java.awt.Color;
import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

class splash extends JWindow {
    Container cp;
    JPanel p1;
    JLabel l3;
    JProgressBar jb;
    private BufferedImage backgroundImg;

    splash() {
        try {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception ignored) { }
            cp = getContentPane();
            cp.setLayout(null);

            setVisible(true);
            setSize(297, 280);
            setLocation(150, 100);

            p1 = new JPanel(null, true);
            p1.setBounds(0, 0, 297, 280);
            cp.add(p1);

            l3 = new JLabel();
            l3.setBounds(05, 220, 297, 20);
            p1.add(l3);
            URL backgroundImgUrl = this.getClass().getResource("/Image/final.png");
            try {
                assert backgroundImgUrl != null;
                backgroundImg = ImageIO.read(backgroundImgUrl);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            JLabel l = new JLabel(new ImageIcon(backgroundImg));
            l.setBounds(05, 05, 291, 215);
            p1.add(l);
            l.setBorder(new LineBorder(new Color(115, 176, 188), 5));

            jb = new JProgressBar();
            jb.setBounds(05, 250, 291, 30);
            p1.add(jb);

            try {
                Thread.sleep(1000);
            } catch (Exception ignored) { }
            File f = new File("c:/'.'");
            File[] strRoot = File.listRoots();
            for (int k = 0; k < strRoot.length; k++) {
                l3.setText("	Checking Recycle Bin...");
                File fh = new File(strRoot[k] + "RECYCLER");
                if (fh.exists()) {
                    Runtime r = Runtime.getRuntime();
                    r.exec("Utilities/emptyRecycle.bat");
                    fh.delete();
                }
                jb.setValue(8 * k);
                try {
                    Thread.sleep(100);
                } catch (Exception ignored) { }
            }
            try {
                Thread.sleep(4000);
            } catch (Exception ignored) { }
            for (int k = 0; k < strRoot.length; k++) {
                try {
                    l3.setText("	Checking System Restore Point...");
                    File fh2 = new File(strRoot[k] + "System Volume Information/'.'");
                    String str = fh2.getParent();
                    File fgv = new File(str + "");
                    String[] strRoot2 = fgv.list();
                    assert strRoot2 != null;
                    for (String s : strRoot2) {
                        File df = new File(strRoot[k] + "System Volume Information/" + s);
                        //System.out.println(strRoot2[y]);
                        if (df.exists()) {
                            Runtime r = Runtime.getRuntime();
                            r.exec("Utilities/emptySysRes.bat");
                            df.delete();
                        }
                    }
                    jb.setValue(9 * k);
                    try {
                        Thread.sleep(100);
                    } catch (Exception ignored) { }
                } catch (Exception gg) {
                    k++;
                }
            }
            try {
                Thread.sleep(4000);
            } catch (Exception ignored) { }
            l3.setText("	Checking Windows Temp Folder...");
            try {
                File fi, fi1, fi2, fi3, fic;
                for (int j = 0; j < 3; j++) {
                    jb.setValue(19 * j);
                    try {
                        Thread.sleep(100);
                    } catch (Exception ignored) { }
                }
                try {
                    Runtime r = Runtime.getRuntime();
                    r.exec("Utilities/emptyTmp.bat");
                    try {
                        Thread.sleep(4000);
                    } catch (Exception ignored) { }
                    l3.setText("	Checking User Temp Folder...");
                    fic = new File("c:/'.'");
                    String hhb = fic.getParent();
                    File fjb = new File(hhb + "");
                    String[] hjb = fjb.list();
                    for (int jbb = 0; jbb < Objects.requireNonNull(hjb).length; jbb++) {
                        File ffbb = new File(hjb[jbb] + "");
                        ffbb.delete();
                        jb.setValue(10 * jbb);
                        try {
                            Thread.sleep(100);
                        } catch (Exception ignored) { }
                    }
                    Runtime rb = Runtime.getRuntime();
                    rb.exec("Utilities/emptyTemp.bat");
                    l3.setText("	Start Cleaning computer...");
                    Runtime rb1 = Runtime.getRuntime();
                    rb1.exec("start_clean.bat");
                    jb.setValue(jb.getMaximum());
                    try {
                        Thread.sleep(2000);
                    } catch (Exception ignored) { }
                } catch (Exception ignored) { }
                p1.setVisible(false);
                setVisible(false);
                setSize(0, 0);
            } catch (Exception ignored) {
            }
        } catch (Exception ignored) {
        }
    }
}