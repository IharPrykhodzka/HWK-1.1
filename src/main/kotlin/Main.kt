fun main() {

    val amount = 200
    val total = 11_000
    val fee = calculateFee(amount, total)
    val fee2 = calculateFee2(amount, total)
    println(fee)
    println(fee2)

}

fun calculateFee(amount: Int, total: Int): Double {

    val ex = false

    val discount = when (total) {

        in 0..1000 -> 0.30
        in 1_001..10_000 -> 0.25
        in 10_001..50_000 -> 0.20
        else -> 0.15
    }

    return amount * (discount + exclusive(ex))
}

fun calculateFee2(amount: Int, total: Int): Double {

    val ex = true

    val discount = when (total) {

        in 0..1000 -> 0.30
        in 1_001..10_000 -> 0.25
        in 10_001..50_000 -> 0.20
        else -> 0.15
    }

    return amount * (discount + exclusive(ex))
}


fun exclusive(ex: Boolean): Double {
    return if (ex) {
        0.05
    } else {
        0.0
    }

}