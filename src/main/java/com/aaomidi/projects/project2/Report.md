# Project 2 #

## Question: ##

In this project we were tasked to create a program that can calculate the **travel distance** and **travel time** of a projectile using the **thrown angle** and the **initial velocity** of a projectile.

We know from Physics that:

```
Assuming Gravity (g) is 10 ms^-2
Vertical Component of Velocity (V_v) = Velocity * SIN(ThrownAngle)
Horizontal Component of Velocity (V_h) = Velocity * COS(ThrownAngle)
travelTime = (2 * V_v) / g
travelDistance = V_h * travelTime
```

## Proposed Solution ##

The creation of a **Projectile** class which will obtain the velocity and angle from the user and do its calculations.

## Design ##

Class: Projectile

Fields:

* **GRAVITY_ACCELERATION** Constant value of 10 ms^-2. Static and accessible publicly. Reason for static is that the value is shared between all implementations of **Projectile**, so there is no reason to waste memory.
* **thrownAngle** Value between 0 and 90 inclusive. Double, final and not accessible publicly.
* **initialVelocity** Value is non negative. Double, final and not accessible publicly.
* **horizontalVelocity** Value will be calculated as the program goes on.
* **verticalVelocity** Value will be calculated as the program goes on.
* **travelTime** Value will be calculated as the program goes on.
* **travelDistance** Value will be calculated as the program goes on.

Constructor:
The constructor will accept the thrownAngle and initialVelocity. It will throw an **IllegalArgumentException** if thrown angle isn't between 0 and 90 or initialVelocity is negative.

## Implementation ##
Same as project1.

