# dsa-java

A hand-built Data Structures & Algorithms practice repo in Java — part of a
structured prep track combining DSA, OOP, and Java fluency.

## Purpose

This repo isn't just solved LeetCode problems. It's where I build real
understanding of how data structures and algorithms actually work, by
implementing them myself in Java before relying on the language's built-in
versions — and by practicing without AI assistance so the fluency is real,
not borrowed.

## Rules

1. **Hand-built before built-in.** Every data structure is implemented from
   scratch as a proper Java class (real encapsulation, constructors,
   methods) before I use `java.util`'s version of it. The built-in version
   only gets used once I understand what it's doing underneath.

2. **No AI for core logic.** Implementations and problem solutions in this
   repo are written cold — no Copilot, no ChatGPT, no autocomplete
   suggestions accepted for the actual logic. AI is only used afterward,
   as a reviewer ("what would a strict reviewer flag here?"), never as
   the author.

3. **Tested, not just working.** Structures and algorithms here include
   JUnit tests, not just a `main` method that happens to print the right
   thing once.

4. **Documented tradeoffs.** Each structure/algorithm's section notes its
   time and space complexity, and why I chose the approach I did.

## Structure

```
/arrays        - array-based structures and problems
/linkedlists    - singly/doubly linked list implementations
/stacks-queues  - stack and queue implementations
/trees          - binary trees, BSTs, traversals
/hashmaps       - hash map implementation and problems
/graphs         - graph representations and traversal algorithms
/sorting        - sorting algorithm implementations
```

Each folder contains its own short README documenting what's inside and
what I learned building it.

## Log

Ongoing weekly notes on what was built, what was hard, and what to revisit
live in [`LOG.md`](./LOG.md).
