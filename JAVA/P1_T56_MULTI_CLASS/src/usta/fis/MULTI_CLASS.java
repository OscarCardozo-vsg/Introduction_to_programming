package usta.fis;

import usta.logic.Vehicle;

import javax.swing.*;

public class MULTI_CLASS {
    private static Vehicle myVehicle;
    //create a program that do it manage the bus places with differents X for unavailable, D available, O for busy.
    //the bus have 4 colums but the rows depend for each bus.
    public static void main(String[] args) {
        myVehicle = new Vehicle();
        String value, showinfo, value_color, showinfo_color, value_brand, showinfo_brand, value_width, showinfo_width, value_heigth, showinfo_heigth;
        String value_cost, showinfo_cost, value_doors, showinfo_doors, value_wheels, showinfo_wheels, value_plate, showinfo_plate;
        String value_seating, showinfo_seating, row, colum, showinfo_fill, showinfo_status;
        int value_confirm;
        /*value=JOptionPane.showInputDialog("please type the kind of service of your vehicle:");
        myVehicle.setServiceType(value);
        showinfo=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the kind service for this vehicle is: "+showinfo);

        value_color=JOptionPane.showInputDialog("please type the color of your vehicle:");
        myVehicle.setServiceType(value_color);
        showinfo_color=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the color for this vehicle is: "+showinfo_color);

        value_brand=JOptionPane.showInputDialog("please type the brad of your vehicle:");
        myVehicle.setServiceType(value_brand);
        showinfo_brand=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the brand for this vehicle is: "+showinfo_brand);

        value_width=JOptionPane.showInputDialog("please type the width of your vehicle:");
        myVehicle.setServiceType(value_width);
        showinfo_width=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the width for this vehicle is: "+showinfo_width);

        value_heigth=JOptionPane.showInputDialog("please type the heigth of your vehicle:");
        myVehicle.setServiceType(value_heigth);
        showinfo_heigth=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the heigth for this vehicle is: "+showinfo_heigth);

        value_cost=JOptionPane.showInputDialog("please type the cost of your vehicle:");
        myVehicle.setServiceType(value_cost);
        showinfo_cost=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the cost for this vehicle is: "+showinfo_cost);

        value_doors=JOptionPane.showInputDialog("please type the doors of your vehicle:");
        myVehicle.setServiceType(value_doors);
        showinfo_doors=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the doors for this vehicle is: "+showinfo_doors);

        value_wheels=JOptionPane.showInputDialog("please type the wheels of your vehicle:");
        myVehicle.setServiceType(value_wheels);
        showinfo_wheels=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the wheels for this vehicle is: "+showinfo_wheels);

        value_plate=JOptionPane.showInputDialog("please type the plate of your vehicle:");
        myVehicle.setServiceType(value_plate);
        showinfo_plate=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the wheels for this vehicle is: "+showinfo_plate);*/

        //1. pedir el numero de filas
        value_seating = JOptionPane.showInputDialog("please input the number of rows of your bus.");
        //2. crea la matriz con las medidas pedidas
        myVehicle.createPlaces(value_seating);
        //3.inicializa la matriz
        myVehicle.initPlaces();
        //4. convierte el array en un string para poder mostrar
        showinfo_seating= myVehicle.arrayToshow();
        //5. muestra lo hecho
            JOptionPane.showMessageDialog(null, showinfo_seating);

        do {
            row = JOptionPane.showInputDialog("Please type the row to fill the seating");
            colum = JOptionPane.showInputDialog("Please type the colum to fill the seating");
            showinfo_fill = myVehicle.p_fillplaces(row, colum);
            JOptionPane.showMessageDialog(null, showinfo_fill);
            value_confirm = JOptionPane.showConfirmDialog(null, "do you want fill another seating?");
        }while (value_confirm==JOptionPane.YES_OPTION);

        showinfo_status=myVehicle.p_statusofbus();
        JOptionPane.showMessageDialog(null, showinfo_status);
    }
}
