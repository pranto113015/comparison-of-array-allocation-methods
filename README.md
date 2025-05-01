# Comparison Of Array Allocation Methods

This repository mainly focuse the four main array allocation types  like : `Fixed Stack Dynamic`, `Stack Dynamic`, `Fixed Heap Dynamic`, and `Heap Dynamic` by using both Java and JavaScript.

It concludes with a comparison of how each language handles memory allocation and array behavior, highlighting key structural differences.



## Four Types Methods Overview

 ✔️ **Fixed Stack Dynamic**

- **Java** : Java doesn't have a built-in "fixed stack-dynamic" array type, but we can implement this concept by combining fixed-size arrays with stack allocation (local variables) and dynamic behavior within those constraints.

  **What is a Fixed Stack-Dynamic Array?**

    - Fixed size (determined at declaration)

    - Stack allocation (local variable)

    - Dynamic behavior in terms of element values (contents can change)


- **JavaScript** : JavaScript doesn't have true fixed-size arrays or stack allocation like lower-level languages, but we can simulate the concept of a fixed stack-dynamic array using various techniques.

    **What is a Fixed Stack-Dynamic Array in JavaScript Context?**

    - An array with fixed length (size can't change after creation)

    - "Stack" behavior (using local variables)

    - Dynamic element values (contents can be modified)


---


✔️ **Stack Dynamic**

- **Java** : A Dynamic Stack in Java is a stack data structure that can grow or shrink in size automatically as elements are pushed or popped. This is different from a fixed-size stack, which uses arrays and has limited capacity.

    - The size is determined at runtime (dynamic)

    - The array reference is stored on the stack (for local variables)

    - The actual array is allocated on the heap (like all Java objects)

- **JavaScript** : In JavaScript, stacks can be implemented using the native Array because arrays are dynamic by nature. This means they can grow or shrink as needed without pre-defined size constraints.


---

✔️ **Fixed Heap Dynamic**

- **Java** : In Java, a Fixed Heap-Dynamic refers to a data structure (like a heap) that is created with a fixed size during runtime, but once created, its size cannot be changed (i.e., it is fixed). This is usually implemented using an array, and the heap operations (insert, delete) are done within that fixed size.

- **JavaScript** : In JavaScript, a Fixed Heap-Dynamic refers to a heap data structure that has a fixed size determined at runtime, but once created, it does not resize. A heap maintains a heap property (either max-heap or min-heap).

---

✔️ **Heap Dynamic**

- **Java** : In Java, all arrays are heap-dynamic in the sense that they are allocated on the heap, but the term "heap-dynamic" typically refers to collections that can grow and shrink dynamically at runtime. Since Java's native arrays are fixed-size after creation, we typically use the ArrayList class from Java Collections Framework for true heap-dynamic behavior.

- **JavaScript** : In JavaScript, all arrays are inherently heap-dynamic - they're objects that can grow and shrink dynamically at runtime. Unlike Java which requires special classes like ArrayList for dynamic arrays, JavaScript arrays are always resizable and flexible.


## Summary :
`Java` Arrays are static, type-strict, and require predefined size allocation. They are efficient but inflexible when it comes to resizing.

`JavaScript` Arrays are dynamic and flexible, allowing elements of various types and resizing on the fly, making them ideal for use in web development but less efficient for large-scale, performance-sensitive applications.


