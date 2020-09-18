n = int(input())
t = int(input())
total = 0

marksList = input().split()
newMarksList = list()
sumList = list()

for i in marksList:
  newMarksList.append(int(i))
newMarksList.sort(reverse=True)
#print("Sorted MarksList",newMarksList)

for i in range(t):
    sumList.append(newMarksList[i])
    
#print(sumList)    
for i in sumList:
    total+=i
print(total)

