# Insertion Sort
* a method insertionSort takes an array as a parameter and return the array sorted


![pesodu code](../assets/psedu.png)

## Java Code 
>public static int[] insertionSort(int[] arr){
> 
>for (int i = 1; i < arr.length; i++) {
> 
>int j = i-1;
> 
>int temp = arr[i];
>
>           while (j>=0 && temp< arr[j])
> 
>           {
> 
>              arr[j+1] = arr[j];
> 
>              j = j-1;
> 
>          }
> 
>          arr[j+1] = temp;
> 
>      }
> 
>      return arr;
> 
> }
>
> 

## Tracing


![first array trace](../assets/firstarr.jpg)

![second array trace](../assets/nearlyarr.jpg)

![third array trace](../assets/revarr.jpg)

![forth array trace](../assets/uniarr.jpg)