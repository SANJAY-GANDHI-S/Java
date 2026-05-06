package com.accessmodifier.modifier;

// private
//      Accessible only within the same class.

public class PrivateAccessModifier extends ProtectedAccessModifier{
    private int favNumber = 7;

    public void setFavNumber(int num) {
        favNumber = num;
    }

    public int getFavNumber() {
        return favNumber;
    }

    public static void main(String[] args) {
        // Example of private access modifier
        ProtectedAccessModifier pmf = new ProtectedAccessModifier();
        int n = pmf.favNumber;

        // Example of private access modifier
        PrivateAccessModifier primf = new PrivateAccessModifier();
        n = primf.favNumber;
    }
}
