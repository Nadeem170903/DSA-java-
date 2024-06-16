class Car {
    String title;
    String company;
    String model;

}


public class Sample1 {


    public static void main(String args[]) {
        // Define object;

        Car C1 = new Car();
        C1.title = "Seltos";
        C1.company = "KIA";
        C1.model = "SKT2024";

        // print car info

        System.out.println("Car tile --->"+C1.title);
        System.out.println("Car model --->"+C1.model);
        System.out.println("Car company name --->"+C1.company);
    }
}