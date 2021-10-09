package ui

abstract class Activity {
    abstract fun printUserInterface()

    fun selectActivity(): Activity {
        print("번호 입력 => ")
        val select = readLine()
        return if (select == null) {
            println("**** 반드시 입력해야합니다. ****")
            selectActivity()
        } else {
            selectActivity(select)
        }
    }

    protected abstract fun selectActivity(select: String): Activity
}