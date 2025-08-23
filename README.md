# Zoho 2025 – 2nd Chance Coding Round (College)

This repository contains solutions to 7 programming problems asked in the **Zoho 2025 2nd Chance Coding Round** during my college placement.  
Each file `QusX.java` corresponds to one problem.

---

## Problem Statements

### 1. HTML Tag Validation
**File:** `Qus1.java`  
Write a program to check whether the list of HTML/XML tags has properly nested and balanced.  
- Input: a string containing HTML-like tags  
- Output: `"Valid"` if all tags are correctly nested, otherwise `"Invalid"`  

**Example**
```
Input:  <html><body><h1></h1></body></html>
Output: Valid

Input:  <html><body><h1></body></h1></html>
Output: Invalid
```

---

### 2. Coin Distribution Between Zara and Neil
**File:** `Qus2.java`  
Zara and Neil collect coins. If one has **more coins than the other**, then **Omar** comes in and takes away coins:  
- He repeatedly takes **half of the excess coins** from the player with more coins.  
- This continues until both have equal coins.  

**Example**
```
Input:  Zara = 20, Neil = 11
Step 1: Omar takes 10 from Zara → Zara = 10, Neil = 11
Step 2: Omar takes 6 from Neil → Zara = 10, Neil = 5
Step 2: Omar takes 5 from Zara → Zara = 5, Neil = 5
Output: Omar = 10 + 6 + 5 = 21
```

---

### 3. IP Whitelist Check
**File:** `Qus3.java`  
Given an IP address and a list of allowed (whitelisted) ranges, check whether the given IP is allowed.

**Example**
```

Input:  Whitelist = [192.168.1.1-192.168.2.10 192.168.1.15 10.0.0.1-10.0.0.5]
Check IP = 192.168.1.101
Output: Allowed

Input:  Check IP = 10.0.0.66
Output: Not Allowed

```

---

### 4. Maximum Coins in Pyramid (Mystery Game)
**File:** `Qus4.java`  
Given a pyramid (triangle) of numbers, calculate the maximum number of coins that can be collected from top to bottom by moving only to adjacent numbers.

**Example**
```
Input 1:
1
2 3
4 5 6

Output: 10   (1 → 3 → 6)

Input 2:
    6 
   1 2 
  5 9 3 
 9 8 7 2 
8 4 1 9 4

Ouput 33 (6 → 2 → 9 → 7 → 9)
```

---

### 5. Recently Played Songs
**File:** `Qus5.java`  
Implement a system that maintains a playlist of recently played songs with a fixed capacity.  
- If capacity is exceeded, remove the least recently played song.  
- Always show the current playlist.

**Example**
```

Capacity = 3
Play: A, B, C
Playlist = [A, B, C]

Play: D
Playlist = [B, C, D]

```

---

### 6. Package Dependency Resolution
**File:** `Qus6.java`  
Given a set of packages and their dependencies, resolve the order in which packages must be installed.  
Detect cycles if present.

**Example**
```
Input:
A -> B
B -> C
C -> D

Output: D, C, B, A
```

---

### 7. Tall Queue
**File:** `Qus7.java`  
People stand in a queue. When a **new person** joins at the **end**:  
- If they are **taller** than some people already in the queue, all the **shorter people ahead of them get kicked out**.  
- The queue always remains in non-decreasing order of height from front to back.

**Example**
```
Input Queue: [10, 5, 15, 8, 3]
Queue after: [15, 8, 3]
```
**Constraints**
```
Time Complexity: O(N)
```
---

## How to Run

Compile and run any program individually:
```bash
javac Qus1.java
java Qus1
````

---

## Notes

* These are direct coding round problems from **Zoho 2025 – 2nd Chance**.
* Solutions are implemented in Java.
* Sample inputs are available in the Same file.

