def largest_product(series, size):
    if size > len(series):
        # span of numbers is longer than number series
        raise ValueError("span must not exceed string length")
    if size < 0:
        # span of number is negative
        raise ValueError("span must not be negative")
    if size == 0:
        return 1
    for ch in series:
        if not ch.isdigit():
            raise ValueError("digits input must only contain digits")

    max_prod = 0
    for i in range(0, len(series) - size + 1):
        window = series[i:i+size]
        prod = 1
        for ch in window:
            prod *= int(ch)
        if prod > max_prod:
            max_prod = prod
    return max_prod





