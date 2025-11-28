def rebase(input_base, digits, output_base):
    
    if input_base < 2:
        raise ValueError("input base must be >= 2")
    if not all(d in range(0, input_base) for d in digits):
        raise ValueError("all digits must satisfy 0 <= d < input base")
    if output_base < 2:
        raise ValueError("output base must be >= 2")
        
    if len(digits)<1:
        return [0]
    
    decimal = 0
    for i in range(0, len(digits)):
        decimal += digits[i] * input_base ** (len(digits)-1-i)
    if decimal == 0:
        return [0]
    output = []
    resto = decimal
    while resto > 0:
        output.append(resto%output_base)
        resto = resto // output_base
    return output[::-1]
    