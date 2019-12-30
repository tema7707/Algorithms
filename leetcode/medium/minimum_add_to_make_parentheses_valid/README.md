## 921. Minimum Add to Make Parentheses Valid
Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

Formally, a parentheses string is valid if and only if:

It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

#### Example 1:
```
Input: "())"
Output: 1
```

#### Example 2:
```
Input: "((("
Output: 3
```

#### Example 3:
```
Input: "()"
Output: 0
```


#### My submission:
Runtime: 15 ms, faster than **52.28%** of Java online submissions for Minimum Add to Make Parentheses Valid.
Memory Usage: 37.6 MB, less than **100.00%** of Java online submissions for Minimum Add to Make Parentheses Valid.

