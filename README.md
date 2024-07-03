<h1>Programmatic Representation of an Internal Combustion Engine</h1>
<p>This is a simplified breakdown of a 4-stroke fuel-injected internal combustion engine.</p>
<p>I wanted to play around with creating a Java application representing a real-world object.
A combustion engine seemed to be an interesting exercise in breaking down an object into
individual components and representing them as classes which then need to interact to create
a larger object.</p>

<h2>Project Scope</h2>
<p>This simulation should aim to capture the following functionality:

<b style="color:mediumseagreen">1. User Experience</b> 
   1. A user can turn the simulation on and turn it off again.
   2. The user can step through the 4 parts of the combustion cycle in forward and reverse motion. 
   3. The user can see the status of each component at a given step. For example:
      1. The position of the piston. 
      2. The contents of the combustion chamber. 
      3. The status of the spark plug or valves.

<b style="color:mediumseagreen">2. Engine Components</b>
The following components should be included and fully functional:

| Crankshaft          | Camshaft          | Cylinder           | Valves               |
|:--------------------|:------------------|:-------------------|:---------------------| 
| Shaft               | Shaft             | Combustion Chamber | Intake Valve         | 
| Connecting Rod      | Intake Cam        | Sparkplug          | Intake Rocker Arm    | 
| Piston              | Exhaust Cam       | Piston Head        | Intake Valve Spring  | 
| Crankshaft Sprocket | Camshaft Sprocket |                    | Exhaust Valve        | 
|                     |                   |                    | Exhaust Rocker Arm   | 
|                     |                   |                    | Exhaust Valve Spring |

> - Each component should have the ability to be turned on and off individually.
> - Each component should display the output values of that component.
> - A single component being on or off should not affect the functionality of other components.
> - All the components should be unique classes with specific properties that are mutable or immutable depending on the context.

<b style="color:mediumseagreen">3. The Simulation</b> 
   1. The application should start with the engine off. 
   2. The start method should initiate all the components to cycle automatically. 
   3. The manual / automatic toggle should enable or disable the ability to step through each part of the combustion cycle. 
   4. When enabled, the manual mode should allow the user to step through the cycle using the forward or reverse methods. 
   5. Each step of the cycle should display the relevant status information for each component. 
   6. The start / stop method should resume from the last position.

---

<h2>The Combustion Cycle</h2>
<b style="color:cornflowerblue">Intake (Down Stroke)</b>

1. Piston travels from Top Dead Center (TDC) to Bottom Dead Center (BDC).
   1. A vacuum is created in the cylinder.
   2. Low air pressure in the cylinder draws atmospheric high air pressure in.
2. Air being drawn into the cylinder brings fuel to create an air/fuel mixture.
   1. When the piston reaches BDC, the cylinder is filled with the air/fuel molecules.

<b style="color:mediumpurple">Compression (Up Stroke)</b>

1. The piston travels from BDC to TDC.
   1. The air/fuel mixture in the cylinder is compressed as the piston travels on the up-stroke.
2. Just before the piston reaches TDC, the Spark Plug ignites the fuel mixture.
   1. The molecules that are between the spark plug contacts are ignited.
   2. The molecules adjacent to the ignited molecules are heated until they ignite.
   3. The chain reaction continues until all the air/fuel mixture has been ignited (deflagration).

<b style="color:chocolate">Combustion (Down Stroke)</b>

1. The piston travels from TDC to BDC.
   1. Because the cylinder is sealed, the pressure build-up from the ignited fuel pushes the piston down.
   2. This is the only part of the cycle that generates energy which is converted into motion.
2. By the time the piston reaches BDC, all the air/fuel mixture has been spent and the cylinder is filled with exhaust.

<b style="color:mediumseagreen">Exhaust (Up Stroke)</b>

1. The piston travels from BDC to TDC.
   1. As the piston travels back up, the exhaust is pushed out of the exhaust port in the cylinder and out of the engine.