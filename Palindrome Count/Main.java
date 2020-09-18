inputStringList = input().split()
#print(inputStringList)
reversedInputList = list()
outputList = list()
for word in inputStringList:
    reversedWord = word[::-1]
    reversedInputList.append(reversedWord)

#print(reversedInputList)   

for i in range(len(inputStringList)):
    if(inputStringList[i]==reversedInputList[i]):
        outputList.append(1)
    else:
        outputList.append(0)

#print(outputList)
print(outputList.count(1))
    
    