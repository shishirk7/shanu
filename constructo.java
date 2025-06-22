public class constructo {
    // Static nested class Geek
 
    static class geek{
        String name;
        int age;

        geek(String name,int age){
            this.name=name;
            this.age=age;

        }
    }
    public static void main(String[] args) {
        geek g=new geek("shanu",65);
        System.out.println("Name="+g.name+" \nage="+g.age);
    }
}
