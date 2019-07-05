package MayKotlinSolving.Basic

object DevKot {

    @JvmStatic
    fun main(args: Array<String>) {

        for (i in 0..49) {

            if (i >= 10 && i <= 40) {


                when (i) {

                    20 -> println("warnings 1")

                    30 -> println("Warnings 2")

                    40 -> println("Warnings 3")

                    else -> println("No warnign")
                }

            }

        }

    }
}
