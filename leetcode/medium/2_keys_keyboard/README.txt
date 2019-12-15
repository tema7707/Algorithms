## 650. 2 Keys Keyboard
Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:

Copy All: You can copy all the characters present on the notepad (partial copy is not allowed).
Paste: You can paste the characters which are copied **last time**.
 

Given a number n. You have to get **exactly** n 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get n 'A'.

#### Example 1:

```
Input: 3
Output: 3
Explanation:
Intitally, we have one character 'A'.
In step 1, we use Copy All operation.
In step 2, we use Paste operation to get 'AA'.
In step 3, we use Paste operation to get 'AAA'.
```

#### Example 2:

```
Input: [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
Output: 0
Explanation: 
All 1s are either on the boundary or can reach the boundary.
```

#### My submission:
Runtime: 0 ms, faster than **100.00%** of Java online submissions for 2 Keys Keyboard.
Memory Usage: 33.1 MB, less than **5.26%** of Java online submissions for 2 Keys Keyboard.

