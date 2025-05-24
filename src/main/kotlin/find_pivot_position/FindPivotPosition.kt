package org.example.find_pivot_position

/**
 * Given an array of int, find the array position where the sum of right elements if equal to the sum of the left elements
 * Examples:
 *     1,7,3,6,5,6 -> expected 3
 *     1,7,3,6,3,6,5,6 -> expected 4
 */
fun main() {
    println(findPivot(arrayOf(1,7,3,6,5,6)))
}

fun findPivot(input: Array<Int>): Int {
    val arraySum = input.sum()
    var rightSum = 0
    var leftSum = arraySum
    for(i in 0 until input.size-1) {
        leftSum -= input[i]
        if (i != 0) {
           rightSum += input[i-1]
        }

        if(rightSum == leftSum) return i
    }
    return -1
}