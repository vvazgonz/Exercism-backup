def roman(number):
    result = ""
    for i in range(0, number):
        result += "I"
    result = result.replace("IIIII", "V").replace("IIII", "IV").replace("VV", "X").replace("VIV", "IX").replace("XXXXX", "L").replace("XXXX", "XL").replace("LL", "C").replace("LXL", "XC").replace("CCCCC", "D").replace("CCCC", "CD").replace("DD", "M").replace("DCD", "CM") 
    # We replace in this order: 5, 4, 10, 9, 50, 40, 100, 90, 500, 400, 1000, 900, because this are the "problematic" numbers.
    return result
    
    