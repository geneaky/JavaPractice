package justcode.test2;

import java.util.Comparator;

public class Test implements Comparable<Test>{

    int x,y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Test o) {
        if(this.x>o.x){
            return 1; //x에 대해서는 오름차순
        }
        else if(this.x==o.x){
            if(this.y<o.x){
                return 1; //y에 대해서는 내림차순
            }
        }
        return -1;
    }

}
