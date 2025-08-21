# JAVADSA: Data Structures and Algorithms in Java

This repository contains a collection of common data structures and algorithms implemented in Java. It's intended for educational purposes and as a reference for anyone looking to practice their DSA skills.

## Implemented Data Structures and Algorithms

The project currently includes implementations for the following:

*   **Arrays**: Basic array operations.
*   **Linked Lists**: Singly linked list with insertion and traversal methods.
*   **Searching**: Bubble Search.
*   **Sorting**: Bubble Sort.
*   **Trees**:
    *   Binary Tree with traversal methods (inorder, preorder, postorder, level order).
    *   Sum Tree.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 1.7 or higher
*   Apache Maven

### Building the Project

The project is configured with Maven, so you can easily build it from the command line.

1.  Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2.  Navigate to the `JAVADSA` directory:
    ```bash
    cd JAVADSA
    ```
3.  Compile the project using Maven:
    ```bash
    mvn compile
    ```

### Running the Code

Each implementation file contains a `main` method that demonstrates its functionality. You can run any of them from your IDE or using Maven.

To run a specific file with Maven, use the `exec:java` goal:

```bash
mvn exec:java -Dexec.mainClass="<package>.<className>"
```

For example, to run the `LinkedList` demonstration:

```bash
mvn exec:java -Dexec.mainClass="LinkedList.LinkedList"
```

And to run the `BinaryTree` demonstration:

```bash
mvn exec:java -Dexec.mainClass="tree.BinaryTree"
```

## Contributing

Feel free to fork the repository and submit pull requests to add new data structures, algorithms, or improvements.
