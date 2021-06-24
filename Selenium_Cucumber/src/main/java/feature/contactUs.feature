Feature: Contact Us apparel webpage



@test1
Scenario: Customer submits an Order_ID in Contact Us page
Given User is already on ContactUs page
When User selects the dropdown <"Customer service">
And User provides the details like <"ed@gmail.com"> and <"12345"> and <"message text">
And User clicks on Send button

@test2
Scenario Outline: Customer submits an Order_ID in Contact Us page
Given User is already on ContactUs page
When User selects the dropdown <drpDown>
And User provides the details like <email> and <OID> and <mtext>
And User clicks on Send button

Examples:
|drpDown|email|OID|mtext|
|"Webmaster"|"wills8@gmail.com"|"9876"|"like this"|

@test3
Scenario Outline: Customer submits an Order_ID in Contact Us page
Given User is already on ContactUs page
When User inputs data using <sheetName> and <rowNumber>
And User clicks on Send button

Examples:
|sheetName|rowNumber|
|"ContactUs"|1|
|"ContactUs"|2|

@test4
Scenario: Customer submits an Order_ID in Contact Us page
Given User is already on ContactUs page
