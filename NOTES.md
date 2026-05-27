# Day 2 — Interview Notes

## Operators
- Arithmetic  → + - * / %
- Relational  → == != > < >= <=
- Logical     → && || !
- Ternary     → condition ? a : b

## Precedence
() → * / % → + - → relational → == != → && → ||

## Type Casting
- Widening  → int to double → automatic
- Narrowing → double to int → (int) manual
- String to int → Integer.parseInt()
- int to String → String.valueOf()

## Method Overloading
- Same method name, different parameters
- Java decides which to call based on arguments

## Contains Duplicate (LC #217)
- HashSet one pass
- set.add() returns false → duplicate exists!
- Time: O(n)  Space: O(n)

## Interview Questions
Q: What is operator precedence?
A: Order in which operators are evaluated
   () first, then * / %, then + -, then logical

Q: Difference between = and ==?
A: = assigns value, == compares values

Q: What is widening vs narrowing?
A: Widening → smaller to bigger type → automatic
   Narrowing → bigger to smaller type → manual cast needed

Q: What does HashSet.add() return?
A: true if element is new, false if already exists

Q: Time complexity of Contains Duplicate?
A: O(n) — one pass through array