# Static Block Initialization:

1. Similar to **Eager Initialization**, This is also the simplest implementation of the **Singleton Design pattern** 
2. In this method, The private static variable of the same class is assigned the object of the same class itself in the static block.
3. As the instantiation is inside the static block, The instance will be created at the time of loading the class into **JVM memory**.
4. This method is applicable, when the client always wants the instance of this class.


### Advantages:
1. This is very easy to write.
2. As the name suggests, This static block provides a way to handle exceptions inside the static block.

### Disadvantages:

1. The object will always be created no matter whether it is required or not.
2. Hence, There will be a wastage of heap memory in case we don't need the instance of this Singleton class.