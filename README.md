# Data Structure and Algorithm in Java

- The main focus of this repo is to implements some of the basic data Structures in Java like Array List, Linked List, Stack , Queues, Heaps, Graphs and Trees and cover all the highly used Algorithms in a pattern wise manner for interview preparation and creating some of the algorithms from Information theory

## **Week 1: Arrays & Strings**

This week is about solidifying your understanding of the most fundamental data structures and common patterns associated with them.

### **Day 1: Arrays - Hashing & Basic Manipulation**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Two Sum | https://leetcode.com/problems/two-sum/ | LeetCode | Easy | Hash Map Lookup | Array, HashMap | Use a hash map to store elements and their indices. For each element, check if `target - current_element` exists in the map. | Done |
| Contains Duplicate | https://leetcode.com/problems/contains-duplicate/ | LeetCode | Easy | Hashing | Array, HashSet | Use a HashSet to keep track of the numbers seen. If a number is already in the set, return true. | Done |
| Merge Sorted Array | https://leetcode.com/problems/merge-sorted-array/ | LeetCode | Easy | Two Pointers | Array | Use two pointers starting from the end of both arrays to merge them in place in `nums1`. | Done |
| 3Sum | https://leetcode.com/problems/3sum/ | LeetCode | Medium | Two Pointers | Array | Sort the array. Iterate through, and for each element, use two pointers to find a pair that sums to the negative of the current element, avoiding duplicates. | Done |
| Product of Array Except Self | https://leetcode.com/problems/product-of-array-except-self/ | LeetCode | Medium | Prefix/Postfix Product | Array | Calculate prefix products and postfix products in two separate passes. The result for each index is the product of its corresponding prefix and postfix products. | Done |
| First Missing Positive | https://leetcode.com/problems/first-missing-positive/ | LeetCode | Hard | Cyclic Sort / In-place Hashing | Array | Use the array itself as a hash map. Try to place each number `x` at index `x-1`. Then iterate to find the first index `i` where `nums[i] != i+1`. | Done |

### **Day 2: Arrays - Sliding Window**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Best Time to Buy and Sell Stock | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ | LeetCode | Easy | Sliding Window | Array | Keep track of the minimum price found so far (left pointer) and calculate the max profit as you iterate (right pointer). | Done |
| Maximum Average Subarray I | https://leetcode.com/problems/maximum-average-subarray-i/ | LeetCode | Easy | Sliding Window | Array | Maintain a sliding window of size `k`. Calculate the sum of the first window, then slide it by one element at a time, updating the sum and tracking the maximum. |  |
| Longest Substring Without Repeating Characters | https://leetcode.com/problems/longest-substring-without-repeating-characters/ | LeetCode | Medium | Sliding Window | String, HashSet | Use a sliding window with a HashSet to track characters. Expand the window by moving the right pointer. If a duplicate is found, shrink the window from the left. |  |
| Minimum Size Subarray Sum | https://leetcode.com/problems/minimum-size-subarray-sum/ | LeetCode | Medium | Sliding Window | Array | Use a variable-sized sliding window. Expand the window until the sum is \>= target, then shrink it from the left to find the minimum length. |  |
| Sliding Window Maximum | https://leetcode.com/problems/sliding-window-maximum/ | LeetCode | Hard | Deque | Deque | Use a deque to store indices of elements in the current window, in decreasing order of their values. The front of the deque is always the maximum element. |  |

### **Day 3: Arrays - Two Pointers**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Valid Palindrome | https://leetcode.com/problems/valid-palindrome/ | LeetCode | Easy | Two Pointers | String | Use two pointers, one at the start and one at the end. Move them towards the center, skipping non-alphanumeric characters and comparing. |  |
| Squares of a Sorted Array | https://leetcode.com/problems/squares-of-a-sorted-array/ | LeetCode | Easy | Two Pointers | Array | Use two pointers at the start and end of the input array. Compare the absolute values of the elements, place the larger square at the end of the result array, and move the corresponding pointer. |  |
| Container With Most Water | https://leetcode.com/problems/container-with-most-water/ | LeetCode | Medium | Two Pointers | Array | Start with pointers at both ends. Calculate the area. Move the pointer pointing to the shorter line inward, as this is the only way to potentially increase the area. |  |
| Trapping Rain Water | https://leetcode.com/problems/trapping-rain-water/ | LeetCode | Hard | Two Pointers | Array | Use two pointers, `left` and `right`, and two variables, `left_max` and `right_max`. If `height[left]` is smaller than `height[right]`, the water trapped at `left` is determined by `left_max`. Move `left`. Otherwise, do the same for `right`. |  |

### **Day 4: Strings - Anagrams & Subsequences**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Valid Anagram | https://leetcode.com/problems/valid-anagram/ | LeetCode | Easy | Hashing | String, HashMap/Array | Use a hash map or an array of size 26 to store character counts for the first string. Decrement the counts for the second string. All counts must be zero at the end. |  |
| Group Anagrams | https://leetcode.com/problems/group-anagrams/ | LeetCode | Medium | Hashing | Array, HashMap | Iterate through the strings, sort each string to get a canonical representation (e.g., "eat" -\> "aet"), and use this as a key in a hash map to group the anagrams. |  |
| Find All Anagrams in a String | https://leetcode.com/problems/find-all-anagrams-in-a-string/ | LeetCode | Medium | Sliding Window | String, HashMap | Use a sliding window of the same size as the pattern string `p`. Maintain character counts for the window and compare them with the counts of `p`. |  |
| Minimum Window Substring | https://leetcode.com/problems/minimum-window-substring/ | LeetCode | Hard | Sliding Window | String, HashMap | Use a sliding window. Expand the window until it contains all characters of `t`. Then, shrink the window from the left while maintaining the condition, tracking the minimum length. |  |

### **Day 5: Matrix Manipulation**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Rotate Image | https://leetcode.com/problems/rotate-image/ | LeetCode | Medium | In-place Manipulation | 2D Array | To rotate 90 degrees clockwise, first transpose the matrix (swap `matrix[i][j]` with `matrix[j][i]`) and then reverse each row. |  |
| Spiral Matrix | https://leetcode.com/problems/spiral-matrix/ | LeetCode | Medium | Layer-by-Layer Traversal | 2D Array | Use four pointers for the boundaries (top, bottom, left, right). Traverse the outer layer, then move the boundaries inward and repeat until they cross. |  |
| Set Matrix Zeroes | https://leetcode.com/problems/set-matrix-zeroes/ | LeetCode | Medium | In-place Markers | 2D Array | Use the first row and first column of the matrix as markers. If a cell `(i, j)` is zero, set `matrix[i][0]` and `matrix[0][j]` to zero. Then, use these markers to update the rest of the matrix. |  |
| Word Search | https://leetcode.com/problems/word-search/ | LeetCode | Medium | Backtracking on Grid | 2D Array | Start a DFS/backtracking search from each cell. In the search, explore neighbors to find the next character of the word. Mark visited cells to avoid using the same letter twice in a word. |  |

