# Jakarta EE Overview
This is the repository for the LinkedIn Learning course Jakarta EE Overview. The full course is available from [LinkedIn Learning][lil-course-url].

![Jakarta EE Overview][lil-thumbnail-url] 

Do you need an overview of Jakarta EE as a whole? In this course, Java Champion and Jakarta EE Developer Advocate Ivar Grimstad guides you through the purpose of Jakarta EE and the specifications that you will need to understand. Ivar presents a quick overview of Jakarta EE, its specifications and implementations, the containers you will use for different component types, and the standard units for deployments. He goes into more depth on the Jakarta EE Platform, then dives into Web Profiles and Core Profiles. Packed with useful tips and practical challenges, this course can help you to decide the next steps in your Jakarta EE journey.

_See the readme file in the main branch for updated instructions and information._

## Instructions
The starting point for the challenges are in the main branch of this repository.
The solutions are in separate branches. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the solution videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
The `main` branch holds the starting point for all the challenges.

When switching from one branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

## Installing
1. To use these exercise files, you must have the following installed:
	- Java 17 (or newer)
    - Apache Maven 3.8.x (or newer)
2. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.
3. [Course-specific instructions]
   - Download Eclipse GlassFish 7.0.x from [Eclipse GlassFish Downloads](https://projects.eclipse.org/projects/ee4j.glassfish/downloads)
   - Unzip the downloaded file 
   - Navigate to `glassfish7/bin`
   - Start Apache Derby by typing the following command: `asadmin start-database`
   - Start Eclipse GlassFish by typing the following command `asadmin start-domain`'
4. Tip
   - [HTTPie](https://httpie.io/) is a great tool for interacting with RESTful Endpoints.

## Solutions
*Try to solve the challenge yourself before looking at the solutions*
1. [Challenge 1](https://github.com/LinkedInLearning/jakarta-ee-overview-4379001/tree/02_03)
2. [Challenge 2](https://github.com/LinkedInLearning/jakarta-ee-overview-4379001/tree/03_03)
3. [Challenge 3](https://github.com/LinkedInLearning/jakarta-ee-overview-4379001/tree/04_03)


### Instructor

Ivar Grimstad 
                            


                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/ivar-grimstad).

[lil-course-url]: https://www.linkedin.com/learning/jakarta-ee-overview?dApp=59033956&leis=LAA
[lil-thumbnail-url]: https://media.licdn.com/dms/image/D560DAQE_l0w9P-In5g/learning-public-crop_675_1200/0/1683911963227?e=2147483647&v=beta&t=hrsZbkDLsVF9y1HePeXEIfS6eCR6vrFdDmKj3zitCUA
