dict = {
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

def roman(number):
    roman_number = ""
    for roman, value in dict.items():
        while number >= roman:
            roman_number += value
            number -= roman
    return roman_number
    
    
    