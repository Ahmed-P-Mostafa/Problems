package com.polotika

import java.util.*

class CodeForces {

    private fun dominoDisaster(){
     /**
      * https://codeforces.com/contest/1567/submission/127961990 */
        val scanner = Scanner(System.`in`)
        val n = scanner.nextByte()

        for (i in 0 until n) {
            val width = scanner.nextByte()
            val domino = scanner.next().toLowerCase()
            if (domino.contains("u")) {
                val u = domino.indexOf('u')
                val upDomino = domino.replace('u', 'd')
                println(upDomino.toUpperCase())
            } else if (domino.contains("d")) {
                val d = domino.indexOf('d')
                val upDomino = domino.replace('d', 'u')
                println(upDomino.toUpperCase())
            } else {
                println(domino.toUpperCase())
            }
        }
    }

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

    private fun goodNumber(){

        /**
         * my submission link
         * https://codeforces.com/contest/365/submission/126968811
         */
        val scanner = Scanner(System.`in`)
        val n = scanner.nextInt()
        val k = scanner.nextInt()
        val array = IntArray(n)
        Arrays.fill(array, 1)

        for (i in 0 until n) {
            val line = scanner.next()
            for (j in 0..k) {
                if (!line.contains("" + j)) {
                    array[i] = 0
                    break
                }
            }
        }
        println(Arrays.stream(array).sum())

    }

    private fun nightAtTheMuseum(){

        /**
         * my submission link
         * https@ //codeforces.com/contest/731/submission/126993030
         */

        val frac = 96

        val scanner = Scanner(System.`in`)

        val exhibit = scanner.next()
        var result = 0
        var letter = 'a'.toInt() - frac
        for (i in 0 until exhibit.length) {
            val x = exhibit[i].toInt() - frac
            val abs = Math.abs(x - letter)
            result += if (abs < 13) {
                abs
            } else {
                val h = Math.abs(abs - 26)
                h
            }
            letter = exhibit[i].toInt() - frac
        }
        println(result)
    }
}
