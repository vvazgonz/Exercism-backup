def is_valid(isbn):
    numbers = "".join(isbn.split("-"))
    if len(numbers) != 10:
        return False
    
    suma = 0
    for i in range(10, 1, -1):
        if numbers[10-i].isdigit():
            suma += i * int(numbers[10-i])
        else:
            return False
    if numbers[9] == 'X':
        suma += 10
    elif numbers[9].isdigit():
        suma += int(numbers[9])
    else:
        return False
    return suma % 11 == 0