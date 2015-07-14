package bob

class Bob() {
  def hey(speech: String): String = {
    val stripped_speech: String = speech.replaceAll("[, ]", "")
    val last_char = speech takeRight 1

    if (speech == "" || speech.matches("\\W+")) {
      "Fine. Be that way!"
    } else if (stripped_speech.forall(_.isDigit)) {
      "Whatever."
    } else if (speech == speech.toUpperCase() && speech.exists(_.isLetter)) {
      "Woah, chill out!"
    } else if (last_char == "?") {
      "Sure."
    } else {
      "Whatever."
    }
  }
}