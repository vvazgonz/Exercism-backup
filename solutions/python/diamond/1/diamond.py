def rows(letter):
    abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    max_index = abc.index(letter.upper())
    dim = 2 * (max_index+1) -1
    position = max_index
    result = []
    for index in range(0, max_index+1):
        letter = abc[index]
        line = ""
        for char in range(0, max_index+1):
            if char == position:
                line += letter
            else:
                line += " "
        line = line + line[-2::-1]
        result.append(line)
        position -= 1
    result = result + result[-2::-1]
    return result
    
                
            
        