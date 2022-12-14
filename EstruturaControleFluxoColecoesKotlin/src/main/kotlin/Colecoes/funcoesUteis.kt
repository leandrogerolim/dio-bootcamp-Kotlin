package Colecoes;




        fun main() {


                val numbers = listOf(1, -2, 3, -4, 5, -6);      // 1 essa é a lista original

                val positives = numbers.filter { x -> x > 0 }  // 2 filtra numeroes maiores que 0

                val negatives =
                        numbers.filter { it < 0 }      // 3 anotação It valor dentro do predicado filtrando itens menor que zero

                println("Numbers: $numbers")
                println("Positive Numbers: $positives")
                println("Negative Numbers: $negatives")
        }
