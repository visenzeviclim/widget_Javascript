Feature: Widget

  # Test Plan : https://docs.google.com/spreadsheets/d/1fIq8NAMXwUSMZjhtbulWTf2ARLf8WrhIDDIMpGxCoc8/edit#gid=0
  Background: In order to purchase products
    As a computer user
    John will like to search for products based on an image

  # Worksheet : Finds_Widget_Icon
  Scenario Outline: User finds widget icon
    When "John" attempts to launch page "<PAGE>"
    Then he should see that the icon exist
    Examples:
      | CONTEXT             | PAGE                         |
      | FindWidgetIcon_001  | Visenze Search By Image      |

  # Worksheet : Launch_SBI_Widget
  Scenario Outline: User launches SBI Widget
    Given "John" launches page "<PAGE>"
     When "John" attempts to open SBI Image
     Then he should see that the main dialog shows
      And he should see that the Title "<TITLE>" shows
      And he should see that the Description "<DESCRIPTION>" shows
      And he should see that the following tabs "<TAB_1>" and "<TAB_2>" shows

    Examples:
      | CONTEXT             | PAGE                    | TITLE        | DESCRIPTION                                                           | TAB_1           | TAB_2           |
      | LaunchSBIWidget_001 | Visenze Search By Image | Image Search | Use an image to find similar matches and get product recommendations. | Upload an image | Paste image URL |

  # Worksheet : Upload_Image
  Scenario Outline: User uploads a photo
    Given "John" launches page "<PAGE>"
      And he has opened SBI Image
     When he attempts to click on tab "<TAB>" to upload "<PHOTO>"
     Then he should see that the "<TITLE>" dialog shows

    Examples:
      | CONTEXT             | PAGE                    | TAB             | PHOTO         | TITLE                |
      | LaunchSBIWidget_001 | Visenze Search By Image | Upload an image | MafiaBoss.jpg | Find Similar Products |