fun main() {

    var a: String = "inicial"  // 1 var pode ser alterado no caso "iniciado"
    println(a)
    a = "final"  ///depois de alterarada vira "final"
    println(a)
    val b: Int = 1             // 2 diferente da val que fica com o valor fixo.

    // b = 444                     //cannot reassigned
    val c = 3                  // 3

    println(b)
    println(c)





}

fun someCondition() = true

fun main2() { // a Val pode ser alterada no caso de ela não ter sido iniciado ainda. val d: Int

    val d: Int  // 1 // a Val pode ser alterada no caso de ela não ter sido iniciado ainda. val d: Int

    if (someCondition()) {  //quando o if escolhe uma opção a variavel val recebe o valor no caso ela recebe o valor " 1".
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d) // 3

}