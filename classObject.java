public class classObject {
    String color;
    int count;

    void write(){
        System.out.println("print");
    }
    

public static void main (String [] args){
    classObject pen = new classObject();
    pen.color ="black";
    pen.count = 2;

    pen.write();
}
}
