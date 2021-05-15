package justcode.test4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;
        List<String> sample = new ArrayList<>();
        sample.add("a");
        sample.add("b");
        sample.add("c");
        sample.add("d");

        Iterator<String> iterator = sample.iterator();

        System.out.println("iterator 시작");
        start = System.nanoTime();
        while(iterator.hasNext()){
            iterator.next();
        }
        end = System.nanoTime();
        System.out.println("iterator 동작시간"+ (end-start));

        System.out.println("반복문 시작");
        start = System.nanoTime();
        for(String sa:sample){

        }
        end = System.nanoTime();
        System.out.println("반복문 동작시간"+ (end-start));
    }
}
