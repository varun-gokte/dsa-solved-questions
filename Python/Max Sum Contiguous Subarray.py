class Solution:
    # @param A : tuple of integers
    # @return an integer
    def maxSubArray(self, A):
        maxSum=A[0]
        sum=0

        for i in A:
            sum = max (sum+i,i)
            maxSum = max(sum,maxSum)

        return maxSum
