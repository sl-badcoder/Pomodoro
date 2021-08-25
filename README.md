# Pomodoro
***
__Pomodoro learn technique for cmd__


![GitHub Logo](/photos/test_input.png)

# Installation
* You need Java and Bash installed

```
$ git clone https://github.com/sl-badcoder/Pomodoro.git
$ cd Pomodoro/src
```
If you want to call it from anywhere just create yourself an alias for example: <br>
```
alias pomodorob="bash <path>/src/pro50.sh"
alias pomodoroj="java <path>/src/Timer.java"
```
Add the alias to your CMD config.

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
$ chmod +x pro50.sh
$ ./pro50.sh 4 -w 25 -b 5
```
* First input is how often you want to run the config (here 4)
* Rest is same like for the java script (look below for Help)

# Help
**To get help with the commands to give the script just type:**
```sh 
$ java Timer.java --help
```

# Issues
***
* Some issues may appear by giving -sb and -sw. To test if it works just just add `-t` to the command
* The programm doesnt start with 0 minutes it iterates first and then it stops the time. Maybe I will fix this in the Future.
* If you want to fix some of these bugs just add a pull request. For my console it works so for me its not necessary to update it.
