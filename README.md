# 202504WAppD
Course - Web Application Development

Framework:
Spring Boot

Open the website at this URL:
http://localhost:8084/pj

### App Function
a. Website hierarchy: 
  1. The website has an index page, which shows the course name, a list of lectures, and a list of 
  multiple-choice (MC) polls. 
  2.  Each lecture has a course material page, which shows  
    • the lecture title, 
    • the download links of lecture notes, 
    • a list of comments from registered users (including the teachers and students). 
  3.  Each poll has a poll page, which shows 
    • a poll question (e.g., “Which date do you prefer for the mid-term test?”), 
    • exactly four MC options (if a user has selected an option, the selected option will be 
    shown and can be edited), 
    • the current number of votes for each MC option, 
    • a list of comments from registered users (including the teachers and students). 
b. Student registration (for unregistered users) and login function: 
  1. Information includes username, password, full name, email address, and phone number. 
c. Unregistered users can read all contents on the index page but not the other pages.  
d. Registered students can read content on all pages, and do the followings: 
  1. Write new comments. 
  2. Vote for polls (If the user has voted, the chosen option can be edited by the same user). 
  3. Update the user’s personal information except the username. 
e. The teachers (at least one and can be more than one) can do anything a registered student can do, plus 
the followings: 
  1. Edit (add, remove, update) the list of admins and registered users, and their information.   
  2. Add and delete course material pages and poll pages.
  3. Add and delete course materials or comments.
f. A voting history page of a registered user (including the teachers and students). 
g. A comment history page of a registered user (including the lecturer and students). 

