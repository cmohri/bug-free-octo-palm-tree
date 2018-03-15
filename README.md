bug-free-octo-palm-tree


Kashf Mashrafi

John Liu

Clara Mohri

# L #01: What Does the Data Say?

## Background
  Quicksort is a a sorting alorithm that sorts recursively. It uses a helper method, partition, which takes as arguments the array, a left bound index, *a*, right bound index, *b*. Partition then randomly generates a *pivot point*, which is an index between a and b. Then, it will place the pivot point in its final resting position, and return the number of items in the array to the left of pivot point, which are all smaller than the pivot point. Using this, we can now look at two smaller subsections: one to the left of the pivot point, and one to the right of the pivot point. Recursively, quicksort will keep sorting smaller subsections of the array for as long as the left bound is smaller than the right bound, resulting is a sorted array.

## Hypothesis

  We believe that the best case for quicksort is when the array is already sorted. We predict that the running time will be O(nlogn) for this. 
  We believe that the worst case for quicksort is when the array is descending order. We predict that the running time will be O(n^2) for this.

## Experiment Methodology
  Because we believe that the above-mentioned cases are the best and worst cases, we will run tests on these cases, and continually change the size of the array so as to see how running time increases when array size increases. We will in no way change the pivot point, because our algorithm uses a randomly generated pivot point.
  We will start with an array of size 100, and then increase the size by increments of 5 until we reach 10,000, which is the maximum size of an array of integer allowed by Java. For each size, we will create a new array of the tested nature (in order, in reverse order, random order) and sort it three times. We will record the time right before calling the sort method, and right after the sort method. The average for the three running times will be recorded alongside the size of the array.

## Results 
  The raw data results can be founded in the three .csv files contained in this repo. Here are the plots of the data, all together and then plotted separately: 

*Chart of All Data*

![alt text](https://github.com/cmohri/bug-free-octo-palm-tree/blob/master/AllTimes.png) 

*Chart of Reverse Order Arrays*

![alt text](https://github.com/cmohri/bug-free-octo-palm-tree/blob/master/Reversetimes.png)

*Chart of Ordered Arrays*

![alt text](https://github.com/cmohri/bug-free-octo-palm-tree/blob/master/SortedOrder.png)

*Chart of Randomly Arranged Arrays*

![alt text](https://github.com/cmohri/bug-free-octo-palm-tree/blob/master/Shufflegraph.png)

**

## Further Inquiry 
  We found the results for the randomly ordered array to be strange because of the difference in running time relative to the sorted and reverse order list running times. Therefore, we decided to test randomly ordered arrays in a different way as well. We created a constant array of size 10,000, and a test array. The test array copied increasing amounts of items from the constant array, and then sorted those items. We ran this twenty times for each size (each time resetting the test array) and recorded the mean running time for each size. 
  
  The plot below displays data for ten different arrays, each following the above descrived methodology.  
![alt text](https://github.com/cmohri/bug-free-octo-palm-tree/blob/master/samearraylargersize.png)

Here we see that the data does in fact resemble the randomly arranged arrays plot as shown in the Results section, and that it is neither a linear function nor a n^2 function.


## Running Time Classification
  Because of our randomized pivot point, there is no best case. There is not best case because we don't know how the pivot point will relate to the array that our quicksort method is sorting. 
  However, there does seem to be a bad case running time of O(n^2), as evidenced by the reverse-order arrays that overall were very much resembling n^2 in their plot, and also based on the trendline which has an R^2 of nearly 1. This could be because the pivot point chosen at first having to swap every single item from one of it's sides to the other, and then continuing. 
  Overall, clearly the running time is not O(n^2). We see that already for a sorted array, although the running time is much higher, the running time is not as close to O(n^2) like a reverse order array, because R^2 becomes approximately 0.98. The programs that we had access to did not allow us to create trend lines of O(nlogn), but we still assert that on average the running time for a randomized quick sort is O(nlogn). As the plot of the shuffled (random) arrays' running times shows, we see that there is a lower bound that even resembles a linear function, whereas the upper bound increases in difference with the lower bound as n increases. Arguably, this resembles as O(nlogn) function. Furthermore, if we assume that on average, a random pivot point will divide an array into equal portions, and we know that for each portion partition will be called, which has running time O(n), then we can say that on average, partition will be called logn times. This leads to an average running time of O(nlogn).
  
## Conclusions
  With a randomized pivot point, there is no true best-case or worst-case, because a randomized pivot point will randomly divide the array. However, an average running time can be assessed, using the reasoning stated in *Running Time Classification*, which justifies that the average expected running time for a randomized quick sort is O(nlogn).

