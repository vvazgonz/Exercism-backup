def classify(number):
    if number < 1:
        raise ValueError("Classification is only possible for positive integers.")
    suma = 0
    for i in range(1, number//2 + 1):
        if not number % i:
            suma += i
    if number < suma:
        return "abundant"
    elif number == suma:
        return "perfect"
    else:
        return "deficient"