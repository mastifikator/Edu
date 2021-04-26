package Randomizer;

import java.util.Random;

public class TestObject implements Comparable<TestObject>{
        private Integer intTest1;
        private Integer intTest2;

    public TestObject(){
        Random r = new Random();
        this.intTest1 = r.nextInt();
        this.intTest2 = r.nextInt();
    }

    private void test(){
        int intTest3 = intTest1 + intTest2;
    }

    @Override
    public int compareTo(TestObject o) {
        int result = this.intTest1.compareTo(o.intTest1);
        if(result == 0) this.intTest2.compareTo(o.intTest2);

        return result;
    }
}