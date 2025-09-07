// Life cycle of a thread
/*
    1) NEW
    2) RUNNABLE
    3) RUNNING
    4) NONRUNNABLE
    4) TERMINATED

 */
/*
    New :- Instance of a thread created which is not yet startedby invoking start().
    Runnable :- After invocation of start() & before it is selected to be run by the scheduler .
    RUNNING :- After thread scheduler has selected it
    NON-RUNNABLE :- Thread alive , not eligible to run .
    TERMINATED :- run() method has exited.

 */