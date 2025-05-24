package org.example.firstUniqueChar

/**
 * Given a string, find the first non-repeating character
 */
fun main() {
    println(uniqueChar("aabbccddeefg"))
    //expected return is 'f'
}

fun uniqueChar(input: String): Char? {
    if (input.length == 1) {
        return null
    }

    var firstDifferent = false
    for (i in 1 until input.length) {
        if (input[i] != input[i-1]) {
            if(firstDifferent) return input[i-1]
            else firstDifferent = true
        } else {
            firstDifferent = false
        }
    }
    return null
}