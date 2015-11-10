# Lab10
Weather Prediction/Logging system made to understand 'Observer Patterns' as part of CSE201 lab

Note :
- Random Numbers generated using a <a href="https://en.wikipedia.org/wiki/Linear_congruential_generator">Linear Congruential Generator</a>. 
- First predictor uses sliding window prediction algorithm
- Second predictor uses a custom algorithm which assumes that the input doesn't vary from the global mean by more than 10%
- Third predictor takes the mean of all the slopes with the current point as one of the end points,and uses this mean slope to extrapolate the graph.
