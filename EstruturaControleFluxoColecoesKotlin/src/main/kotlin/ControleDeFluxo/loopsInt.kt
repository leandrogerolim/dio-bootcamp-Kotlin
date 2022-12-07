fun main() {
    for(i in 0..3) {             // 1 dois pontos diz que quer ir do 0 ate 3 incluindo o primeiro e o ultimo
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2 until é sem o ultimo elemento
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3 step pulando de 2 em 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // do ultimo para o primeiro .  3210 incluindo o primeiro e o ultimo.
        print(i)
    }
    print(" ")

}