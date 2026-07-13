a,b,c = 1,2,'C'

temp = [a,b,c]
leng = 1;
for i in temp :
    print(str(i), end="")
    if leng == len(temp):
        break
    print("->", end="")
    leng+=1

