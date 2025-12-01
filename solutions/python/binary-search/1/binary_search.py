def find(search_list, value):
    if value not in search_list:
        # example when value is not found in the array.
        raise ValueError("value not in array")
    inicio = 0
    fin = len(search_list) - 1
    medio = 0
    while inicio <= fin:
        medio = (fin+inicio) // 2
        if search_list[medio] == value:
            return medio
        if search_list[medio] > value:
            fin = medio - 1
        else:
            inicio = medio + 1
    return medio
