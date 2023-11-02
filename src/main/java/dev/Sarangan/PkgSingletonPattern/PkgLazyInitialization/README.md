# Static Block Initialization:


### Advantages:
1. The object is created only when it's required by calling the static method `getInstance()`
2. An exception handling can be achieved.

### Disadvantages:
1. In the case of **multi-threading environment**, multiple threads can be inside the `if` block at the same time. This definitely may end up in creating multiple objects
2. So it will violate the rule of **Singleton Design pattern**.