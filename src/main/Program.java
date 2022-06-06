package main;

import nezet.KincsKeresiGui;

public class Program {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KincsKeresiGui().setVisible(true);
            }
        });
    }

}
