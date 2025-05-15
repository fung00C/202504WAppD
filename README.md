# 202504WAppD
Course - Web Application Development

Framework:
Spring Boot

Open the website at this URL:
http://localhost:8084/pj

### H2 Database 
**Name:** 
myDB

**Username:** 
as

**Password:** 
password

### Initial user accounts of your application:

| Login name | Passwork | User type |
| ---------- | -------- | --------- |
| keith | keithpw | Admin User |
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
  1. Information required: username, password, full name, email address, phone number

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


