# 🚀 Sum of Maximum and Minimum in Array

## 📝 Problem Statement

You are given an array `ARR` of size `N`. Your task is to **find the sum of the maximum and minimum elements** in the array.

### 🔁 Follow Up
Can you solve this problem using the **minimum number of comparisons**?

---

## 📥 Input Format

- The first line contains an integer `T` — the number of test cases.
- For each test case:
  - The first line contains an integer `N` — the size of the array.
  - The second line contains `N` space-separated integers representing the elements of the array `ARR`.

---

## 📤 Output Format

- For each test case, print a single integer: the **sum of the maximum and minimum** element in the array.

---

## ✅ Constraints

- `1 <= T <= 10`
- `1 <= N <= 10^5`
- `-10^9 <= ARR[i] <= 10^9`
- Time limit: **1 second**

---

## 🧪 Sample Input 1

2
7
1 2 4 5 6 6 6
6
-1 -4 5 8 9 3

shell
Copy
Edit

## ✅ Sample Output 1

7
5

yaml
Copy
Edit

### 📘 Explanation

- **Test Case 1:** Maximum = 6, Minimum = 1 → Sum = 6 + 1 = 7  
- **Test Case 2:** Maximum = 9, Minimum = -4 → Sum = 9 + (-4) = 5

---

## 🧪 Sample Input 2

2
5
3 3 3 3 3
1
-1

shell
Copy
Edit

## ✅ Sample Output 2

6
-2
