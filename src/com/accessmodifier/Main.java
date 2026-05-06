package com.accessmodifier;

import com.accessmodifier.modifier.ProtectedAccessModifier;
import com.accessmodifier.modifier.PublicAccessModifier;

public class Main extends ProtectedAccessModifier{
    public static void main(String[] args) {
        // Example of public access modifier
        PublicAccessModifier pmf = new PublicAccessModifier();
        int n = pmf.number;

        // Example of protected access modifier

        // ProtectedAccessModifier promf = new ProtectedAccessModifier();
        // n = promf.favNumber; // 'favNumber' has protected access in 'com.accessmodifier.modifier.ProtectedAccessModifier'

        Main main = new Main();
        n = main.favNumber;

        // Example of no access modifier used
        // n = main.number; // 'number' is not public in 'com.accessmodifier.modifier.ProtectedAccessModifier'. Cannot be accessed from outside package

        // Example of private access modifier
        ProtectedAccessModifier primf = new ProtectedAccessModifier();
        // n = primf.favNumber; // 'favNumber' has protected access in 'com.accessmodifier.modifier.ProtectedAccessModifier'
    }
}
