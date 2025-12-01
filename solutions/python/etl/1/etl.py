def transform(legacy_data):
    dictionary = {}
    for puntaje in legacy_data.keys():
        for letra in legacy_data[puntaje]:
            dictionary[letra.lower()] = puntaje
    return dictionary
