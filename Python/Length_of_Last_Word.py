def lengthOfLastWord(self, s: str) -> int:
    words=s.split()
    wordsLength=len(words)
    lastWord=words[wordsLength-1]
    lastWordLength=len(lastWord)
    return lastWordLength
x="Hello World"
print (lengthOfLastWord(0,x))