package ui

object InventoryControlActivity: Activity() {

    override fun printUserInterface() = println("""
        ==== 준비중입니다. ====
    """.trimIndent())

    override fun selectActivity(select: String): Activity = MenuActivity


}