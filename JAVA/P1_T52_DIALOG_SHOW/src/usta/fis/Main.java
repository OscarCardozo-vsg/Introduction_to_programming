package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"My first dialog show","Title in the meassage", JOptionPane.WARNING_MESSAGE );

        //String respuesta= JOptionPane.showInputDialog("escribe tu nombre:");
        //System.out.print(respuesta);
        String respuesta= JOptionPane.showInputDialog("escribe tu nombre:","Tu nombre");
        String[] v_carreras={
            "Ingeneria de sistemas",
            "Ingeneria mecatronica",
            "Ingeneria civil",
            "Ingeneria metalurgica",
            "ingeneria aereoespacial",
            "Medicina"
        };
        String v_respuesta= (String) JOptionPane.showInputDialog(null, "seleccione su carreara","Carrera", JOptionPane.DEFAULT_OPTION, null, v_carreras, v_carreras[0]);
        JOptionPane.showConfirmDialog(null,"Welcome "+respuesta+", is your carrear : "+v_respuesta+"?","Your Answere", JOptionPane.INFORMATION_MESSAGE );
    }

}
