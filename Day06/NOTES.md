# Day 6 — Interview Notes

## Class and Object
- Class  → blueprint/template
- Object → real instance created from class
- new keyword creates object
- Each object has OWN copy of fields
- Object stored in HEAP memory
- Reference stored in STACK memory

## Constructor
- Same name as class
- No return type (not even void)
- Runs automatically when object created
- Used to initialize fields
- Types:
  Default      → no params
  Parameterized → with params
- Can be overloaded
- If parameterized written → no default provided!

## this Keyword
- Refers to current object
- Avoids field vs parameter ambiguity
- this.name = field
- name      = parameter
- Cannot use in static methods!

## Encapsulation
- Wrapping data and hiding it
- Private fields + public getters/setters
- One of 4 pillars of OOP
- Benefits:
  → data protection
  → validation before setting
  → hide implementation details
  → better control over data

## Getters and Setters
- Getter → read private field (getXxx)
- Setter → write with validation (setXxx)
- Boolean getter → isXxx()
- Always make fields private
- Setters validate before setting

## IllegalArgumentException
- Thrown when method receives invalid argument
- RuntimeException (unchecked)
- No need to declare in method signature
- Always provide meaningful message
- Caught using catch(IllegalArgumentException e)

## Valid Anagram (LC #242)
- Two strings same chars same frequency
- Approach 1: Sort both → compare
  Time: O(n log n) Space: O(n)
- Approach 2: Frequency array
  freq[c - 'a']++ for s
  freq[c - 'a']-- for t
  all zeros → anagram!
  Time: O(n) Space: O(1) ✅

## Interview Questions

Q: What is encapsulation?
A: Hiding data with private fields
   Providing public getters/setters
   for controlled and validated access

Q: What is this keyword?
A: Refers to current object instance
   Avoids field vs parameter ambiguity
   Cannot use in static methods

Q: What is constructor?
A: Special method to initialize object
   Same name as class, no return type
   Runs automatically when object created

Q: Why private fields?
A: Data protection + validation
   Prevents invalid data from being set

Q: 4 pillars of OOP?
A: Encapsulation, Inheritance,
   Polymorphism, Abstraction

Q: Difference between class and object?
A: Class = blueprint
   Object = real instance of class

Q: What is IllegalArgumentException?
A: Thrown when invalid argument passed
   RuntimeException, unchecked
   Use for validation in setters

Q: Time complexity of Valid Anagram?
A: Frequency array O(n) time O(1) space ✅