// Access Modifiers + Getters and Setters  (ENCAPSULATION);
class encap{
    private String name ;

    public void setName(String a){
     name = a;
    }

    public String getName(){
        return  name;
    }


}

public class arj_01_Access_modifiers {
    public static void main(String[] args) {

  encap enc = new encap();
   enc.setName("turula");
   System.out.println( enc.getName());
    }
}










