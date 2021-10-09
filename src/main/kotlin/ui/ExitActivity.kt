package ui

import kotlin.system.exitProcess

object ExitActivity: Activity() {

    override fun printUserInterface() {
        println("""
            ==== POS의 전원을 끕니다. ====
        """.trimIndent())
        exitProcess(0)
    }

    override fun selectActivity(select: String): Activity = ExitActivity

}