object Question02 extends App{
    val wordList: List[String] = List("apple", "banana", "cherry", "date")

    val countLetterOccurrences = (list: List[String]) => list.map((word) => word.length).reduce((a, b) => a+b)

    println(s"Total number of letters: ${countLetterOccurrences(wordList)}");
}
