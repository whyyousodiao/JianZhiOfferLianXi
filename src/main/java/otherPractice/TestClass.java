package otherPractice;

public class TestClass {
    private int m;
    public TestClass(){
        m = 0;
    }
    public  int inc(){
        return m+1;
    }

    public static void main(String[] args) {
        TestClass ts = new TestClass();

        for (int i = 0; i < 10; i++) {
            System.out.println(ts.inc());
        }
    }
}
