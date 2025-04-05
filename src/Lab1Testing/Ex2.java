package Lab1Testing;

public class Ex2 {
    public static void main (String []args){
        String s1="Sara";
        String lastName="Mekshaj";
        String gender="Female";

        String info=s1+lastName+gender;
        String info2=s1.concat(lastName).concat(gender);
        System.out.println(info);
        System.out.println(info2);
    }
}
