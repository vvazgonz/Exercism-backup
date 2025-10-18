def equilateral(sides):
    a = sides[0]
    b = sides[1]
    c = sides[2]
    if a <= 0 or b <= 0 or c <= 0:
        return False
    if a+b >= c and b + c >= a and a+c >= b and a is b and b is c:
        return True
    else:
        return False


def isosceles(sides):
    a = sides[0]
    b = sides[1]
    c = sides[2]
    if a <= 0 or b <= 0 or c <= 0:
        return False
    if a+b >= c and b + c >= a and a+c >= b and (a is b or b is c or a is c):
        return True
    else:
        return False


def scalene(sides):
    a = sides[0]
    b = sides[1]
    c = sides[2]
    if a <= 0 or b <= 0 or c <= 0:
        return False
    if a+b >= c and b + c >= a and a+c >= b and (a is not b and b is not c and a is not c):
        return True
    else:
        return False
