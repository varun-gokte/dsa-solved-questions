class Solution:
	# @param A : list of integers
	# @return a list of integers
	def subUnsort(self, A):
        arr=A.copy()
        arr.sort()
        
        ans=[]
        s=-1
        e=-1
        
        for i in range (len(A)):
            if (arr[i]!=A[i]):
                if s==-1:
                    s=i
                else:
                    e=i
                    
        if (s==-1):
            ans=[-1]
        else:
            ans=[s,e]
        
        return ans