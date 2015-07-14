package bob

class Bob() {
  def hey(speech: String): String = {

    if (speech.trim.isEmpty) "Fine. Be that way!"
    else if (speech == speech.toUpperCase() && speech.exists(_.isLetter)) "Woah, chill out!"
    else if (speech.endsWith("?")) "Sure."
    else "Whatever."
  }
}