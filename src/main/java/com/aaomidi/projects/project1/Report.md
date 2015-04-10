# Project 1 #

## Question ##

We were tasked to create a program that can calculate the surface area mass and draft of a barge using it's length (l), width (w) and height (h).

We know that the material used to build this barge has a weight of approximately 1.06 tons per meters squared.

So we have the following formulas:

```
surfaceArea = (2*h)*(l+w)+(l*b)
mass = surfaceArea * 1.06
draft = mass / (l*b)
``` 

## Proposed solution ##

The proposed solution in this program is to create a "floating box" class which has all the required fields for solving the problem.

### Design ###

Class: FloatingBox

Fields: 

* ***1.06 constant*** which is a **double** type value. **Not accessible publicly** and a **final** value since it can not change after the object is constructed. The value is also **static** to stop java from allocating memory simply for a constant value that is the same between different instances of class.
* ***length*** which is a **double** type value. **Not accessible publicly** and a **final** value since it can not change after the object is constructed.
* ***width*** which is a **double** type value. **Not accessible publicly** and a **final** value since it can not change after the object is constructed.
* ***height*** which is a **double** type value. **Not accessible publicly** and a **final** value since it can not change after the object is constructed.
* ***surfaceArea*** which is a **double** type value. **Not accessible publicly**. This field will be calculated once on demand and cached further on the program.
*  ***mass*** which is a **double** type value. **Not accessible publicly**. This field will be calculated once on demand and cached further on the program.
*  ***draft*** which is a **double** type value. **Not accessible publicly**. This field will be calculated once on demand and cached further on the program.

Constructor:
The constructor will accept the length, width and height values. It will also throw an **IllegalArgumentException** if either one of the entries is a non-positive number.

### Implementation ###
The program has two functions, one for executing the actual program and one for testing it. The test is written as an separate function which randomly creates length, width and height values and tries to create a Box with the given information.
Then it'll try to print out the surfaceArea, mass and draft of the created box.

