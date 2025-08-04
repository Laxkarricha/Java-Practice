public class thisClassObject {
    String name;
    int age;

    void Stu() {
        System.out.println("Student");
    }
    void name(){
        System.out.println(this.name);
    }
    void age(){
        System.out.println(this.age);
    }
    public static void main(String[] args) {
    thisClassObject Student = new thisClassObject();
    Student.name = "Richa";
    Student.age= 30;
    
    thisClassObject Stud = new thisClassObject();
    Stud.name = "laxkar";
    Stud.age = 23;


    Student.Stu();
    Student.name();
    Student.age();
    Stud.Stu();
    Stud.name();
    Stud.age();

    }
}
