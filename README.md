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
You are an explorer climbing down a mystical pyramid of treasures. Each level of the pyramid contains gold coins, and from each coin, you can only move to one of the two directly connected coins on the level below.

Your goal is to collect as many coins as possible on your way down, starting from the top of the pyramid and choosing a path through adjacent positions on each row.

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
You're implementing a simplified version of Spotify’s “Recently Played” feature.

Maintain a list of the last K unique songs Played.
When a new song is played:

- If it already exists in the list, move it to the front.

- If it's new and the list has less than k songs, add it to the front.

- If it's new and the list is full, remove the least recently played song(last), then add it to the front.

You are given:  
- **K** – the maximum number of songs in the playlist (1 ≤ K ≤ 1000)  
- **N** – the total number of songs played (1 ≤ N ≤ 10<sup> 5</sup>)  
- A list of **N** song IDs (each ID is a positive integer ≤ 10<sup> 9</sup>)

Print the final state of the playlist (most recent first), space-separated.

**Example**
```
Sample input:
3
7
5 3 5 2 4 5 1

Sample output:
1 5 4

Explanation:
Play 5 → [5]
Play 3 → [3, 5]
Play 5 → [5, 3]
Play 2 → [2, 5, 3]
Play 4 → [4, 2, 5]   (3 removed because size > 3)
Play 5 → [5, 4, 2]
Play 1 → [1, 5, 4]   (2 removed because size > 3)
```

---

### 6. Package Dependency Resolution
**File:** `Qus6.java`  

A software system can have dependencies on other packages to be installed.  
You are given package dependencies as pairs **(A depends on B)**.  

You must determine the **installation order** of packages such that each package installed after its dependencies.

---

### Input:
- **N** – number of packages  
- **M** – number of dependency pairs  
- **M** lines: **A B** meaning **A depends on B**

---

### Output:
- Any one valid **topological order** of packages  
- If not possible (cycle), print `-1`

---

### Example 1:

**Input**


**Example**
```
Input:
A B
B C
C D

Output: D, C, B, A
```

---

### 7. Tall Queue
**File:** `Qus7.java`  
You are in charge of managing people standing in a line. 
People arrive one by one with a specific height. When a new person arrives:

1. They always join the back of the line.  
2. If the newly joined person is taller than the person standing in front of them, the shorter person in front of them is kicked out of the line, and the newly joined person moves one position forward.  
3. Step 2 continues until the newly joined person stands behind a person who is taller than them. (or they reach the front of the line).

When the last person joins the line, print the heights of the people in the order they are standing. Your solution must have an **efficient data structure** for the line, which allows insertion and removal in **O(1)** average time complexity.

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

