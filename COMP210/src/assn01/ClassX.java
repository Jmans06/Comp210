package assn01;

public class ClassX {
    public static void main(String[] args){
        ClassY j=new ClassY();
        ClassY k=new ClassY();
        j.methodB();
        k.methodB();
        k.methodA();
        j.methodB();
        k.methodB();
    }
}

class ClassY{
    static String name="Jackson";
    public void methodA(){
        name="Connor";
    }
    public static void methodB(){
        System.out.println(name);
    }
}
