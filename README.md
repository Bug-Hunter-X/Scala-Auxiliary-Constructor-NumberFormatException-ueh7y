# Scala Auxiliary Constructor NumberFormatException

This example showcases a common error in Scala when using auxiliary constructors: improper input handling and the potential for `NumberFormatException`.

The `MyClass` class demonstrates this issue where an auxiliary constructor attempts to parse a string into an integer without input validation.  This can cause unexpected crashes if the input string is invalid.

The solution provides robust input handling via `Try` and a default value.