def score(x, y):
    radius_2 = x*x + y*y
    if radius_2 <= 1:
        return 10
    elif radius_2 <= 25:
        return 5
    elif radius_2 <= 100:
        return 1
    else:
        return 0
