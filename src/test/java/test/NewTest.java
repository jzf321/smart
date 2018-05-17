package test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Array;

public class NewTest {
    public static void main(String[] args) {
        JSONArray array=new JSONArray();
        for (int i=0;i<3;i++){
            JSONObject obj=new JSONObject();
            obj.put("a"+i,i);
            obj.put("b"+i,i);
            obj.put("c"+i,i);
            array.add(obj);
        }
        System.out.println(array.toJSONString());
    }
}
