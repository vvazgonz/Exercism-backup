values = {
    'black': 0,
    'brown': 1,
    'red': 2,
    'orange': 3,
    'yellow': 4,
    'green': 5,
    'blue': 6,
    'violet': 7,
    'grey': 8,
    'white': 9
}

magnitudes = {
    0: "ohms",
    1: "kiloohms",
    2: "megaohms",
    3: "gigaohms"
}

def label(colors):
    value = (values[colors[0]] * 10 + values[colors[1]])
    exponent =  values[colors[2]]
    magnitud = (exponent+1) // 3
    return str(int(value * 10**(exponent - 3*magnitud))) + " " + magnitudes[magnitud]