### **Day 6 & 7: Review & Catch-up**

Use these two days to review the patterns from this week: Hashing, Sliding Window, Two Pointers, and Matrix Traversal. Re-solve problems you found difficult or try a few from this list that you skipped.

---

## **Week 2: Linked Lists**

This week focuses on a data structure that is a favorite in interviews for testing understanding of pointers, memory, and recursion.

### **Day 8: Singly Linked Lists - Traversal & Reversal**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Reverse Linked List | https://leetcode.com/problems/reverse-linked-list/ | LeetCode | Easy | Iterative/Recursive Reversal | Linked List | **Iterative:** Use three pointers (`prev`, `current`, `next`) to reverse the links. **Recursive:** Reverse the rest of the list, then attach the current node to the end. |  |
| Middle of the Linked List | https://leetcode.com/problems/middle-of-the-linked-list/ | LeetCode | Easy | Fast & Slow Pointers | Linked List | Use two pointers, one moving one step (slow) and the other moving two steps (fast). When the fast pointer reaches the end, the slow pointer will be at the middle. |  |
| Palindrome Linked List | https://leetcode.com/problems/palindrome-linked-list/ | LeetCode | Easy | Reverse Second Half | Linked List | Find the middle, reverse the second half of the list, and then compare the two halves. |  |
| Reverse Linked List II | https://leetcode.com/problems/reverse-linked-list-ii/ | LeetCode | Medium | Iterative Reversal | Linked List | Find the start of the sublist to be reversed. Reverse the required number of nodes using the standard iterative approach, and then reconnect the reversed portion to the main list. |  |

### **Day 9: Linked Lists - Two Pointers & Cycles**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Linked List Cycle | https://leetcode.com/problems/linked-list-cycle/ | LeetCode | Easy | Fast & Slow Pointers | Linked List | Use two pointers, one moving one step (slow) and one moving two steps (fast). If they ever meet, there is a cycle. |  |
| Remove Nth Node From End of List | https://leetcode.com/problems/remove-nth-node-from-end-of-list/ | LeetCode | Medium | Two Pointers | Linked List | Use two pointers. Move the first pointer `n` steps ahead. Then move both pointers together until the first pointer reaches the end. The second pointer will be at the node before the one to be removed. |  |
| Linked List Cycle II | https://leetcode.com/problems/linked-list-cycle-ii/ | LeetCode | Medium | Fast & Slow Pointers | Linked List | First, find if a cycle exists and the meeting point. Then, start one pointer from the head and another from the meeting point. The point where they meet again is the start of the cycle. |  |
| Reorder List | https://leetcode.com/problems/reorder-list/ | LeetCode | Medium | Split, Reverse, Merge | Linked List | 1. Find the middle of the list. 2. Split the list into two halves. 3. Reverse the second half. 4. Merge the two halves by alternating nodes. |  |

### **Day 10: Linked Lists - Merging & Sorting**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Merge Two Sorted Lists | https://leetcode.com/problems/merge-two-sorted-lists/ | LeetCode | Easy | Iterative Merging | Linked List | Create a dummy head for the new list. Iterate through both lists, comparing nodes and appending the smaller one to the new list. |  |
| Sort List | https://leetcode.com/problems/sort-list/ | LeetCode | Medium | Merge Sort | Linked List | Implement merge sort. Recursively split the list in half (using fast/slow pointers to find the middle), sort each half, and then merge the sorted halves. |  |
| Merge k Sorted Lists | https://leetcode.com/problems/merge-k-sorted-lists/ | LeetCode | Hard | Min-Heap | Heap, Linked List | Use a min-heap to store the first node of each list. Repeatedly extract the minimum node from the heap, add it to the result list, and add the next node from the same list to the heap. |  |

### **Day 11 & 12: Advanced Linked Lists & LRU Cache**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Add Two Numbers | https://leetcode.com/problems/add-two-numbers/ | LeetCode | Medium | Elementary Math | Linked List | Iterate through both lists simultaneously, adding corresponding digits along with a carry. Create a new list for the result. |  |
| Copy List with Random Pointer | https://leetcode.com/problems/copy-list-with-random-pointer/ | LeetCode | Medium | Hashing/Interweaving | Linked List, HashMap | **Hashing:** Use a hash map to store the mapping from old nodes to new nodes. In a second pass, set the `random` pointers. |  |
| LRU Cache | https://leetcode.com/problems/lru-cache/ | LeetCode | Medium | HashMap + Doubly Linked List | HashMap, Doubly Linked List | Use a hash map for O(1) lookups of keys to nodes. Use a doubly linked list to maintain the order of usage. When an item is accessed, move it to the front. If the cache is full, remove the item from the end. |  |
| Reverse Nodes in k-Group | https://leetcode.com/problems/reverse-nodes-in-k-group/ | LeetCode | Hard | Iterative/Recursive Reversal | Linked List | Traverse the list and reverse `k` nodes at a time. This requires careful pointer manipulation to connect the reversed groups. |  |

### **Day 13 & 14: Review & Catch-up**

Review the linked list patterns: Fast & Slow Pointers, Reversal, Merging. The **LRU Cache** is a very common design question, so be sure you understand the HashMap + Doubly Linked List approach thoroughly.

---

## **Week 3: Stacks & Queues**

This week covers LIFO (Last-In, First-Out) and FIFO (First-In, First-Out) data structures, essential for managing nested data, traversals, and more.

### **Day 15: Stacks - LIFO Basics & Parentheses**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Valid Parentheses | https://leetcode.com/problems/valid-parentheses/ | LeetCode | Easy | Stack for Matching | Stack | Iterate through the string. If you see an opening bracket, push it onto the stack. If you see a closing bracket, pop from the stack and check if it's the matching opening bracket. |  |
| Min Stack | https://leetcode.com/problems/min-stack/ | LeetCode | Medium | Two Stacks / Pair | Stack | Use a second stack to keep track of the minimum element seen so far. When you push an element, push the new minimum onto the min-stack. |  |
| Evaluate Reverse Polish Notation | https://leetcode.com/problems/evaluate-reverse-polish-notation/ | LeetCode | Medium | Stack | Stack | Iterate through the tokens. If a token is a number, push it onto the stack. If it's an operator, pop two numbers, perform the operation, and push the result back. |  |

