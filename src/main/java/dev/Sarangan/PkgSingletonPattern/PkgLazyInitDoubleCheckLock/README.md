# Lazy Initialization with Double check Locking

1. As we have seen in the case of **"Thread Safety Singleton approach"**, It was allowed to create only one instance in a multithreaded environment but reduced the overall performance.
2. Hence we should use `Synchronized` block for thread safety inside the `if` condition again. So that only one instance is created by multiple threads. 

### Advantages:
1. This approach guarantees that **only one instance** will be created at any given point in time inside the memory.
2. The reason is that because the method `getInstance()` is using the keyword `syncrhonized`

### Disadvantages:
1. As the method is `synchronized`, Only one thread at a time will be able to access the `getInstance()` method at any given time.
2. Because, there will be only one lock available per object and that is shared between the threads. Hence it reduce performance.