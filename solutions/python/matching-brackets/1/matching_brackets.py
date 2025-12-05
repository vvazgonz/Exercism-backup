def is_paired(input_string):
    pairs = {')': '(', ']': '[', '}': '{'}
    stack = []

    for ch in input_string:
        if ch in pairs.values():
            stack.append(ch)
        elif ch in pairs:
            if not stack or stack.pop() != pairs[ch]:
                return False

    return not stack
