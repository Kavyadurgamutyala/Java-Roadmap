# Day 4 — Interview Notes

## Arrays
- Index starts at 0
- Last index = arr.length - 1
- Fixed size cannot grow/shrink
- Default: int=0, boolean=false, String=null

## Arrays Class
- Arrays.sort()    → sort ascending
- Arrays.fill()    → fill with value
- Arrays.copyOf()  → copy n elements
- Arrays.toString()→ print nicely

## 2D Array
- matrix[row][col]
- Transpose: matrix[j][i] = matrix[i][j]

## Kadane's Algorithm
- currentSum = max(num, currentSum+num)
- maxSum = max(maxSum, currentSum)
- Time: O(n)  Space: O(1)

## Interview Questions

Q: What is Kadane's algorithm?
A: Find maximum subarray sum in O(n) O(1)
   At each step extend or start fresh
   take whichever is bigger

Q: Array default values?
A: int=0, boolean=false, String=null

Q: Array vs ArrayList?
A: Array → fixed size, faster
   ArrayList → dynamic size, flexible

Q: What is matrix transpose?
A: Swap rows and columns
   matrix[i][j] → matrix[j][i]