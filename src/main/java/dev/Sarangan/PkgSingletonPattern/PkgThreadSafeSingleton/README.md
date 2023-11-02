# Thread Safe Initialization (i.e., In case of a Multi-threading application):


### Advantages:
1. This approach guarantees that **only one instance** will be created at any given point in time inside the memory.
2. The reason is that because the method `getInstance()` is using the keyword `syncrhonized`

### Disadvantages:
1. As the method is `synchronized`, Only one thread at a time will be able to access the `getInstance()` method at any given time.
2. Because, there will be only one lock available per object and that is shared between the threads. Hence it reduce performance.