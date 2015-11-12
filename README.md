# Lab10
Weather Prediction/Logging system made to understand 'Observer Patterns' as part of CSE201 lab

###About
- Random Numbers generated using a <a href="https://en.wikipedia.org/wiki/Linear_congruential_generator">Linear Congruential Generator</a>. 
- First predictor uses sliding window prediction algorithm
- Second predictor takes the mean of the 100 most recent slopes with the current point as one of the end points,and uses this mean slope to extrapolate the graph.

###Result
On average, the second predictor performs better.However,both of them fail are too off from the actual reasings at times  and are unable to achieve high accuracy over a long duration, which shows that the random number generator is performing well.
