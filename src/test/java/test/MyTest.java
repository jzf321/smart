package test;
import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static List<String> getMain(){
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        return list;
    }

    public static void main(String[] args) {
        List<String> l=getMain();
        l.forEach(str->{
            System.out.println(str);
        });
    }
}
