# String Matching Algorithms

## Naive String Matching

Naive String Matching is a simple string matching algorithm that checks for a pattern within a text by sliding the pattern one character at a time and comparing it with the corresponding characters in the text. It has a time complexity of O(m * n), where m is the length of the pattern and n is the length of the text.

## Knuth-Morris-Pratt (KMP) Algorithm

The Knuth-Morris-Pratt (KMP) Algorithm is an efficient string matching algorithm that avoids unnecessary character comparisons by utilizing information from previous matches. It preprocesses the pattern to construct a prefix function or failure function, which helps skip comparisons when a mismatch occurs. It has a time complexity of O(m + n), where m is the length of the pattern and n is the length of the text.

## Rabin-Karp Algorithm

The Rabin-Karp Algorithm is a string matching algorithm that uses hashing to efficiently search for a pattern within a text. It calculates hash values for the pattern and substrings of the text and compares these hash values to identify potential matches. It has an average-case time complexity of O(n + m), where n is the length of the text and m is the length of the pattern.

## Boyer-Moore Algorithm

The Boyer-Moore Algorithm is a highly efficient string matching algorithm that scans the text from right to left and uses information from the pattern to skip comparisons and make jumps when mismatches occur. It incorporates two main heuristics, the bad character rule and the good suffix rule, to optimize the search process. It has a time complexity of O(n + m), where n is the length of the text and m is the length of the pattern.



# Numerical Algorithms

## Euclidean Algorithm (for finding GCD)

The Euclidean Algorithm is a method for finding the greatest common divisor (GCD) of two integers. It repeatedly applies the property that the GCD of two numbers also divides their difference, efficiently reducing the problem until a solution is reached. It has a time complexity of O(log(min(a, b))), where a and b are the input integers.

## Primality Testing (using Miller-Rabin)

Primality Testing is a method for determining whether a given number is prime. The Miller-Rabin Algorithm is a probabilistic primality test that checks whether a number is likely prime based on a set of randomly chosen witnesses. It has a high probability of correctly identifying primes but may occasionally give false positives. It has a time complexity of O(k * log^3(n)), where k is the number of iterations and n is the input number.

## Fast Fourier Transform (FFT)

The Fast Fourier Transform (FFT) is an efficient algorithm for computing the Discrete Fourier Transform (DFT) of a sequence or array of numbers. It converts a time-domain representation of a signal into its frequency-domain representation, enabling efficient analysis and processing of signals. It has a time complexity of O(n log n), where n is the number of input elements.

## Karatsuba Algorithm (for fast multiplication of large numbers)

The Karatsuba Algorithm is a divide-and-conquer algorithm for multiplying large numbers efficiently. It divides the input numbers into smaller parts, performs recursive multiplications, and combines the results using addition and shifts. It has a time complexity of approximately O(n^1.59), making it faster than the traditional multiplication algorithm for large numbers.


