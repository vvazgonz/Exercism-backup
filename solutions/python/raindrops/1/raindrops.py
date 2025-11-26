def convert(number):
    text = ""
    if not number%3:
        text += "Pling"
    if not number%5:
        text += "Plang"
    if not number%7:
        text += "Plong"
    if text == "":
        return str(number)
    else:
        return text
        
