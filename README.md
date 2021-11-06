# Group Name: The Phantom Troupe 
COSC 338 Group Project

Scrum is a type of software development that helps teams organize, plan, and review work for upcoming sprints. This proposal comes from an experience of being in unorganized scrum meetings/business environments where the team was not on the same page. The problem this project will solve is the problem of group members going into different directions in projects.
	Conceptually to complete this project, we need to allow communication through apps(like how people can post to the codepath discussion board), UI for the different classes, and classes to complete the functionality of the backend.
	The product experience will leave the user with an understanding of what they and their teammates need to complete and see each other’s progress. It will include real time updates and push notifications. The value of the app to the user is clear, friends and peers can greatly benefit from this app, students complete group projects and start businesses frequently. The market for this app is huge, everyday people are coming together with their ideas and this application can help them keep track perfectly and look at the data logged. This app will be used regularly by users in work environments to see updates on the team and their progress. The objective of the application is clear, help teams keep track of progress in a work environment. This application will be perfect for small businesses that need to keep track of team progress as a whole. I’d like for more features to be added as time progresses. This app will be a challenging application to complete, we will be implementing features from Parse and other applications.
	
- [x] Story 1: Establish layout/UI for application
- [ ] Story 2: Connect UI to backend
- [ ] Story 3: Create database for users 
- [ ] Story 4: Implement task update in real time
- [ ] Story 5: Implement past tasks feature 
- [ ] Story 6: Test

Navigation Flow: The user will start on the login, once logged in they will be able to see the tasks that are currently in progress. If they click the menu they will be prompted and depending on the option they will be navigated to that screen. (I.e clicking the "Enter Task" button in the menu will take them to a page where they input a task to be completed.)
	


1. User Stories (Required and Optional)
Required Must-have Stories

* User logs in to access previous tasks
* User can scroll and see past tasks
* Percentage bar showing how much left to do
* Help button on task
* Menu (Dash, Notification, Mark complete, etc.)
2. Optional Nice-to-have Stories

* Notes Section 
* Calendar
* Project Recap
* Take picture of a board and the app writes the task down automatically 

MODEL | POST

| Property | Type | Description |
| --- | --- | --- |
| task | String | The tasks to be completed |
| --- | --- | --- |
| author | Pointer to User | The task author |
| --- | --- | --- |
| createdAt | DateTime | Tells when someone posted a task |
| --- | --- | --- |
| completedAt | DateTime | Shows when task was completed |
| --- | --- | --- |
| help | Boolean| User can indicate if they need help on a task or not |
| --- | --- | --- |
| completionPercentage | float| Users can show the completion percentage of their task |
		
NETWORKING

List of network requests
* Home Feed Screen
	* READ/GET: Query all tasks from users
	* Create/POST: User will be able to create task
	* Delete: User will be able to delete post/s

* Create Task Screen
	* Create: New task object
