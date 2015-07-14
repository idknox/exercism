package hamming

object Hamming {
  def compute(first: String, second: String) = {
    if (first.length != second.length) throw new IllegalArgumentException
    first.indices.filter(i => first(i) != second(i)).length
  }
}