def is_armstrong_number(number):
    string = str(number)
    suma = 0
    for i in string:
        suma += int(i)**len(string)
    print(suma)
    return suma == number