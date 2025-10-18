import math

def square(number):
    res = 1
    if number > 64 or number < 1:
        raise ValueError('square must be between 1 and 64')
    return 2 ** (number-1)

def total():
    sum = 0
    for x in range(1,65):
        sum += square(x)
    return sum
