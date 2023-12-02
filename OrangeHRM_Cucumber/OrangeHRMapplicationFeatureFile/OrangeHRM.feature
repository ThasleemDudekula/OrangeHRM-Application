Feature: OrangeHRM application functionalities testing

Scenario: OrangeHRM application LogIn Test

Given User should open the system
When User should enter OrangeHRM application URL Address
Then User should be navigated to OrangeHRM LogIn page
Then User should close the application along with the Browser


Scenario: OrangeHRM application LogIn Test

Given User should open the system
When User should enter OrangeHRM application URL address
Then User should be navigated to OrangeHRM LogIn Page
Then User should enter 	Username and Password and click on LogIn Button
Then User should be navigated to OrangeHRM Application Homepage
Then User should click on WelCOme Admin
Then User should click on LogOut
Then User should be navigated to OrangeHRM Application LogIn Page
Then The User should close the Chrome Browser along with the OrangeHRM Application
 
 
 Scenario Outline: OrangeHRM application LogIn Test with Test Data
 
 Given User should open the system
 When User should enter OrangeHRM application URL address
 Then User should be navigated to OrangeHRM LogIn Page
 Then User should enter "<Username>" and "<Password>" and click on LogIn Button
 Then Usershould be navigated to OrangeHRM application Homepage
 Then User should click on Welcome Admin
 Then User should click on Logout
 Then User should be navigated to OrangeHRM Application LogIn Page
 Then The User should close the Chrome Browser along with the OrangeHRM Application


Examples:
|  UserName     |   Password    |
|  Admin        |   Thasleem@07    |
|  Admin        |   Testing       |
|  Thaslee      |   Thasleem    |
|  Admin        |   Thasleem@07    |
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 