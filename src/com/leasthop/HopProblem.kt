package com.leasthop

class HopProblem {
    fun getMinimumHops(maxHops: List<Int>, thesisCompartmentNumber: Int): Int {
        if (maxHops.size <= 1 || thesisCompartmentNumber == 1)
            return 0

        val totalCompartments = maxHops.size
        val thesisCompartmentIndex = thesisCompartmentNumber - 1

        var maxReach = maxHops[0]
        var step = maxHops[0]
        var jump = 1
        for (i in 1 until totalCompartments) {
            if (i == thesisCompartmentIndex)
                return jump
            if (i + maxHops[i] > maxReach)
                maxReach = i + maxHops[i]
            step--
            if (step == 0) {
                jump++
                step = maxReach - i
            }
        }
        return jump
    }
}