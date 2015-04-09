class Sieve
  def initialize(max)
    @max = max
    @numbers = (2..@max).to_a
  end

  def primes
    @numbers.each do |num|
      p = num
      until p*num > @max
        @numbers.delete(p*num)
        p += 1
      end
    end
    @numbers
  end
end