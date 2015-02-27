class Trinary
  def initialize(trinary_number)
    @trinary_number = trinary_number
  end

  def to_decimal
    (@trinary_number.reverse.chars.each_with_index.map do |digit, i|
      digit == '0' || digit == '1' || digit == '2' ? digit.to_i * 3 ** i : 0
    end).reduce(:+)
  end
end