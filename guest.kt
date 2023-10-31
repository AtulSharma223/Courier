class guest : Customer(), amountPayble {
    override fun bill(amount: Double): Double {
        return amount * 0.7
    }
}
