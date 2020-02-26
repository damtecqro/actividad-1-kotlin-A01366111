package com

import java.util.*

//Javier Iñiguez Quezada _ A01366111

//Pseudocodigo
// P08
// val arrayA
// arraA.distinct()
// println(arraA)

// //P31
// fun evaluarPrimo(number):return String{
//     for(i in 2..n/2){
//         if(n % i ==0){
//             return no primo
//         }
//     }
//     return primo
// }

// evaluarPrimo(17)




// P08 (*) Eliminate consecutive duplicates of list elements.
println("Ejercicio 8")
val a = arrayOf("a", "b", "c", "c", "a","a","b","b")
val b = a.distinct()
println(b)

//P31 (*) Determine whether a given integer number is prime.
fun primeN(n: Int): String {
    println("Ejercicio 31")
    for (i in 2..n / 2) {
        if (n % i == 0) {
            return "no es primo"
        }
    }
    return "es primo"
}

println("17 " + primeN(17))

//Resultado:
//Ejercicio 8
//[a, b, c]
//Ejercicio 31
//17 es primo
//
//Process finished with exit code 0

