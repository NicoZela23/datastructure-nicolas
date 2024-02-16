 <a name="readme-top"></a>
  ![Maintained][Maintained-shield]
  ![Forks][Forks-shield]
  ![Pull Request][PullRequest-shield]
  ![Pull Request Closed][PullRequestclosed-shield]
  [![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/NicoZela23/datastructure-nicolas">
    <img src="images/logo.png" alt="Logo" width="150" height="110">
  </a>

<h3 align="center">Data Structures</h3>

  <p align="center">
    Incremental project of the third module 
    <br />
    <a href="https://github.com/NicoZela23/datastructure-nicolas"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/NicoZela23/datastructure-nicolas">View Demo</a>
    ·
    <a href="https://github.com/NicoZela23/datastructure-nicolas/issues">Report Bug</a>
    ·
    <a href="https://github.com/NicoZela23/datastructure-nicolas/issues">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#development-environment">Development Environment</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#usage">Usage</a></li>
      <ul>
        <li><a href="#main-menu">Main Menu</a></li>
        <li><a href="#double-linked-list">Double Linked List</a></li>
        <li><a href="#circular-linked-list">Circular Linked List</a></li>
        <li><a href="#array-stack-and-linked-list-stack">Array Stack and Linked List Stack</a></li>
        <li><a href="#array-queue-and-linked-list-queue">Array Queue and Linked List Queue</a></li>
        <li><a href="#double-ended-queue">Double Ended Queue</a></li>
        <li><a href="#binary-tree">Binary Tree</a></li>
        <li><a href="#graph">Graph</a></li>
        <li><a href="#merge-sort-and-bubble-sort">Merge Sort and Bubble Sort</a></li>
        <li><a href="#exit">Exit</a></li>
      </ul>
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
## About The Project

![product-screenshot](images/productScreenShot.png)

Welcome to the incremental project for the Data Structures class instructed by **_Mauricio Flores_**. This readme document serves as a dynamic guide that will undergo continuous updates throughout the module. As we progress through each subject, new features and sections will be added to enhance your understanding of data structures.

Table of Contents:
* Basic Data Structures
* Stacks and Queues
* Trees and Graphs
* Sorting Algorithms

While it's possible that not everything will be covered, the project will be updated with each new subject learned.

Use the `Run.main` button to see it by yourself.

### Development Environment
* [![Java][Java]][Java-url]
* [![IntelliJ IDEA][IntelliJ]][IntelliJ-url]
* [![Git][Git]][Git-url]
* [![Powershell][Powershell]][Powershell-url]
* [![Github][Github]][Github-url]

<!-- GETTING STARTED -->
## Getting Started

To run this project, ensure you have Java 21 installed along with any Integrated Development Environment (IDE). Simply execute a local build, and everything will be up and running smoothly.

Clone this project and test it by yourself!

<!-- USAGE EXAMPLES -->
## Usage


The project showcased here was exclusively developed in Java, leveraging a console-based interface that interacts with every aspect of the application. Following a traditional approach, users navigate through the program's functionalities by inputting numerical selections or characters as dictated by the console menu.

**Having as options this way of choice using characters in the main menu**:
> Enter your choice (A - M):

**Or this in every other data structure menu depending on the amount of options available**
> Enter your choice (1-9):


Each option provided to access and experiment with the specific methods within each menu implementation is inherently self-explanatory. This not only offers guidance on usage but also provides insight into the underlying implementation details.


### Main Menu
The main menu serves as a central hub, facilitating access to each specific data structure menu simply by entering the corresponding character into the console.
### Linked List
* `Add First` Adds a new node containing the specified data to the beginning of the linked list. The data to be added to the beginning of the linked list will be inserted by keyboard accepting integer values


* `Add Last` Adds a new node containing the specified data to the end of the linked list. The data to be added to the end of the linked list will be inserted by keyboard accepting integer values.


* `First Element` Returns the first node data of the linked list, or null if the list is empty


* `Last Element` Returns the last node data of the linked list, or null if the list is empty


* `List is Empty` Checks whether the linked list is empty or not. Returns true if the linked list is empty, false otherwise


* `List Size` Returns the number of elements currently stored in the linked list.


* `Remove First` Removes the first node from the linked list. If the linked list is empty, this method does nothing.


* `Print` Prints all elements in the linked list. The order of printing is from the first node to the last node.


* `Exit` Returns to the Main menu

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Double Linked List
* `Add First` Adds a new node containing the specified data to the beginning of the doubly linked list. The data to be added to the beginning of the doubly linked list will be inserted by keyboard accepting integer values


* `Add Last` Adds a new node containing the specified data to the end of the doubly linked list. The data to be added to the end of the doubly linked list will be inserted by keyboard accepting integer values.


* `First Element` Returns the first node data of the doubly linked list, or null if the list is empty


* `Last Element` Returns the last node data of the doubly linked list, or null if the list is empty


* `List is Empty` Checks whether the doubly linked list is empty or not. Returns true if the doubly linked list is empty, false otherwise


* `List Size` Returns the number of elements currently stored in the doubly linked list.


* `Remove First` Removes the first node from the doubly linked list. If the doubly linked list is empty, this method does nothing.


* `Remove Last` Removes the last node from the doubly linked list. If the doubly linked list is empty, this method does nothing.


* `Print` Prints all elements in the doubly linked list. The order of printing is from the first node to the last node.


* `Exit` Returns to the Main menu

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Circular Linked List
* `Add First` Adds a new node containing the specified data to the beginning of the circular linked list. The data to be added to the beginning of the circular linked list will be inserted by keyboard accepting integer values


* `Add Last` Adds a new node containing the specified data to the end of the circular linked list. The data to be added to the end of the circular linked list will be inserted by keyboard accepting integer values.


* `First Element` Returns the first node data of the circular linked list, or null if the list is empty


* `Last Element` Returns the last node data of the circular linked list, or null if the list is empty


* `List is Empty` Checks whether the circular linked list is empty or not. Returns true if the linked list is empty, false otherwise


* `List Size` Returns the number of elements currently stored in the circular linked list.


* `Remove First` Removes the first node from the circular linked list. If the circular linked list is empty, this method does nothing.


* `Print` Prints all elements in the circular linked list. The order of printing is from the first node to the last node.


* `Exit` Returns to the Main menu

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Array Stack and Linked List Stack
When accessing the array stack, you must first choose whether to initiate it with a preset capacity or utilize the default capacity, which is set to 1000.

being `1` the option to set capacity and `2` to use default capacity


When accessing the linked list stack, the capacity grows dynamically, eliminating any concerns about predefined limits. In terms of functionality, both options provide the same features; the only distinction lies in their implementations, with one utilizing arrays and the other employing linked lists.

* `Push Element` Pushes an element onto the top of the stack. the element to be pushed onto the stack will be inserted by keyboard accepting integer values


* `Pop Element` Removes returns the element at the top of the stack.


* `Top Element` Returns the element at the top of the stack without removing it.


* `Stack is Empty` Checks whether the stack is empty or not. Returns true if the stack is empty, false otherwise


* `Stack Size` Returns the number of elements currently stored in the stack.


* `Print` Prints all elements in the stack from top to bottom. The order of printing is from the topmost element to the bottommost element.


* `Exit` Returns to the Main menu

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Array Queue and Linked List Queue
When accessing the array queue, you must first choose whether to initiate it with a preset capacity or utilize the default capacity, which is set to 1000.

being `1` the option to set capacity and `2` to use default capacity


When accessing the linked list queue, the capacity grows dynamically, eliminating any concerns about predefined limits. In terms of functionality, both options provide the same features; the only distinction lies in their implementations, with one utilizing arrays and the other employing linked lists.

* `Enqueue Element` Adds an element to the rear of the queue. The element to be added to the queue will be inserted by keyboard accepting integer values


* `Dequeue Element` Removes the element at the front of the queue.


* `First Element` Returns the element at the front of the queue without removing it.


* `Queue is Empty` Checks whether the queue is empty or not. True if the queue is empty, false otherwise


* `Queue Size` Returns the number of elements currently stored in the queue.


* `Print` Prints all elements in the queue. The order of printing is from the front of the queue to the rear.


* `Exit` Returns to the Main menu

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Double Ended Queue
* `Enqueue First Element` Adds an element to the front of the deque. The element to be added to the front of the deque will be inserted by keyboard accepting integer values


* `Enqueue Last Element` Adds an element to the end of the deque. The element to be added to the end of the deque will be inserted by keyboard accpeting integer values


* `Dequeue First Element` Removes the element at the front of the deque.


* `Dequeue Last Element` Removes the element at the end of the deque.


* `First Element` Returns the element at the front of the deque without removing it.


* `Last Element` Returns the element at the end of the deque without removing it.


* `Queue is Empty` Checks whether the deque is empty or not. True if the deque is empty, false otherwise


* `Queue Size` Returns the number of elements currently stored in the deque.


* `Print` Prints all elements in the double-ended queue. The order of printing is from the front of the deque to the rear.


* `Exit` Returns to the Main menu

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Binary Tree
When accessing the Binary Tree, you must first choose whether to initiate it with a preset root or leave it blank and add it later

being `1` the option to set a root and `2` to use start without one.

* `Insert Node` Inserts a new node containing the specified data into the binary tree. The data to be inserted into the binary tree will be inserted by keyboard accepting integer values


* `Delete Node` Deletes the node containing the specified data from the binary tree. If the data is not found in the tree, this method does nothing.


* `Get Node` Returns a reference to a specific node in the binary tree containing the specified data.


* `Tree Height` Calculates the height of the binary tree.


* `Tree Size` Returns the number of nodes currently stored in the binary tree.


* `Search` Searches for the specified data in the binary tree. Returns true if the data is found in the binary tree, false otherwise


* `Print Unordered Tree` It prints and array containing all the nodes without being ordered or calculated just to show all the nodes in order of insertion


* `Print inOrder Tree` Performs an in-order traversal of the binary tree and prints an array containing the data of all nodes visited in the traversal.


* `Print preOrder Tree` Performs a pre-order traversal of the binary tree and prints an array containing the data of all nodes visited in the traversal. 


* `Print postOrder Tree` Performs a post-order traversal of the binary tree and prints an array containing the of all nodes visited in the traversal.


* `Exit` Returns to the Main menu

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Graph
* `Add Node` Adds a node to the graph. the data inserted into the graph will be inserted by keyboard


* `Add Edge` Adds an edge between the specified source and destination nodes with the given weight. It receives source node of the edge, the destination node of the edge the weight of the edge.


* `Remove Node` Removes the specified node from the graph.


* `Remove Edge` Removes the specified edge from the graph.


* `Number of Nodes` Returns the number of nodes in the graph.


* `Get Nodes` Returns a list of all nodes in the graph.


* `Number of Edges` Returns the number of edges in the graph.


* `Get Edges` Returns a list of all edges in the graph.


* `Get Edge` Returns the edge between the specified source and destination nodes, if it exists. It receives source node of the edge, the destination node of the edge.


* `Out Degree` Returns the in-degree of the specified node. It receives a node whose in-degree is to be calculated.


* `In Degree`Returns the in-degree of the specified node. It receives a node whose in-degree is to be calculated.


* `Out Going Edges` Returns a list of all outgoing edges from the specified node. It receives the node whose outgoing edges are to be retrieved.


* `In Coming Edges` Returns a list of all incoming edges to the specified node. It receives the node whose incoming edges are to be retrieved.


* `Exit` Returns to the Main menu

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Merge Sort and Bubble Sort
When accessing the Merge Sort and Bubble Sort methods you will have two options being `1` to try the sorting method and `2` to return to the Main Menu.

When accessing the sorting method with both cases you need to insert the capacity of the array and after that insert the array of numbers to be sorted using spaces in the same line

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Exit
It Ends the whole app

<p align="right">(<a href="#readme-top">back to top</a>)</p>

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/nicozela/
[Maintained-shield]: https://img.shields.io/badge/Maintained%3F-yes-green.svg
[Forks-shield]: https://img.shields.io/github/forks/NicoZela23/datastructure-nicolas.svg
[PullRequest-shield]: https://img.shields.io/github/issues-pr/NicoZela23/datastructure-nicolas.svg
[PullRequestclosed-shield]: 	https://img.shields.io/github/issues-pr-closed/NicoZela23/datastructure-nicolas.svg
[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/es/
[IntelliJ]: https://img.shields.io/badge/Intellij%20Idea-000?logo=intellij-idea&style=for-the-badge
[IntelliJ-url]: https://www.jetbrains.com/idea/
[Git]: https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white
[Git-url]: https://git-scm.com/
[Powershell]: https://img.shields.io/badge/powershell-5391FE?style=for-the-badge&logo=powershell&logoColor=white
[Powershell-url]: https://www.microsoft.com/store/productId/9MZ1SNWT0N5D?ocid=pdpshare
[Github]: https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white
[Github-url]: https://github.com/



