# **Adapter Design Pattern**
##Before
Because the interface between Line and Rectangle objects is incompatible, 
the user has to recover the type of each shape and manually supply the correct
arguments.
##After
The Adapter's "extra level of indirection" takes care of mapping a 
user-friendly common interface to legacy-specific peculiar interfaces.