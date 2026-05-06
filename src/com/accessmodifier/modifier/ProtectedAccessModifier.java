package com.accessmodifier.modifier;

// protected
//  Accessible:
//      Within the same class
//      Same package
//      Subclasses (even in different packages)

// default (no modifier)
//      Accessible only within the same package

public class ProtectedAccessModifier {
    protected int favNumber = 0;
    int number = 0;
}

// Java in-build packages

//                                 java
//       --------------------------------------------------------
//       |          |          |          |          |          |
//     lang        util        io       applet      awt        net

