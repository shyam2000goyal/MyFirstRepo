@ATM
Feature: ATM Machine Functionality Validation

@ATM_1

Scenario Outline: Validate that ATM machine will display a message when user enter the negative amonut
	Given User has valid card "<CardNumber>" and also have balance on his account
	When User enter the amount "<amount>"
	Then a validation message will display for the negative amount
Examples:
	|CardNumber|amount|
	|12345|-12|
