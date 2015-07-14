package word_count

class Phrase(s: String) {
  var word_list = for {word <- s.split("[, ] *") if !word.matches("[!@$%^&:]")} yield word.replaceAll("[!&@$%^:,.]", "").toLowerCase

  def wordCount() = {
    var count = new scala.collection.mutable.HashMap[String, Int]
    word_list.foreach (word => if (count.contains(word)) count(word) += 1 else count(word) = 1)
    count
  }
}