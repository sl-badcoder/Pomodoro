# Pomodoro
***
__Pomodoro learn technique for cmd__


![GitHub Logo](/photos/test_input.png)

# Input
***
**A typical input looks like this:**
```
$ java Timer.java -w 50 -b 10
```
* -w stands for WorkTime
* -b stands for BreakTime


# Shell Inputs
***
**If you want to run your config more than once use the shell script (pro50.sh):**

```
$ bash pro50.sh 4 -w 25 -b 5
```
* First input is how often you want to run the config
* Rest is same like for the java script (look below for Help)

# Help
**To get help with the commands to give the script just type:**
```sh 
$ java Timer.java --help
```

# Issues
***
* Some issues may appear by giving -sb and -sw. to test if it works just just add `-t` to the command
* The programm doesnt start with 0 minutes it iterates first and then it stops the time. Maybe I will fix this in the Future.
* If you want to fix some of these bugs just add a pull request. For my console it works so for me its not necessary to update it.
