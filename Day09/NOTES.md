# Day 9 — Interview Notes

## Abstract Class vs Interface

Abstract Class:
- cannot instantiate
- abstract + concrete methods
- has constructor + fields
- single inheritance (extends)
- IS-A relationship
- Dog IS-A Animal

Interface:
- pure contract
- abstract methods only
- Java 8: default + static ok
- no constructor, no fields
- multiple inheritance (implements)
- CAN-DO relationship
- Bird CAN-DO Fly

## Key Rules
- class implements interface
- class extends abstract class
- one class → many interfaces ✅
- one class → one class only ❌

## When to Use
- IS-A? → abstract class
- CAN-DO? → interface
- multiple behaviors? → interfaces ✅

## Longest Consecutive Sequence (LC #128)
- Add all nums to HashSet
- For each num:
  if num-1 NOT in set → sequence start!
  count up while next exists
  update maxLength
- Time: O(n)  Space: O(n)

## Code Logic
HashSet set = all numbers
for each num:
    if !set.contains(num-1):
        length = 1
        while set.contains(num+1):
            num++, length++
        maxLength = max(maxLength, length)

## Interview Questions

Q: Difference abstract class vs interface?
A: Abstract → IS-A, partial impl, single inherit
   Interface → CAN-DO, pure contract, multiple

Q: Can class implement multiple interfaces?
A: YES! Duck implements Flyable, Swimmable ✅

Q: Can interface have constructor?
A: NO! interfaces cannot have constructors

Q: What is default method in interface?
A: Java 8 feature, method with body
   implementing class can override optionally

Q: Why HashSet for consecutive sequence?
A: contains() = O(1) lookup
   Makes overall solution O(n) ✅

Q: How to find sequence start?
A: num-1 NOT in set = sequence start!
   Avoids counting same sequence twice