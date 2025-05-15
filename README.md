# 202504WAppD
Course - Web Application Development

Framework:
Spring Boot

Open the website at this URL:
http://localhost:8084/pj

### H2 Database 
**Name:** myDB
**Username:** as
**Password:** password

###Initial user accounts of your application:

| Login name | Passwork | User type |
| ---------- | -------- | --------- |
| keith | keithpw | Admin, User |
| john | johnpw | User |
| code | codepw | User |

## App Function

### Website Hierarchy

1. **Index Page**
   - Course name
   - List of lectures
   - List of multiple-choice (MC) polls

2. **Lecture Page**
   - Lecture title
   - Download links of lecture notes
   - List of comments from registered users (including teachers and students)

3. **Poll Page**
   - Poll question (e.g., "Which date do you prefer for the mid-term test?")
   - Four MC options (editable if selected)
   - Current number of votes for each option
   - List of comments from registered users

### Student Registration and Login

- **Registration (Unregistered Users)**
  - Information required: username, password, full name, email address, phone number

- **Functionalities for Registered Students**
  1. Write new comments
  2. Vote in polls (editable selection)
  3. Update personal information (excluding username)

### Teacher Functionalities

- In addition to student capabilities, teachers can:
  1. Manage admins and registered users
  2. Add/delete course material and poll pages
  3. Add/delete course materials or comments

### Additional Pages

- **Voting History:** Shows the voting history of a user (including teachers and students)
- **Comment History:** Displays the comment history of a user (including teachers and students)

### App Function
a. Website hierarchy: 
  1. The website has an index page, which shows the course name, a list of lectures, and a list of 
  multiple-choice (MC) polls. 
  2.  Each lecture has a course material page, which shows
     • the lecture title, 
     • the download links of lecture notes, 
     • a list of comments from registered users (including the teachers and students). 
  4.  Each poll has a poll page, which shows
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

e. The teachers (at least one and can be more than one) can do anything a registered student can do, plus the followings: 
  1. Edit (add, remove, update) the list of admins and registered users, and their information.   
  2. Add and delete course material pages and poll pages.
  3. Add and delete course materials or comments.

f. A voting history page of a registered user (including the teachers and students). 

g. A comment history page of a registered user (including the lecturer and students). 

