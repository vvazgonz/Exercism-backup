def is_isogram(string):
    string = string.lower()
    words = string.split()
    for i in range(0, len(string)):
        if i < len(string)-1:
            if string[i] in string[i+1:] and string[i] not in '- ':
                return False

    return True