### **Day 16: Monotonic Stack**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Daily Temperatures | https://leetcode.com/problems/daily-temperatures/ | LeetCode | Medium | Monotonic Stack | Stack, Array | Use a monotonic (decreasing) stack to store indices of temperatures. When you find a warmer day, pop from the stack and calculate the difference in days. |  |
| Next Greater Element I | https://leetcode.com/problems/next-greater-element-i/ | LeetCode | Easy | Monotonic Stack + Map | Stack, HashMap | Use a monotonic stack to precompute the next greater element for all numbers in `nums2` and store the results in a map for quick lookup. |  |
| Largest Rectangle in Histogram | https://leetcode.com/problems/largest-rectangle-in-histogram/ | LeetCode | Hard | Monotonic Stack | Stack, Array | Use a monotonic (increasing) stack to keep track of indices. When a smaller bar is encountered, pop from the stack and calculate the area for the popped bar, with the current bar as the right boundary and the new stack top as the left boundary. |  |

### **Day 17 & 18: Queues - BFS & Design**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Implement Queue using Stacks | https://leetcode.com/problems/implement-queue-using-stacks/ | LeetCode | Easy | Two Stacks | Stack | Use two stacks, one for `enqueue` (`in`) and one for `dequeue` (`out`). When `dequeue` is called and `out` is empty, pour all elements from `in` into `out`. This reverses the order. |  |
| Number of Islands | https://leetcode.com/problems/number-of-islands/ | LeetCode | Medium | Breadth-First Search (BFS) | Queue, 2D Array | Iterate through the grid. When you find a '1', start a BFS from that cell to find all connected '1's, marking them as visited (e.g., changing to '0'). Increment the island count. |  |
| Rotting Oranges | https://leetcode.com/problems/rotting-oranges/ | LeetCode | Medium | BFS | Queue, 2D Array | Use BFS starting from all initially rotten oranges simultaneously (multi-source BFS). The level of the BFS corresponds to the minutes passed. After, check for any remaining fresh oranges. |  |
| Design Circular Queue | https://leetcode.com/problems/design-circular-queue/ | LeetCode | Medium | Array + Pointers | Array | Use an array with two pointers, `head` and `tail`, to manage the queue. Use the modulo operator (`%`) to handle wrapping around the array. |  |

### **Day 19, 20, & 21: Review & Catch-up**

Review the core use cases for Stacks (LIFO, parentheses, monotonic) and Queues (FIFO, BFS). Try any problems you skipped and make sure you can implement the solutions from scratch.

---

## **Week 4: Trees - Basics & Traversal**

Trees are a cornerstone of FAANG interviews. This week builds the foundation, focusing on traversal algorithms and basic properties.

### **Day 22: Tree Traversal - DFS (Depth-First Search)**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Binary Tree Inorder Traversal | https://leetcode.com/problems/binary-tree-inorder-traversal/ | LeetCode | Easy | DFS (Inorder) | Binary Tree, Stack | **Recursive:** Trivial. **Iterative:** Use a stack. Go left as far as possible, pushing nodes onto the stack. When you can't go left, pop, visit the node, and go right. |  |
| Binary Tree Preorder Traversal | https://leetcode.com/problems/binary-tree-preorder-traversal/ | LeetCode | Easy | DFS (Preorder) | Binary Tree, Stack | **Recursive:** Trivial. **Iterative:** Use a stack. Push the root, then in a loop, pop a node, visit it, and push its right child then its left child (so the left is processed first). |  |
| Binary Tree Postorder Traversal | https://leetcode.com/problems/binary-tree-postorder-traversal/ | LeetCode | Easy | DFS (Postorder) | Binary Tree, Stack | **Iterative:** Use two stacks. The first stack performs a modified preorder (Root, Right, Left). Push results onto the second stack. The second stack will then contain the nodes in postorder. |  |

### **Day 23: Tree Traversal - BFS (Breadth-First Search)**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Binary Tree Level Order Traversal | https://leetcode.com/problems/binary-tree-level-order-traversal/ | LeetCode | Medium | BFS | Binary Tree, Queue | Use a queue. In a loop, get the size of the current level. Dequeue that many nodes, add their values to a list for the current level, and enqueue their children. |  |
| Binary Tree Zigzag Level Order Traversal | https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/ | LeetCode | Medium | BFS | Binary Tree, Queue | Same as standard level order, but use a flag to determine whether to add nodes to the level's list from left-to-right or right-to-left. |  |
| Binary Tree Right Side View | https://leetcode.com/problems/binary-tree-right-side-view/ | LeetCode | Medium | BFS / DFS | Binary Tree, Queue | **BFS:** Perform a level order traversal and add the last element of each level to the result. **DFS:** Traverse right-first. The first time you visit a new depth, that node is the rightmost one. |  |

### **Day 24 & 25: Tree Properties & Binary Search Trees (BST)**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Maximum Depth of Binary Tree | https://leetcode.com/problems/maximum-depth-of-binary-tree/ | LeetCode | Easy | DFS | Binary Tree | Recursively find the depth of left and right subtrees. The depth of the current node is `1 + max(left_depth, right_depth)`. |  |
| Same Tree | https://leetcode.com/problems/same-tree/ | LeetCode | Easy | DFS | Binary Tree | Recursively check if the current nodes are equal and if their left and right subtrees are also the same. |  |
| Invert Binary Tree | https://leetcode.com/problems/invert-binary-tree/ | LeetCode | Easy | DFS / BFS | Binary Tree | Recursively invert the left and right subtrees, then swap the left and right children of the current node. |  |
| Validate Binary Search Tree | https://leetcode.com/problems/validate-binary-search-tree/ | LeetCode | Medium | DFS with Range | Binary Tree | Use a recursive DFS. Pass down a valid range `(min, max)` for each node's value. For the left child, the new max is the parent's value. For the right child, the new min is the parent's value. |  |
| Kth Smallest Element in a BST | https://leetcode.com/problems/kth-smallest-element-in-a-bst/ | LeetCode | Medium | Inorder Traversal | Binary Tree, Stack | An inorder traversal of a BST visits nodes in sorted order. Perform an iterative inorder traversal and stop after visiting the k-th element. |  |
| Subtree of Another Tree | https://leetcode.com/problems/subtree-of-another-tree/ | LeetCode | Easy | DFS | Binary Tree | For each node in the main tree, check if the subtree rooted at that node is identical to the `subRoot`. Use a helper function for the identity check. |  |

### **Day 26, 27, & 28: Review & Path Sum Problems**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Path Sum | https://leetcode.com/problems/path-sum/ | LeetCode | Easy | DFS | Binary Tree | Use a recursive DFS. Subtract the current node's value from the target sum and recurse on the children. At a leaf node, check if the remaining sum is zero. |  |
| Path Sum II | https://leetcode.com/problems/path-sum-ii/ | LeetCode | Medium | DFS + Backtracking | Binary Tree, List | Use a recursive DFS, passing down the current path. When a valid path is found at a leaf, add a copy of the current path to the results. Backtrack by removing the node from the path after returning from the recursion. |  |
| Binary Tree Maximum Path Sum | https://leetcode.com/problems/binary-tree-maximum-path-sum/ | LeetCode | Hard | DFS with Global Max | Binary Tree | Use a recursive DFS. For each node, the function should return the max path sum starting from that node and going downwards. It should also update a global variable for the max path sum that can "bend" (i.e., go left-root-right). |  |

