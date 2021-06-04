package justcode.test5;

class OutClass{ // 이건 굳이 이렇게 할 필요 없고 다른 java 파일에 하는게 보통인데 내부 클래스를 어디까지 접근가능한지 확인할때 편리함을 위해
    private String out;

    public OutClass(String out) {
        this.out = out;
    }
}

//내부 클래스는 인스턴스 클래스 , 스태틱 클래스, 로컬 클래스 , 익명 클래스가 있는데 밑에서 확인해 보자 - 변수 선언위치와 동일하며,변수와 동일한 유효범위와 접근성을 가짐
public class Main {

    protected class InstanceInnerClass2{}
    class InstanceInnerClass3{}
    private class InstanceInnerClass4{}

    public abstract class InstanceInnerClass5{}
    protected abstract class InstanceInnerClass6{}
    abstract class InstanceInnerClass7{}
    private abstract class InstanceInnerClass8{}


//    //////////////////////////////////////////////

    public static class StaticInnerClass1{}
    protected static class StaticInnerClass2{}
    static class StaticInnerClass3{}
    private static class StaticInnerClass4{}

    public static abstract  class StaticInnerClass5{}
    protected static abstract class StaticInnerClass6{}
    static abstract class StaticInnerClass7{}
    private static abstract class StaticInnerClass8{}

//    //////////////////////////////////////////////////////

    static void test(){
        class LocalInnerClass{}
    }
}
