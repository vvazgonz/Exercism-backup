actions = {
    0: "wink",
    1: "double blink",
    2: "close your eyes",
    3: "jump"
}

def commands(binary_str):
    inverted = binary_str[::-1]
    seq = []
    reversed = len(binary_str) == 5 and binary_str[0] == "1"
    for index, bin in enumerate(inverted):
        if index <= 3:
            if bin == "1":
                seq.append(actions[index])
    if reversed:
        return seq[::-1]
    return seq
            
        
