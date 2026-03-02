# Looping Statements

Looping is used to execute a single statement or a block of statement n times till the condition is true. In simple words we can say that loop is a way to keep executing either a single statement or a block of statement n times till the condition is true i.e. until a given condition becomes false.

There are three types of loops in Java:

1. While
2. Do-while
3. For

## 1. While loop

While Loop is used to execute a single statement or a block of statement n times till the condition is true. In simple words we can say that loop is a way to keep executing either a single statement or a block of statement n times till the condition is true i.e. until a given condition becomes false.

    while (condition) {
        // Code to be executed repeatedly
        // Update the loop control variable(s) here
    }

## 2. Do-while loop

A do-while loop is an exit-controlled loop that guarantees the body of the loop is executed at least once. The code block runs first, and then the condition is checked. This makes it ideal for scenarios like menu-driven programs or input validation, where the user must be prompted for input at least once.

    do {
        // code to be executed
    } while (condition); // Note the required semicolon

## 3. For loop

A for loop is an entry-controlled loop used when the number of iterations is known in advance. Its syntax is concise, combining the initialization, condition, and update expressions in a single line. The condition is checked before each iteration, so the loop body might not execute at all if the initial condition is false.

    for (initialization; condition; increment/decrement) {
        // code to be executed
    }

Every loop contains three parts:
1. Initialization
2. Condition
3. Increment/Decrement