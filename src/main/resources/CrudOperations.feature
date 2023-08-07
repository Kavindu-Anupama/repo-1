Feature: Sample test

    Scenario: Create a new Sample entity
    Given the API endpoint to create an entity
    When I send a POST request with JSON payload
    Then the response status should be 201 Created
    And the entity should be created in the database
