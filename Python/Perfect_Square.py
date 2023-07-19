import math
from operator import truediv
def isPerfectSquare(num):
    i=1
    while (i<=num):
        if (math.pow(i,2)==num):
            return True
        i=i+1
    return False

x=25
print (isPerfectSquare(x))
