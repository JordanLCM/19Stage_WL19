Feature: Testing for site WL19
Description: Purpose of this feature is to test if user can access to the site

  @Open_Site
  Scenario: Open URL to site
    Given user opens "https://the777888.com/"
    And user checks that site opened is "https://the777888.com"
    
  @Close_Announcement
  Scenario: Closing announcement
    Given user opens "https://the777888.com/" for closing announcement
    And user clicks on do not show again checkbox
    Then user clicks on close button