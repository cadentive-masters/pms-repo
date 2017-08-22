# pms-repo
Product Management System


# GIT Checkin Process

Step1 : 
Go to GIT repositories.
Select a Repository and Fork IT.
It will create a private REPO or copy REPO of the actual repo with all branches available.
<br> 

Step 2:
Copy the forked URL and clone it in your local system folder.<br>
git clone [forked repo url]

<br> 
Step 3:
git remote add upstream [main repo url]<br>
This is one time activity to make a link from your forked repo to Main Repo.

<br> 
Step 4:
If you have branches of the repo then checkout to that branch<br>
git checkout [branch name]

<br> 
Step 5: 
Before modifying the files you can use the command<br>
git pull upstream [branchname]<br>
This command will be used to pull the latest files into your local system folder from the branch selected.<br>

Create or Update the files that are required. Once files are modified, view the difference between old and changed files of repo.<br>
git diff

<br> 
Step 6:<br>
git gui - Open the graphical view of GIT

<br>
stash the changes
Add a commit message and click on commit button to affect the changes done.
Click on push to send the files to your forked repo branch

<br> 
Step 7:<br>
Navigate to your forked repo link in browser
Verify the files checked in.
Create a pull request and add a message for the pull request.

<br> 
Step 8:<br>
Click on Merge Request to merge the changes from your forked repo to master/branch.

Finally the code is ready in your main branch for build and deployment.
