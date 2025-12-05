miles = ["", "M", "MM", "MMM"]
cientos = ["" ,"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"]
decenas = ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
unidades = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
    

def roman(number):
    return miles[number//1000] + cientos[(number%1000)//100] + decenas[(number%100)//10] + unidades[(number%10)]    
    
    