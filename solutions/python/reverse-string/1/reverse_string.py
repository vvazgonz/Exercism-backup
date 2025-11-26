def reverse(text):
    string = ""
    for c in range(len(text)-1, -1, -1):
        string += text[c]
    return string
