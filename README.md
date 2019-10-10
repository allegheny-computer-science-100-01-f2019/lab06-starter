# cs100f2019-lab6-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter materials for Laboratory 6 in Computer Science 100.

 Since the Travis builds for this repository will initially fail (as evidenced by
 a red &#x2717; appearing in the commit logs instead of a green &#x2714;), the
 programmer is responsible for completing all of the steps needed to satisfy the
 requirements for the assignment, thus causing a &#x2714; to instead appear in
 the commit logs.

## Introduction

This assignment requires a team of programmers to implement and test a Java program,
called `AnalyzeText`, that will produce textual output demonstrating a simple
analysis of a book. First, the program will display the name of the
programmer and the date at which the program was run. Then, it will display the
information about the book, such as its title, author, the number of words it has.
Finally, the program will allow the user to search for specific keywords in the book.
As verified by [Checkstyle](https://github.com/checkstyle/checkstyle), the source code for the
`AnalyzeText.java` file must adhere to all of the requirements in the [Google
Java Style Guide](https://google.github.io/styleguide/javaguide.html).

The developer is also responsible for writing a reflection document, written in
a Markdown language that adheres to the standards described
in the [Markdown Syntax Guide](https://guides.github.com/features/mastering-markdown/)
and answers the questions outlined in the template reflection document. Remember, you
can preview the contents of a committed Markdown file by clicking on the name of
the file in your GitHub repository.

The source code in the `AnalyzeText.java` file must also pass additional tests
set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader).
GatorGrader will check the following characteristics of your implementation:

* The `AnalyzeText` program must:
  * Contain at least 10 single-line comments and 2 multi-line comments
  * Include at least 8 `println` statements
  * Use `new Scanner`, `new File`, `FileNotFoundException` commands.
  * Declare at least two `int` variables.
  * Utilize conditional `if` and repetition `while`statements.
  * Use at least one boolean OR expression.
  * Perform and display textual analysis of the book as outlined in the
    assignment sheet

When you use the `git commit` command to transfer your source code to your
GitHub repository, [Travis CI](https://travis-ci.com/) will initialize a build
of your assignment, checking to see if it meets all of the requirements. If both
your source code and writing meet the established requirements, then you
will see a green &#x2714; in the listing of commits in GitHub. If your
submission does not meet the requirements, a red &#x2717; will appear instead.
The instructor will reduce a programmer's grade for this assignment if the red
&#x2717; appears on the last commit in GitHub immediately before the
assignment's due date.

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides. In particular, please make sure that you have read the
following GitHub guides: [Mastering
Markdown](https://guides.github.com/features/mastering-markdown/), [Hello
World](https://guides.github.com/activities/hello-world/), and [Documenting Your
Projects on GitHub](https://guides.github.com/features/wikis/). Each of these
guides will help you to understand how to use both [GitHub](http://github.com) and
[GitHub Classroom](https://classroom.github.com/).

To do well on this assignment, you should also review Chapter 3 and 4 and study
Sections 5.1 through 5.4. Please see the course instructor or one of the
technical leaders if you have questions about any of these reading assignments.

## System Commands

This project invites students to enter system commands into a terminal window.
This assignment uses [Docker](https://www.docker.com) to deliver programs, such
as `gradle` and the source code and packages needed to run
[GatorGrader](https://github.com/GatorEducator/gatorgrader), to a students'
computer, thereby eliminating the need for a programmer to install them on their
development workstation. Individuals who do not want or can not install Docker can
optionally install of the programs mentioned in the [Project
Requirements](#requirements) section of this document. Once all the required
programs are installed locally on a machine, a software developer can type the
various `gradle` commands directly in the terminal.

### Using Docker

Once you have installed [Docker Desktop](https://www.docker.com/products/docker-desktop), you can use the
following `docker run` command to start `gradle grade` as a containerized
application, using the [DockaGator](https://github.com/GatorEducator/dockagator)
Docker image available on [DockerHub](https://cloud.docker.com/u/gatoreducator/repository/docker/gatoreducator/dockagator).

```bash
docker run --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator
```

The aforementioned command will use `"$(pwd)"` (i.e., the current directory) as
the project directory and `"$HOME/.dockagator"` as the cached GatorGrader
directory. Please note that both of these directories must exist, although only
the project directory must contain something. Generally, the project directory
should contain the source code and technical writing of this assignment, as
provided to a student through GitHub. Additionally, the cache directory should
not contain anything other than directories and programs created by DockaGator,
thus ensuring that they are not otherwise overwritten during the completion of
the assignment. To ensure that the previous command will work correctly, you
should create the cache directory by running the command `mkdir
$HOME/.dockagator`. If the above `docker run` command does not work correctly on
the Windows operating system, you may need to instead run the following command
to work around limitations in the terminal window:

```bash
docker run --rm --name dockagator \
  -v "$(pwd):/project" \
  -v "$HOME/.dockagator:/root/.local/share" \
  gatoreducator/dockagator
```

Since the above `docker run` command uses a Docker images that, by default, runs
`gradle grade` and then exits the Docker container, you may want to instead run
the following command so that you enter an "interactive terminal" that will
allow you to repeatedly run commands within the Docker container.

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

Once you have typed this command, you can use the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) in the Docker container by
typing the command `gradle grade` in your terminal. Running this command will
produce a lot of output that you should carefully inspect. If GatorGrader's
output shows that there are no mistakes in the assignment, then your source code
and writing are passing all of the automated baseline checks. However, if the
output indicates that there are mistakes, then you will need to understand what
they are and then try to fix them.

Here are some additional commands that you may need to run when using Docker:

* `docker info`: display information about how Docker runs on your workstation
* `docker images`: show the Docker images installed on your workstation
* `docker container list`: list the active images running on your workstation
* `docker system prune`: remove many types of "dangling" components from your workstation
* `docker image prune`: remove all "dangling" docker images from your workstation
* `docker container prune`: remove all stopped docker containers from your workstation
* `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

### Using Gradle

You can complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is correct) the program using the command `gradle
build`. Running the command `gradle -q --console plain run` will suppress the display of
Gradle's diagnostic information and only produce output of the program.
Here are some other commands that you can type:

* `gradle grade`: run the [GatorGrader](https://github.com/GatorEducator/gatorgrader) tool to check your work
* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* gradle -q --console plain run*: run the Java program without Gradle's extraneous information
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base")
directory for this assignment where the `build.gradle` file is located.

## Expected Program Output

Due to the inherent randomness in this program's output, typing the command
`gradle run` in the terminal window produces textual output that will differ
from the instructor's version of `AnalyzeText` shown below. Your program must adhere to
all of the requirements for the assignment and pass all of the verification
checks, producing textual output that follows the pattern that is given on the
assignment sheet. In particular, please remember that the purpose of the
`AnalyzeText` program is to perform simple analysis of text &mdash;
make sure that your program displays all pertinent information.

```
$ gradle -q --console plain run
Janyl Jumadinova Wed Oct 09 17:04:29 EDT 2019
ULYSSES S. GRANT

BY

WALTER ALLEN
There are 27910 number of words in this book
Please enter two single keywords
time
life
Occurrence # 0: extended, in its destruction of life and waste of property, in the
Occurrence # 1: on which there may always be two opinions. As time passes, and the
Occurrence # 2: chastened judgment of coming time, will appear to all men, as even now
Occurrence # 3: In the story of Grant's life some things must be told that are not at
Occurrence # 4: good. The lesson and encouragement of his life are that in spite of
Occurrence # 5: weaknesses which at one time seemed to have doomed him to failure and
Occurrence # 6: hard desperate work of life in a new country, where everything depended
Occurrence # 7: "Stand Fast;" in another, "Stand Sure." Sometimes Latin equivalents were
Occurrence # 8: he learned thoroughly, and made the chief occupation of his life. Soon
Occurrence # 9: Ravenna, Portage County, Ohio. In a short time he removed to Point
Occurrence # 10: but he had no contempt for knowledge. Throughout his life he was a
Occurrence # 11: maternal instincts. Her life was centred in her home and family. Both
Occurrence # 12: at West Point. His life was that of other boys of like condition, with
Occurrence # 13: at a time when a large part of all traveling was done on horseback. As
Occurrence # 14: account of this period of his life is: "When I was seven or eight years
Occurrence # 15: miles away, several times alone; also Maysville, Ky., often, and once
Occurrence # 16: at the same time.... The rod was freely used there, and I was not exempt
Occurrence # 17: it. Probably he took it as a part of life, something that had to be
Occurrence # 18: interested. The family life was serious but not severe. Obedience and
Occurrence # 19: one matter,--he would not be a tanner for life. He told his father,
Occurrence # 20: possibly in response to some suggestion that it was time for him to quit
Occurrence # 21: his aimless occupations and begin his lifework, that he would work in
Occurrence # 22: account of what happened when this door to an education and a life
Occurrence # 23: time to other things, not in the routine prescribed. He pursued a
Occurrence # 24: time at the academy. But this, too, was easy for him. He appears to have
Occurrence # 25: life vitiated by vices. He was neither profane nor filthy. His
Occurrence # 26: barracks and gave much time to society in the neighborhood. Grant had
Occurrence # 27: social life. A few miles away was the home of his classmate and chum
Occurrence # 28: This was the time of the agitation regarding the annexation of Texas, a
Occurrence # 29: all his vicissitudes of fortune until his death. Their life together was
Occurrence # 30: his later life, but his heart was never enlisted in the cause for which
Occurrence # 31: the most sanguinary and expensive war of modern times."
Occurrence # 32: But the Mexican war changed Grant's plan of life. While he was at
Occurrence # 33: devoted much time to reviewing his studies and extending them, giving
Occurrence # 34: his commanders, who held it for a time to afford him an opportunity to
Occurrence # 35: his necessities nor his duties saved him from being sometimes overcome
Occurrence # 36: These thirteen quiet years of Grant's life are not of account in his
Occurrence # 37: his life that could not be escaped. Nor in the pride and power of his
Occurrence # 38: dearest could not have esteemed his life successful, even in its humble
Occurrence # 39: enthusiasm. He met for the first time many leading men of the State, and
Occurrence # 40: His orders were changed at different times, until finally he was
Occurrence # 41: any fighting; but generals were at that time made with haste to meet
Occurrence # 42: friend. There were times when both army and people were impatient with
Occurrence # 43: In the last days of August, having been occupied, meantime, in reducing
Occurrence # 44: under fire for the first time, but they drove the enemy and captured the
Occurrence # 45: criticised at the time as unnecessary; but General Grant always asserted
Occurrence # 46: formally assigned to the command until October. The intermediate time
Occurrence # 47: he made this suggestion to the War Department, at the same time
Occurrence # 48: strain he did sometimes yield to this temptation. But he never yielded
Occurrence # 49: For a long time he was unconscious. As soon as he could be moved he was
Occurrence # 50: he was unable to leave his bed. Meantime he was repeatedly called upon
Occurrence # 51: the Cumberland to be only a question of time and famine, sent Longstreet
Occurrence # 52: the leading men in civil official life, who were sustaining the armies
Occurrence # 53: time acted independently.
Occurrence # 54: This crisis of Grant's life should not be passed over without allusion
Occurrence # 55: life the respect and love of friends, and the homage of millions of
Occurrence # 56: renewed, and continued with varying fortunes, at one time one army, and
Occurrence # 57: at another time the opposing army, having the advantage. There was, in
Occurrence # 58: enemy's line and broke through it, want of timely and vigorous support
Occurrence # 59: ended the sixth day of very heavy fighting. The result to this time is
Occurrence # 60: the enemy. We have lost to this time 11 general officers killed,
Occurrence # 61: than any one else the terrible cost of life which his unrelenting
Occurrence # 62: spirit in accordance with the habit of his life. No folly or
Occurrence # 63: all times, and the "simple faith in success" that would not let him be
Occurrence # 64: small house where Lee awaited him. Within a short time the conditions
Occurrence # 65: and lingering, as if presentiment of a crisis in his life oppressed him.
Occurrence # 66: of an army opposed to the Union was dissolved. But meantime Lincoln had
Occurrence # 67: manner of life they had abandoned.
Occurrence # 68: and the Republican parties, although from the time of his break with
Occurrence # 69: deprived the President of a wise and staunch personal friend at a time
Occurrence # 70: alleged that the sentiment of the people of Santo Domingo had not been
Occurrence # 71: of annexation; but the hostile sentiment in Congress and among the
Occurrence # 72: of official life, and a steady growth of corruption and abuses in the
Occurrence # 73: by the majority. The Democratic party, meantime, making a virtue of
Occurrence # 74: course or open his eyes to the true sentiment of the nation. Instead of
Occurrence # 75: the department at the same time. Mr. Bristow was succeeded by an
Occurrence # 76: During this time affairs in the Southern States were, as a rule, growing
Occurrence # 77: this time-honored custom would be unwise, unpatriotic, and fraught with
Occurrence # 78: learning, and their social life. He was received with high courtesies by
Occurrence # 79: that the rest of life was but a few months of increasing torture. Then
Occurrence # 80: disposition than the narration for the public of his own life story. But
Occurrence # 81: in his circumstances, the question was not one of sentiment, but only of
Occurrence # 82: outward manifestations of his life.
Occurrence # 83: people in all walks of life.
Keywords "time" and "life" appeared 84 number of times.

Thank you for using the AnalyzeText program.
 Have a wonderful day.

```

## Using Travis CI

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
[GatorGrader](https://github.com/GatorEducator/gatorgrader) and additional
checking programs every time you commit to your GitHub repository. The checking
will start as soon as you have accepted the assignment &mdash; thus creating your own
private repository &mdash; and the course instructor and/or GitHub enables Travis for
it. If you are using Travis for the first time, you will need to authorize
Travis CI to access the private repositories that you created on GitHub. If you
do not see either a yellow &#9679; or a green &#x2714; or a red &#x2717; in your
listing of commits, then please ask the instructor to see whether or not
Travis CI was correctly enabled.

## System Requirements

We developed this assignment to work with the following software and versions:

- Docker Desktop
- Operating Systems
  - Linux
  - MacOS
  - Windows 10 Pro
  - Windows 10 Enterprise
- Programming Language Tools
  - Gradle 5.4
  - OpenJDK 11.0.4
  - Python 3.6 or 3.7

## Reporting Problems

If you have found a problem with this assignment's provided source code or
documentation, then you can go to the [Java Assignment 06 Starter
100-01](https://github.com/allegheny-computer-science-100-01-f2019/lab06-starter)
repository and [raise an
issue](https://github.com/allegheny-computer-science-100-01-f2019/lab06-starter/issues).
If you have found a problem with the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks
your assignment, then you can also [raise an
issue](https://github.com/GatorEducator/gatorgrader/issues) in that repository.
To ensure that your issue is properly resolved, please provide as many details
as is possible about the problem that you experienced. If you discover a problem
with the assignment sheet for this project, then please raise an issue in the
GitHub repository that provides the assignment sheets for your course.

Whenever possible, individuals who find, and use the appropriate GitHub issue
tracker to correctly document, a mistake in any aspect of this assignment will
receive free [GitHub stickers](https://octodex.github.com/) and extra credit
towards their grade for the project.

## Receiving Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a technical leader during the
course session. Alternatively, you may ask questions in the Slack workspace for
this course. Finally, you can schedule a meeting during the course instructor's
office hours.

## Project Assessment

The grade that a student receives through Sakai on this assignment will have the following components:

- **Percentage of Correct GatorGrader Checks [up to 75%]**: Students are encouraged to
  repeatedly try to implement a Java program that passes all of GatorGrader's
  checks by, for instance, creating a program that produces the correct output.
  Students should also repeatedly revise their technical writing to ensure that
  it also passes all of GatorGrader's checks about, for instance, the length of
  its content and its appropriate use of Markdown.

- **Travis CI Build Status [5%]**: Since additional checks on the source code and/or
  technical writing may be encoded in Travis CI's actions and, moreover, all of
  the GatorGrader checks are also run in Travis CI, a portion of the students' lab grade
  depends on whether their last before-the-deadline build passes and a green
  &#x2714; appears in their GitHub commit log instead of a red &#x2717;. As with
  the previous grading component, students are encouraged to repeatedly revise
  their source code and technical writing in an attempt to get their Travis CI
  build to pass.

- **Mastery of Technical Writing [up to 10%]**: Students will also receive this portion of the lab grade
  when the responses to the technical writing questions presented in the
  `writing/reflection.md` reveal a mastery of both writing skills and technical
  knowledge. To receive this portion of the grade, the submitted writing should have
  correct spelling, grammar, and punctuation in addition to following the rules
  of Markdown and providing technically accurate answers. Students are
  encouraged to ask the course instructor or a student technical leader to use
  the GitHub issue tracker to provide feedback on their mastery of technical
  writing skills.

- **Mastery of Technical Knowledge and Skills [up to 10%]**: Students will receive
  a portion of their assignment grade when their GitHub repository
  reveals that they have  mastered all of the technical
  knowledge and skills developed during the
  completion of this project. As a part of this grade, the instructor will
  assess aspects of the project including, but not limited to, the use of
  effective source code comments and Git commit messages. Students are
  encouraged to ask the course instructor or a student technical leader to use
  the GitHub issue tracker to provide feedback on how well their work
  demonstrates mastery of the assignment's technical knowledge and skills.
