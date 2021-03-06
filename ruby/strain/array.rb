class Array
  def keep
    self.map { |element| element if yield element }.compact
  end

  def discard
    self.map { |element| element unless yield element }.compact
  end
end