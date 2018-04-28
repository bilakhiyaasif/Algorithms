s=input()
l1=list(s)
l=len(l1)
o=l-1
c=0
for i in range(0,len(l1)):
    #print(l1[i])
    #print(l1[o])
    if l1[i]==l1[o]:
        c=c+1
    o=o-1

if c==l:
    print("YES")
else:
    print("NO")
