# Searching Algorithms

## Linear Search

Linear Search is a simple search algorithm that sequentially checks each element in a list until a match is found or the entire list has been searched. It works well for small lists or unsorted lists but is inefficient for large lists as it has a time complexity of O(n).

## Binary Search

Binary Search is an efficient search algorithm for sorted lists. It works by repeatedly dividing the search interval in half until the target element is found or the interval is empty. It has a time complexity of O(log n), making it suitable for large sorted lists.

## Interpolation Search

Interpolation Search is an improved version of Binary Search for uniformly distributed sorted lists. Instead of always dividing the search interval in half, it estimates the position of the target element based on its value and the values at the ends of the interval. It has an average-case time complexity of O(log log n) when elements are uniformly distributed.

## Jump Search

Jump Search is a search algorithm that works on sorted lists. It jumps ahead by a fixed step size and then performs linear search in the current interval until the target element is found or the end of the list is reached. It combines the advantages of linear search and binary search and has a time complexity of O(√n) for uniformly distributed lists.

