# LLD Practice Repository

## Index -

### Basics -
1. FutureExample - Callables, Future, ExecutorService, etc.
2. AdderSubtractor - Adder Subtractor problem (Thread synchronization) solution 
   - using Locks which adds some extra logic to the business logic in Adder or Subtractor
   - `synchronized` keyword which abstracts away the synchronization logic using monitors or method level synchronization
3. ProducerConsumer - Producer Consumer Problem solution
   - **bad** : producer consumer threads without synchronization
   - **notsogood** : Uses Mutex (i.e. `Lock`) to synchronize the threads, but it's not performant since only one thread allowed to produce or consume at a time.
   - **good** : Uses `Semaphore` as a signaling mechanism so that multiple threads can access critical section
   - Ref : [Mutex Vs Semaphore](https://www.geeksforgeeks.org/mutex-vs-semaphore/)
4. LambdaAndStreams - Examples of functional interfaces, lambdas & Java stream basics

---

### Solid Principles - 
   - Single Responsibility Principle
   - Open-Closed Principle
   - Liskov Substitution Principle
   - Interface Segregation
   - Dependency Inversion

---

### Design Patterns -
1. **creational** - Creational Design Patterns
   - Singleton
   - Builder
   - Prototype
   - Simple factory, factory method, 
   - Abstract factory
2. **structural** - Structural Design patterns
   - Decorator
   - Adapter
   - Flyweight
   - Composite
3. **behavioral** - Behavioral Design Patterns
   - Observer
   - Strategy

