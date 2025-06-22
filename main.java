public class main{
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.color="red";
        mycar.speed= 120;
        mycar.drive();


        System.out.println(mycar.color);
        System.out.println(mycar.speed);
        
        if(mycar.haveCar){
            System.out.println("yes i have a car");

        }
        else{
            System.out.println("I do not have a car");
        }
        
    }
}