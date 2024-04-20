# Sorting Algorithms

## Bubble Sort

Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass-through is repeated until no swaps are needed, indicating that the list is sorted.

## Selection Sort

Selection Sort divides the input list into two parts: a sorted sublist and an unsorted sublist. It repeatedly selects the smallest (or largest, depending on the sorting order) element from the unsorted sublist and swaps it with the first unsorted element. This process continues until the entire list is sorted.

## Insertion Sort

Insertion Sort builds the final sorted list one element at a time. It takes each element from the unsorted part of the list and inserts it into its correct position in the sorted part of the list, shifting elements as necessary.

## Merge Sort

Merge Sort is a divide-and-conquer algorithm. It divides the input list into two halves, sorts each half recursively, and then merges the sorted halves to produce a sorted list.

## Quick Sort

Quick Sort is another divide-and-conquer algorithm. It selects a pivot element, partitions the list into two sublists (elements smaller than the pivot and elements larger than the pivot), and recursively sorts the sublists. The pivot element is then placed in its final sorted position.

## Heap Sort

Heap Sort is based on the heap data structure. It first builds a max-heap (for ascending order) or min-heap (for descending order) from the input list. It repeatedly extracts the root element (which is the largest or smallest depending on the heap type) and rebuilds the heap until the list is sorted.

## Radix Sort

Radix Sort is a non-comparative sorting algorithm that sorts numbers by processing individual digits. It processes the digits of the numbers from the least significant digit (LSD) to the most significant digit (MSD) using counting sort or bucket sort as a subroutine.

## Bucket Sort

Bucket Sort is a distribution sort algorithm that distributes elements of an input list into a finite number of buckets. Each bucket is then sorted individually, either using a different sorting algorithm or recursively using bucket sort.
