# Activity: Exploring APIs
- TODO: a brief, high-level description of what kind of application your team is thinking of developing.
- TODO: a link to the documentation for an API your team can use related to the domain.
- TODO: a screenshot of using a tool to try out the API (like https://www.postman.com/Links to an external site. or https://hoppscotch.io/Links to an external site.Links to an external site.)
- TODO: example output of running your Java code.
- TODO: a list of any technical problems blocking progress (if any)

## Problem Domain: 

NHL Fantasy Game.

## Application Description: 

Draft and manage a virtual team of players from the NHL and earn points based on their real-life performances.

## Link to API documentation: 

https://gitlab.com/dword4/nhlapi/-/blob/master/stats-api.md#teams

## Screenshots:

<img width="992" alt="Screenshot 2023-09-29 at 2 03 03 PM" src="https://github.com/RMagill46/API-Ex/assets/115095025/9f18a264-5952-4efa-aacf-646e50c5d154">

## Example Output:

[ {
  "id" : "PR",
  "description" : "Pre-season",
  "postseason" : false
}, {
  "id" : "R",
  "description" : "Regular season",
  "postseason" : false
}, {
  "id" : "P",
  "description" : "Playoffs",
  "postseason" : true
}, {
  "id" : "A",
  "description" : "All-Star game",
  "postseason" : false
}, {
  "id" : "WA",
  "description" : "All-Star Women game",
  "postseason" : false
}, {
  "id" : "O",
  "description" : "Olympic game",
  "postseason" : false
}, {
  "id" : "WCOH_EXH",
  "description" : "World cup of hockey exhibition/preseason games ",
  "postseason" : false
}, {
  "id" : "WCOH_PRELIM",
  "description" : "World cup of hockey preliminary games ",
  "postseason" : false
}, {
  "id" : "WCOH_FINAL",
  "description" : "World cup of hockey semifinals and finals ",
  "postseason" : false
} ]

See ApiTestCall.java

## Technical Problems:

Cant retrieve data rightaway, have to wait for season to start
