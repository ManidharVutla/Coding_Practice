n=14
roman= {'I' :1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
str=''
while n>0 :
    if n < roman['V']:
        if n + roman ['I'] == roman['V']:
            str+='IV'
            n-=5
        else
            str+='I'
            n-=1
    elif n < roman['X']:
        if n + roman ['V'] == roman['X']:
            str+='IV'
            n-=5
        else
            str+='I'
            n-=1
    elif n< roman['L']:
        str+='X'
        n-=10
    elif n< roman['C']:
        str+='L'
        n-=50
    elif n< roman['D']:
        str+='C'
        n-=100

    elif n< roman['M']:
        str+='D'
        n-=500
    elif n > 1000:
        str+='M'
        n-=100

print (str)
