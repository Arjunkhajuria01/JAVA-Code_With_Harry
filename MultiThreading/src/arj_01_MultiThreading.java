// MULTI-THREADING in java
/*
    🔹 What is Multithreading?
    Thread = a small unit of a process.
    Multithreading = running multiple threads at the same time, so tasks can execute concurrently.
    👉 Example:
    You are watching a YouTube video (main thread).
    At the same time, comments are loading, and ads are downloading (other threads).

    🔹 Why Multithreading?
    Better use of CPU (does multiple tasks together).
    Faster execution when tasks are independent.
    Example: Game → graphics thread, sound thread, user input thread.

        🔹 How to Create Threads in Java
    There are two main ways:
    1. Extending Thread class
    2. Implementing Runnable interface


    🔹 Useful Thread Methods
    start() → starts the thread.
    run() → contains the thread’s job.
    sleep(ms) → pause the thread.
    join() → wait for another thread to finish.
    isAlive() → check if thread is running.
    setPriority(int) → set thread priority (1–10).


    🔹 Thread Lifecycle
    A thread goes through these states:
    New → created but not started.
    Runnable → ready to run.
    Running → currently executing.
    Waiting/Timed Waiting → waiting for another thread or timer.
    Terminated → finished execution.
     */