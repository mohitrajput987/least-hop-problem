package com.leasthop

fun main() {
    val hopProblems = HopProblem()

    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(2, 3, 1, 1, 3),
            thesisCompartmentNumber = 3
        )
    )

    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9),
            thesisCompartmentNumber = 11
        )
    )

    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(2, 1, 3, 5, 1, 1, 1, 1, 1, 1),
            thesisCompartmentNumber = 9
        )
    )

    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(1,1,1,1,1,1,1,1,1,1),
            thesisCompartmentNumber = 6
        )
    )

    println(
        "Minimum number of hops = " + hopProblems.getMinimumHops(
            maxHops = listOf(1,1,1,2,1,1,1,1,1,1),
            thesisCompartmentNumber = 6
        )
    )
}