package javasessions;

public class CarAssignment {
	
	String brand;
    String model;
    int year;

    public static void main(String[] args) {
    	CarAssignment car1 = new CarAssignment();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        CarAssignment car2 = new CarAssignment();
        car2.brand = "Honda";
        car2.model = "Accord";
        car2.year = 2019;

        CarAssignment car3 = new CarAssignment();
        car3.brand = "Ford";
        car3.model = "Fusion";
        car3.year = 2018;

        CarAssignment car4 = new CarAssignment();
        car4.brand = "Audi";
        car4.model = "A6";
        car4.year = 2022;

        System.out.println("Original values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);


        System.out.println("----------");

     // Assignments:
        // 1. Assign car1 to car2 => car2 = car1
        // 2. Assign car2 to car3 => car3 = car2
        // 3. Assign car3 to car4 => car4 = car3
        // 4. Assign car4 to car1 => car1 = car4

/*
        // 1. Assign car1 to car2
        car2 = car1;
        System.out.println("After Assining Car1 to Car2 values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);
        
        
        // 2. Assign car2 to car3
        car3 = car2;
        System.out.println("After Assining Car3 to Car2 values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);
        
        // 3. Assign car3 to car4
        car4 =car3;
        System.out.println("After Assining Car1 to Car4 values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);
        
        // 4. Assign car4 to car1
        car1 = car4;
        System.out.println("After Assining Car4 to Car1 values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);
        */
        
        // 1. Assign car1 to car2
        car1 = car2;
        System.out.println("After Assining Car1 to Car2 values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);
        
        
        // 2. Assign car2 to car3
        car2 = car3;
        System.out.println("After Assining Car3 to Car2 values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);
        
        // 3. Assign car3 to car4
        car3 =car4;
        System.out.println("After Assining Car1 to Car4 values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);
        
        // 4. Assign car4 to car1
        car4 = car1;
        System.out.println("After Assining Car4 to Car1 values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
        System.out.println(car4.brand + " " + car4.model + " " + car4.year);


        // Print the values of car1, car2, car3 and car4 after each assignment
    }

}
