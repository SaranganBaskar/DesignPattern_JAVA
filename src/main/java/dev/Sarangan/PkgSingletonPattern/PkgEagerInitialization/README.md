# Eager Initialization:

1. This is the simplest implementation of the **Singleton Design pattern**
2. In this method, The private static variable of the same class is assigned the object of the same class itself at the time of loading the class into **JVM memory**.
3. This method is applicable, when the client always wants the instance of this class.


### Advantages:
1. This is very easy to write.

### Disadvantages:

1. The object will always be created no matter whether it is required or not.
2. Hence, There will be a wastage of heap memory in case we don't need the instance of this Singleton class.
3. Very difficult for Exception handling - To be analyzed.