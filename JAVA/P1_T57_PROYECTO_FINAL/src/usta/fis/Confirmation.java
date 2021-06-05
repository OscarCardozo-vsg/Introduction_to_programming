package usta.fis;

public class Confirmation {
    static boolean esGanador3(String[][] t, String Mj) {
        boolean sw = false;

        //Verifiacacion filas
        if (t[0][0] == Mj && t[0][1] == Mj && t[0][2] == Mj){
            sw = true;
        }else if (t[1][0] == Mj && t[1][1] == Mj && t[1][2] == Mj){
            sw=true;
        }else if (t[2][0] == Mj && t[2][1] == Mj && t[2][2] == Mj){
            sw=true;
        }
        //Verificacion Columnas
        if (t[0][0] == Mj && t[1][0] == Mj && t[2][0] == Mj){
            sw = true;
        }else if (t[0][1] == Mj && t[1][1] == Mj && t[2][1] == Mj){
            sw=true;
        }else if (t[0][2] == Mj && t[1][2] == Mj && t[2][2] == Mj){
            sw=true;
        }
        //Verificacion diagonales

        if (t[0][0] == Mj && t[1][1] == Mj && t[2][2] == Mj){
            sw = true;
        }else if (t[0][2] == Mj && t[1][1] == Mj && t[2][0] == Mj){
            sw=true;
        }

        return sw;
    }

    static boolean esGanador5(String[][] t, String Mj) {
        boolean sw = false;

        //Verifiacacion filas
        if (t[0][0] == Mj && t[0][1] == Mj && t[0][2] == Mj && t[0][3] == Mj && t[0][4] == Mj){
            sw = true;
        }else if (t[1][0] == Mj && t[1][1] == Mj && t[1][2] == Mj && t[1][3] == Mj && t[1][4] == Mj){
            sw=true;
        }else if (t[2][0] == Mj && t[2][1] == Mj && t[2][2] == Mj && t[2][3] == Mj && t[2][4] == Mj){
            sw=true;
        }else if (t[3][0] == Mj && t[3][1] == Mj && t[3][2] == Mj && t[3][3] == Mj && t[3][4] == Mj){
            sw=true;
        }else if (t[4][0] == Mj && t[4][1] == Mj && t[4][2] == Mj && t[4][3] == Mj && t[4][4] == Mj){
            sw=true;
        }
        //Verificacion Columnas
        if (t[0][0] == Mj && t[1][0] == Mj && t[2][0] == Mj && t[3][0] == Mj && t[4][0] == Mj){
            sw = true;
        }else if (t[0][1] == Mj && t[1][1] == Mj && t[2][1] == Mj && t[3][1] == Mj && t[4][1] == Mj){
            sw=true;
        }else if (t[0][2] == Mj && t[1][2] == Mj && t[2][2] == Mj && t[3][2] == Mj && t[4][2] == Mj){
            sw=true;
        }else if (t[0][3] == Mj && t[1][3] == Mj && t[2][3] == Mj && t[3][3] == Mj && t[4][3] == Mj){
            sw=true;
        }else if (t[0][4] == Mj && t[1][4] == Mj && t[2][4] == Mj && t[3][4] == Mj && t[4][4] == Mj){
            sw=true;
        }
        //Verificacion diagonales

        if (t[0][0] == Mj && t[1][1] == Mj && t[2][2] == Mj && t[3][3] == Mj && t[4][4] == Mj){
            sw = true;
        }else if (t[0][4] == Mj && t[1][3] == Mj && t[2][2] == Mj && t[3][1] == Mj && t[4][0] == Mj){
            sw=true;
        }

        return sw;
    }
}
