package com.oops.inheritance;

// Hierarchical Inheritance:-
//      Multiple classes inherit from one parent

//                  Parent
//     ----------------------------------
//     |               |                 |
//   Child           Child             Child

public class HierarchicalInheritance {
    public static void main(String[] args) {

    }
}

class Dogs {
    public Dogs() {
        System.out.println("Dogs Constructor called");
    }
}

class Bulldog extends Dogs{
    public Bulldog() {
        System.out.println("Bulldog Constructor called");
    }
}

class GoldenRetriever extends Dogs{
    public GoldenRetriever() {
        System.out.println("Golden Retriever Constructor called");
    }
}

class Rottweiler extends Dogs{
    public Rottweiler() {
        System.out.println("Rottweiler Constructor called");
    }
}
