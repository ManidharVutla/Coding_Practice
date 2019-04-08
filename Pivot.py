semi=[2,-9,6,0,7,9,15,7,8]
might = semi[0]
index=0
cancel=0
for i in range(1, len(semi)):
    if cancel==1 and semi[i] > might:
        might= semi[i]
        index=i
        cancel=0
    elif semi[i] < might:
        cancel=1
    #print("might is:" + str(might))

print(index)
