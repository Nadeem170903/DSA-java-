class Car {
    String title;
    String company;
    String model;


    // define Constructor 

    Car(String title, String company, String model) {
        this.title = title;
        this.model = model;
        this.company = company;
    }

   // implement polymorphism 

    public void carInfo(String title){
        System.out.println("Car title --->"+title);
    }

    public void carInfo(String title ,String model){
        System.out.println("Car title --->"+title);
        System.out.println("Car model --->"+model);

    }

}


public class Sample2 {


    public static void main(String args[]) {
        // Define object;

        Car C1 = new Car("Seltos","KIA", "SKT2024");
        
        // print car info according to our need 
        C1.carInfo(C1.title);
        C1.carInfo(C1.title,C1.model);
    

    }
}