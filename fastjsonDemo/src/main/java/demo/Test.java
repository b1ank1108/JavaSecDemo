package demo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Test {
    public static void main(String[] args) {
        String line = "\n------------------";
        User user = new User();
        user.setAge(18);
        user.setName("b1ank");
        System.out.println(user.getClass().getName()+line);

        //序列化 SerializerFeature.WriteClassName -> @type
        String js = JSON.toJSONString(user, SerializerFeature.WriteClassName);
        System.out.println(js+line);

        //parse
        Object obj2 = JSON.parse(js);
        System.out.println(obj2.getClass().getName()+line);

        //parseObject
        Object obj3 = JSON.parseObject(js);
        System.out.println(obj3.getClass().getName());
        Object obj4 = JSON.parseObject(js,User.class);
        System.out.println(obj4.getClass().getName());
    }
}
