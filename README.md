# DocuSignCodingChallenge

This project is coded in Java.

It has 

2 Data Transfer Object Classes (POJO)
	Type Class
		Variables with description and hot/cold responses and their getter and setter methods.
	Input Class
		Temperature type variable and Type class variables for setting the values according to different commands.
1 Validation Class for validating input 
1 Process Class for processing validated input
1 DecodeInput Class for decoding the input in proper format
1 DressingSense Class which is main class and calls the validation class function to validate the input.
	If the input is valid and according to the business rules, it gives the input to the process class which process the input commands.

9 User Defined Exception classes which can be thrown in Validation class if input doesn't satisfy the give business rules.


The output of this project wont be same as expected in the problem statement. It seems, for every command, a command must be processed and if wrong command is 
entered, the message 'fail' is thrown.
This takes processing time for every command and hence pro-actively I used a logic, where the commands will be validated first and if the satisfies the criteria/business rules, then only all the commands will be processed.
This would be a better way/approach in a real time scenario.

For convenience, I have also put the reason of failure of the input commands. Else, we can normally output 'fail' as a status for invalid command.


Expected Input
Temperature Type Command - Space - Comma separated numeric Commands without space

Ouput:
For invalid input
	Wrong command ------> fail
For invalid command
	Wrong Command ------> fail
For wrong order command
	<Reason of Wrong order> ------> fail
For valid input and corectly ordered command
(Hot/Cold) Responses depending on temperature type.


Test Cases

1. HOTT 8,6,4,2,1,7
Wrong temperature command entered ------> fail

2. COLT 8,6,4,2,1,7
Wrong temperature command entered ------> fail

3. COLD 8,6,4,2,1,7,8,8
Wrong no of arguments entered ------> fail

4. COLD 8,6,4,2,1,7,10
Wrong command entered ------> fail

5. HOT 8,6,6
One of the command is repeated ---->fail

6. HOT 8,6,3
No Proper Cloths ---->fail

7. COLD 8,6,3,4,2,5,7
No Proper Cloths ---->fail

8. COLD 6
Pajamas Not Removed ---->fail

9. HOT 8,6,4,2,1,7
Removing PJs,shorts,t-shirt,sun visor,sandals,leaving house,

10. COLD 8,6,3,4,2,5,1,7
Removing PJs,pants,socks,shirt,hat,jacket,boots,leaving house, 

11. COLD 8,6,3,4,2,5,7,1
Leaving House with No Proper Cloths ---->fail

12. HOT 8,6,4,2,7,1
Leaving House with No Proper Cloths ---->fail


 
