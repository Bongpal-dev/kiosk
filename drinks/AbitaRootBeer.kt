package drinks

class AbitaRootBeer: Drinks() {

    override val name: String = "Abita Root Beer"
    override val price: Double = 4.8

    override fun descriptionMenu() {
        println("5. Abita Root Beer        | W 4.8 | 청량감 있는 독특한 미국식 무알콜 탄산음료")
    }
}