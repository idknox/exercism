package anagram

class Anagram(w: String) {
  val test_word: String = w.toLowerCase
  def is_anagram(word: String) = word.toLowerCase != test_word && word.toLowerCase.toList.sorted == test_word.toList.sorted
  def matches(words: Seq[String]) = words.filter(word => is_anagram(word))
}