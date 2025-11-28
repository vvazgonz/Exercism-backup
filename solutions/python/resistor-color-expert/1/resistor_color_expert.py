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

tolerances = {
    "grey": 0.05,
    "violet": 0.1,
    "blue": 0.25,
    "green": 0.5,
    "brown": 1,
    "red": 2,
    "gold": 5,
    "silver": 10
}

magnitudes = {
    0: "ohms",
    1: "kiloohms",
    2: "megaohms",
    3: "gigaohms"
}

def resistor_label(colors):
    value = 0
    value1 = values[colors[0]]
    value2 = 0
    value3 = 0
    multiplier = 0
    tolerance = 0
    magnitude = magnitudes[0]
    if len(colors)>= 2:
        value2 = values[colors[1]]
        if len(colors) <= 4:
            multiplier = values[colors[2]]
            tolerance = tolerances[colors[3]]
            value = 10 * value1 + value2
        if len(colors) == 5:
            value3 = values[colors[2]]
            multiplier = values[colors[3]]
            tolerance = tolerances[colors[4]]
            value = 100 * value1 + 10 * value2 + value3 
    else:
        return f"{value1} ohms"
    value = value * 10**multiplier
    value_f = value
    for i in range(1,4):
        if value >= 1000**i:
            value_f = value/(1000**i)
            magnitude = magnitudes[i]
    return_text = f"{value_f:g} {magnitude}"
    tolerance_text = f" ±{tolerance}%"
    if tolerance:
        return_text+=tolerance_text
    return return_text
            
    