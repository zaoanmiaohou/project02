package TestDeskTop.TestFinal;

import java.util.HashMap;

public class SeasonTest {

    public static void main(String[] args) {
        Season.SPRING.show();
        Season.SUMMER.show();
        Season.AUTUMN.show();
    }
}
interface Inter{
    void show();
}
enum Season implements Inter{
    //类的对象：用 ，隔开，最后一个用 ;
    SPRING("spring","春暖花开"),
    SUMMER("summer","烈日炎炎"),
    AUTUMN("autumn","秋高气爽");

    private final String seaName;
    private final String seaDesc;

    private Season(String seaName, String seaDesc) {
        this.seaName = seaName;
        this.seaDesc = seaDesc;
    }

    @Override
    public void show() {
        System.out.println("季节");
    }

    public void test01() {
    }
}
