object Q2 {
  def main(args: Array[String]) : Unit = {
    val inputList = List("apple", "banana", "cherry", "date")
    val  count = countLetterOccurrences(inputList)
    println("Total count of letter occurences : " + count)
  }

  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(word => word.length) // Map words to their lengths
    val totalOccurrences = letterCounts.reduce((acc, length) => acc + length) // Sum up the lengths
    totalOccurrences
  }

}