---

## **Weeks 5-13: Plan Continuation**

Of course. Here is the detailed plan for weeks 5 through 8.

---

### **Week 5: Trees - Advanced**

This week, we move beyond basic traversals to more complex tree-based data structures and algorithms, which are common in harder interview questions.

### **Day 29: Lowest Common Ancestor (LCA)**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Lowest Common Ancestor of a BST | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ | LeetCode | Easy | BST Properties | Binary Search Tree | Utilize BST properties. If both nodes `p` and `q` are smaller than the current node, go left. If both are larger, go right. Otherwise, the current node is the split point and thus the LCA. |  |
| Lowest Common Ancestor of a Binary Tree | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/ | LeetCode | Medium | Recursive DFS | Binary Tree | Use a recursive DFS. If the current node is null or matches `p` or `q`, return it. Recurse on left and right subtrees. If both recursive calls return non-null, the current node is the LCA. Otherwise, return the non-null result. |  |
| Lowest Common Ancestor of a Binary Tree II | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-ii/ | LeetCode | Medium | DFS + State | Binary Tree | Similar to LCA I, but you must first confirm both `p` and `q` exist in the tree. Use the recursive search and a counter or boolean flags to track if both nodes have been found. |  |
| Lowest Common Ancestor of a Binary Tree III | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-iii/ | LeetCode | Medium | Parent Pointers | Tree w/ Parent Pointers | Find the depths of both nodes. Move the deeper node up until it's at the same depth as the other. Then, move both nodes up simultaneously until they meet. This is the LCA. |  |

### **Day 30 & 31: Tries (Prefix Trees)**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Implement Trie (Prefix Tree) | https://leetcode.com/problems/implement-trie-prefix-tree/ | LeetCode | Medium | Trie Implementation | Trie Node (Object/Struct) | Implement a Trie class with a root node. Each node contains a map/array for children and a boolean to mark the end of a word. Implement `insert`, `search`, and `startsWith` by traversing the structure. |  |
| Design Add and Search Words Data Structure | https://leetcode.com/problems/design-add-and-search-words-data-structure/ | LeetCode | Medium | Trie + Backtracking | Trie Node | Use a Trie. For the search function, if the character is a '.', you must recursively try matching it with every existing child node (backtracking). |  |
| Word Search II | https://leetcode.com/problems/word-search-ii/ | LeetCode | Hard | Trie + DFS on Grid | Trie, 2D Array | 1. Build a Trie from the given words. 2. Perform a DFS from each cell on the board. 3. As you traverse the board, also traverse the Trie. 4. If you reach a node marking the end of a word, add it to the result. Prune the Trie after finding a word to avoid duplicates. |  |

### **Day 32: Constructing Trees from Traversals**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Construct Binary Tree from Preorder and Inorder Traversal | https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/ | LeetCode | Medium | Recursive Construction | Binary Tree, HashMap | The first element of preorder is the root. Find this root in the inorder traversal to determine the elements in the left and right subtrees. Recursively build the subtrees. Use a map to store inorder indices for O(1) lookup. |  |
| Construct Binary Tree from Inorder and Postorder Traversal | https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/ | LeetCode | Medium | Recursive Construction | Binary Tree, HashMap | The last element of postorder is the root. Find this root in the inorder traversal to determine the elements in the left and right subtrees. Recursively build the subtrees, processing the postorder array from right to left. |  |

### **Day 33: Serialization & Deserialization**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Serialize and Deserialize Binary Tree | https://leetcode.com/problems/serialize-and-deserialize-binary-tree/ | LeetCode | Hard | Preorder Traversal | Binary Tree, String, Queue | **Serialize:** Use a preorder traversal (DFS). Append node values to a string, using a special character (e.g., '#') for null nodes. **Deserialize:** Split the string into a list/queue. Use a recursive helper that takes from the queue to build the tree, following the same preorder structure. |  |
| Serialize and Deserialize BST | https://leetcode.com/problems/serialize-and-deserialize-bst/ | LeetCode | Medium | Preorder Traversal | BST, String | For a BST, you only need to store the preorder traversal. To deserialize, recursively build the tree, using upper and lower bounds to determine if the next value belongs to the left or right subtree. |  |

### **Day 34 & 35: Review & Catch-up**

Review the advanced tree patterns: **LCA, Tries, Construction, and Serialization**. These are complex topics, so ensure you can code the solutions from scratch. Try to explain the time and space complexity of each approach.

---

### **Week 6: Heaps & Priority Queues**

Heaps are perfect for problems involving ordering, finding min/max elements efficiently, and scheduling. Java's `PriorityQueue` is a direct implementation.

### **Day 36: Heap Basics & Top K Elements**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Kth Largest Element in a Stream | https://leetcode.com/problems/kth-largest-element-in-a-stream/ | LeetCode | Easy | Min-Heap | Heap (Priority Queue) | Maintain a min-heap of size `k`. When adding a new element, if the heap is smaller than `k`, add it. Otherwise, if the element is larger than the heap's minimum (the root), pop the root and add the new element. The root is always the k-th largest. |  |
| Last Stone Weight | https://leetcode.com/problems/last-stone-weight/ | LeetCode | Easy | Max-Heap | Heap | Use a max-heap to store all stone weights. In a loop, extract the two largest stones, smash them, and push the result (if non-zero) back into the heap. Continue until one or zero stones remain. |  |
| Top K Frequent Elements | https://leetcode.com/problems/top-k-frequent-elements/ | LeetCode | Medium | Heap + HashMap | Heap, HashMap | 1. Use a hash map to count the frequency of each element. 2. Use a min-heap of size `k` to store the `k` most frequent elements. The heap should be ordered by frequency. |  |
| Kth Largest Element in an Array | https://leetcode.com/problems/kth-largest-element-in-an-array/ | LeetCode | Medium | Min-Heap / Quickselect | Heap | **Heap:** Add all elements to a min-heap of size `k`. The root will be the k-th largest. **Quickselect:** A more optimal approach. Use the partitioning logic from quicksort to recursively find the k-th element in average O(N) time. |  |

