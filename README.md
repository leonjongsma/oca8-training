# oca8-training

Assignment Overview:

World Cup football fever has hit the world! To celebrate, we are going to build an
object-oriented Java application you can use to manage the tournament. You are
going to code an application that allows a user to enter a number of teams, place
them in groups, and keep the team and group statistics throughout the “group” stage
of the tournament. The basic program structure could be adapted to any sport;
however we will focus on the 2010 FIFA World Cup, being held in South Africa.
Basic rules of the FIFA World Cup group stage:
1. There are 8 groups, with each group having 4 teams.
2. Each team will play each other team in a group during the “group” stage. This
means each team plays 3 matches during this stage.
3. If a team wins a match, they are awarded 3 points. If a team draws a match,
they are awarded 1 point. If a team loses a match, they are not awarded any
points.
4. The number of goals they score in a match is added to their “Goals For” total.
The number of goals scored against them in a match is added to the “Goals
Against” total.
5. The order of the teams in a group is based on the number of points that each
team has earned. In the event two or more teams have the same number of
points, those teams can be in any order.
6. The top two teams from each group progress to the next round of the World
Cup.

Your program should have the following functionality using a menu system:

1. Allow the user to “Populate a Group”. This involves entering the details of 4
teams that will make up a group. Although 8 groups are present in the real
World Cup, for the purpose of ease of data entry and testing of the
application, only 2 groups need to be created in this assignment.

2. Allow the user to input the results of a match that has been played. The user
must select the group and teams involved, and then enter the number of
goals scored by each team.

3. Display the current ladder of each group. A ladder is the order of the teams in
a group. The order in which teams appear on the ladder is based on the rules
of point 5 above.

4. Run a report to show the final standings at the end of the group stage. When
all teams in all groups have played each other in a group (every team has
played 3 matches), the report can be run to show the top two teams from
each group that will be progressing to the next round. This report can only be
run if all teams in all groups have played 3 matches each.

5. Quit the application.