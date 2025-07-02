# 🔁 Reverse Subarray After Position M

## 🧩 Problem Statement

Given an array/list `ARR` of integers and a position `M`, reverse the elements of the array after the position `M` (0-based index).

---

## 🧠 Detailed Explanation

You are provided an array and an index `M`. You must reverse the elements of the array from index `M+1` to the end of the array.

### Example:

**Input**:
ARR = [1, 2, 3, 4, 5, 6], M = 3

makefile
Copy
Edit

**Output**:
[1, 2, 3, 4, 6, 5]

yaml
Copy
Edit

**Explanation**:
- The subarray to reverse is from index `M+1 = 4` to the end → `[5, 6]`
- Reversing this part gives `[6, 5]`
- Final array: `[1, 2, 3, 4, 6, 5]`

---

## 🔢 Constraints

- `1 <= T <= 10` — Number of test cases  
- `0 <= M <= N <= 5 * 10^4`  
- `-10^9 <= ARR[i] <= 10^9`  
- Time Limit: `1 sec`

---

## 📤 Input Format

- First line contains a single integer `T` — number of test cases.
- For each test case:
  - First line contains two integers `N` and `M` — size of the array and the index `M`.
  - Second line contains `N` space-separated integers — the elements of the array.

---

## 📥 Output Format

- For each test case, print the modified array after reversing the elements from index `M+1` to `N-1`.

---

## 🧪 Sample Input 1
2
6 3
1 2 3 4 5 6
5 2
10 9 8 7 6

shell
Copy
Edit

## ✅ Sample Output 1
1 2 3 4 6 5
10 9 8 6 7

yaml
Copy
Edit

---

## 🧪 Sample Input 2
2
7 3
1 4 5 6 6 7 7
9 3
10 4 5 2 3 6 1 3 6

shell
Copy
Edit

## ✅ Sample Output 2
1 4 5 6 7 7 6
10 4 5 2 6 3 1 6 3

yaml
Copy
Edit

---

## 💡 Hints

- Try to think by creating another array.
- Try to observe which elements are being swapped during reversal.
- In-place reversal is possible using a two-pointer approach.

---
