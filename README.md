# Lab10
Weather Prediction/Logging system made to understand 'Observer Patterns' as part of CSE201 lab

Note :
- Random Numbers generated using a <a href="https://en.wikipedia.org/wiki/Linear_congruential_generator">Linear Congruential Generator</a>. 
- First predictor uses sliding window prediction algorithm
- Second predictor takes the mean of the 100 most recent slopes with the current point as one of the end points,and uses this mean slope to extrapolate the graph.

On average, the second predictor predicts values closer to the actual reading.However,both of them fail at times (which is a lot) and are unable to achieve high accuracy over a long duration, which shows that the random number generator is performing well.
