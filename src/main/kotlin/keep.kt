object Raindrops {

    fun convert(number: Int): String {


        var string = ""

        if (number % 3 == 0) {
            string += "Pling"
        }
        if (number % 5 == 0) {
            string += "Plang"
        }
        if (number % 7 == 0) {
            string += "Plong"
        }
        if (string != "") {
            return string
        }
        return number.toString()

    }

}

