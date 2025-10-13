
class MyEmployee1    {
    private int id;
    private String name;

   public void setName(String n){
    name = n;
}
public String getName(){
    return name;
}
public void setId(int i){
    id = i;
}
public int getId() {
    return id;
}
}
       public class accessModifier {
           public static void main(String[] args) {
               MyEmployee1 obj = new MyEmployee1();
               obj.setName("adda");
               System.out.println(obj.getName());
               obj.setId(1);
               System.out.println(obj.getId());

           }
       }