### **Day 37 & 38: K-way Merge & Stream Median**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Merge k Sorted Lists | https://leetcode.com/problems/merge-k-sorted-lists/ | LeetCode | Hard | K-way Merge with Min-Heap | Heap, Linked List | Use a min-heap to store the first node of each of the `k` lists. Repeatedly extract the minimum node from the heap, add it to the result list, and if that node has a `next`, add the `next` node to the heap. |  |
| Find K Pairs with Smallest Sums | https://leetcode.com/problems/find-k-pairs-with-smallest-sums/ | LeetCode | Medium | K-way Merge with Min-Heap | Heap | This is a variation of k-way merge. The initial heap contains pairs `(nums1[i], nums2[0])` for all `i`. When you pop a pair `(u, v)` where `v` is `nums2[j]`, push the next pair `(u, nums2[j+1])` into the heap. |  |
| Find Median from Data Stream | https://leetcode.com/problems/find-median-from-data-stream/ | LeetCode | Hard | Two Heaps | Max-Heap, Min-Heap | Use two heaps: a max-heap for the smaller half of numbers (`lo`) and a min-heap for the larger half (`hi`). Keep the heaps balanced (sizes equal or `lo` is one larger). The median is either the top of `lo` or the average of the tops of both heaps. |  |

### **Day 39 & 40: More Heap Problems (Scheduling)**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Task Scheduler | https://leetcode.com/problems/task-scheduler/ | LeetCode | Medium | Greedy with Heap/Math | Heap, Queue | **Heap:** Use a max-heap to prioritize the most frequent tasks. Process a task, then put it in a waiting queue for `n` cycles before it can be added back to the heap. **Math:** A simpler solution involves calculating the idle slots based on the most frequent task. |  |
| Reorganize String | https://leetcode.com/problems/reorganize-string/ | LeetCode | Medium | Greedy with Heap | Heap, HashMap | Count character frequencies. Use a max-heap to always pick the most frequent character that is not the same as the previously appended character. |  |
| Process Tasks Using Servers | https://leetcode.com/problems/process-tasks-using-servers/ | LeetCode | Medium | Two Heaps | Two Min-Heaps | Use two min-heaps: one for available servers (sorted by weight, then index) and one for busy servers (sorted by finish time). At each task, move finished servers from the busy heap to the available heap. Assign the task to the best available server. |  |

### **Day 41 & 42: Review & Catch-up**

Heaps are versatile. Review the main patterns: **Top K, K-way Merge, Two Heaps for Median, and Greedy Scheduling**. Make sure you understand the time complexity implications of heap operations.

---

### **Week 7: Graphs - Basics & Traversal**

Graphs are used to model networks of all kinds. This week covers fundamental representations and traversal algorithms.

### **Day 43: Graph Representation & Cloning**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Clone Graph | https://leetcode.com/problems/clone-graph/ | LeetCode | Medium | DFS/BFS with Hashing | Graph, HashMap | Use a hash map to store the mapping from original nodes to their copies (`visited` map). This prevents getting stuck in cycles and re-cloning nodes. Perform a traversal (DFS or BFS). For each node, create its clone, add it to the map, and then recursively clone its neighbors. |  |

### **Day 44 & 45: Graph Traversal (BFS/DFS) & "Number of Islands" Pattern**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Number of Islands | https://leetcode.com/problems/number-of-islands/ | LeetCode | Medium | Grid Traversal (DFS/BFS) | Queue, 2D Array | Iterate through the grid. When you find a '1' that hasn't been visited, increment an island counter and start a traversal (DFS or BFS) from that cell to find all connected '1's, marking them as visited (e.g., by changing them to '0'). |  |
| Max Area of Island | https://leetcode.com/problems/max-area-of-island/ | LeetCode | Medium | Grid Traversal (DFS/BFS) | 2D Array | Same as Number of Islands, but the traversal function should return the size of the island it just explored. Keep a global max variable. |  |
| Walls and Gates | https://leetcode.com/problems/walls-and-gates/ | LeetCode | Medium | Multi-source BFS | Queue, 2D Array | Start a BFS from all gates simultaneously. Add all gate locations (0s) to the queue initially. The level of the BFS corresponds to the distance from the nearest gate. |  |
| Surrounded Regions | https://leetcode.com/problems/surrounded-regions/ | LeetCode | Medium | Border DFS/BFS | 2D Array | An 'O' is not surrounded if it's connected to an 'O' on the border. Start a traversal (DFS or BFS) from all 'O's on the border and mark all reachable 'O's (e.g., change them to 'T'). In a final pass, flip all remaining 'O's to 'X's and all 'T's back to 'O's. |  |

### **Day 46: Connectivity & Water Flow**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Pacific Atlantic Water Flow | https://leetcode.com/problems/pacific-atlantic-water-flow/ | LeetCode | Medium | Multi-source DFS/BFS from Borders | 2D Array, Set | Start traversals from the borders inwards. Use two boolean matrices, `pacific` and `atlantic`, to mark cells that can reach each ocean. A cell can reach an ocean if it's on the border or if it can flow to a neighbor that can reach the ocean (height must be non-decreasing from ocean to cell). The result is the intersection of the two matrices. |  |
| 01 Matrix | https://leetcode.com/problems/01-matrix/ | LeetCode | Medium | Multi-source BFS | Queue, 2D Array | Similar to Walls and Gates. Find all cells with 0 and add them to the BFS queue. The distance for these cells is 0. Then, perform a multi-source BFS to find the shortest distance to a 0 for all other cells. |  |

### **Day 47, 48, & 49: Review & Catch-up**

Graph traversals on grids are extremely common. Solidify your understanding of the **"Number of Islands" pattern** and its variations (Max Area, Surrounded Regions). Practice the "border-to-inward" traversal technique from Pacific-Atlantic.

---

### **Week 8: Graphs - Advanced Algorithms**

This week covers classic graph algorithms that are required for solving many optimization, scheduling, and connectivity problems.

### **Day 50: Topological Sort**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Course Schedule | https://leetcode.com/problems/course-schedule/ | LeetCode | Medium | Topological Sort (Cycle Detection) | Graph, Adjacency List, Array | This is a cycle detection problem in a directed graph. **Kahn's Algo (BFS):** Build an adjacency list and an in-degree array. Add all nodes with an in-degree of 0 to a queue. Process the queue, "removing" nodes and decrementing the in-degree of their neighbors. If a neighbor's in-degree becomes 0, add it to the queue. If the number of nodes processed equals the total number of nodes, there is no cycle. |  |
| Course Schedule II | https://leetcode.com/problems/course-schedule-ii/ | LeetCode | Medium | Topological Sort | Graph, Adjacency List, Array | Same as Course Schedule I, but you need to return the sorted order. The order in which nodes are processed (removed from the queue in Kahn's algorithm) is a valid topological sort. |  |
| Alien Dictionary | https://leetcode.com/problems/alien-dictionary/ | LeetCode | Hard | Topological Sort | Graph, Adjacency List, HashMap | 1. Infer dependency rules by comparing adjacent words (e.g., "wrt", "wrf" -> t > f). 2. Build a graph from these rules. 3. Perform a topological sort on the graph to find the character order. Handle invalid orderings (cycles). |  |

