N=int(input())
#print(N)
if N>= 1 and N<=1000:
    for i in range(2,N):
        for j in range(2,i+1):
            if i==j:
                print(i,end=" ")
            elif i%j==0:
                break
