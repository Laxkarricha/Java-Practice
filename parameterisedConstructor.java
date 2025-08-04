public class parameterisedConstructor {
    String name;
    int age;

    void info(){
        System.out.println("Student inftomation");
        System.out.println(this.name);
        System.out.println(this.age);
    }
    parameterisedConstructor (String name, int age){
        System.out.println("info");
        this.name = name;
        this.age = age;
    }

public static void main(String[] args) {
    parameterisedConstructor Student = new parameterisedConstructor("Chanchu",30);
    Student.info();
    

}
}
