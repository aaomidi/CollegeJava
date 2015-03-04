#Project 1#

##Question:##

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

* ***1.06 constant*** which is a **double** type value. **Not accessible publicly** and a **final** value since it can not change after the object is constructed.
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
    [1425504229.225] ((( Start Box
    [1425504229.228]
    Could not create Box with given information:
     >Length: -1
     >Width: -26
     >Height: 36
    [1425504229.229] ((( Start Box
    [1425504229.229]
    Could not create Box with given information:
     >Length: -20
     >Width: -12
     >Height: 28
    [1425504229.229] ((( Start Box
    [1425504229.229]
    Could not create Box with given information:
     >Length: -15
     >Width: 10
     >Height: -43
    [1425504229.229] ((( Start Box
    [1425504229.230]
    Could not create Box with given information:
     >Length: -34
     >Width: 9
     >Height: -18
    [1425504229.230] ((( Start Box
    [1425504229.230]
    Could not create Box with given information:
     >Length: 50
     >Width: -14
     >Height: 27
    [1425504229.230] ((( Start Box
    [1425504229.230]
    Given information:
     >Length: 13.00
     >Width: 15.00
     >Height: 28.00
    >>Surface Area: 1763.00
    >>Mass: 1868.78
    >>Draft: 9.58

    [1425504229.230] ((( Start Box
    [1425504229.231]
    Could not create Box with given information:
     >Length: -4
     >Width: 33
     >Height: 38
    [1425504229.231] ((( Start Box
    [1425504229.231]
    Could not create Box with given information:
     >Length: 46
     >Width: -17
     >Height: 33
    [1425504229.231] ((( Start Box
    [1425504229.231]
    Could not create Box with given information:
     >Length: -27
     >Width: 8
     >Height: -33
    [1425504229.231] ((( Start Box
    [1425504229.231]
    Given information:
     >Length: 3.00
     >Width: 3.00
     >Height: 1.00
    >>Surface Area: 21.00
    >>Mass: 22.26
    >>Draft: 2.47

    [1425504229.231] ((( Start Box
    [1425504229.232]
    Could not create Box with given information:
     >Length: -13
     >Width: -2
     >Height: 21
    [1425504229.232] ((( Start Box
    [1425504229.232]
    Could not create Box with given information:
     >Length: -50
     >Width: -21
     >Height: -13
    [1425504229.232] ((( Start Box
    [1425504229.232]
    Given information:
     >Length: 6.00
     >Width: 39.00
     >Height: 17.00
    >>Surface Area: 1764.00
    >>Mass: 1869.84
    >>Draft: 7.99

    [1425504229.232] ((( Start Box
    [1425504229.232]
    Given information:
     >Length: 43.00
     >Width: 24.00
     >Height: 16.00
    >>Surface Area: 3176.00
    >>Mass: 3366.56
    >>Draft: 3.26

    [1425504229.232] ((( Start Box
    [1425504229.233]
    Could not create Box with given information:
     >Length: 27
     >Width: -42
     >Height: -15
    [1425504229.233] ((( Start Box
    [1425504229.233]
    Could not create Box with given information:
     >Length: -25
     >Width: 38
     >Height: 20
    [1425504229.233] ((( Start Box
    [1425504229.233]
    Could not create Box with given information:
     >Length: -8
     >Width: 6
     >Height: 39
    [1425504229.233] ((( Start Box
    [1425504229.233]
    Could not create Box with given information:
     >Length: 38
     >Width: -40
     >Height: 8
    [1425504229.233] ((( Start Box
    [1425504229.233]
    Could not create Box with given information:
     >Length: 12
     >Width: -24
     >Height: 45
    [1425504229.233] ((( Start Box
    [1425504229.234]
    Could not create Box with given information:
     >Length: 11
     >Width: 5
     >Height: -43
    [1425504229.234] ((( Start Box
    [1425504229.234]
    Could not create Box with given information:
     >Length: -13
     >Width: -14
     >Height: 30
    [1425504229.234] ((( Start Box
    [1425504229.234]
    Could not create Box with given information:
     >Length: -40
     >Width: 17
     >Height: -1
    [1425504229.234] ((( Start Box
    [1425504229.234]
    Could not create Box with given information:
     >Length: -2
     >Width: 48
     >Height: -6
    [1425504229.234] ((( Start Box
    [1425504229.234]
    Could not create Box with given information:
     >Length: -25
     >Width: 31
     >Height: 27
    [1425504229.234] ((( Start Box
    [1425504229.235]
    Given information:
     >Length: 1.00
     >Width: 17.00
     >Height: 45.00
    >>Surface Area: 1637.00
    >>Mass: 1735.22
    >>Draft: 102.07

    [1425504229.235] ((( Start Box
    [1425504229.235]
    Could not create Box with given information:
     >Length: 47
     >Width: 40
     >Height: -30
    [1425504229.235] ((( Start Box
    [1425504229.235]
    Could not create Box with given information:
     >Length: -39
     >Width: 16
     >Height: 10
    [1425504229.235] ((( Start Box
    [1425504229.235]
    Could not create Box with given information:
     >Length: -28
     >Width: -11
     >Height: -7
    [1425504229.235] ((( Start Box
    [1425504229.235]
    Given information:
     >Length: 5.00
     >Width: 22.00
     >Height: 45.00
    >>Surface Area: 2540.00
    >>Mass: 2692.40
    >>Draft: 24.48

    [1425504229.235] ((( Start Box
    [1425504229.236]
    Could not create Box with given information:
     >Length: -23
     >Width: -18
     >Height: 45
    [1425504229.236] ((( Start Box
    [1425504229.236]
    Could not create Box with given information:
     >Length: -9
     >Width: 40
     >Height: -42
    [1425504229.236] ((( Start Box
    [1425504229.236]
    Could not create Box with given information:
     >Length: -17
     >Width: 12
     >Height: -26
    [1425504229.236] ((( Start Box
    [1425504229.236]
    Could not create Box with given information:
     >Length: -12
     >Width: -16
     >Height: -41
    [1425504229.236] ((( Start Box
    [1425504229.236]
    Could not create Box with given information:
     >Length: 48
     >Width: -50
     >Height: -35
    [1425504229.236] ((( Start Box
    [1425504229.236]
    Could not create Box with given information:
     >Length: 35
     >Width: 14
     >Height: -44
    [1425504229.237] ((( Start Box
    [1425504229.237]
    Could not create Box with given information:
     >Length: -14
     >Width: 12
     >Height: 30
    [1425504229.237] ((( Start Box
    [1425504229.237]
    Could not create Box with given information:
     >Length: -10
     >Width: 25
     >Height: -10
    [1425504229.237] ((( Start Box
    [1425504229.237]
    Could not create Box with given information:
     >Length: -36
     >Width: -14
     >Height: -37
    [1425504229.237] ((( Start Box
    [1425504229.237]
    Could not create Box with given information:
     >Length: 28
     >Width: -40
     >Height: 20
    [1425504229.237] ((( Start Box
    [1425504229.237]
    Could not create Box with given information:
     >Length: 41
     >Width: 38
     >Height: -1
    [1425504229.237] ((( Start Box
    [1425504229.238]
    Could not create Box with given information:
     >Length: 31
     >Width: 20
     >Height: 0
    [1425504229.238] ((( Start Box
    [1425504229.238]
    Could not create Box with given information:
     >Length: -40
     >Width: -4
     >Height: 34
    [1425504229.238] ((( Start Box
    [1425504229.238]
    Could not create Box with given information:
     >Length: -30
     >Width: -7
     >Height: 36
    [1425504229.238] ((( Start Box
    [1425504229.238]
    Could not create Box with given information:
     >Length: -17
     >Width: 6
     >Height: -48
    [1425504229.238] ((( Start Box
    [1425504229.239]
    Could not create Box with given information:
     >Length: -32
     >Width: 10
     >Height: 5
    [1425504229.239] ((( Start Box
    [1425504229.239]
    Could not create Box with given information:
     >Length: -40
     >Width: -40
     >Height: -10
    [1425504229.239] ((( Start Box
    [1425504229.239]
    Could not create Box with given information:
     >Length: -49
     >Width: -14
     >Height: -39
    [1425504229.239] ((( Start Box
    [1425504229.239]
    Could not create Box with given information:
     >Length: 8
     >Width: -34
     >Height: -49
    [1425504229.239] ((( Start Box
    [1425504229.239]
    Could not create Box with given information:
     >Length: 43
     >Width: -14
     >Height: 31
    [1425504229.239] ((( Start Box
    [1425504229.239]
    Could not create Box with given information:
     >Length: -5
     >Width: 45
     >Height: 25
    [1425504229.239] ((( Start Box
    [1425504229.240]
    Could not create Box with given information:
     >Length: -30
     >Width: -42
     >Height: 25
    [1425504229.240] ((( Start Box
    [1425504229.240]
    Could not create Box with given information:
     >Length: 50
     >Width: 8
     >Height: -42
    [1425504229.240] ((( Start Box
    [1425504229.240]
    Could not create Box with given information:
     >Length: -30
     >Width: -36
     >Height: 30
    [1425504229.240] ((( Start Box
    [1425504229.241]
    Given information:
     >Length: 14.00
     >Width: 34.00
     >Height: 41.00
    >>Surface Area: 4412.00
    >>Mass: 4676.72
    >>Draft: 9.83

    [1425504229.241] ((( Start Box
    [1425504229.241]
    Could not create Box with given information:
     >Length: 27
     >Width: 46
     >Height: -37
    [1425504229.241] ((( Start Box
    [1425504229.241]
    Could not create Box with given information:
     >Length: -22
     >Width: -45
     >Height: -30
    [1425504229.241] ((( Start Box
    [1425504229.241]
    Could not create Box with given information:
     >Length: 10
     >Width: 48
     >Height: -5
    [1425504229.241] ((( Start Box
    [1425504229.241]
    Could not create Box with given information:
     >Length: 40
     >Width: 44
     >Height: -23
    [1425504229.241] ((( Start Box
    [1425504229.241]
    Could not create Box with given information:
     >Length: -37
     >Width: 1
     >Height: -39
    [1425504229.241] ((( Start Box
    [1425504229.242]
    Given information:
     >Length: 17.00
     >Width: 11.00
     >Height: 20.00
    >>Surface Area: 1307.00
    >>Mass: 1385.42
    >>Draft: 7.41

    [1425504229.242] ((( Start Box
    [1425504229.242]
    Could not create Box with given information:
     >Length: -34
     >Width: 31
     >Height: -22
    [1425504229.242] ((( Start Box
    [1425504229.242]
    Could not create Box with given information:
     >Length: 43
     >Width: -31
     >Height: 39
    [1425504229.242] ((( Start Box
    [1425504229.242]
    Could not create Box with given information:
     >Length: 46
     >Width: -43
     >Height: 39
    [1425504229.242] ((( Start Box
    [1425504229.242]
    Could not create Box with given information:
     >Length: -39
     >Width: 44
     >Height: 15
    [1425504229.242] ((( Start Box
    [1425504229.242]
    Could not create Box with given information:
     >Length: -17
     >Width: -29
     >Height: -42
    [1425504229.243] ((( Start Box
    [1425504229.243]
    Given information:
     >Length: 27.00
     >Width: 22.00
     >Height: 40.00
    >>Surface Area: 4514.00
    >>Mass: 4784.84
    >>Draft: 8.06

    [1425504229.243] ((( Start Box
    [1425504229.243]
    Could not create Box with given information:
     >Length: -22
     >Width: -12
     >Height: 35
    [1425504229.243] ((( Start Box
    [1425504229.243]
    Given information:
     >Length: 22.00
     >Width: 22.00
     >Height: 12.00
    >>Surface Area: 1540.00
    >>Mass: 1632.40
    >>Draft: 3.37

    [1425504229.243] ((( Start Box
    [1425504229.243]
    Could not create Box with given information:
     >Length: -40
     >Width: 19
     >Height: -25
    [1425504229.243] ((( Start Box
    [1425504229.243]
    Could not create Box with given information:
     >Length: -6
     >Width: 24
     >Height: 2
    [1425504229.243] ((( Start Box
    [1425504229.244]
    Could not create Box with given information:
     >Length: -3
     >Width: 34
     >Height: 20
    [1425504229.244] ((( Start Box
    [1425504229.244]
    Could not create Box with given information:
     >Length: -17
     >Width: -1
     >Height: 38
    [1425504229.244] ((( Start Box
    [1425504229.244]
    Could not create Box with given information:
     >Length: 45
     >Width: 42
     >Height: -15
    [1425504229.244] ((( Start Box
    [1425504229.244]
    Could not create Box with given information:
     >Length: -49
     >Width: -4
     >Height: -32
    [1425504229.244] ((( Start Box
    [1425504229.244]
    Given information:
     >Length: 9.00
     >Width: 22.00
     >Height: 18.00
    >>Surface Area: 1314.00
    >>Mass: 1392.84
    >>Draft: 7.03

    [1425504229.244] ((( Start Box
    [1425504229.244]
    Could not create Box with given information:
     >Length: -32
     >Width: 9
     >Height: 33
    [1425504229.244] ((( Start Box
    [1425504229.244]
    Could not create Box with given information:
     >Length: 16
     >Width: -48
     >Height: -20
    [1425504229.244] ((( Start Box
    [1425504229.245]
    Could not create Box with given information:
     >Length: 49
     >Width: -8
     >Height: -21
    [1425504229.245] ((( Start Box
    [1425504229.245]
    Could not create Box with given information:
     >Length: 44
     >Width: -21
     >Height: 35
    [1425504229.245] ((( Start Box
    [1425504229.245]
    Could not create Box with given information:
     >Length: -35
     >Width: -36
     >Height: 47
    [1425504229.245] ((( Start Box
    [1425504229.245]
    Could not create Box with given information:
     >Length: -42
     >Width: -26
     >Height: 46
    [1425504229.245] ((( Start Box
    [1425504229.245]
    Could not create Box with given information:
     >Length: -49
     >Width: -23
     >Height: 10
    [1425504229.245] ((( Start Box
    [1425504229.245]
    Could not create Box with given information:
     >Length: -11
     >Width: -27
     >Height: 39
    [1425504229.245] ((( Start Box
    [1425504229.245]
    Could not create Box with given information:
     >Length: 48
     >Width: -47
     >Height: -45
    [1425504229.245] ((( Start Box
    [1425504229.245]
    Could not create Box with given information:
     >Length: 3
     >Width: -4
     >Height: -48
    [1425504229.246] ((( Start Box
    [1425504229.246]
    Could not create Box with given information:
     >Length: -3
     >Width: -29
     >Height: 39
    [1425504229.246] ((( Start Box
    [1425504229.246]
    Could not create Box with given information:
     >Length: -47
     >Width: 16
     >Height: 35
    [1425504229.246] ((( Start Box
    [1425504229.246]
    Could not create Box with given information:
     >Length: -17
     >Width: -16
     >Height: -13
    [1425504229.246] ((( Start Box
    [1425504229.246]
    Could not create Box with given information:
     >Length: -26
     >Width: -35
     >Height: 30
    [1425504229.246] ((( Start Box
    [1425504229.246]
    Could not create Box with given information:
     >Length: -2
     >Width: -30
     >Height: 24
    [1425504229.246] ((( Start Box
    [1425504229.246]
    Given information:
     >Length: 5.00
     >Width: 39.00
     >Height: 47.00
    >>Surface Area: 4331.00
    >>Mass: 4590.86
    >>Draft: 23.54

    [1425504229.246] ((( Start Box
    [1425504229.246]
    Could not create Box with given information:
     >Length: -4
     >Width: -2
     >Height: 9
    [1425504229.246] ((( Start Box
    [1425504229.246]
    Could not create Box with given information:
     >Length: -36
     >Width: 41
     >Height: -36
    [1425504229.247] ((( Start Box
    [1425504229.247]
    Could not create Box with given information:
     >Length: 42
     >Width: -30
     >Height: 44
    [1425504229.247] ((( Start Box
    [1425504229.247]
    Could not create Box with given information:
     >Length: -45
     >Width: 47
     >Height: -2
    [1425504229.247] ((( Start Box
    [1425504229.247]
    Could not create Box with given information:
     >Length: 50
     >Width: -7
     >Height: -36
    [1425504229.247] ((( Start Box
    [1425504229.247]
    Could not create Box with given information:
     >Length: -35
     >Width: 1
     >Height: 48
    [1425504229.247] ((( Start Box
    [1425504229.247]
    Could not create Box with given information:
     >Length: -48
     >Width: -1
     >Height: -14
    [1425504229.247] ((( Start Box
    [1425504229.247]
    Given information:
     >Length: 50.00
     >Width: 33.00
     >Height: 34.00
    >>Surface Area: 7294.00
    >>Mass: 7731.64
    >>Draft: 4.69

    [1425504229.247] ((( Start Box
    [1425504229.247]
    Could not create Box with given information:
     >Length: -20
     >Width: -34
     >Height: -31
    [1425504229.247] End Box )))
```
