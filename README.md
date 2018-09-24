# Problem Set 2

Problem Set 2 challenges your ability to declare, intialize, and use primitive and basic reference types. You will also need to make use of common arithmetic and String operators. This is your first introduction to methods. It's alright if you're not too sure what they are or how to use them. They'll become increasingly familiar over the coming weeks.

## Getting Started

To get started, you'll need to create a [GitHub](https://github.com/) repository to store your Problem Set 2 code. After cloning my skeleton repository, you'll need to setup a remote to push your code to your repository instead of mine. Steps to accomplish this are outlined below.

### Setup

01. Login to your [GitHub](https://github.com/) account and create a new repository named ```problem-set-2```.
02. In GitBash, navigate to your ```APCSA``` folder.
03. Clone my skeleton repository from [GitHub](https://github.com/). This will make a copy of my repository and store it locally.
```
   >>> git clone git@github.com:rwilson-ucvts/problem-set-2-skeleton.git
```
04. The cloning process will have created a folder named ```problem-set-2-skeleton```. Rename this folder to ```pset2```.
```
   >>> mv problem-set-2-skeleton pset2
```
05. Change directories to get into your ```pset2``` folder.
```
   >>> cd pset2
```
06. Originally, the remote will be pointing at my repository. We need to overwrite this.
```
   >>> git remote rename origin upstream
```
07. Lastly, we need to add a new remote that points at the repository you created earlier. Make sure you replace YOUR-USERNAME with your actual username.
```
   >>> git remote add pset2 git@github.com:YOUR-USERNAME/problem-set-2.git
```
08. Launch Eclipse and set the ```Workspace``` to the ```APCSA``` folder you created on your ```Desktop```. Make sure you're using your ```Workspace```, as others' will be similarly named.
09. From within the ```Package Explorer``` (the left-most panel), right-click and select ```Import...```.
10. Select ```Git > Projects from Git```, and click ```Next >```.
11. Select ```Existing local repository``` and click ```Next >```.
12. Click the ```Add...``` button, and then the ```Browse...``` button.
13. Navigate to the ```APCSA``` folder on your ```Desktop```, click the ```pset2``` project folder, and click ```Open```.
14. Select the checkbox next to your project and click ```Finish```.
15. Now that we've imported the Git project, we can click ```Next >```, ```Next >```, and ```Finish``` once more.

You should now see a ```Project``` in the ```Package Explorer``` in Eclipse.

16. Expand the ```Project``` folder. You should see the ```JRE System Library``` folder, as well as the ```src``` folder.
17. Expand the src folder. You should see a single source file named ```ProblemSet2.java```. Double-click to open it.

If you see the following starter code, then you've correctly cloned and setup your project.

![problem set 2 skeleton code screenshot](https://www.ucvts.tec.nj.us/cms/lib/NJ03001805/Centricity/domain/760/apcsa-images/pset2-skeleton.png)

## Exercises

Problem Set 2 contains 5 exercises, each of which will be written in separate methods. The ```main``` method has already been written for you. You do not need to modify it, except to uncomment lines of code to test your solutions (more on this later).

### Exercise 1 (```sayHello```)

In the ```sayHello``` method, you'll be implementing a program that first prompts the user for his or her first and last name. After receiving this information, the program should print a simple message to the console: ```Hello, First Last!``` (i.e., the first and last names the user entered). Be sure you declare, instantiate, use, and close the ```Scanner``` appropriately.

### Exercise 2 (```gradeMe```)

In the ```gradeMe``` method, you'll be implementing a program that prompts the user for three of each of the following: homework scores, quiz scores, and test scores. These averages are worth 15%, 30%, and 55%, respectively, of your final grade. Your method should print your final grade in the following format: ###.##%. Again, make sure you're closing your ```Scanner``` as needed.

### Exercise 3 (```groupUs```)

In the ```groupUs``` method, you'll be implementing a program that prompts the user for the number of students and teachers (in separate prompts) attending a field trip. The operating assumption is that each bus can accommodate 47 people (in addition to the driver). Your program should report how many buses are required, as well as the number of people on each bus.

### Exercise 4 (```info```)

In the ```info``` method, you'll be implementing a program that asks the user to enter his or her personal information: first name, last name, grade, age, and hometown (in that order). Your program should then print this information to the console in the following format.

```
NAME     : {first name} {last name}
GRADE    : {grade}
AGE      : {age}
HOMETOWN : {hometown}
```

### Exercise 5 (```initials```)

In the ```initials``` method, you'll be implementing a program that prompts the user to separately enter his or her first, middle, and last names. Your program should then print his or her intials in a single print statement. Please use the same output below for guidance.

```
Please enter your first name: Samantha
Please enter your middle name: Marie
Please enter your last name: Smith

Your intials are SMS.
```

## Deadline

Your Canvas submission is due at or before 11:59pm on your section-specific due date.
* September 27, 2018 (A 9/10)
* September 28, 2018 (B 1/2)

### Submission Requirements

All that is required for submission is the URL to your [GitHub](https://github.com/) repository for this problem set.
