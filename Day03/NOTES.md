# Day 3 — Interview Notes

## Key Concepts

### if/else
- Condition must return boolean
- Only ONE block executes
- else if and else are optional

### switch
- Works with int, char, String
- break exits switch block
- Without break → fall-through happens
- default runs when no case matches

### Loops
- for      → known iterations
- while    → unknown iterations
- do-while → runs at least once

### break vs continue
- break    → exits loop entirely
- continue → skips current iteration

### Two Pointer
- Two variables pointing different positions
- Reduces O(n²) to O(n)
- i → slow pointer (tracks position)
- j → fast pointer (scans array)

## Interview Questions

Q: Difference between while and do-while?
A: while checks condition first, may never run.
   do-while runs body first, always runs once.

Q: What is fall-through in switch?
A: Without break, execution continues
   to next case automatically.

Q: What is two pointer technique?
A: Uses two index variables to solve
   array problems in O(n) instead of O(n²)

Q: Time complexity of Move Zeroes?
A: O(n) time, O(1) space — in-place ✅

Q: Difference between break and continue?
A: break exits loop entirely.
   continue skips current iteration only.