## 942. DI String Match
Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]

#### Example 1:

```
Input: "IDID"
Output: [0,4,1,3,2]
```

#### Example 2:

```
Input: "III"
Output: [0,1,2,3]
```

#### My submission:
Runtime: 51 ms, faster than **100.00%** of Python3 online submissions for DI String Match.
Memory Usage: 13.8 MB, less than **100.00%** of Python3 online submissions for DI String Match.

