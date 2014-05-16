TreeMap-is a red-black tree meaning it is self balancing and gives O(lgn) adding removing and searching performance. It also stores the key and the value together and there can't be more than 1 of the same keys. It is sorted.

HashMap-is a Hash table which gives O(1) performance for adding, removing, searching, assuming keys are dispersed properly with the hash function. Only store the key. Allows for multiple values with the same key. It is unsorted

TreeSet- has O(lgn) for adding removing and searching. Doesn't allow for duplicate values.It is sorted.

HashSet- has O(1) for adding removing searching,assuming keys are dispersed properly with the hash function. Only store the key. Doesn't allow for duplicate values.It is unsorted.

HashMap vs. TreeMap- Hash map is consistently faster at adding elements while TreeMap is consistently faster at removing elements.
TreeMap is also consistently faster at searching that HashMap.

Is there a built-in Heap in java? If so what is it?
Yes. It is called a Priority Queue.
