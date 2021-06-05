package usta.logic;

public class Vehicle {
    private String serviceType;
    private String color;
    private String brand;
    private float width;
    private float heigth;
    private int cost;
    private int doorsNumber;
    private int wheelsNumber;
    private String plates;
    private char [][] places;

    //methods getter and setter
    //set-> poner, colocar.
    //get-> obtener.

    /*public void setServiceType(String serviceTypevalue){
        serviceType= serviceTypevalue;
    }
    public String getServiceType(){
        return serviceType;
    }

    public void setColor(String colorvalue){
        color= colorvalue;
    }
    public String getColor(){ return color; }

    public void setBrand(String brandvalue){ brand= brandvalue; }
    public String getBrand(){
        return color;
    }

    public void setWidth(float Widthvalue){
        width= Widthvalue;
    }
    public float getWidth(){
        return width;
    }

    public void setHeigth(float heigthvalue){
        heigth= heigthvalue;
    }
    public float getHeigth(){
        return heigth;
    }

    public void setCost(int costvalue){ cost= costvalue; }
    public int getCost(){
        return cost;
    }

    public void setDoorsNumber(int doorsNumbervalue){ doorsNumber= doorsNumbervalue; }
    public int getDoorsNumber(){
        return doorsNumber;
    }

    public void setWheelsNumber(int wheelsNumbervalue){ wheelsNumber= wheelsNumbervalue; }
    public int getWheelsNumber(){
        return wheelsNumber;
    }

    public void setPlates(String platesvalue){ plates= platesvalue; }
    public String getPlates(){ return plates;}*/

    public void createPlaces(String rows){
        int rowsInt= Integer.parseInt(rows);
        places= new char[rowsInt][4];
    }

    public void initPlaces(){
        boolean letter= true;

        for (int i = 0; i < places.length ; i++) { //this was do it for rows
            for (int j = 0; j < places[0].length ; j++) { //this was do it for colums
                if(letter==true){
                    letter=false;
                }else{
                    letter=true;
                }
                if(letter==true){
                    places[i][j]='D';
                }else{
                    places[i][j]='X';
                }
            }
        }
    }
    public String arrayToshow(){
        String returnString="";

        for (int i = 0; i < places.length ; i++) {
            for (int j = 0; j < places[0].length ; j++){
                returnString= returnString+ places[i][j];
            }
            returnString= returnString+"\n";
        }
        return returnString;
    }
    public String p_fillplaces(String row, String colum){
        int i_row= Integer.parseInt(row);
        int i_colum= Integer.parseInt(colum);
        if (places[i_row][i_colum]=='X'||places[i_row][i_colum]=='O'){
            places[i_row][i_colum]='O';
            return "the place was fill";
        }else{
            return "the place is unavalible";
        }
    }

    public String p_statusofbus(){
        int filled= 0, empty= 0;

            for (int i = 0; i < places.length; i++) {
                for (int j = 0; j < places[0].length; j++) {
                    if (places[i][j]=='D'){
                        empty++;
                    }if (places[i][j]=='O'){
                        filled++;
                }
            }
        }
        return "the amount of filled places are: "+filled+", and the amount of empty places are: "+empty;

    }
}
