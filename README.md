# Java HashMap Example

## Overview

This project demonstrates the use of Java's `HashMap` collection to store and retrieve employee names and their corresponding employee IDs.

The program performs the following operations:

* Creates a `HashMap`
* Adds key-value pairs using `put()`
* Retrieves a value using `get()`
* Checks if a key exists using `containsKey()`
* Checks if a value exists using `containsValue()`

## Code Concepts

### HashMap

A `HashMap` stores data as key-value pairs.

Example:

```java
HashMap<String, Integer> empIds = new HashMap<>();
```

* `String` represents the employee name (key)
* `Integer` represents the employee ID (value)

### Adding Data

```java
empIds.put("Bismark", 4435);
empIds.put("Kofi", 4436);
empIds.put("Kwame", 4437);
```

### Retrieving Data

```java
empIds.get("Bismark");
```

Output:

```text
4435
```

### Checking for a Key

```java
empIds.containsKey("George");
```

Output:

```text
false
```

### Checking for a Value

```java
empIds.containsValue(4435);
```

Output:

```text
true
```

## Example Output

```text
4435
false
true
```

## Technologies Used

* Java
* HashMap Collection Framework

## How to Run

1. Clone the repository.
2. Open the project in your preferred IDE.
3. Compile and run the `Maps.java` file.

```bash
javac Maps.java
java Maps
```

## Learning Objectives

This project helps beginners understand:

* Java Collections Framework
* HashMap data structure
* Key-value pair storage
* Basic lookup operations
* Searching for keys and values

```
```
