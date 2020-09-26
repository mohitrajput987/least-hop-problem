# Least Hop Problem
A kotlin program to find minimum number of jumps to reach a particular compartment while starting with first compartment.

# How to use
There is a method `getMinimumHops()` in class `HopProblem` which takes two parameters as input:
- Max number of hops for each compartment
- Compartment number to reach

Output will be an integer which indicates minimum number of hops to reach the destination.

# Test Data
```kotlin

// Expected output: 2
    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(2, 3, 1, 1, 3),
            thesisCompartmentNumber = 5
        )
    )

// Expected output: 3
    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9),
            thesisCompartmentNumber = 11
        )
    )

// Expected output: 3
    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(2, 1, 3, 5, 1, 1, 1, 1, 1, 1),
            thesisCompartmentNumber = 9
        )
    )

// Expected output: 5
    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(1,1,1,1,1,1,1,1,1,1),
            thesisCompartmentNumber = 6
        )
    )

// Expected output: 4
    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(1,1,1,2,1,1,1,1,1,1),
            thesisCompartmentNumber = 6
        )
    )
```
