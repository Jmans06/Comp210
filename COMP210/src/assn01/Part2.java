package assn01;

public class Part2 {
    public static void main(String[] args){
        short sh=32767;
        method2();
    }
    public static void method2(){
        int n2=0xD4;
        System.out.println(n2);
        method3();
    }
    public static void method3(){
        char[] a3={'a','z'};
        int[] b3={'a','z'};
        System.out.println(a3[0]+" "+a3[1]);
        System.out.println(b3[0]+" "+b3[1]);
    }
}