# 🔁 Count Inversions in an Array

## 🧩 Problem Statement

For a given integer array `ARR` of size `N` containing all **distinct** values, find the total number of **Inversions**.

An **inversion** is defined as a pair `(ARR[i], ARR[j])` such that:
- `ARR[i] > ARR[j]`
- `i < j`

### 📌 Example:
For `ARR = [3, 2, 1]`  
Valid inversions:
- (3, 2)
- (2, 1)
- (3, 1)

✅ Total Inversions = 3

---

## ✅ Constraints

- 1 ≤ N ≤ 10⁵  
- 1 ≤ ARR[i] ≤ 10⁹  
- Time Limit: 1 second  
- Elements are all **distinct**

---

## 📥 Input Format

- First line contains an integer `N` — the size of the array
- Second line contains `N` space-separated integers representing the array `ARR`

## 📤 Output Format

- Print a single integer — the total number of inversions

---

## 🧪 Sample Input 1

3
3 2 1

shell
Copy
Edit

### ✅ Sample Output 1

3

yaml
Copy
Edit

**Explanation:**  
Inversions are: (3, 2), (3, 1), (2, 1)

---

## 🧪 Sample Input 2

5
2 5 1 3 4

shell
Copy
Edit

### ✅ Sample Output 2

4
