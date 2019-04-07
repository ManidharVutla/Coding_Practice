x="0ABCBDAB"
y="0BDCABA"

rows= len(x)
cols=len(y)

c =  [[0 for i in range(cols)] for j in range(rows)]
b =  [['' for i in range(cols)] for j in range(rows)]

for i in range(1, rows):
    for j in range(1, cols):
        if x[i] == y[j] :
            c[i][j] = c[i-1][j-1] + 1
            b[i][j]+='D'
        elif c[i-1][j] >= c[i][j-1] :
            c[i][j] = c[i-1] [j]
            b[i][j]+='U'
        else:
            c[i][j] = c[i][j-1]
            b[i][j]+='L'


i=rows-1
j=cols-1
s=''
done=0


while i>0 :
    while j>0 :
        if b[i][j] =='U':
            i-=1
        elif b[i][j] == 'L' :
            j-=1
        elif b[i][j] == 'D':
            s+=x[i]
            i-=1
            j-=1
            if j==0 or i==0:
                done=1
                break
    if done==1:
        break
print (s [:: -1])
