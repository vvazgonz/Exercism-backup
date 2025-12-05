def prime(number):
    if number < 1:
        # when the prime function receives malformed input
        raise ValueError('there is no zeroth prime')
        
    n = 2
    primos = [2]
    
    while len(primos) < number:
        n += 1
        flag = True
        for prime in primos:
            if n%prime == 0:
                flag = False
                break
        if flag:
            primos.append(n)
        

    return primos[number -1 ]
