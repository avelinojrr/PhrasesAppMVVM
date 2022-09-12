package com.example.quotesappmvvm.model

class ListTitle {
    companion object {
        fun titleRandom(): TitleModel{
            val position = (0..7).random()
            return title[position]
        }
        private val title = listOf<TitleModel>(
            TitleModel(
                title = "Don Quijote de la Mancha",
                credits = "1605. Miguel de Cervantes"
            ),
            TitleModel(
                title = "El Principito",
                credits = "1943. Antoine de Saint-Exupéry"
            ),
            TitleModel(
                title = "El Hobbit",
                credits = "1937. J.R.R. Tolkien"
            ),
            TitleModel(
                title = "El Señor de los Anillos",
                credits = "1954. J.R.R. Tolkien"
            ),
            TitleModel(
                title = "El Alquimista",
                credits = "1988. Paulo Coelho"
            ),
            TitleModel(
                title = "El Origen de las Especies",
                credits = "1859. Charles Darwin"
            ),
            TitleModel(
                title = "El Arte de la Guerra",
                credits = "500 a.C. Sun Tzu"
            ),
            TitleModel(
                title = "Harry Potter y la Piedra Filosofal",
                credits = "1997. J.K. Rowling"
            )
        )
    }
}