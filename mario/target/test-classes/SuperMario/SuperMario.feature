# User Stories
#Author: Soumya

@SuperMarioGamingPage
Feature: SuperMario

Background:
Given player is on gaming screen

Scenario: mario moves forward
When player press right arrow
Then mario moves forward

Scenario: mario moves backward
When player press left arrow
Then mario moves backward

Scenario: mario jumps
When player press up arrow
Then mario jump

Scenario: mario bends down
When player press down arrow
Then mario bends down

Scenario: mario jump and shoot
When player press A
Then mario jump
And mario shoot

Scenario: mario shoot
When player press M
Then mario shoot

Scenario: mario moves forward and jump
When player press right arrow
And player press up arrow 
Then mario moves forward and jump

Scenario: mario moves backward and jump`
When player press left arrow
And player press up arrow 
Then mario moves backward and jump


Scenario: mario bend down and moves forward
When player press down arrow 
And player press right arrow
Then mario bends down and moves forward

Scenario: mario bend down and moves backward
When player press down arrow
And player press left arrow
Then mario bends down and moves backward

Scenario: mario moves forward and shoot
When player press right arrow
And player press M
Then mario moves forward and shoot

Scenario: mario moves backward and shoot
When player press left arrow
And player press M
Then mario moves backward and shoot

Scenario: mario jump and shoot
When player press up arrow
And player press M
Then mario jump and shoot

Scenario: mario bend down and shoot
When player press down arrow
And player press M
Then mario bend down and shoot

Scenario: mario moves forward and jump and shoot
When player press right arrow
And player press A
Then mario Moves forward and jump and shoot

Scenario: mario does not move
When player does not press up arrow or down arrow or left arrow or right arrow or A
Then mario does not move

Scenario: mario moves forward and dies
When player there is a hurdel
And pla
Then mario shoot
