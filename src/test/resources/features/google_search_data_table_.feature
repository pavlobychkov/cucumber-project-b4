Feature: Passing multiple parameters to the same step
  @google_search_data_table @smoke
  Scenario: Searching multiple items
    Given user in on Google search page
    Then user searches the following items
    |item|
    |loop academy|
    |java        |
    |selenium    |
    |cucumber bdd|
    |sql         |
    |Pavlo       |
   And we love loop academy

