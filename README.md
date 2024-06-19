# eAssert

## Description
eAssert is a light-weight fully-transparent assertion library for JDK. It is not based on AssertJ or Truth.

## Motivation
The internal complexity of open source assertion libraries intrigued me and so I decided to build my own and explore the limitations

## Scope
The library supports assertions for the following types:

-String
-Integer and int
-Boolean
-Date (LocalDateTime, ZonedDateTime and Date)
-Arraylist<?>
-1-D arrays (String[], Integer[] and Boolean[]) 

## Comparison strategy

All type comparison strategies are based on built in comparators e.g. .equals() and ==. Other assertion libraries have customisable
validation strategies which I will look into.
