package collectioneasy;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    A a = new A();
    static Map<String, String> d = new HashMap<>();
    static Map<String, String> m = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        d.put("1","2");
        d.put("5","8");
        d.put("6","2");
        B.C c = new B.C();
        c.setF(12);
        c.setK(24);
        c.cMethod();
        B.C d = new B.C();
        d.cMethod();
    }
}

class A extends B {

}

class B {
    String s;
    static class C{
        static int k = 3;
        static int f = 2;

        void cMethod() {
            System.out.println(k + f);
        }

        public int getK() {
            return k;
        }

        public void setK(int k) {
            C.k = k;
        }

        public int getF() {
            return f;
        }

        public void setF(int f) {
            C.f = f;
        }
    }
}