## Testing Results ##
```
    [1428686537.707] DEBUG START
    [1428686537.709] ((( Start Projectile
    [1428686537.710] Given information:
     >Thrown Angle: 62.00
     >Initial Velocity: 0.00
    >>Vertical Component of Velocity: 0.00
    >>Horizontal Component of Velocity: 0.00
    >>Travel Time: 0.00
    >>Travel Distance: 0.00
    [1428686537.710] End Projectile )))
    [1428686537.710] ((( Start Projectile
    [1428686537.711] Couldn't create a projectile with the given information:
     >Thrown Angle: -14
     > Initial Velocity: 6
    [1428686537.711] End Projectile )))
    [1428686537.711] ((( Start Projectile
    [1428686537.711] Couldn't create a projectile with the given information:
     >Thrown Angle: -31
     > Initial Velocity: 3
    [1428686537.711] End Projectile )))
    [1428686537.711] ((( Start Projectile
    [1428686537.712] Couldn't create a projectile with the given information:
     >Thrown Angle: -57
     > Initial Velocity: 4
    [1428686537.712] End Projectile )))
    [1428686537.712] ((( Start Projectile
    [1428686537.712] Couldn't create a projectile with the given information:
     >Thrown Angle: 86
     > Initial Velocity: -9
    [1428686537.712] End Projectile )))
    [1428686537.712] ((( Start Projectile
    [1428686537.712] Couldn't create a projectile with the given information:
     >Thrown Angle: -9
     > Initial Velocity: 7
    [1428686537.713] End Projectile )))
    [1428686537.713] ((( Start Projectile
    [1428686537.713] Couldn't create a projectile with the given information:
     >Thrown Angle: -61
     > Initial Velocity: 4
    [1428686537.713] End Projectile )))
    [1428686537.713] ((( Start Projectile
    [1428686537.713] Couldn't create a projectile with the given information:
     >Thrown Angle: 38
     > Initial Velocity: -5
    [1428686537.713] End Projectile )))
    [1428686537.714] ((( Start Projectile
    [1428686537.714] Couldn't create a projectile with the given information:
     >Thrown Angle: -72
     > Initial Velocity: 2
    [1428686537.714] End Projectile )))
    [1428686537.714] ((( Start Projectile
    [1428686537.714] Couldn't create a projectile with the given information:
     >Thrown Angle: 86
     > Initial Velocity: -1
    [1428686537.714] End Projectile )))
    [1428686537.714] ((( Start Projectile
    [1428686537.714] Given information:
     >Thrown Angle: 18.00
     >Initial Velocity: 4.00
    >>Vertical Component of Velocity: 1.24
    >>Horizontal Component of Velocity: 3.80
    >>Travel Time: 0.25
    >>Travel Distance: 0.94
    [1428686537.714] End Projectile )))
    [1428686537.715] ((( Start Projectile
    [1428686537.715] Given information:
     >Thrown Angle: 44.00
     >Initial Velocity: 8.00
    >>Vertical Component of Velocity: 5.56
    >>Horizontal Component of Velocity: 5.75
    >>Travel Time: 1.11
    >>Travel Distance: 6.40
    [1428686537.715] End Projectile )))
    [1428686537.715] ((( Start Projectile
    [1428686537.715] Couldn't create a projectile with the given information:
     >Thrown Angle: -88
     > Initial Velocity: 5
    [1428686537.715] End Projectile )))
    [1428686537.715] ((( Start Projectile
    [1428686537.715] Couldn't create a projectile with the given information:
     >Thrown Angle: -84
     > Initial Velocity: 7
    [1428686537.715] End Projectile )))
    [1428686537.715] ((( Start Projectile
    [1428686537.716] Couldn't create a projectile with the given information:
     >Thrown Angle: -74
     > Initial Velocity: -4
    [1428686537.716] End Projectile )))
    [1428686537.716] ((( Start Projectile
    [1428686537.716] Given information:
     >Thrown Angle: 65.00
     >Initial Velocity: 2.00
    >>Vertical Component of Velocity: 1.81
    >>Horizontal Component of Velocity: 0.85
    >>Travel Time: 0.36
    >>Travel Distance: 0.31
    [1428686537.716] End Projectile )))
    [1428686537.716] ((( Start Projectile
    [1428686537.716] Couldn't create a projectile with the given information:
     >Thrown Angle: 44
     > Initial Velocity: -1
    [1428686537.716] End Projectile )))
    [1428686537.716] ((( Start Projectile
    [1428686537.717] Given information:
     >Thrown Angle: 43.00
     >Initial Velocity: 7.00
    >>Vertical Component of Velocity: 4.77
    >>Horizontal Component of Velocity: 5.12
    >>Travel Time: 0.95
    >>Travel Distance: 4.89
    [1428686537.717] End Projectile )))
    [1428686537.717] ((( Start Projectile
    [1428686537.717] Couldn't create a projectile with the given information:
     >Thrown Angle: -8
     > Initial Velocity: -10
    [1428686537.717] End Projectile )))
    [1428686537.717] ((( Start Projectile
    [1428686537.717] Given information:
     >Thrown Angle: 61.00
     >Initial Velocity: 0.00
    >>Vertical Component of Velocity: 0.00
    >>Horizontal Component of Velocity: 0.00
    >>Travel Time: 0.00
    >>Travel Distance: 0.00
    [1428686537.717] End Projectile )))
    [1428686537.717] ((( Start Projectile
    [1428686537.718] Couldn't create a projectile with the given information:
     >Thrown Angle: -49
     > Initial Velocity: 7
    [1428686537.718] End Projectile )))
    [1428686537.718] ((( Start Projectile
    [1428686537.718] Couldn't create a projectile with the given information:
     >Thrown Angle: 89
     > Initial Velocity: -9
    [1428686537.718] End Projectile )))
    [1428686537.718] ((( Start Projectile
    [1428686537.718] Given information:
     >Thrown Angle: 68.00
     >Initial Velocity: 3.00
    >>Vertical Component of Velocity: 2.78
    >>Horizontal Component of Velocity: 1.12
    >>Travel Time: 0.56
    >>Travel Distance: 0.63
    [1428686537.719] End Projectile )))
    [1428686537.719] ((( Start Projectile
    [1428686537.719] Given information:
     >Thrown Angle: 48.00
     >Initial Velocity: 0.00
    >>Vertical Component of Velocity: 0.00
    >>Horizontal Component of Velocity: 0.00
    >>Travel Time: 0.00
    >>Travel Distance: 0.00
    [1428686537.719] End Projectile )))
    [1428686537.719] ((( Start Projectile
    [1428686537.719] Given information:
     >Thrown Angle: 85.00
     >Initial Velocity: 1.00
    >>Vertical Component of Velocity: 1.00
    >>Horizontal Component of Velocity: 0.09
    >>Travel Time: 0.20
    >>Travel Distance: 0.02
    [1428686537.719] End Projectile )))
    [1428686537.720] ((( Start Projectile
    [1428686537.720] Couldn't create a projectile with the given information:
     >Thrown Angle: 19
     > Initial Velocity: -1
    [1428686537.720] End Projectile )))
    [1428686537.720] ((( Start Projectile
    [1428686537.720] Couldn't create a projectile with the given information:
     >Thrown Angle: 3
     > Initial Velocity: -8
    [1428686537.720] End Projectile )))
    [1428686537.720] ((( Start Projectile
    [1428686537.720] Couldn't create a projectile with the given information:
     >Thrown Angle: 12
     > Initial Velocity: -3
    [1428686537.720] End Projectile )))
    [1428686537.720] ((( Start Projectile
    [1428686537.721] Couldn't create a projectile with the given information:
     >Thrown Angle: 3
     > Initial Velocity: -1
    [1428686537.721] End Projectile )))
    [1428686537.721] ((( Start Projectile
    [1428686537.721] Couldn't create a projectile with the given information:
     >Thrown Angle: -7
     > Initial Velocity: 10
    [1428686537.721] End Projectile )))
    [1428686537.721] ((( Start Projectile
    [1428686537.721] Couldn't create a projectile with the given information:
     >Thrown Angle: -15
     > Initial Velocity: 3
    [1428686537.721] End Projectile )))
    [1428686537.722] ((( Start Projectile
    [1428686537.722] Given information:
     >Thrown Angle: 69.00
     >Initial Velocity: 10.00
    >>Vertical Component of Velocity: 9.34
    >>Horizontal Component of Velocity: 3.58
    >>Travel Time: 1.87
    >>Travel Distance: 6.69
    [1428686537.722] End Projectile )))
    [1428686537.722] ((( Start Projectile
    [1428686537.722] Given information:
     >Thrown Angle: 76.00
     >Initial Velocity: 0.00
    >>Vertical Component of Velocity: 0.00
    >>Horizontal Component of Velocity: 0.00
    >>Travel Time: 0.00
    >>Travel Distance: 0.00
    [1428686537.722] End Projectile )))
    [1428686537.722] ((( Start Projectile
    [1428686537.723] Couldn't create a projectile with the given information:
     >Thrown Angle: -3
     > Initial Velocity: -8
    [1428686537.723] End Projectile )))
    [1428686537.723] ((( Start Projectile
    [1428686537.723] Couldn't create a projectile with the given information:
     >Thrown Angle: -10
     > Initial Velocity: -10
    [1428686537.723] End Projectile )))
    [1428686537.723] ((( Start Projectile
    [1428686537.723] Couldn't create a projectile with the given information:
     >Thrown Angle: -90
     > Initial Velocity: -5
    [1428686537.723] End Projectile )))
    [1428686537.723] ((( Start Projectile
    [1428686537.723] Couldn't create a projectile with the given information:
     >Thrown Angle: -54
     > Initial Velocity: 3
    [1428686537.724] End Projectile )))
    [1428686537.724] ((( Start Projectile
    [1428686537.724] Given information:
     >Thrown Angle: 13.00
     >Initial Velocity: 9.00
    >>Vertical Component of Velocity: 2.02
    >>Horizontal Component of Velocity: 8.77
    >>Travel Time: 0.40
    >>Travel Distance: 3.55
    [1428686537.724] End Projectile )))
    [1428686537.724] ((( Start Projectile
    [1428686537.724] Couldn't create a projectile with the given information:
     >Thrown Angle: 41
     > Initial Velocity: -6
    [1428686537.724] End Projectile )))
    [1428686537.724] ((( Start Projectile
    [1428686537.724] Couldn't create a projectile with the given information:
     >Thrown Angle: -79
     > Initial Velocity: 5
    [1428686537.725] End Projectile )))
    [1428686537.725] ((( Start Projectile
    [1428686537.726] Given information:
     >Thrown Angle: 63.00
     >Initial Velocity: 6.00
    >>Vertical Component of Velocity: 5.35
    >>Horizontal Component of Velocity: 2.72
    >>Travel Time: 1.07
    >>Travel Distance: 2.91
    [1428686537.726] End Projectile )))
    [1428686537.726] ((( Start Projectile
    [1428686537.726] Couldn't create a projectile with the given information:
     >Thrown Angle: -49
     > Initial Velocity: -10
    [1428686537.726] End Projectile )))
    [1428686537.726] ((( Start Projectile
    [1428686537.726] Given information:
     >Thrown Angle: 25.00
     >Initial Velocity: 1.00
    >>Vertical Component of Velocity: 0.42
    >>Horizontal Component of Velocity: 0.91
    >>Travel Time: 0.08
    >>Travel Distance: 0.08
    [1428686537.726] End Projectile )))
    [1428686537.726] ((( Start Projectile
    [1428686537.726] Couldn't create a projectile with the given information:
     >Thrown Angle: 19
     > Initial Velocity: -1
    [1428686537.726] End Projectile )))
    [1428686537.726] ((( Start Projectile
    [1428686537.726] Couldn't create a projectile with the given information:
     >Thrown Angle: -79
     > Initial Velocity: 10
    [1428686537.727] End Projectile )))
    [1428686537.727] ((( Start Projectile
    [1428686537.727] Given information:
     >Thrown Angle: 0.00
     >Initial Velocity: 7.00
    >>Vertical Component of Velocity: 0.00
    >>Horizontal Component of Velocity: 7.00
    >>Travel Time: 0.00
    >>Travel Distance: 0.00
    [1428686537.727] End Projectile )))
    [1428686537.727] ((( Start Projectile
    [1428686537.727] Couldn't create a projectile with the given information:
     >Thrown Angle: -4
     > Initial Velocity: 8
    [1428686537.727] End Projectile )))
    [1428686537.727] ((( Start Projectile
    [1428686537.727] Couldn't create a projectile with the given information:
     >Thrown Angle: -10
     > Initial Velocity: 1
    [1428686537.727] End Projectile )))
    [1428686537.728] ((( Start Projectile
    [1428686537.728] Couldn't create a projectile with the given information:
     >Thrown Angle: -6
     > Initial Velocity: -5
    [1428686537.728] End Projectile )))
    [1428686537.728] ((( Start Projectile
    [1428686537.728] Couldn't create a projectile with the given information:
     >Thrown Angle: -38
     > Initial Velocity: -6
    [1428686537.728] End Projectile )))
    [1428686537.728] ((( Start Projectile
    [1428686537.728] Given information:
     >Thrown Angle: 46.00
     >Initial Velocity: 5.00
    >>Vertical Component of Velocity: 3.60
    >>Horizontal Component of Velocity: 3.47
    >>Travel Time: 0.72
    >>Travel Distance: 2.50
    [1428686537.728] End Projectile )))
    [1428686537.728] ((( Start Projectile
    [1428686537.728] Couldn't create a projectile with the given information:
     >Thrown Angle: 23
     > Initial Velocity: -3
    [1428686537.729] End Projectile )))
    [1428686537.729] ((( Start Projectile
    [1428686537.729] Couldn't create a projectile with the given information:
     >Thrown Angle: -41
     > Initial Velocity: 6
    [1428686537.729] End Projectile )))
    [1428686537.729] ((( Start Projectile
    [1428686537.729] Couldn't create a projectile with the given information:
     >Thrown Angle: 0
     > Initial Velocity: -9
    [1428686537.729] End Projectile )))
    [1428686537.729] ((( Start Projectile
    [1428686537.729] Couldn't create a projectile with the given information:
     >Thrown Angle: -84
     > Initial Velocity: -5
    [1428686537.729] End Projectile )))
    [1428686537.729] ((( Start Projectile
    [1428686537.729] Given information:
     >Thrown Angle: 23.00
     >Initial Velocity: 10.00
    >>Vertical Component of Velocity: 3.91
    >>Horizontal Component of Velocity: 9.21
    >>Travel Time: 0.78
    >>Travel Distance: 7.19
    [1428686537.729] End Projectile )))
    [1428686537.729] ((( Start Projectile
    [1428686537.729] Couldn't create a projectile with the given information:
     >Thrown Angle: -58
     > Initial Velocity: 9
    [1428686537.729] End Projectile )))
    [1428686537.730] ((( Start Projectile
    [1428686537.730] Given information:
     >Thrown Angle: 6.00
     >Initial Velocity: 5.00
    >>Vertical Component of Velocity: 0.52
    >>Horizontal Component of Velocity: 4.97
    >>Travel Time: 0.10
    >>Travel Distance: 0.52
    [1428686537.730] End Projectile )))
    [1428686537.730] ((( Start Projectile
    [1428686537.730] Couldn't create a projectile with the given information:
     >Thrown Angle: 11
     > Initial Velocity: -5
    [1428686537.730] End Projectile )))
    [1428686537.730] ((( Start Projectile
    [1428686537.730] Couldn't create a projectile with the given information:
     >Thrown Angle: -30
     > Initial Velocity: 8
    [1428686537.730] End Projectile )))
    [1428686537.730] ((( Start Projectile
    [1428686537.730] Couldn't create a projectile with the given information:
     >Thrown Angle: 34
     > Initial Velocity: -8
    [1428686537.731] End Projectile )))
    [1428686537.731] ((( Start Projectile
    [1428686537.731] Couldn't create a projectile with the given information:
     >Thrown Angle: -68
     > Initial Velocity: 1
    [1428686537.731] End Projectile )))
    [1428686537.731] ((( Start Projectile
    [1428686537.731] Couldn't create a projectile with the given information:
     >Thrown Angle: -18
     > Initial Velocity: 4
    [1428686537.731] End Projectile )))
    [1428686537.731] ((( Start Projectile
    [1428686537.731] Given information:
     >Thrown Angle: 21.00
     >Initial Velocity: 9.00
    >>Vertical Component of Velocity: 3.23
    >>Horizontal Component of Velocity: 8.40
    >>Travel Time: 0.65
    >>Travel Distance: 5.42
    [1428686537.732] End Projectile )))
    [1428686537.732] ((( Start Projectile
    [1428686537.732] Couldn't create a projectile with the given information:
     >Thrown Angle: -33
     > Initial Velocity: 9
    [1428686537.732] End Projectile )))
    [1428686537.732] ((( Start Projectile
    [1428686537.732] Couldn't create a projectile with the given information:
     >Thrown Angle: -40
     > Initial Velocity: 0
    [1428686537.732] End Projectile )))
    [1428686537.732] ((( Start Projectile
    [1428686537.732] Couldn't create a projectile with the given information:
     >Thrown Angle: -46
     > Initial Velocity: -7
    [1428686537.732] End Projectile )))
    [1428686537.733] ((( Start Projectile
    [1428686537.733] Couldn't create a projectile with the given information:
     >Thrown Angle: -1
     > Initial Velocity: 6
    [1428686537.733] End Projectile )))
    [1428686537.733] ((( Start Projectile
    [1428686537.733] Given information:
     >Thrown Angle: 57.00
     >Initial Velocity: 0.00
    >>Vertical Component of Velocity: 0.00
    >>Horizontal Component of Velocity: 0.00
    >>Travel Time: 0.00
    >>Travel Distance: 0.00
    [1428686537.733] End Projectile )))
    [1428686537.733] ((( Start Projectile
    [1428686537.733] Couldn't create a projectile with the given information:
     >Thrown Angle: -31
     > Initial Velocity: 6
    [1428686537.733] End Projectile )))
    [1428686537.733] ((( Start Projectile
    [1428686537.733] Couldn't create a projectile with the given information:
     >Thrown Angle: 48
     > Initial Velocity: -7
    [1428686537.733] End Projectile )))
    [1428686537.734] ((( Start Projectile
    [1428686537.734] Couldn't create a projectile with the given information:
     >Thrown Angle: -25
     > Initial Velocity: -3
    [1428686537.734] End Projectile )))
    [1428686537.734] ((( Start Projectile
    [1428686537.734] Couldn't create a projectile with the given information:
     >Thrown Angle: -61
     > Initial Velocity: 2
    [1428686537.734] End Projectile )))
    [1428686537.734] ((( Start Projectile
    [1428686537.734] Given information:
     >Thrown Angle: 78.00
     >Initial Velocity: 9.00
    >>Vertical Component of Velocity: 8.80
    >>Horizontal Component of Velocity: 1.87
    >>Travel Time: 1.76
    >>Travel Distance: 3.29
    [1428686537.734] End Projectile )))
    [1428686537.734] ((( Start Projectile
    [1428686537.734] Couldn't create a projectile with the given information:
     >Thrown Angle: -26
     > Initial Velocity: 6
    [1428686537.734] End Projectile )))
    [1428686537.734] ((( Start Projectile
    [1428686537.734] Couldn't create a projectile with the given information:
     >Thrown Angle: -14
     > Initial Velocity: 5
    [1428686537.735] End Projectile )))
    [1428686537.735] ((( Start Projectile
    [1428686537.735] Couldn't create a projectile with the given information:
     >Thrown Angle: -54
     > Initial Velocity: 6
    [1428686537.735] End Projectile )))
    [1428686537.735] ((( Start Projectile
    [1428686537.735] Couldn't create a projectile with the given information:
     >Thrown Angle: -80
     > Initial Velocity: -10
    [1428686537.735] End Projectile )))
    [1428686537.735] ((( Start Projectile
    [1428686537.735] Couldn't create a projectile with the given information:
     >Thrown Angle: -7
     > Initial Velocity: 1
    [1428686537.735] End Projectile )))
    [1428686537.735] ((( Start Projectile
    [1428686537.735] Couldn't create a projectile with the given information:
     >Thrown Angle: -86
     > Initial Velocity: -4
    [1428686537.735] End Projectile )))
    [1428686537.735] ((( Start Projectile
    [1428686537.735] Couldn't create a projectile with the given information:
     >Thrown Angle: -72
     > Initial Velocity: -3
    [1428686537.736] End Projectile )))
    [1428686537.736] ((( Start Projectile
    [1428686537.736] Given information:
     >Thrown Angle: 49.00
     >Initial Velocity: 10.00
    >>Vertical Component of Velocity: 7.55
    >>Horizontal Component of Velocity: 6.56
    >>Travel Time: 1.51
    >>Travel Distance: 9.90
    [1428686537.736] End Projectile )))
    [1428686537.736] ((( Start Projectile
    [1428686537.736] Couldn't create a projectile with the given information:
     >Thrown Angle: 31
     > Initial Velocity: -1
    [1428686537.736] End Projectile )))
    [1428686537.736] ((( Start Projectile
    [1428686537.736] Given information:
     >Thrown Angle: 85.00
     >Initial Velocity: 0.00
    >>Vertical Component of Velocity: 0.00
    >>Horizontal Component of Velocity: 0.00
    >>Travel Time: 0.00
    >>Travel Distance: 0.00
    [1428686537.736] End Projectile )))
    [1428686537.736] ((( Start Projectile
    [1428686537.736] Given information:
     >Thrown Angle: 52.00
     >Initial Velocity: 3.00
    >>Vertical Component of Velocity: 2.36
    >>Horizontal Component of Velocity: 1.85
    >>Travel Time: 0.47
    >>Travel Distance: 0.87
    [1428686537.736] End Projectile )))
    [1428686537.736] ((( Start Projectile
    [1428686537.737] Couldn't create a projectile with the given information:
     >Thrown Angle: -24
     > Initial Velocity: 7
    [1428686537.737] End Projectile )))
    [1428686537.737] ((( Start Projectile
    [1428686537.737] Couldn't create a projectile with the given information:
     >Thrown Angle: -59
     > Initial Velocity: -2
    [1428686537.737] End Projectile )))
    [1428686537.737] ((( Start Projectile
    [1428686537.737] Couldn't create a projectile with the given information:
     >Thrown Angle: -71
     > Initial Velocity: -6
    [1428686537.737] End Projectile )))
    [1428686537.737] ((( Start Projectile
    [1428686537.737] Given information:
     >Thrown Angle: 28.00
     >Initial Velocity: 6.00
    >>Vertical Component of Velocity: 2.82
    >>Horizontal Component of Velocity: 5.30
    >>Travel Time: 0.56
    >>Travel Distance: 2.98
    [1428686537.738] End Projectile )))
    [1428686537.738] ((( Start Projectile
    [1428686537.738] Couldn't create a projectile with the given information:
     >Thrown Angle: -33
     > Initial Velocity: 6
    [1428686537.738] End Projectile )))
    [1428686537.738] ((( Start Projectile
    [1428686537.738] Couldn't create a projectile with the given information:
     >Thrown Angle: 72
     > Initial Velocity: -4
    [1428686537.738] End Projectile )))
    [1428686537.738] ((( Start Projectile
    [1428686537.738] Couldn't create a projectile with the given information:
     >Thrown Angle: -12
     > Initial Velocity: 7
    [1428686537.738] End Projectile )))
    [1428686537.738] ((( Start Projectile
    [1428686537.738] Given information:
     >Thrown Angle: 72.00
     >Initial Velocity: 1.00
    >>Vertical Component of Velocity: 0.95
    >>Horizontal Component of Velocity: 0.31
    >>Travel Time: 0.19
    >>Travel Distance: 0.06
    [1428686537.739] End Projectile )))
    [1428686537.739] ((( Start Projectile
    [1428686537.739] Couldn't create a projectile with the given information:
     >Thrown Angle: -72
     > Initial Velocity: 6
    [1428686537.739] End Projectile )))
    [1428686537.739] ((( Start Projectile
    [1428686537.739] Given information:
     >Thrown Angle: 79.00
     >Initial Velocity: 10.00
    >>Vertical Component of Velocity: 9.82
    >>Horizontal Component of Velocity: 1.91
    >>Travel Time: 1.96
    >>Travel Distance: 3.75
    [1428686537.739] End Projectile )))
    [1428686537.739] ((( Start Projectile
    [1428686537.739] Couldn't create a projectile with the given information:
     >Thrown Angle: -69
     > Initial Velocity: -4
    [1428686537.739] End Projectile )))
    [1428686537.739] ((( Start Projectile
    [1428686537.740] Given information:
     >Thrown Angle: 64.00
     >Initial Velocity: 4.00
    >>Vertical Component of Velocity: 3.60
    >>Horizontal Component of Velocity: 1.75
    >>Travel Time: 0.72
    >>Travel Distance: 1.26
    [1428686537.740] End Projectile )))
    [1428686537.740] ((( Start Projectile
    [1428686537.740] Couldn't create a projectile with the given information:
     >Thrown Angle: 50
     > Initial Velocity: -2
    [1428686537.740] End Projectile )))
    [1428686537.741] ((( Start Projectile
    [1428686537.742] Given information:
     >Thrown Angle: 8.00
     >Initial Velocity: 6.00
    >>Vertical Component of Velocity: 0.84
    >>Horizontal Component of Velocity: 5.94
    >>Travel Time: 0.17
    >>Travel Distance: 0.99
    [1428686537.742] End Projectile )))
    [1428686537.742] ((( Start Projectile
    [1428686537.742] Given information:
     >Thrown Angle: 43.00
     >Initial Velocity: 2.00
    >>Vertical Component of Velocity: 1.36
    >>Horizontal Component of Velocity: 1.46
    >>Travel Time: 0.27
    >>Travel Distance: 0.40
    [1428686537.742] End Projectile )))
    [1428686537.742] DEBUG END
```