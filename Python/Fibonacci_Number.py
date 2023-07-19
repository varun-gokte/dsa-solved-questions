def fib(self, n: int) -> int:
    if (n<2):
        return n
    else:
        return fib (self,n-1) + fib (self,n-2)

x=3
print (fib(0,x))