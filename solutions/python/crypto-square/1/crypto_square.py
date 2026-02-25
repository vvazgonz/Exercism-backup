import math
import string

def cipher_text(plain_text):
    allowed = string.ascii_letters + string.digits
    normalized = ''.join(ch.lower() for ch in plain_text if ch in allowed)
    if not normalized:
        return ""
    L = len(normalized)
    c = math.ceil(math.sqrt(L))
    r = math.ceil(L / c)
    rows = []
    for i in range(0, L, c):
        row = normalized[i:i + c]
        rows.append(row.ljust(c, ' '))

    cols = []
    for col in range(c):
        col_str = ''.join(row[col] for row in rows)
        cols.append(col_str)
    return ' '.join(cols)