### **Day 51 & 52: Union-Find (Disjoint Set Union)**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Number of Connected Components in an Undirected Graph | https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/ | LeetCode | Medium | Union-Find | Union-Find (Array) | Implement a Union-Find data structure with path compression and union by rank/size for efficiency. Initialize with `n` components. Iterate through the edges, and for each edge `(u, v)`, perform a `union` operation. If `u` and `v` were not already connected, decrement the component count. |  |
| Graph Valid Tree | https://leetcode.com/problems/graph-valid-tree/ | LeetCode | Medium | Union-Find | Union-Find (Array) | For a graph to be a valid tree, it must have `n-1` edges and be fully connected (i.e., have only one connected component). Use Union-Find. Iterate through edges; if you try to union two nodes that are already in the same set, you've found a cycle, so it's not a tree. After, check if there's only one component. |  |
| Redundant Connection | https://leetcode.com/problems/redundant-connection/ | LeetCode | Medium | Union-Find | Union-Find (Array) | Iterate through the edges. For each edge, if the two nodes are already in the same component (checked using `find`), then adding this edge creates a cycle. This is the redundant connection to return. Otherwise, perform the `union`. |  |
| Accounts Merge | https://leetcode.com/problems/accounts-merge/ | LeetCode | Medium | Union-Find | Union-Find, HashMap | Use Union-Find to group indices of accounts. Create maps from each email to the index of the first account containing it. If an email is seen again, union the current account index with the previously seen index. After processing all accounts, iterate through the accounts again, grouping emails by their root parent in the Union-Find structure. |  |

### **Day 53 & 54: Shortest Path & Minimum Spanning Tree (MST)**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Min Cost to Connect All Points | https://leetcode.com/problems/min-cost-to-connect-all-points/ | LeetCode | Medium | Minimum Spanning Tree (MST) | Graph, Union-Find | This is a classic MST problem. 1. Calculate all possible edges (Manhattan distances between all pairs of points). 2. Use Kruskal's algorithm: Sort all edges by weight and use Union-Find to add edges that connect two previously unconnected components, until all points are connected. |  |
| Network Delay Time | https://leetcode.com/problems/network-delay-time/ | LeetCode | Medium | Dijkstra's Algorithm | Graph, Adjacency List, Min-Heap | Use Dijkstra's algorithm to find the shortest path from the source node `k` to all other nodes. A min-heap is used to efficiently select the unvisited node with the smallest distance. The answer is the maximum shortest distance to any node. If any node is unreachable, return -1. |  |
| Cheapest Flights Within K Stops | https://leetcode.com/problems/cheapest-flights-within-k-stops/ | LeetCode | Medium | Modified Dijkstra's / Bellman-Ford | Graph, Adjacency List, Min-Heap | A standard Dijkstra's won't work because of the `k` stops constraint. Use a modified Dijkstra's where the state in the priority queue is `(cost, city, stops)`. Don't revisit a city if you've already found a cheaper or equivalent path with fewer or equal stops. |  |

### **Day 55 & 56: Review & Catch-up**

