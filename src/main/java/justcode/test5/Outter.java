package justcode.test5;

public class Outter {
    String filed = "Outter-field";

    void method(){
        System.out.println("Outter-method");
    }

    class Nested{
        String field ="Nested_field";
        void method(){
            System.out.println("Nested_method");
        }

        void print(){
            System.out.println(this.field);
            this.method();
            System.out.println(Outter.this.filed);
            Outter.this.method();
        }
    }
}
