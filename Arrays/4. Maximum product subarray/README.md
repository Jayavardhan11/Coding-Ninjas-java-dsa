# Sort 0s, 1s and 2s in a Single Scan

## 🧩 Problem Statement

You are given an integer array `ARR` of size `N` consisting only of `0`s, `1`s, and `2`s. Your task is to sort this array **in a single scan**, i.e., you must iterate over the array only once.

This is a classic problem also known as the **Dutch National Flag** problem.

---

## ✅ Constraints

- 1 ≤ T ≤ 10 — Number of test cases  
- 1 ≤ N ≤ 5 × 10⁵ — Size of each array  
- 0 ≤ ARR[i] ≤ 2 — Array elements can only be 0, 1, or 2  
- Time Limit: 1 second

---

## 📥 Input Format

- First line contains the integer `T`, number of test cases.
- For each test case:
  - First line contains the integer `N`, the size of the array.
  - Second line contains `N` space-separated integers (0, 1, or 2) representing the array.

---

## 📤 Output Format

For each test case, print the sorted array on a new line.

---

## 🔍 Sample Input

2
6
0 1 2 2 1 0
7
0 1 2 1 2 1 2

shell
Copy
Edit

## ✅ Sample Output

0 0 1 1 2 2
0 1 1 1 2 2 2
