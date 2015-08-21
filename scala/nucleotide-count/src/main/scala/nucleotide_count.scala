package nucleotide_count

class DNA(strand: String) {
  val valid_tides = List('A', 'T', 'C', 'G')
  check_input

  def count(n: Char) = {
    if (!valid_tides.contains(n)) throw new IllegalArgumentException
    strand.count(_ == n)
  }

  def nucleotideCounts = {
    var counts = collection.mutable.Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> 0)
    strand.foreach(tide => counts(tide) += 1)
    counts
  }

  private def check_input = {
    strand.foreach(tide => if (!valid_tides.contains(tide)) throw new IllegalArgumentException)
  }
}
