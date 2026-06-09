# Day 8 — Interview Notes

## Inheritance
- Child class reuses parent class code
- extends keyword
- Child gets all parent fields and methods
- Code reuse (DRY principle)

## super keyword
- super()           → calls parent constructor
- super.method()    → calls parent method
- super() MUST be first line in constructor!

## @Override
- Annotation to override parent method
- Java verifies method exists in parent
- Prevents spelling mistakes
- Makes code readable

## Polymorphism
- One method behaves differently
- Based on object type
- Decided at RUNTIME
- Animal[] can hold Dog, Cat objects!

## Abstract Class
- Incomplete class
- Has abstract methods (no body)
- Cannot create object directly
- Child MUST implement abstract methods
- Can have constructors
- Can have concrete methods too

## Interview Questions

Q: What is inheritance?
A: Child class reuses parent class code
   using extends keyword. Promotes DRY.

Q: What is polymorphism?
A: One method behaves differently based
   on object type. Decided at runtime.

Q: What is abstract class?
A: Incomplete class with abstract methods.
   Cannot instantiate directly.
   Child must implement abstract methods.

Q: Difference abstract class vs interface?
A: Abstract → partial implementation
             can have constructors
             single inheritance only
   Interface → full abstraction
              no constructors
              multiple inheritance ✅

Q: What is super keyword?
A: Refers to parent class.
   super() = parent constructor
   super.method() = parent method

Q: What is @Override?
A: Annotation to override parent method.
   Java verifies method exists in parent.

Q: What is DRY principle?
A: Don't Repeat Yourself.
   Inheritance promotes DRY by
   reusing parent code in child class.

## Ransom Note (LC #383)
- Count frequency of magazine chars
- Decrement for ransomNote chars
- If any goes negative → false!
- Time: O(n)  Space: O(1)

## Code Logic:
int[] freq = new int[26]
for char in magazine → freq[c-'a']++
for char in ransomNote:
    freq[c-'a']--
    if < 0 → return false
return true