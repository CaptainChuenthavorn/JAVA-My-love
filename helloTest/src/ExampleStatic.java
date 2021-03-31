import java.util.ArrayList;

public class ExampleStatic {
        private int nonStaticVariable;
        private static int staticVariable;
   
        public static void staticMethod() {
             nonStaticVariable = 999;// (1) non-static method can call static variable
             staticVariable = 9999; //but static method can't call non-static
        }
        public void nonStaticMethod() {
             nonStaticVariable = 999;
             staticVariable = 9999;
        }
        public static void main(String[] args) {
             nonStaticVariable = 999;// (2)   
             staticVariable = 9999;
             nonStaticMethod();// (3)
             staticMethod();
             
        }
   
}
