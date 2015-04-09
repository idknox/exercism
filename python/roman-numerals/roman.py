ROMANS = {
    1000: 'M',
    900: 'CM',
    500: 'D',
    400: 'CD',
    100: 'C',
    90: 'XC',
    50: 'L',
    40: 'XL',
    10: 'X',
    9: 'IX',
    5: 'V',
    4: 'IV',
    1: 'I'
}


def numeral(arabic):
    roman = ''

    while arabic > 0:
        max = next(number for number in sorted(ROMANS.keys(), reverse=True) if arabic - number >= 0)
        roman += ROMANS[max]
        arabic -= max
    return roman