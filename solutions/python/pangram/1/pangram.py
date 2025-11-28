def is_pangram(sentence):
    sentence = sentence.lower()
    for c in 'abcdefghijklmnopqrstuvwxyz':
        if c not in sentence:
            return False
    return True
