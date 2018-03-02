L=int(input())
N=int(input())
for i in range(0,N):
    data=input()
    W,H=data.split()
    W=int(W)
    H=int(H)
    if W<L and H<L:
        print("UPLOAD ANOTHER")
    elif W>=L and H>=L:
        if W==L and H==L:
            print("ACCEPTED")
        elif W==H:
            print("ACCEPTED")
        else:
            print("CROP IT")
    else:
        print("UPLOAD ANOTHER")
