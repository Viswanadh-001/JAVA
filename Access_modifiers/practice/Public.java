package Access_modifiers.practice;

public class Public {
    public static int a = 10;

    public static void main(String[] args) {
       // System.out.println(a);
        Public_2 obj = new Public_2();
         obj.method();
    }
}

class Public_2 extends Public {
    public void method() {
        System.out.println("Parent class in method");
        System.out.println(a);
    }
}
