Feature: Sample test

    Scenario: Create a new Sample entity
    Given the API endpoint to create an entity
    When I send a POST request with JSON payload
    Then the response status should be 201 Created
    And the entity should be created in the database

    Scenario: Recieve an existing Sample entity
    Given the API endpoint to retrieve an Sample entity
    When I send a GET request with any entity ID
    Then the response status should be 200 OK
    And the Sample entity details should be returned

    Scenario: Update an existing Sample entity
    Given the API endpoint to update a Sample entity
    When I send a PATCH request with any entity ID and JSON payload
    Then the response status should be 200 OK
    And the Sample entity should be updated int the database

    Scenario: Delete an existing Sample entity
    Given the API endpoint to delete a Sample entity
    When I send a DELETE request with any entity ID
    Then the response status should be 204 NO CONTENT
    And the Sample entity need to be delete in the database
