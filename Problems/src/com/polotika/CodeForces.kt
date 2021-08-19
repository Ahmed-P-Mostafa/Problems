package com.polotika

import java.util.*

class CodeForces {

    private fun vanyaAndFenceCF677D2A(){
        
        /**
        my submission link
        https://codeforces.com/contest/677/submission/125541754*/
        val n: Int
        val h: Int
        var x: Int
        var result = 0
        val scanner = Scanner(System.`in`)
        n = scanner.nextInt()
        h = scanner.nextInt()

        for (i in 0 until n) {
            x = scanner.nextInt()
            if (x > h) result++
            result++
        }
        println(result)
    }

    private fun tooLongWord (){
        /**
        my submission link
        https://codeforces.com/contest/71/submission/126424957*/

        val scanner = Scanner(System.`in`)

        val n = scanner.nextInt()
        for (i in 0 until n) {
            val word = scanner.next()
            if (word.length > 10) {
                val abb = word[0].toString() + (word.length - 2).toString() + word[word.length - 1]
                println(abb)
            } else {
                println(word)
            }
        }
    }
}
