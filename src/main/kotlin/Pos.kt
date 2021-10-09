import ui.Activity
import ui.MenuActivity
import ui.RunActivity

class Pos {

    fun run() {
        RunActivity.printUserInterface()
        var activity: Activity = MenuActivity
        while (true) {
            activity.printUserInterface()
            activity = activity.selectActivity()
        }
    }

}

fun main() = Pos().run()