abstract class Demo{
    void m1(){
        System.out.println("abstract method");
    }
    abstract int m2(int a,int b);
}
class Sample extends Demo{
    static void m3(){
        System.out.println("hai");
    }
    int m2(int a,int  b){
        return a+b;
    }
}
public class main{
    public static void main(String args[]){
        Sample s=new Sample();
        s.m3();
        s.m1();
        System.out.println(s.m2(10,20));
    }
}