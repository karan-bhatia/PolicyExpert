Feature: Policy Expert exercise

  @ValidatePersonalDataWhenStatementStatusIs_I_Agree
  Scenario: Validate personal data on Policy Expert page
    Given user opens "Chrome" browser and access Policy Expert URL "https://insurance.policyexpert.co.uk/home"
    And user enters the "Mr","Adam", "Hilton",
    And user enters Date of Birth as "12","May" and "2000"
    And user enters the "Divorced", "Yes", "12121212", "vketipisz@qmetric.co.uk"
    When user selects the status in Statements about you as "Agree"
    And user enters the postcode of the address as "EC2N 4AY"
    And user selects the same correspondence address as "Yes"
    And user selects property type as "House"
    And user selects property description as "Maisonette"
    And user add the the year of property built as "1900"
    And user enters the number of bedrooms in the property as "3"
    And user selects the ownership of property as "No - rented furnished"
    And user enters the property occupied by as "You as sole occupier"
    And user enters the property occupied time as "During the day"
    And user selects the tress taller than 10 meters as "Yes"
    And user selects the flat roof for property as "No"
    Then user selects statements about property as "Agree"

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