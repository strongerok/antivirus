package Stronger_antivirus;
//*************************************** E-Security *****************************************************************************
//
//
//								Andrey Molokanov BVT1801
//********************************************************************************************************************************

import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.File;

class virus {
    BufferedReader br = null;
    public String fname = "";
    int flag = 0;
    JButton b1, b2, b3, b4, b5;
    JFrame jf;
    String name;
    File ee;

    virus(String str) { // Block the Virus Infected FIle
        File ff = new File(str);
        File rr = new File(str + ".block");
        ff.renameTo(rr);
    }
}

