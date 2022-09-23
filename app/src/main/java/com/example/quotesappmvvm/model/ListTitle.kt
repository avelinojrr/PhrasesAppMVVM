package com.example.quotesappmvvm.model

class ListTitle {
    companion object {
        fun titleRandom(): TitleModel{
            val position = (0..47).random()
            return title[position]
        }
        private val title = listOf<TitleModel>(
            TitleModel(
                title = "The best way to predict the future is to invent it.",
                credits = "Alan Kay"
            ),
            TitleModel(
                title = "I have not failed. I've just found 10,000 ways that won't work.",
                credits = "Thomas A. Edison"
            ),
            TitleModel(
                title = "Success is walking from failure to failure with no loss of enthusiasm.",
                credits = "Winston Churchill"
            ),
            TitleModel(
                title = "The dreamers are the saviors of the world.",
                credits = "James Allen"
            ),
            TitleModel(
                title = "A goal is a dream with a deadline.",
                credits = "Napoleon Hill"
            ),
            TitleModel(
                title = "Happiness is when what you think, what you say, and what you do are in harmony.",
                credits = "Mahatma Gandhi"
            ),
            TitleModel(
                title = "A day of worry is more exhausting than a week of work.",
                credits = "John Lubbock"
            ),
            TitleModel(
                title = "Make each day your masterpiece.",
                credits = "John Wooden"
            ),
            TitleModel(
                title = "If there is no struggle, there is no progress.",
                credits = "Frederick Douglass"
            ),
            TitleModel(
                title = "The power of imagination makes us infinite.",
                credits = "John Muir"
            ),
            TitleModel(
                title = "We know what we are, but know not what we may be.",
                credits = "William Shakespeare"
            ),
            TitleModel(
                title = "You must do the things you think you cannot do.",
                credits = "Eleanor Roosevelt"
            ),
            TitleModel(
                title = "Will done is better than well said.",
                credits = "Benjamin Franklin"
            ),
            TitleModel(
                title = "Once you choose hope, anything’s possible.",
                credits = "Christopher Reeve"
            ),
            TitleModel(
                title = "I would rather die of passion than of boredom.",
                credits = "Vincent van Gogh"
            ),
            TitleModel(
                title = "Change your thoughts and you change your world.",
                credits = "Norman Vincent Peale"
            ),
            TitleModel(
                title = "Enthusiasm moves the world.",
                credits = "Arthur Balfour"
            ),
            TitleModel(
                title = "All our dreams can come true if we have the courage to pursue them.",
                credits = "Walt Disney"
            ),
            TitleModel(
                title = "I will go anywhere as long as it is forward.",
                credits = "David Livingston"
            ),
            TitleModel(
                title = "The creation of a thousand forests is in one acorn.",
                credits = "Ralph Waldo Emerson"
            ),
            TitleModel(
                title = "Everything you can imagine is real.",
                credits = "Pablo Picasso"
            ),
            TitleModel(
                title = "If you can't explain it simply, you don't understand it well enough.",
                credits = "Albert Einstein"
            ),
            TitleModel(
                title = "Innovation distinguishes between a leader and a follower.",
                credits = "Steve Jobs"
            ),
            TitleModel(
                title = "There is only one happiness in this life, to love and to be loved.",
                credits = "George Sand"
            ),
            TitleModel(
                title = "The best way to pay for a lovely moment is to enjoy it.",
                credits = "Richard Bach"
            ),
            TitleModel(
                title = "More than anything else, preparation is the key to success.",
                credits = "Alexander Graham Bell"
            ),
            TitleModel(
                title = "If your hatred could be converted into electricity, it would light up the whole world.",
                credits = "Nicola Tesla"
            ),
            TitleModel(
                title = "There is no substitute for hard work.",
                credits = "Thomas Edison"
            ),
            TitleModel(
                title = "I'm not worried that they stole my idea... I'm worried that they don't have any of their own.",
                credits = "Nikola Tesla"
            ),
            TitleModel(
                title = "Somewhere, something incredible is waiting to be discovered.",
                credits = "Carl Sagan"
            ),
            TitleModel(
                title = "There are two things, science and opinion; the former breeds knowledge, the latter, ignorance.",
                credits = "Hippocrates"
            ),
            TitleModel(
                title = "Champions are not made in gyms. The champions are made of something they have inside.",
                credits = "Muhammad Ali"
            ),
            TitleModel(
                title = "The only way to do great work is to love what you do.",
                credits = "Steve Jobs"
            ),
            TitleModel(
                title = "Everything depends on the trip, not on the result.",
                credits = "Luis Lewis"
            ),
            TitleModel(
                title = "The best motivation always comes from the interior.",
                credits = "Michael Jhonson"
            ),
            TitleModel(
                title = "If you fail to prepare, you are prepared to fail.",
                credits = "Mark Spitz"
            ),
            TitleModel(
                title = "You can not set any limits, there’s nothing impossible.",
                credits = "Usain Bolt"
            ),
            TitleModel(
                title = "My attitude is that if I encounter a weakness, I will turn it into a fortress.",
                credits = "Michael Jordan"
            ),
            TitleModel(
                title = "Each strike brings me closer to the next home run.",
                credits = "Babe Ruth"
            ),
            TitleModel(
                title = "Love is playing each game as if it were the last.",
                credits = "Michael Jordan"
            ),
            TitleModel(
                title = "It’s hard to beat a person who never gives up.",
                credits = "Babe Ruth"
            ),
            TitleModel(
                title = "If you are afraid to fail, you will probably fail.",
                credits = "Kobe Bryant"
            ),
            TitleModel(
                title = "Don't count the days, make the days count.",
                credits = "Muhammad Ali"
            ),
            TitleModel(
                title = "I like criticism, it makes you stronger.",
                credits = "Lebron James"
            ),
            TitleModel(
                title = "If you want something, train for it.",
                credits = "Ingrid Drexler"
            ),
            TitleModel(
                title = "If you want to be the best, you have to be willing to do the things that others are not willing to do.",
                credits = "Michael Phelps"
            ),
            TitleModel(
                title = "You have to believe in yourself when no one else does because that will make you a winner.",
                credits = "Venus Williams"
            ),
            TitleModel(
                title = "Doubt disappears with action. If you are not working, that is when doubt arises.",
                credits = "Connor McGregor"
            ),
            TitleModel(
                title = "I am not the next Bill Gates or Steve Jobs: I am the first Axel Avelino.",
                credits = "Axel Avelino"
            ),


        )
    }
}