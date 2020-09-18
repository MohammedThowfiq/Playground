mylist = input().split()
reversedList = list()
for i in mylist:
  reversedList.append(i[::-1])
for i in range(len(mylist)):
  if(mylist[i]==reversedList[i]):
    print("$"+mylist[i]+"$",end=" ")
  else:
    print(reversedList[i],end=" ")