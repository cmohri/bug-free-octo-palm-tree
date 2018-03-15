bug-free-octo-palm-tree

Kashf Mashrafi

John Liu

Clara Mohri


# L #01: What Does the Data Say?

## Background
  Quicksort is a a sorting alorithm that sorts recursively. It uses a helper method, partition, which takes as arguments the array, a left bound index, *a*, right bound index, *b*. Partition then randomly generates a *pivot point*, which is an index between a and b. Then, it will place the pivot point in its final resting position, and return the number of items in the array to the left of pivot point, which are all smaller than the pivot point. Using this, we can now break up the array into at most two smaller subsections: one to the left of the pivot point, and one to the right of the pivot point. Recursively, quicksort will keep sorting the left and right sides until left and right converge. 

## Hypothesis

  We believe that the best case for quicksort is when the array is already sorted. We predict that the running time will be O(nlogn) for this. 
  We believe that the worst case for quicksort is when the array is descending order. We predict that the running time will be O(n^2) for this.

## Experiment Methodology
  Because we believe that the above-mentioned cases are the best and worst cases, we will run tests on these cases, and continually change the size of the array so as to see how running time increases when array size increases. We will in no way change the pivot point, because our algorithm uses a randomly generated pivot point.
  We will start with an array of size 100, and then increase the size by increments of 5 until we reach 10,000, which is the maximum size of an array of integer allowed by Java. For each size, we will create a new array of the tested nature (in order, in reverse order, random order) and sort it three times. We will record the time right before calling the sort method, and right after the sort method. The average for the three running times will be recorded alongside the size of the array.

## Results 
  The raw data results can be founded in the three .csv files contained in this repo..

## Conclusions

