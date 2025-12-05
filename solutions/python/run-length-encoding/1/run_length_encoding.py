def decode(string):
    result = ""
    cifra = 1
    for index, char in enumerate(string):
        if char.isdigit():
            if string[index+1].isdigit():
                cifra = 10*int(char) + int(string[index+1]) 
            elif cifra != 1:
                continue
            else:
                cifra = int(char)
        else:
            for i in range(0, cifra):
                result+= char
            cifra = 1
    return result


def encode(string):
    result = ""
    count = 0
    for index, char in enumerate(string):
        if index == len(string) -1 or char != string[index+1]:
            if count == 0:
                result+= char
            else:
                result += f"{count+1}{char}"
                count = 0
        else:
            count+=1
    return result
