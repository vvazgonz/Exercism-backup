def square_root(x):
    cota_inferior = 0
    cota_superior = 0
    
    if x == 1:
        return 1
        
    for a in range(0, x+1):
        if a**2 > x:
            cota_superior = a
            cota_inferior = a-1
            break

    distancia_entre_cotas = cota_superior **2 - cota_inferior**2
    distancia = x - cota_inferior **2
    sqrt = (cota_inferior + distancia / distancia_entre_cotas)
    if sqrt/int(sqrt) != 1.0:
        return int(sqrt)
    else:
        return sqrt