package phone_number

class PhoneNumber(raw_number: String) {
    val numbers_only = raw_number.replaceAll("[. ()-]", "")

  def number = {
    var valid_number = if (isValid) numbers_only else "0000000000"
    if (valid_number.length == 11) valid_number.drop(1) else valid_number
  }

  def areaCode = number.take(3)

  override def toString = {
    s"($areaCode) ${number.substring(3, 6)}-${number.drop(6)}"
  }

  private def isValid = {
    var first = numbers_only.take(1)
    (numbers_only.length == 11 && first == "1") || numbers_only.length == 10
  }
}