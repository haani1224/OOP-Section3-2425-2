# 📘 OOP Lab Exercise 3 - Advanced Array Practice (Java)

## 👨‍🏫 Objective
Modify the given Java program to complete the tasks below. The questions are divided into three categories:

1. 🔍 Spot the errors -- **(⭐Answered below⭐)**
2. ✍️ Write short array declarations -- **(⭐Answered in file name Advanced_Array_Practice.java⭐)**
3. 🔧 Create and implement helper methods -- **(⭐Answered in file name Advanced_Array_Practice.java⭐)**

---

## 🔍 Part A: Spot the Errors (3 Questions)

1. ❌ Fix the following broken array initialization:
   ```java
   double gpa[] = new double(4); // Line to fix
   ```
   ✅ The correct syntax:
   ```java
   double[] gpa = new double(4);
   ```

3. ❌ The following shorthand array causes a compile error. Identify and correct the issue:
   ```java
   int[] points;
   points = {90, 85, 88}; // Line to fix
   ```
   ✅ The correct syntax:
   ```java
   int[] points;
   points = {{90, 85, 88}};
   ```

4. ❌ Correct the misuse of variable-length arguments:
   ```java
   public static void printTotal(int... values, String title) { // Invalid
       // ...
   }
   ```
   ✅ The correct syntax:
   ```java
   public static void printTotal(int... values, String title) { // Invalid
       // ...
   }
   ```

---
