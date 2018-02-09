c=0;
l,r,k=input().split()
l=int(l)
r=int(r)
k=int(k)
for i in range(l,r+1):
    #print(i,sep=' ',end=" ");
    if i%k==0:
        c=c+1;

print(c);
