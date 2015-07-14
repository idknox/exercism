package word_count

class Phrase(s: String) {
  var word_list = create_word_list(s)

  def wordCount() = {
    var count = new scala.collection.mutable.HashMap[String, Int]
    word_list.foreach (word => if (count.contains(word)) count(word) += 1 else count(word) = 1)
    count
  }

  private

  def create_word_list(s: String) = {
    val word_array = s.split("[, ] *")
    for {word <- word_array if not_punctuation(word)} yield alpha_only_word(word)
  }

  def not_punctuation(word: String) = {
    !word.matches("[!@$%^&:]")
  }

  def alpha_only_word(w: String) = {
    w.replaceAll("[!&@$%^:,.]", "").toLowerCase
  }
}