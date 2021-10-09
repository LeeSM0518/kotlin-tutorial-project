package ui

import ui.MenuActivity.Menu.Exit
import ui.MenuActivity.Menu.InventoryControl
import ui.MenuActivity.Menu.SellingProducts


object MenuActivity : Activity() {

    enum class Menu(val number: String, val activity: Activity) {
        InventoryControl("1", InventoryControlActivity),
        SellingProducts("2", SellingProductsActivity),
        Exit("3", ExitActivity)
    }

    override fun printUserInterface() = println("""
    =========== 메뉴 ============
   
     1. 재고 조회
     2. 상품 판매
     3. 종료
   
    =============================
    """.trimIndent())

    override fun selectActivity(select: String): Activity =
        when (select) {
//            Menu.values().get(select) =>
            InventoryControl.number -> InventoryControl.activity
            SellingProducts.number -> SellingProducts.activity
            Exit.number -> Exit.activity
            else -> super.selectActivity()
        }
}