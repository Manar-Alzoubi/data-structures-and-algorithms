# Binary Search of Sorted Array

write function  "BinarySearch" which takes 2 parameters: the first is sorted array and the second is search key, return the index of the array’s element that is equal to the value of the search key, or -1 if the element is not in the array.




## Whiteboard Process
![Reverse Array](/assets/BinarySearch.jpg)



## Approach & Efficiency
since the array is sorted, the approach is to divide the array into two halfs , and determine  the element is in which half, then divide the half of array in which the element is into two halfs and compare to the middle element ,if the element is greater than the middle search on the greater half else search in the smaller half and repeate until you find the element , if it is not exist return -1