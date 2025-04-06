package Lab1Testing;

public class Ex9 {
    int modelYear;
    String modelName;

    public Ex9(int year,String name){
        this.modelName=name;
        this.modelYear=year;
    }
    public static void main (String []args){
    Ex9 myCar=new Ex9(2022,"Porche");
    System.out.println("Car name"+myCar.modelName +(", car year: ")+myCar.modelYear);


    }
}


