def translate(text):
    vowels = ['a', 'e', 'i', 'o', 'u']
    vowels_and_y = ['a', 'e', 'i', 'o', 'u', 'y']
    starts = {"xr", "yt"}
    array = []
    for word in text.split():
        if word[0] in vowels or word[0:2] in starts:
            array.append(word + "ay")
            continue
        for pos in range(1, len(word)):
            if word[pos] in vowels_and_y:
                pos += 1 if word[pos] == 'u' and word[pos - 1] == "q" else 0
                array.append(word[pos:] + word[:pos] + "ay")
                break
                
        
    return " ".join(array)