abc = 'abcdefghijklmnopqrstuvwxyz'
numbers = '123456789'
def encode(plain_text):
    plain_text = plain_text.lower()
    encoded_text = ""
    flag = 0
    for index, char in enumerate(plain_text):
        if flag == 5:
            encoded_text += " "
            flag = 0
        if char in abc:
            encoded_text += abc[len(abc)-1 -abc.index(char)]
        elif char in numbers:
            encoded_text += char
        else:
            continue
        flag += 1
    return encoded_text.strip()

def decode(ciphered_text):
    decoded_text = ""
    for index, char in enumerate(ciphered_text):
        if char in abc:
            decoded_text += abc[len(abc)-1 -abc.index(char)]
        elif char in " ":
            continue
        else:
            decoded_text += char
    return decoded_text
