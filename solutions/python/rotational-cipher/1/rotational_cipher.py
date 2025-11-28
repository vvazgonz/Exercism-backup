def rotate(text, key):
    abc = 'abcdefghijklmnopqrstuvwxyz'
    abc2 = abc[key:len(abc)] + abc[:key]
    string = ""
    for i in range(0, len(text)):
        if text[i] != " ":
            if text[i].lower() not in abc:
                string += text[i]
            else:
                if text[i].isupper():
                    string += abc2[abc.find(text[i].lower())].upper()
                else:
                    string += abc2[abc.find(text[i].lower())].lower()
                
            
        else:
            string += text[i]
    return string
