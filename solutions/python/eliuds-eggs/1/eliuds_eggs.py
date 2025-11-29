def egg_count(display_value):
    num = display_value
    binary = ""
    while num>0:
        binary += str(num%2)
        num = num//2
    return binary.count("1")
        
