# 🚀 Maximum Product Subarray

## 🧩 Problem Statement

You are given an array `arr` of integers. Your task is to find the **contiguous subarray** within the array which has the **largest product** of its elements.

A subarray is a contiguous portion of the array. For example, for the array `[1,2,3]`, its non-empty subarrays are:
- `[1]`, `[2]`, `[3]`
- `[1,2]`, `[2,3]`
- `[1,2,3]`

You must report the **maximum product** among all possible non-empty contiguous subarrays.

---

## ✅ Constraints

- 1 ≤ T ≤ 100 — Number of test cases  
- 1 ≤ N ≤ 5000 — Size of the array  
- -100 ≤ arr[i] ≤ 100 — Elements can be negative, zero, or positive  
- Time Limit: 1 second

---

## 📥 Input Format

- First line contains an integer `T`, the number of test cases.
- For each test case:
  - First line contains an integer `N`, the size of the array.
  - Second line contains `N` space-separated integers.

---

## 📤 Output Format

- For each test case, print the **maximum product** of any contiguous subarray on a new line.

---

## 🧪 Sample Input

2
4
3 5 -2 -4
5
2 4 3 5 6

shell
Copy
Edit

## ✅ Sample Output

120
720
