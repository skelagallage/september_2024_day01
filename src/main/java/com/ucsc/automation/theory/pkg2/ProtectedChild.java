package com.ucsc.automation.theory.pkg2;

import com.ucsc.automation.theory.pkg1.ProtectedClass;

public class ProtectedChild extends ProtectedClass {

    @Override
    public void display() {
        System.out.println(x);
    }
}
