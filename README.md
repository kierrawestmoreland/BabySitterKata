# BabySitterKata
Pillar Exercise

Directions (from JamesKBride Github):

This kata simulates a babysitter working and getting paid for one night.  The rules are pretty straight forward:

The babysitter 
- starts no earlier than 5:00PM
- leaves no later than 4:00AM
- gets paid $12/hour from start-time to bedtime
- gets paid $8/hour from bedtime to midnight
- gets paid $16/hour from midnight to end of job
- gets paid for full hours (no fractional hours)

Feature:
As a babysitter
In order to get paid for 1 night of work
I want to calculate my nightly charge

# My thoughts while coding
*First*, I figured I would need a main class to run the application (Main) & a class to figure out the rate (NightlyRate).

*Second*, I created variables within the NightlyRate class:
 * startTime & endTime
 * startTimeLimit & endTimeLimit
 * Payrate for hourly charges of $12, $8, & $16
 
*Next*, I write my first simple test (getBabySitterStartTime)
I want to return a number from my NightlyRate class and see if expected = actual.
The test fails, passes, and then I refactor this test to be associated with the method I think I should've created first (startTimeLimit).
 
BabySitter Time Conversion:
I thought that hard coding the original times into military time would be the easiest thing to do (for hours between 5p & 12a).
For the hours after 12a, I am going to add each hour to 24 until we arrive at 4am which would equal 28 (12am = 24 + 4am = 28).
I think this would serve as an easy conversion to accomplish the goal of the code.

I know I need to check whether or not the babysitter is working within the right hours. 
I also know that I need to calculate each group of hours in each range separately. 
I'm going to start doing that with if statements, but I would like to try this kata again using for loops to increase the number of the hours in each range. 
I'm trying to stick to simple first (if statements) to prevent myself from overthinking. 