## Testing Results ##
```
    [1425546990.394] ((( Start Box
    [1425546990.395]
    Could not create Box with given information:
     >Length: 31
     >Width: -23
     >Height: -32
    [1425546990.395] End Box )))
    [1425546990.396] ((( Start Box
    [1425546990.396]
    Could not create Box with given information:
     >Length: -39
     >Width: 26
     >Height: 45
    [1425546990.396] End Box )))
    [1425546990.396] ((( Start Box
    [1425546990.397]
    Given information:
     >Length: 5.00
     >Width: 49.00
     >Height: 6.00
    >>Surface Area: 893.00
    >>Mass: 946.58
    >>Draft: 3.86

    [1425546990.397] End Box )))
    [1425546990.397] ((( Start Box
    [1425546990.397]
    Given information:
     >Length: 24.00
     >Width: 11.00
     >Height: 45.00
    >>Surface Area: 3414.00
    >>Mass: 3618.84
    >>Draft: 13.71

    [1425546990.397] End Box )))
    [1425546990.397] ((( Start Box
    [1425546990.398]
    Could not create Box with given information:
     >Length: -28
     >Width: -24
     >Height: -41
    [1425546990.398] End Box )))
    [1425546990.398] ((( Start Box
    [1425546990.398]
    Could not create Box with given information:
     >Length: -46
     >Width: -3
     >Height: 0
    [1425546990.398] End Box )))
    [1425546990.398] ((( Start Box
    [1425546990.399]
    Could not create Box with given information:
     >Length: 4
     >Width: -14
     >Height: 22
    [1425546990.399] End Box )))
    [1425546990.399] ((( Start Box
    [1425546990.399]
    Could not create Box with given information:
     >Length: -44
     >Width: -4
     >Height: -30
    [1425546990.399] End Box )))
    [1425546990.399] ((( Start Box
    [1425546990.399]
    Given information:
     >Length: 36.00
     >Width: 44.00
     >Height: 47.00
    >>Surface Area: 9104.00
    >>Mass: 9650.24
    >>Draft: 6.09

    [1425546990.399] End Box )))
    [1425546990.399] ((( Start Box
    [1425546990.400]
    Could not create Box with given information:
     >Length: 47
     >Width: -42
     >Height: 42
    [1425546990.400] End Box )))
    [1425546990.400] ((( Start Box
    [1425546990.400]
    Could not create Box with given information:
     >Length: 49
     >Width: -46
     >Height: -33
    [1425546990.400] End Box )))
    [1425546990.400] ((( Start Box
    [1425546990.400]
    Could not create Box with given information:
     >Length: 5
     >Width: 28
     >Height: -46
    [1425546990.400] End Box )))
    [1425546990.401] ((( Start Box
    [1425546990.401]
    Could not create Box with given information:
     >Length: -28
     >Width: -13
     >Height: 20
    [1425546990.401] End Box )))
    [1425546990.401] ((( Start Box
    [1425546990.401]
    Could not create Box with given information:
     >Length: 46
     >Width: -46
     >Height: 26
    [1425546990.401] End Box )))
    [1425546990.401] ((( Start Box
    [1425546990.401]
    Could not create Box with given information:
     >Length: -34
     >Width: -18
     >Height: -16
    [1425546990.401] End Box )))
    [1425546990.402] ((( Start Box
    [1425546990.402]
    Could not create Box with given information:
     >Length: -48
     >Width: -8
     >Height: 34
    [1425546990.402] End Box )))
    [1425546990.402] ((( Start Box
    [1425546990.402]
    Could not create Box with given information:
     >Length: -28
     >Width: -2
     >Height: 21
    [1425546990.402] End Box )))
    [1425546990.402] ((( Start Box
    [1425546990.402]
    Could not create Box with given information:
     >Length: -45
     >Width: -17
     >Height: 47
    [1425546990.402] End Box )))
    [1425546990.402] ((( Start Box
    [1425546990.402]
    Could not create Box with given information:
     >Length: 38
     >Width: 31
     >Height: -37
    [1425546990.403] End Box )))
    [1425546990.403] ((( Start Box
    [1425546990.403]
    Could not create Box with given information:
     >Length: -5
     >Width: -27
     >Height: -41
    [1425546990.403] End Box )))
    [1425546990.403] ((( Start Box
    [1425546990.403]
    Could not create Box with given information:
     >Length: -19
     >Width: 35
     >Height: 27
    [1425546990.403] End Box )))
    [1425546990.403] ((( Start Box
    [1425546990.404]
    Could not create Box with given information:
     >Length: -33
     >Width: 22
     >Height: 13
    [1425546990.404] End Box )))
    [1425546990.404] ((( Start Box
    [1425546990.404]
    Could not create Box with given information:
     >Length: 47
     >Width: 39
     >Height: -3
    [1425546990.404] End Box )))
    [1425546990.404] ((( Start Box
    [1425546990.404]
    Could not create Box with given information:
     >Length: 8
     >Width: 2
     >Height: -24
    [1425546990.404] End Box )))
    [1425546990.404] ((( Start Box
    [1425546990.405]
    Could not create Box with given information:
     >Length: -48
     >Width: 6
     >Height: 48
    [1425546990.405] End Box )))
    [1425546990.405] ((( Start Box
    [1425546990.405]
    Could not create Box with given information:
     >Length: 11
     >Width: -43
     >Height: 50
    [1425546990.405] End Box )))
    [1425546990.405] ((( Start Box
    [1425546990.405]
    Given information:
     >Length: 19.00
     >Width: 23.00
     >Height: 2.00
    >>Surface Area: 605.00
    >>Mass: 641.30
    >>Draft: 1.47

    [1425546990.405] End Box )))
    [1425546990.405] ((( Start Box
    [1425546990.405]
    Could not create Box with given information:
     >Length: 37
     >Width: 2
     >Height: -23
    [1425546990.405] End Box )))
    [1425546990.406] ((( Start Box
    [1425546990.406]
    Could not create Box with given information:
     >Length: 8
     >Width: 9
     >Height: -21
    [1425546990.406] End Box )))
    [1425546990.406] ((( Start Box
    [1425546990.406]
    Could not create Box with given information:
     >Length: 24
     >Width: -28
     >Height: -37
    [1425546990.406] End Box )))
    [1425546990.406] ((( Start Box
    [1425546990.406]
    Could not create Box with given information:
     >Length: -43
     >Width: 3
     >Height: -25
    [1425546990.406] End Box )))
    [1425546990.406] ((( Start Box
    [1425546990.407]
    Could not create Box with given information:
     >Length: 28
     >Width: 9
     >Height: -8
    [1425546990.407] End Box )))
    [1425546990.407] ((( Start Box
    [1425546990.407]
    Could not create Box with given information:
     >Length: 35
     >Width: 16
     >Height: -29
    [1425546990.407] End Box )))
    [1425546990.407] ((( Start Box
    [1425546990.407]
    Could not create Box with given information:
     >Length: 28
     >Width: 36
     >Height: -12
    [1425546990.407] End Box )))
    [1425546990.407] ((( Start Box
    [1425546990.407]
    Could not create Box with given information:
     >Length: 45
     >Width: -20
     >Height: -22
    [1425546990.408] End Box )))
    [1425546990.408] ((( Start Box
    [1425546990.408]
    Could not create Box with given information:
     >Length: -10
     >Width: -16
     >Height: -12
    [1425546990.408] End Box )))
    [1425546990.408] ((( Start Box
    [1425546990.408]
    Could not create Box with given information:
     >Length: -39
     >Width: -15
     >Height: -19
    [1425546990.408] End Box )))
    [1425546990.408] ((( Start Box
    [1425546990.408]
    Could not create Box with given information:
     >Length: 5
     >Width: -13
     >Height: 40
    [1425546990.408] End Box )))
    [1425546990.409] ((( Start Box
    [1425546990.409]
    Could not create Box with given information:
     >Length: -28
     >Width: -36
     >Height: 41
    [1425546990.409] End Box )))
    [1425546990.409] ((( Start Box
    [1425546990.409]
    Could not create Box with given information:
     >Length: -1
     >Width: 12
     >Height: 4
    [1425546990.409] End Box )))
    [1425546990.409] ((( Start Box
    [1425546990.409]
    Could not create Box with given information:
     >Length: -9
     >Width: 4
     >Height: 28
    [1425546990.410] End Box )))
    [1425546990.410] ((( Start Box
    [1425546990.410]
    Could not create Box with given information:
     >Length: 12
     >Width: 18
     >Height: -43
    [1425546990.410] End Box )))
    [1425546990.410] ((( Start Box
    [1425546990.410]
    Could not create Box with given information:
     >Length: 49
     >Width: -37
     >Height: -6
    [1425546990.410] End Box )))
    [1425546990.410] ((( Start Box
    [1425546990.410]
    Could not create Box with given information:
     >Length: -11
     >Width: -18
     >Height: -27
    [1425546990.411] End Box )))
    [1425546990.411] ((( Start Box
    [1425546990.411]
    Could not create Box with given information:
     >Length: -25
     >Width: 0
     >Height: 30
    [1425546990.411] End Box )))
    [1425546990.411] ((( Start Box
    [1425546990.411]
    Could not create Box with given information:
     >Length: -35
     >Width: 44
     >Height: -13
    [1425546990.411] End Box )))
    [1425546990.411] ((( Start Box
    [1425546990.411]
    Could not create Box with given information:
     >Length: -47
     >Width: -36
     >Height: 31
    [1425546990.412] End Box )))
    [1425546990.412] ((( Start Box
    [1425546990.412]
    Could not create Box with given information:
     >Length: -10
     >Width: 24
     >Height: 15
    [1425546990.412] End Box )))
    [1425546990.412] ((( Start Box
    [1425546990.412]
    Could not create Box with given information:
     >Length: -40
     >Width: 46
     >Height: 5
    [1425546990.412] End Box )))
    [1425546990.412] ((( Start Box
    [1425546990.412]
    Could not create Box with given information:
     >Length: 7
     >Width: 19
     >Height: -10
    [1425546990.412] End Box )))
    [1425546990.412] ((( Start Box
    [1425546990.412]
    Could not create Box with given information:
     >Length: -38
     >Width: 19
     >Height: -9
    [1425546990.413] End Box )))
    [1425546990.413] ((( Start Box
    [1425546990.413]
    Could not create Box with given information:
     >Length: 33
     >Width: -48
     >Height: 26
    [1425546990.413] End Box )))
    [1425546990.413] ((( Start Box
    [1425546990.413]
    Could not create Box with given information:
     >Length: -45
     >Width: -20
     >Height: 22
    [1425546990.413] End Box )))
    [1425546990.413] ((( Start Box
    [1425546990.413]
    Could not create Box with given information:
     >Length: -23
     >Width: -24
     >Height: 26
    [1425546990.413] End Box )))
    [1425546990.413] ((( Start Box
    [1425546990.414]
    Could not create Box with given information:
     >Length: -34
     >Width: -42
     >Height: 17
    [1425546990.414] End Box )))
    [1425546990.414] ((( Start Box
    [1425546990.414]
    Could not create Box with given information:
     >Length: -11
     >Width: -2
     >Height: -46
    [1425546990.414] End Box )))
    [1425546990.414] ((( Start Box
    [1425546990.414]
    Could not create Box with given information:
     >Length: -34
     >Width: 7
     >Height: 3
    [1425546990.414] End Box )))
    [1425546990.414] ((( Start Box
    [1425546990.414]
    Could not create Box with given information:
     >Length: -32
     >Width: -48
     >Height: 49
    [1425546990.414] End Box )))
    [1425546990.414] ((( Start Box
    [1425546990.415]
    Could not create Box with given information:
     >Length: -44
     >Width: -12
     >Height: -19
    [1425546990.415] End Box )))
    [1425546990.415] ((( Start Box
    [1425546990.415]
    Could not create Box with given information:
     >Length: -24
     >Width: -18
     >Height: -25
    [1425546990.415] End Box )))
    [1425546990.415] ((( Start Box
    [1425546990.415]
    Could not create Box with given information:
     >Length: -45
     >Width: 19
     >Height: -35
    [1425546990.415] End Box )))
    [1425546990.415] ((( Start Box
    [1425546990.415]
    Could not create Box with given information:
     >Length: -33
     >Width: 31
     >Height: 16
    [1425546990.416] End Box )))
    [1425546990.416] ((( Start Box
    [1425546990.416]
    Given information:
     >Length: 50.00
     >Width: 3.00
     >Height: 8.00
    >>Surface Area: 998.00
    >>Mass: 1057.88
    >>Draft: 7.05

    [1425546990.416] End Box )))
    [1425546990.416] ((( Start Box
    [1425546990.416]
    Could not create Box with given information:
     >Length: -31
     >Width: -19
     >Height: 47
    [1425546990.416] End Box )))
    [1425546990.416] ((( Start Box
    [1425546990.416]
    Could not create Box with given information:
     >Length: -19
     >Width: -10
     >Height: -30
    [1425546990.416] End Box )))
    [1425546990.416] ((( Start Box
    [1425546990.416]
    Could not create Box with given information:
     >Length: -34
     >Width: 44
     >Height: 24
    [1425546990.416] End Box )))
    [1425546990.416] ((( Start Box
    [1425546990.417]
    Could not create Box with given information:
     >Length: 2
     >Width: 0
     >Height: -32
    [1425546990.417] End Box )))
    [1425546990.417] ((( Start Box
    [1425546990.417]
    Could not create Box with given information:
     >Length: -36
     >Width: -31
     >Height: -33
    [1425546990.417] End Box )))
    [1425546990.417] ((( Start Box
    [1425546990.417]
    Could not create Box with given information:
     >Length: -23
     >Width: -35
     >Height: -42
    [1425546990.417] End Box )))
    [1425546990.417] ((( Start Box
    [1425546990.417]
    Could not create Box with given information:
     >Length: -13
     >Width: -2
     >Height: -42
    [1425546990.417] End Box )))
    [1425546990.417] ((( Start Box
    [1425546990.417]
    Could not create Box with given information:
     >Length: 27
     >Width: -45
     >Height: -26
    [1425546990.417] End Box )))
    [1425546990.417] ((( Start Box
    [1425546990.417]
    Could not create Box with given information:
     >Length: 29
     >Width: -30
     >Height: 7
    [1425546990.417] End Box )))
    [1425546990.417] ((( Start Box
    [1425546990.417]
    Could not create Box with given information:
     >Length: 13
     >Width: 37
     >Height: -40
    [1425546990.417] End Box )))
    [1425546990.417] ((( Start Box
    [1425546990.418]
    Could not create Box with given information:
     >Length: 30
     >Width: 0
     >Height: -15
    [1425546990.418] End Box )))
    [1425546990.418] ((( Start Box
    [1425546990.418]
    Could not create Box with given information:
     >Length: -40
     >Width: -42
     >Height: -31
    [1425546990.418] End Box )))
    [1425546990.418] ((( Start Box
    [1425546990.418]
    Could not create Box with given information:
     >Length: -35
     >Width: 31
     >Height: -46
    [1425546990.418] End Box )))
    [1425546990.418] ((( Start Box
    [1425546990.418]
    Could not create Box with given information:
     >Length: -45
     >Width: 24
     >Height: 15
    [1425546990.418] End Box )))
    [1425546990.418] ((( Start Box
    [1425546990.418]
    Could not create Box with given information:
     >Length: -2
     >Width: 7
     >Height: 36
    [1425546990.418] End Box )))
    [1425546990.418] ((( Start Box
    [1425546990.418]
    Could not create Box with given information:
     >Length: -23
     >Width: 21
     >Height: 41
    [1425546990.418] End Box )))
    [1425546990.418] ((( Start Box
    [1425546990.418]
    Could not create Box with given information:
     >Length: 12
     >Width: -6
     >Height: 47
    [1425546990.418] End Box )))
    [1425546990.419] ((( Start Box
    [1425546990.419]
    Could not create Box with given information:
     >Length: 27
     >Width: -35
     >Height: -35
    [1425546990.419] End Box )))
    [1425546990.419] ((( Start Box
    [1425546990.419]
    Could not create Box with given information:
     >Length: 44
     >Width: 28
     >Height: -49
    [1425546990.419] End Box )))
    [1425546990.419] ((( Start Box
    [1425546990.419]
    Could not create Box with given information:
     >Length: 25
     >Width: -29
     >Height: -27
    [1425546990.419] End Box )))
    [1425546990.419] ((( Start Box
    [1425546990.420]
    Could not create Box with given information:
     >Length: -13
     >Width: -13
     >Height: 3
    [1425546990.420] End Box )))
    [1425546990.420] ((( Start Box
    [1425546990.420]
    Could not create Box with given information:
     >Length: 21
     >Width: -2
     >Height: 10
    [1425546990.420] End Box )))
    [1425546990.420] ((( Start Box
    [1425546990.420]
    Could not create Box with given information:
     >Length: 40
     >Width: -41
     >Height: 19
    [1425546990.420] End Box )))
    [1425546990.420] ((( Start Box
    [1425546990.420]
    Could not create Box with given information:
     >Length: -28
     >Width: -4
     >Height: -11
    [1425546990.420] End Box )))
    [1425546990.420] ((( Start Box
    [1425546990.420]
    Could not create Box with given information:
     >Length: -48
     >Width: -28
     >Height: 16
    [1425546990.420] End Box )))
    [1425546990.420] ((( Start Box
    [1425546990.421]
    Could not create Box with given information:
     >Length: 33
     >Width: 10
     >Height: -34
    [1425546990.421] End Box )))
    [1425546990.421] ((( Start Box
    [1425546990.421]
    Given information:
     >Length: 37.00
     >Width: 47.00
     >Height: 42.00
    >>Surface Area: 8795.00
    >>Mass: 9322.70
    >>Draft: 5.36

    [1425546990.421] End Box )))
    [1425546990.421] ((( Start Box
    [1425546990.421]
    Could not create Box with given information:
     >Length: 7
     >Width: 24
     >Height: -31
    [1425546990.421] End Box )))
    [1425546990.421] ((( Start Box
    [1425546990.421]
    Could not create Box with given information:
     >Length: 34
     >Width: -10
     >Height: 48
    [1425546990.421] End Box )))
    [1425546990.421] ((( Start Box
    [1425546990.421]
    Could not create Box with given information:
     >Length: -39
     >Width: 8
     >Height: -8
    [1425546990.422] End Box )))
    [1425546990.422] ((( Start Box
    [1425546990.422]
    Could not create Box with given information:
     >Length: -41
     >Width: 50
     >Height: 27
    [1425546990.422] End Box )))
    [1425546990.422] ((( Start Box
    [1425546990.422]
    Could not create Box with given information:
     >Length: -15
     >Width: 32
     >Height: 44
    [1425546990.422] End Box )))
    [1425546990.422] ((( Start Box
    [1425546990.422]
    Could not create Box with given information:
     >Length: 39
     >Width: -35
     >Height: -11
    [1425546990.422] End Box )))
    [1425546990.422] ((( Start Box
    [1425546990.422]
    Could not create Box with given information:
     >Length: 11
     >Width: 38
     >Height: -44
    [1425546990.423] End Box )))
    [1425546990.423] ((( Start Box
    [1425546990.423]
    Could not create Box with given information:
     >Length: -7
     >Width: -5
     >Height: -37
    [1425546990.423] End Box )))
    [1425546990.423] ((( Start Box
    [1425546990.424]
    Given information:
     >Length: 40.00
     >Width: 3.00
     >Height: 13.00
    >>Surface Area: 1238.00
    >>Mass: 1312.28
    >>Draft: 10.94

    [1425546990.424] End Box )))
    [1425546990.424] ((( Start Box
    [1425546990.424]
    Could not create Box with given information:
     >Length: -46
     >Width: -41
     >Height: 26
    [1425546990.424] End Box )))
    [1425546990.424] DEBUG END
```
