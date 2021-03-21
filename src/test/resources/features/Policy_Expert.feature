Feature: Policy Expert exercise

  @ValidatePersonalDataWhenStatementStatusIs_I_Agree
  Scenario Outline: Validate personal data on Policy Expert page
    Given user opens "Chrome" browser and access Policy Expert URL "https://insurance.policyexpert.co.uk/home"
    And user enters the "<Title>","<FirstName>", "<LastName>",
    And user enters Date of Birth as "<DOBDate>","<DOBMonth>" and "<DOBYear>"
    And user enters the "<MaritalStatus>", "<SmokingStatus>", "<PhoneNo>", "<EmailId>"
    When user selects the status in Statements about you as "<Statements_Status>"

    Examples:
      | Title | FirstName | LastName | DOBDate | DOBMonth | DOBYear | MaritalStatus | SmokingStatus | PhoneNo  | EmailId                 | Statements_Status |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Agree             |

  @ValidatePersonalDataWhenStatementStatusIs_I_Disagree
  Scenario Outline: Validate the data when Statement Status is selected as Disagree
    Given user opens "Chrome" browser and access Policy Expert URL "https://insurance.policyexpert.co.uk/home"
    And user enters the "<Title>","<FirstName>", "<LastName>",
    And user enters Date of Birth as "<DOBDate>","<DOBMonth>" and "<DOBYear>"
    And user enters the "<MaritalStatus>", "<SmokingStatus>", "<PhoneNo>", "<EmailId>"
    When user selects the status in Statements about you as "<Statements_Status>"
    And user selects the status for business purpose property as "<BusinessPurpose_Status>"
    And user selects the type of business from dropdown as "<TypeOfBusiness>"
    And user selects the number of employees as "<NoOfEmployees>"
    And user selects the number of daily visitors as "<DailyVisitors>"
    And user selects max number of paying guests as "<MaxPayingGuests>"
    And user selects max number of children care for "<MaxChildCare>"
    Examples:
      | Title | FirstName | LastName | DOBDate | DOBMonth | DOBYear | MaritalStatus | SmokingStatus | PhoneNo  | EmailId                 | Statements_Status | BusinessPurpose_Status | TypeOfBusiness                                     | NoOfEmployees | DailyVisitors | MaxPayingGuests | MaxChildCare |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Agree                  |                                                    |               |               |                 |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Beauty                                             | 10            | 43            |                 |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Bed and breakfast                                  | 5             |               | 6               |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Registered child-minding                           | 14            | 60            |                 | 6            |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Clerical work only                                 | 14            | 54            |                 |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Fostering                                          | 14            | 54            |                 | 32           |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Guest house                                        | 14            | 54            |                 |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Medical                                            | 14            | 54            |                 |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Production (including artists / photographers etc) | 14            | 54            |                 |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Small hotel                                        | 14            |               | 23              |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Tuition                                            | 14            | 54            |                 |              |
      | Mr    | Adam      | Hilton   | 12      | May      | 2000    | Divorced      | Yes           | 12121212 | vketipisz@qmetric.co.uk | Disagree          | Disagree               | Other                                              | 14            | 54            |                 |              |