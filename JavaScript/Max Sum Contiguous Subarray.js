module.exports = {
  //param A : array of integers
  //return an integer
  maxSubArray: function (A) {
    maxSum = A[0];
    sum = 0;

    for (i = 0; i < A.length; i++) {
      sum = Math.max(sum + A[i], A[i]);
      maxSum = Math.max(sum, maxSum);
    }

    return maxSum;
  },
};
