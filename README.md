# 99 Scala Problems

These are an adaptation of the Ninety-Nine Prolog Problems written by Werner Hett at the Berne University of Applied Sciences in Berne, Switzerland.

I, [Tony Zhou](https://www.linkedin.com/in/tonyzhou), have altered them to be more amenable to program and practice in Scala.

The problems have different levels of difficulty.

1. Those marked with a single asterisk (*) are easy.
2. Problems marked with two asterisks (**) are of intermediate difficulty.
3. Problems marked with three asterisks (***) are more difficult.


## [Working with lists](https://github.com/zjt1114/scala99/tree/master/src/main/scala/list)

In Scala, lists are objects of type List[A], where A can be any type. 
Lists are effective for many recursive algorithms, because it's easy to add elements to the head of a list, 
and to get the tail of the list, which is everything but the first element.

The solutions to the problems in this section will be in objects named after the problems (P01, P02, etc.).

Some of the problems can be solved easily by using Scala's built-in List function.
To train myself in Scala, I try to provide a solution without using those functions first.
And then followed by a solution using built-in functions.

Each of these solutions has a unit test. 
You can find them [here](https://github.com/zjt1114/scala99/tree/master/src/test/scala/list).

* P01 (*) Find the last element of a list.
* P02 (*) Find the last but one element of a list.
* P03 (*) Find the Kth element of a list.
* P04 (*) Find the number of elements of a list.
* P05 (*) Reverse a list.
* P06 (*) Find out whether a list is a palindrome.
* P07 (**) Flatten a nested list structure.
* P08 (**) Eliminate consecutive duplicates of list elements.
* P09 (**) Pack consecutive duplicates of list elements into sublists.

