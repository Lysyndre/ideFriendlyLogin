# ideFriendlyLogin
It's a simple java program which can be used as a Account managemet system in Windows(for now). 
Which has a save system that allows access to created users and create new users.
To be able to IDE friendly I needed to use a different password system hence its hard to hide characters at the console in IDE's.
In each login attempt code checks the password of the existing user privately.
Then picks a random number limited by the length of the password.
Finally asks user to enter #'th number of their password and checks if it's correct or not.

<<<Important Note>>>
In account creation using space bar is not recommended.
Code will only use the data given before the spacebar in both username and password.
