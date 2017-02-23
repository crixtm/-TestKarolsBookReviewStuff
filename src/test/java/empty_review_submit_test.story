Meta:

Narrative:
As a user
I want to submit an empty review
So that I can see the empty review in the list

Scenario: submiting an empty review
Given the Bookreview opened
When I submit the review
Then the review should appear in the review list