The algorithms in this week are classics. Make sure you can implement **Topological Sort (Kahn's), Union-Find (with optimizations), and Dijkstra's** from scratch. Understand the use case for each: TopoSort for dependencies, Union-Find for connectivity, and Dijkstra's for shortest paths in weighted graphs with non-negative edges.

Of course. Here is the detailed study plan for the final part of your preparation, weeks 9 through 13, formatted as Markdown.

### **Week 9: Dynamic Programming - Basics**

Dynamic Programming (DP) is a crucial topic. This week focuses on recognizing DP patterns and understanding the difference between top-down (memoization) and bottom-up (tabulation) approaches.

### **Day 57 & 58: 1D Dynamic Programming**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Climbing Stairs | https://leetcode.com/problems/climbing-stairs/ | LeetCode | Easy | 1D DP (Fibonacci Style) | Array / Variables | The number of ways to reach step `n` is `ways(n-1) + ways(n-2)`. This is the Fibonacci sequence. Solvable with a DP array or optimized to use just two variables. |  |
| Min Cost Climbing Stairs | https://leetcode.com/problems/min-cost-climbing-stairs/ | LeetCode | Easy | 1D DP | Array | `dp[i]` is the min cost to reach step `i`. `dp[i] = cost[i] + min(dp[i-1], dp[i-2])`. The final answer is `min(dp[n-1], dp[n-2])`. |  |
| House Robber | https://leetcode.com/problems/house-robber/ | LeetCode | Medium | 1D DP | Array | `dp[i]` is the max money robbed up to house `i`. The recurrence is `dp[i] = max(dp[i-1], dp[i-2] + nums[i])`, representing the choice to either rob house `i` or skip it. |  |
| House Robber II | https://leetcode.com/problems/house-robber-ii/ | LeetCode | Medium | 1D DP | Array | The problem breaks down into two separate House Robber I problems, since the first and last houses are adjacent: 1. Rob houses 0 to n-2. 2. Rob houses 1 to n-1. The answer is the max of these two. |  |
| Decode Ways | https://leetcode.com/problems/decode-ways/ | LeetCode | Medium | 1D DP | Array | `dp[i]` is the number of ways to decode the string up to index `i`. A character can be decoded alone (if not '0') or with the previous character (if they form a number 10-26). `dp[i] = dp[i-1]` (for one-digit) `+ dp[i-2]` (for two-digit). |  |

### **Day 59 & 60: 2D Dynamic Programming**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Unique Paths | https://leetcode.com/problems/unique-paths/ | LeetCode | Medium | 2D DP (Grid) | 2D Array | `dp[i][j]` is the number of paths to cell `(i, j)`. The recurrence is `dp[i][j] = dp[i-1][j] + dp[i][j-1]`. The base cases are the first row and column, which have 1 path each. |  |
| Unique Paths II | https://leetcode.com/problems/unique-paths-ii/ | LeetCode | Medium | 2D DP (Grid) | 2D Array | Same as Unique Paths, but if a cell `(i, j)` has an obstacle, `dp[i][j] = 0`. This will propagate through the calculations. |  |
| Minimum Path Sum | https://leetcode.com/problems/minimum-path-sum/ | LeetCode | Medium | 2D DP (Grid) | 2D Array | `dp[i][j]` is the minimum path sum to cell `(i, j)`. The recurrence is `dp[i][j] = grid[i][j] + min(dp[i-1][j], dp[i][j-1])`. |  |

### **Day 61 & 62: DP on Subsequences**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Longest Common Subsequence | https://leetcode.com/problems/longest-common-subsequence/ | LeetCode | Medium | 2D DP | 2D Array | `dp[i][j]` is the LCS of `text1[0...i-1]` and `text2[0...j-1]`. If `text1[i-1] == text2[j-1]`, `dp[i][j] = 1 + dp[i-1][j-1]`. Otherwise, `dp[i][j] = max(dp[i-1][j], dp[i][j-1])`. |  |
| Longest Increasing Subsequence | https://leetcode.com/problems/longest-increasing-subsequence/ | LeetCode | Medium | 1D DP | Array | `dp[i]` is the length of the LIS ending at index `i`. To compute `dp[i]`, iterate from `j = 0 to i-1`. If `nums[i] > nums[j]`, then `dp[i] = max(dp[i], dp[j] + 1)`. An O(N log N) solution also exists using patience sorting. | Done |
| Coin Change | https://leetcode.com/problems/coin-change/ | LeetCode | Medium | 1D DP | Array | `dp[i]` is the minimum number of coins to make amount `i`. To compute `dp[i]`, `dp[i] = min(dp[i], dp[i - coin] + 1)` for each coin in the `coins` array. | Done |

### **Day 63: Review & Catch-up**

DP is all about recognizing the pattern. Review the problems from this week. For each one, ask: What is the state? What is the recurrence relation? What are the base cases?

---

### **Week 10: Dynamic Programming - Advanced**

This week builds on the DP foundation with more complex patterns like knapsack, palindromes, and state machines.

### **Day 64 & 65: Knapsack & Combination Sum Patterns**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Partition Equal Subset Sum | https://leetcode.com/problems/partition-equal-subset-sum/ | LeetCode | Medium | 0/1 Knapsack | 1D DP Array / Set | This can be reduced to the subset sum problem. Find if there is a subset that sums up to `total_sum / 2`. The DP state `dp[i]` can represent whether sum `i` is achievable. |  |
| Combination Sum IV | https://leetcode.com/problems/combination-sum-iv/ | LeetCode | Medium | Unbounded Knapsack | 1D DP Array | `dp[i]` is the number of combinations that sum up to `i`. The recurrence is `dp[i] = sum(dp[i - num])` for each `num` in the input array, as we can reuse numbers. |  |
| Coin Change II | https://leetcode.com/problems/coin-change-ii/ | LeetCode | Medium | Unbounded Knapsack | 1D DP Array | `dp[j]` is the number of ways to make amount `j`. To avoid duplicate combinations, iterate through coins one by one and update the DP table for each coin. `dp[j] += dp[j - coin]`. |  |

### **Day 66 & 67: Palindromic DP & Edit Distance**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Longest Palindromic Substring | https://leetcode.com/problems/longest-palindromic-substring/ | LeetCode | Medium | Expand Around Center | String | A non-DP but common approach. Iterate through the string, and for each character, expand outwards to find the longest palindrome centered there (for both odd and even length palindromes). |  |
| Palindromic Substrings | https://leetcode.com/problems/palindromic-substrings/ | LeetCode | Medium | Expand Around Center | String | Same "Expand Around Center" technique as above, but instead of tracking the max length, you increment a counter for every valid palindrome found. |  |
| Edit Distance | https://leetcode.com/problems/edit-distance/ | LeetCode | Hard | 2D DP | 2D Array | `dp[i][j]` is the min edit distance between `word1[0...i-1]` and `word2[0...j-1]`. If `word1[i-1] == word2[j-1]`, `dp[i][j] = dp[i-1][j-1]`. Otherwise, `dp[i][j] = 1 + min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1])` (for delete, insert, replace). |  |

### **Day 68 & 69: Advanced DP Problems**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Best Time to Buy and Sell Stock with Cooldown | https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/ | LeetCode | Medium | State Machine DP | Variables | Track three states: `held` (max profit if holding a stock), `sold` (max profit if just sold), and `reset` (max profit if not holding and not in cooldown). Define transitions between these states. |  |
| Word Break | https://leetcode.com/problems/word-break/ | LeetCode | Medium | 1D DP | 1D DP Array, Set | `dp[i]` is true if the string `s[0...i-1]` can be segmented. To compute `dp[i]`, check if `dp[j]` is true and the substring `s[j...i-1]` is in the dictionary, for all `j < i`. |  |
| Burst Balloons | https://leetcode.com/problems/burst-balloons/ | LeetCode | Hard | DP with Intervals | 2D DP Array | `dp[i][j]` is the max coins from bursting balloons in the range `[i, j]`. The key is to think about which balloon to burst *last* in an interval `(i, j)`. Let this be `k`. The score is `dp[i][k] + nums[i]*nums[k]*nums[j] + dp[k][j]`. |  |

### **Day 70: Review & Catch-up**

Advanced DP can be tough. Re-read the solutions for the hard problems and try to derive the recurrence relations yourself. Understanding the state transitions in the "Cooldown" problem is key for state machine DP.

---

### **Week 11: Backtracking**

Backtracking is a methodical way of trying out different sequences of decisions, for problems that require exploring all possible solutions (like subsets, permutations, and constraint satisfaction).

### **Day 71 & 72: Subsets & Combinations**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Subsets | https://leetcode.com/problems/subsets/ | LeetCode | Medium | Backtracking | Array, List | Use a recursive backtracking function. In each call, you have two choices for the current element: either include it in the current subset and recurse, or not include it and recurse. |  |
| Subsets II | https://leetcode.com/problems/subsets-ii/ | LeetCode | Medium | Backtracking | Array, List | Same as Subsets, but you must handle duplicates. Sort the input array first. In the recursion, if the current element is the same as the previous one, only consider including it if the previous one was also included. |  |
| Combinations | https://leetcode.com/problems/combinations/ | LeetCode | Medium | Backtracking | Array, List | Similar to Subsets, but you need to generate combinations of a specific size `k`. The recursive function takes the current combination and a starting index to build upon. |  |
| Combination Sum | https://leetcode.com/problems/combination-sum/ | LeetCode | Medium | Backtracking | Array, List | Use backtracking. In the recursive function, you can either include the current number again (since numbers can be reused) or move to the next number. Prune branches where the sum exceeds the target. |  |

### **Day 73 & 74: Permutations & Backtracking on Grids**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Permutations | https://leetcode.com/problems/permutations/ | LeetCode | Medium | Backtracking | Array, List | Use a backtracking function. Keep track of used elements (e.g., with a boolean array or by swapping elements) to avoid duplicates in a single permutation. |  |
| Permutations II | https://leetcode.com/problems/permutations-ii/ | LeetCode | Medium | Backtracking | Array, List, HashMap | Handle duplicates. Sort the input array. In the recursion, if the current element is the same as the previous one, skip it if the previous one hasn't been used in this path. A frequency map can also be used. |  |
| Word Search | https://leetcode.com/problems/word-search/ | LeetCode | Medium | Backtracking on Grid | 2D Array | Start a DFS from each cell. In the DFS, explore neighbors to find the next character of the word. Mark visited cells (e.g., by changing the character) to avoid cycles and unmark them when backtracking. |  |

### **Day 75 & 76: Harder Backtracking Problems**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| N-Queens | https://leetcode.com/problems/n-queens/ | LeetCode | Hard | Backtracking | 2D Array / Sets | A classic backtracking problem. Try to place a queen in each row, one by one. For each placement, check if it's valid (not attacked by other queens). Use sets or boolean arrays to keep track of occupied columns and diagonals for O(1) validity checks. |  |
| Sudoku Solver | https://leetcode.com/problems/sudoku-solver/ | LeetCode | Hard | Backtracking | 2D Array | Write a recursive function that tries to fill the board. Find the next empty cell. Try placing numbers 1-9 in it. For each valid placement, recurse. If the recursion returns true, you've found a solution. If not, backtrack by resetting the cell to empty. |  |

### **Day 77: Review & Catch-up**

The core of backtracking is the "choose, explore, unchoose" pattern. Draw the recursion tree for a small example of Subsets or Permutations to solidify your understanding.

---

### **Week 12: System Design & Miscellaneous Topics**

This week covers important miscellaneous topics and introduces the fundamentals of system design, a key component of FAANG interviews, especially for experienced roles.

### **Day 78 & 79: System Design Fundamentals**

| Topic / Problem | Problem Link | Problem Source | Difficulty | Problem Pattern | Key Concepts | Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| System Design Concepts | - | General | - | High-Level Design | Scalability, Availability, Latency, Consistency, CAP Theorem, Load Balancing, Caching, Databases (SQL vs NoSQL) | Watch introductory videos (e.g., Gaurav Sen, System Design Interview channel) or read articles on these core concepts. Understand the trade-offs. |  |
| Design TinyURL | https://leetcode.com/problems/design-tinyurl/ | LeetCode | Medium | System Design | Hashing, Key-Value Store, API Design, Scalability | This is a classic system design question. Think about: 1. How to generate a unique short key for a long URL (e.g., hashing + collision resolution, base-62 encoding of a counter). 2. How to store the mapping. 3. How to handle high read traffic (caching). 4. API endpoints (`POST /create`, `GET /{short_key}`). |  |

### **Day 80 & 81: Interval Problems**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Merge Intervals | https://leetcode.com/problems/merge-intervals/ | LeetCode | Medium | Sorting + Merging | Array | Sort the intervals by their start time. Iterate through the sorted intervals and merge overlapping ones. If the current interval overlaps with the last one in the result list, merge them; otherwise, add it as a new interval. |  |
| Insert Interval | https://leetcode.com/problems/insert-interval/ | LeetCode | Medium | Merging | Array | Find the correct position to insert the new interval. Then, merge it with any overlapping intervals before and after it. A simpler approach is to add the new interval and then just call the Merge Intervals logic. |  |
| Non-overlapping Intervals | https://leetcode.com/problems/non-overlapping-intervals/ | LeetCode | Medium | Greedy | Array | This is a classic interval scheduling problem. To maximize the number of non-overlapping intervals (and thus minimize removals), sort the intervals by their *end* times. Greedily pick the interval that finishes first, then find the next interval that starts after the first one ends. |  |
| Meeting Rooms II | https://leetcode.com/problems/meeting-rooms-ii/ | LeetCode | Medium | Heaps / Chronological Ordering | Min-Heap, Array | **Heap:** Sort intervals by start time. Use a min-heap to store the end times of meetings currently in progress. For each new meeting, if its start time is after the earliest end time in the heap, you can reuse a room (pop from heap). Then, add the new meeting's end time. The heap's max size is the answer. |  |

### **Day 82 & 83: Bit Manipulation**

| Problem Name | Problem Link | Problem Source | Difficulty | Problem Pattern | Data Structures Used | Solution Description | Completion |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Number of 1 Bits | https://leetcode.com/problems/number-of-1-bits/ | LeetCode | Easy | Bitwise Operations | Integer | Use a loop and a bitwise AND (`&`) to check the last bit. Then right-shift the number. A common trick is `n & (n - 1)`, which unsets the rightmost set bit; count how many times you can do this until `n` becomes 0. |  |
| Counting Bits | https://leetcode.com/problems/counting-bits/ | LeetCode | Easy | Bitwise DP | Array | `dp[i]` is the number of 1s in `i`. Notice the pattern: `dp[i] = dp[i >> 1] + (i & 1)`. The number of 1s in `i` is the same as in `i/2`, plus one if `i` is odd. |  |
| Reverse Bits | https://leetcode.com/problems/reverse-bits/ | LeetCode | Easy | Bitwise Operations | Integer | Iterate 32 times. In each iteration, take the last bit of the input number `n` and append it to the result. Do this by left-shifting the `result` and then OR-ing it with the bit. Then, right-shift `n`. |  |
| Sum of Two Integers | https://leetcode.com/problems/sum-of-two-integers/ | LeetCode | Medium | Bitwise Operations | Integer | Simulate binary addition. The sum without carry is `a ^ b` (XOR). The carry is `(a & b) << 1` (AND, then left shift). Repeat this process with the sum and carry until the carry becomes 0. |  |

### **Day 84: Review & Catch-up**

Review the interval patterns (sorting by start vs. end time) and the bit manipulation tricks. Spend more time on system design concepts, as they are less about code and more about high-level thinking.

---

### **Week 13: Final Review & Mock Interviews**

The final week is for consolidation, practice under pressure, and building confidence.

- **Day 85: Mock Interview 1.**
    - Use a platform like Pramp or interview with a peer.
    - Focus on articulating your thought process clearly from the moment you see the problem.
    - Afterward, review your performance. Did you understand the problem correctly? Did you explore trade-offs? Was your code clean?
- **Day 86: Weakest Area Review.**
    - Based on your mock interview and the past 12 weeks, identify your single weakest topic (e.g., Graphs, Advanced DP).
    - Spend this day doing 3-4 medium problems exclusively from that topic. Go back to the basics and rebuild your confidence.
- **Day 87: Mock Interview 2.**
    - Do another mock interview. Try to apply lessons from the first one.
    - Focus on speed and accuracy. Try to get to a working solution, then discuss optimizations.
- **Day 88: Review Top Patterns.**
    - Quickly review the most important patterns: Sliding Window, Two Pointers, BFS/DFS on Grids/Trees, Topological Sort, Union-Find, Top K with Heaps, 1D DP, Backtracking template.
    - Don't solve full problems, just read the problem and verball describe the pattern and approach you would take.
- **Day 89: System Design Mock Interview.**
    - If possible, do a mock interview focused *only* on system design.
    - Practice drawing diagrams and explaining your component choices. Be prepared to justify every decision.
    - If you can't do a mock, pick a common problem (e.g., Design Instagram, Design a Ride-Sharing App) and talk through it out loud for 45 minutes.
- **Day 90: Rest & Final Prep.**
    - Do not cram. Do one or two easy problems to stay warm.
    - Review your "elevator pitch" about your experience and projects. Prepare questions to ask your interviewers.
    - Get a good night's sleep. Your brain needs to be rested and sharp.

Good luck\! You've put in the work, now it's time to perform.
