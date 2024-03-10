## Intent

**Singleton** is a creational design pattern that ensures that only **ONE** single instance of a class is ever created.

## Problem

The Singleton pattern solves two problems:

1. Restricting the instantiation of a class to a single instance.
2. Having a global and easy access to the single instance of a class.

## Usage

Whenever one object is needed to coordinate actions across your system.

- Example: Logging, Thread pool, and database connection.

##  Solution

All implementations of the Singleton have these two steps in common:

- Make the default constructor private, to prevent other objects from using the `new` operator with the Singleton class.
- Create a static creation method that calls the private constructor to create an object and saves it in a static field.

## Implementation

```
public class DBConnection{
	private String host;
	private int port;
	private static db DBConnection;

	Private DBConnection(String host, int port){
	this.host = host;
	this.port = port;
	}

	// Add the word Synchronized to make it Thread-safe.
	public static DBConnection getInstance(String host,int port){
	if(db == null){
		db = new DBConnection(host,port);
	}
	return db;
	}
}
```

## Extra Resources

| Name             | Link                                                                                               |
| ---------------- | -------------------------------------------------------------------------------------------------- |
| Dr. Khalid Notes | https://cpit252.gitlab.io/notes/singleton/                                                         |
| Refactor guru    | https://refactoring.guru/design-patterns/singleton                                                 |
| My github repo   | [MuhannadMojalled/DesignPatterns (github.com)](https://github.com/MuhannadMojalled/DesignPatterns) |
