"""Functions for creating, transforming, and adding prefixes to strings."""


def add_prefix_un(word):
    """Take the given word and add the 'un' prefix.

    :param word: str - containing the root word.
    :return: str - of root word prepended with 'un'.
    """
    return 'un' + word


def make_word_groups(vocab_words):
    string = ''
    for word in vocab_words:
        if word is vocab_words[0]:
            string +=  word + " :: "
        elif word is vocab_words[len(vocab_words)-1]:
            string +=  vocab_words[0] + word
        else:
            
            string +=  vocab_words[0] + word+ " :: "
    return string

def remove_suffix_ness(word):
    """Remove the suffix from the word while keeping spelling in mind.

    :param word: str - of word to remove suffix from.
    :return: str - of word with suffix removed & spelling adjusted.

    For example: "heaviness" becomes "heavy", but "sadness" becomes "sad".
    """
    splitted = word.split('ness')
    root = splitted[0]
    if root[len(root)-1] == 'i':
        root = root.split('i')[0] + 'y'
    return root
    


def adjective_to_verb(sentence, index):
    """Change the adjective within the sentence to a verb.

    :param sentence: str - that uses the word in sentence.
    :param index: int - index of the word to remove and transform.
    :return: str - word that changes the extracted adjective to a verb.

    For example, ("It got dark as the sun set.", 2) becomes "darken".
    """
    sentence = sentence.split(".")[0]
    words = sentence.split(' ')
    if index <0:
        index = len(words) + index
    
    word = words[index]
    return word+"en"
