def factors(value):
    num = value
    prime_factors = []
    factor = 2
    while factor * factor <= num:
        while num % factor == 0:
            prime_factors.append(factor)
            num //= factor
        factor += 1
    if num > 1:
        prime_factors.append(num)
    return prime_factors
