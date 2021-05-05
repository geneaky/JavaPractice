package justcode.test2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test(1,9);
        Test t2 = new Test(2,8);
        Test t3 = new Test(5,5);
        Test t4 = new Test(2,9);

        List<Test> testList = new ArrayList<>();
        testList.add(t1);
        testList.add(t2);
        testList.add(t3);
        testList.add(t4);
        
        Collections.sort(testList,
                (Test o1,Test o2)->{
            if(o1.x>o2.x){
                return -1;
            }else if(o1.x==o2.x){
                if(o1.y>o2.y){
                    return -1;
                }
            }
            return 1;
        });

        for(Test t : testList){
            System.out.println(t);
        }

    }
}
