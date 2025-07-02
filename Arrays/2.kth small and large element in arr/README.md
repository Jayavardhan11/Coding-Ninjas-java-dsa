# Kth Smallest and Largest Element

## 🧩 Problem Statement

You are given an array `Arr` consisting of `N` **distinct integers** and a positive integer `K`.  
Your task is to **find the Kth smallest and Kth largest elements** of the array.

It is guaranteed that:
- `1 <= K <= N`

---

## 📥 Input Format

- The first line contains an integer `T`, the number of test cases.
- For each test case:
  - First line contains two integers: `N` (size of array) and `K`
  - Second line contains `N` space-separated integers (elements of the array)

---

## 📤 Output Format

- For each test case, print the Kth smallest and Kth largest elements, separated by a space.

---

## 🧪 Sample Input

2
4 4
5 6 7 2
4 3
1 2 5 4

shell
Copy
Edit

## ✅ Sample Output

7 2
4 2

yaml
Copy
Edit

---

## 🔍 Explanation

### Test Case 1:
- Input: `Arr = [5, 6, 7, 2]`, `K = 4`
- Sorted array: `[2, 5, 6, 7]`
- 4th smallest = `7`, 4th largest = `2`

### Test Case 2:
- Input: `Arr = [1, 2, 5, 4]`, `K = 3`
- Sorted array: `[1, 2, 4, 5]`
- 3rd smallest = `4`, 3rd largest = `2`

---

## 📌 Constraints

- `1 <= T <= 50`
- `1 <= N <= 10^4`
- `1 <= K <= N`
- `-10^9 <= Arr[i] <= 10^9`

---
