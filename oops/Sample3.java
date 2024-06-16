class Car {
    String company;
    String model;
    String color;
    int age;


}

class Tata extends Car {


    Tata(String company, String model, String color, int age){
        this.company = company;
        this.color = color;
        this.model = model;
        this.age = age;
    }


    public void carInfo(String company){
        System.out.println(company);
    }

    public void carInfo(int age){
        System.err.println(age);
    }

    public void carInfo(String company, String model){
        System.out.println(company);
        System.out.println(model);
    }

    public void carInfo(String company , String model, String color, int age){
        System.out.println(company);
        System.out.println(model);
        System.out.println(age);
        System.out.println(color);
    }

}

 


public class Sample3 {


    public static void main(String args[]) {
        // Define object;

        Tata t1 = new Tata("Nexon", "SKT2024", "black", 3);
        
        // print car info according to our need 
        t1.carInfo(t1.company);
        t1.carInfo(t1.age);
        t1.carInfo(t1.company,t1.model);
        t1.carInfo(t1.company,t1.model,t1.color,t1.age);
    

    }
}