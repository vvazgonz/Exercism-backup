def response(text):
    if text == "" or text.isspace():
        return "Fine. Be that way!"
    up = text.isupper()
    question = text.rstrip().endswith("?")
    if not up and question:
        return "Sure."
    if up and question:
        return "Calm down, I know what I'm doing!"
    if up:
        return "Whoa, chill out!"
    return "Whatever."