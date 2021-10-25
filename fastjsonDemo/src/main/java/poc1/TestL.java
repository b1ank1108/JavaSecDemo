package poc1;

import com.alibaba.fastjson.JSONException;

public class TestL {
    public static void main(String[] args) {
        String className = "Ljust test;";

        //L ;
        if (((-3750763034362895579L ^ (long)className.charAt(0)) * 1099511628211L ^ (long)className.charAt(className.length() - 1)) * 1099511628211L == 655701488918567152L) {
            className = className.substring(1, className.length() - 1);
            System.out.println(className);
        }

        //LL
        for (int i=0;i<256;i++){
            for (int j=0;j<256;j++){
                if (((-3750763034362895579L ^ (long)i) * 1099511628211L ^ (long)j) * 1099511628211L == 655656408941810501L) {
                    System.out.println((char) i+" "+(char) j);
                }
            }
        }

        //[
        for(int i=0;i<256;i++) {
            if ((-3750763034362895579L ^ (long) i) * 1099511628211L == -5808493101479473382L) {
                System.out.println((char) i);
            }
        }
        long h1;
        for (int i=0;i<256;i++){
            h1 = (-3750763034362895579L ^ (long)i) * 1099511628211L;
            for (int j=0;j<256;j++){
                if ((h1 ^ (long)j) * 1099511628211L == 655701488918567152L) {
                    System.out.println((char) i+" "+(char)j);
                }
            }
        }

    }
}
