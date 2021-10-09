package ui

object RunActivity: Activity() {
    override fun printUserInterface() = println("""
        ==== POS의 전원이 켜졌습니다 ====
    """.trimIndent())

    override fun selectActivity(select: String): Activity = MenuActivity
}