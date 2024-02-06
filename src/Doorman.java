package com.rtaylor02;

import static java.lang.System.out;

public class Doorman implements Greeter {
    @Override
    public void greet(String name) {
        out.println("Good day, " + name);
    }
}
