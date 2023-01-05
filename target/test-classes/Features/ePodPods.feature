@QAbatch01
Feature: ePod Pods test case

  Background: 
    Given User is on pre-login page

  #Test Case: GVCA_ePodPods_02A_TC001
  #Description: The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Graphite' Color with Engrave 'Lilac Pattern' and select Flavour Cartriges 'Lemon berry' with valid 'Nicotin Strength' followed by adding Skin cimento and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Divya
  #Date: 14-sep-2021
  @epodpod2AA
  Scenario Outline: GVCA_ePodPods_2A_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<PatternName>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" and FirstName"<FirstName>"
    And user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    And navigate to Cart and verify the items in Cart
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | PatternName | TextDirection | FontStyle | Text    | FirstName | Flavor      | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | akhila.cha@bat.com | TEST1234 | Black     | Arid        | Vertical      | Ahamono   | Engrave | John      | Lemon Berry |              1.6 | twilight  | 5555555555554444 |               1024 |        1901 | CANADA VYPE USER |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC002
  #Description: The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Rose Gold' Color with Engrave 'Lilac Pattern' and select Flavour Cartriges 'Peach' with valid 'Nicotin Strength' followed by adding Skin cimento and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Divya
  #Date: 14-sep-2021
  @epodpod2AA
  Scenario Outline: GVCA_ePodPods_2A_TC002
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<PatternName>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" and FirstName"<FirstName>"
    And user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    And navigate to Cart and verify the items in Cart
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                     | pwd      | DeviceColour | PatternName | TextDirection | FontStyle | Text   | FirstName | Flavor | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Gold    | Arid        | Vertical      | Arabella  | Zensar | Praks     | Peach  |              1.6 | twilight | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC003
  #Description: The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Black' Color with Engrave 'Lilac Pattern' and select Flavour Cartriges 'Peach' with valid 'Nicotin Strength' followed by adding Skin Calla and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Divya
  #Date: 14-sep-2021
  @epodpod2AA
  Scenario Outline: GVCA_ePodPods_2A_TC003
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<PatternName>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" and FirstName"<FirstName>"
    And user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    And navigate to Cart and verify the items in Cart
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | PatternName | TextDirection | FontStyle   | Text    | FirstName | Flavor | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Black        | Code        | Vertical      | Honeyscript | jacklyn | Mark      | Peach  |              1.6 | twilight | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC004
  #Description: The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Glacier (blue)' Color with Engrave 'Ambages Pattern' and select Flavour Cartriges 'Lychee' with valid 'Nicotin Strength' followed by adding Skin Calla and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 26-OCT-2021
  @epod04
  Scenario Outline: GVCA_ePodPods_2A_TC004
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<PatternName>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" and FirstName"<FirstName>" from Elements Collection
    And user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    And navigate to Cart and verify the items in Cart
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                        | pwd      | DeviceColour | PatternName | TextDirection | FontStyle   | Text    | FirstName | Flavor       | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jonathan.thebault@bat.com | TEST1234 | Black        | Code        | Vertical      | Honeyscript | cecelia | Mark      | Blood Orange |              1.6 | twilight | 5555555555554444 |               1024 |         190 | cecelia koch     |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC005
  #Description: The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Citrine (yellow)' Color with Engrave ' Sparsio Pattern' and select Flavour Cartriges 'Citrus Grape ' with valid 'Nicotin Strength' followed by adding Skin Cimento and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 26-OCT-2021
  @epod05
  Scenario Outline: GVCA_ePodPods_2A_TC005
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<PatternName>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" and FirstName"<FirstName>" from Elements Collection
    And user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | PatternName | TextDirection | FontStyle | Text    | FirstName | Flavor | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Black        | Axis        | Horizontal    | Fusterd   | cecelia | Mark      | Berry  |              1.6 | twilight | 5555555555554444 |               1024 |         190 | mallory stokes   |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC006
  #Description: The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Emerald (green)' Color with Engrave ' Citronica Pattern' and select Flavour Cartriges 'Citrus Grape ' with valid 'Nicotin Strength' followed by adding Skin Ciel and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 26-OCT-2021
  @epod06
  Scenario Outline: GVCA_ePodPods_2A_TC006
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<PatternName>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" and FirstName"<FirstName>" from Elements Collection
    And user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | PatternName | TextDirection | FontStyle | Text    | FirstName | Flavor | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Aqua         | Axis        | Horizontal    | Fusterd   | cecelia | Mark      | Mango  |              1.6 | twilight | 5555555555554444 |               1024 |         190 | keon auor        |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC007
  #Description: The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Emerald (green)' Color with Engrave ' Citronica Pattern' and select Flavour Cartriges 'Citrus Grape ' with valid 'Nicotin Strength' followed by adding Skin Ciel and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 26-OCT-2021
  @epod078
  Scenario Outline: GVCA_ePodPods_2A_TC007
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<PatternName>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" and FirstName"<FirstName>" from Elements Collection
    And user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | PatternName | TextDirection | FontStyle  | Text    | FirstName | Flavor | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Aqua         | Axis        | Horizontal    | Neo Writer | cecelia | Mark      | Mango  |              1.6 | twilight | 5555555555554444 |               1024 |         190 | keon auor        |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC008
  #Description: The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Emerald (green)' Color with Engrave ' Citronica Pattern' and select Flavour Cartriges 'Citrus Grape ' with valid 'Nicotin Strength' followed by adding Skin Ciel and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 26-OCT-2021
  @epod078
  Scenario Outline: GVCA_ePodPods_2A_TC008
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<PatternName>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" and FirstName"<FirstName>" from Elements Collection
    And user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | PatternName | TextDirection | FontStyle | Text | FirstName | Flavor      | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Red          | Bolt        | Horizontal    | Monument  | and  | Mark      | Fresh Apple |              1.6 | twilight | 5555555555554444 |               1024 |         190 | keon auor        |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC009
  #Description: The purpose of this Test Case is to verify the Order placed for 'Epod2 core collections' under specific product details which includes 'Blue' Color select Flavour Cartriges 'Iced Mango' and followed by adding Skin Clavo and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 26-OCT-2021
  @epod19
  Scenario Outline: GVCA_ePodPods_02A_TC009
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    Then user selects skin "<DeviceColour>" and charging cable
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | Flavor | skinindex | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Charcoal-X         | Mango  |         3 | 5555555555554444 |               1024 |         190 | keon auor        |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC010
  #Description: The purpose of this Test Case is to verify the Order placed for 'Epod2 core collections' under specific product details which includes 'Red' Color select Flavour Cartriges 'Berry' and followed by adding Skin Tweed and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 02-NOV-2021
  @epod19
  Scenario Outline: GVCA_ePodPods_02A_TC010
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart
    Then user selects skin "<skinindex>" and charging cable
    And add Cartridges for epodtwo core collection with Flavor "<Flavor>"
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | Flavor      | skinindex | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Red          | Velvety Mix |         2 | 5555555555554444 |               1024 |         190 | Mallary stokes   |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC011
  #Description: The purpose of this Test Case is to verify the Order placed for 'Epod2 core collections' under specific product details which includes 'Aqua' Color select Flavour Cartriges 'Cucumber' and followed by adding Skin "Verde" and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 02-NOV-2021
  @epod19
  Scenario Outline: GVCA_ePodPods_02A_TC011
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart
    Then user selects skin "<skinindex>" and charging cable
    And add Cartridges for epodtwo core collection with Flavor "<Flavor>"
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                     | pwd      | DeviceColour | Flavor     | skinindex | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Aqua         | River Mint |         5 | 5555555555554444 |               1024 |         190 | cecelia Koah     |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC012
  #Description: The purpose of this Test Case is to verify the Order placed for 'Epod2 core collections' under specific product details which includes 'Graphite' Color select Flavour Cartriges 'Blueberry' and followed by adding Skin "Vasco" and add 'Maximum' Magnetic USB Charging Cable' and finally place the order.
  #Author: Harsha
  #Date: 02-NOV-2021
  @epod12
  Scenario Outline: GVCA_ePodPods_02A_TC012
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart
    Then user selects skin "<skinindex>" and charging cable
    And add Cartridges for epodtwo core collection with Flavor "<Flavor>"
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                     | pwd      | DeviceColour | Flavor    | skinindex | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Graphite     | Blueberry |         6 | 5555555555554444 |               1124 |         195 | everardo hand    |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC013
  #Description:The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Black' Colors with Engrave 'Costo Icon' and 'I am Fine' followed by adding Skin 'Ciel' and add 'valid count' pouch' and epod rings "Brella" and finally place the order.
  #Author: Harsha
  #Date: 29-OCT-2021
  @epod135
  Scenario Outline: GVCA_ePodPods_02A_TC013
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user clicks on engravable device to select device color as "<DeviceColour>"
    And user select device design style as Mini Icon to select "<Miniicon>"
    And user customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then verify engraving summary page
    When user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And user adds podcaps and epod rings with design "<design>"
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                     | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text    | Flavor      | NicotineStrength | Skin     | design | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Black        | Glow     | Vertical      | Monument  | Mallary | Forest Mint |              1.6 | twilight | x-ring | 5555555555554444 |               1024 |         197 | keon auer        |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC014
  #Description:The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Black' Colors with Engrave 'Costo Icon' and 'I am Fine' followed by adding Skin 'Ciel' and add 'valid count' pouch' and epod rings "Leaf" and finally place the order.
  #Author: Harsha
  #Date: 29-OCT-2021
  @epod135
  Scenario Outline: GVCA_ePodPods_02A_TC014
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user clicks on engravable device to select device color as "<DeviceColour>"
    And user select device design style as Mini Icon to select "<Miniicon>"
    And user customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then verify engraving summary page
    When user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And user adds podcaps and epod rings with design "<design>"
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                     | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text    | Flavor | NicotineStrength | Skin     | design | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Black        | Arro     | Vertical      | Monument  | Mallary | Mango  |              1.6 | twilight | leaf   | 5555555555554444 |               1024 |         190 | mallory stokes   |

  #deb.dumas@bat.com - silverUser
  #-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC015
  #Description:The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Gold' Colors with Engrave 'Myst Icon' and 'I am Fine' followed by adding Skin 'Clavo' and add 'valid count' pouch' and epod rings "Gemini" and finally place the order.
  #Author: Harsha
  #Date: 29-OCT-2021
  @epod135
  Scenario Outline: GVCA_ePodPods_02A_TC015
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user clicks on engravable device to select device color as "<DeviceColour>"
    And user select device design style as Mini Icon to select "<Miniicon>"
    And user customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then verify engraving summary page
    When user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And user adds podcaps and epod rings with design "<design>"
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                     | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text    | Flavor | NicotineStrength | Skin     | design | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Gold         | Circ     | Vertical      | Droid     | Mallary | Clear  |              1.6 | twilight | gemini | 5555555555554444 |               1024 |         191 | mallory stokes   |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC016
  #Description:The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Gold' Colors with Engrave 'Myst Icon' and 'I am Fine' followed by adding Skin 'Clavo' and add 'valid count' pouch' and finally place the order.
  #Author: Harsha
  #Date: 29-OCT-2021
  @epod16
  Scenario Outline: GVCA_ePodPods_02A_TC016
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user clicks on engravable device to select device color as "<DeviceColour>"
    And user select device design style as Mini Icon to select "<Miniicon>"
    And user customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then verify engraving summary page
    When user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add pouch "<pouchcolour>" from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                     | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text    | Flavor | NicotineStrength | Skin     | pouchcolour | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Gold         | Coco     | Vertical      | Droid     | Mallary | Clear  |              1.6 | twilight | Black       | 5555555555554444 |               1024 |         190 | mallory stokes   |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC017
  #Description:The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Aqua' Colors with Engrave 'Myst Icon' and 'I am Fine' followed by adding Skin 'tweed' and add 'valid count' pouch ' and finally place the order.
  #Author: Harsha
  #Date: 29-OCT-2021
  @epod166
  Scenario Outline: GVCA_ePodPods_02A_TC017
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user clicks on engravable device to select device color as "<DeviceColour>"
    And user select device design style as Mini Icon to select "<Miniicon>"
    And user customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then verify engraving summary page
    When user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add pouch "<pouchcolour>" from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text    | Flavor     | NicotineStrength | Skin     | pouchcolour | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Aqua         | Beta     | Vertical      | Droid     | Mallary | Strawberry |              1.6 | twilight | Red         | 5555555555554444 |               1024 |         190 | mallory stokes   |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC018
  #Description:The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Red' Colors with Engrave 'Mini Icon' and 'I am Fine' followed by adding Skin 'Verde' and add 'valid count' pouch ' and finally place the order.
  #Author: Harsha
  #Date: 29-OCt-2021
  @epod166
  Scenario Outline: GVCA_ePodPods_02A_TC018
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user clicks on engravable device to select device color as "<DeviceColour>"
    And user select device design style as Mini Icon to select "<Miniicon>"
    And user customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then verify engraving summary page
    When user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add pouch "<pouchcolour>" from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text | Flavor     | NicotineStrength | Skin     | pouchcolour | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Red          | Cycl     | Horizontal    | Droid     | void | Strawberry |              1.6 | twilight | Blue        | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC022
  #Description:The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Graphite' Colors with Engrave 'Mini Icon' and 'I am Fine' followed by adding Skin 'Fabrichromatic' and add 'valid count' Magnetic USB Charging Cable' and finally place the order.
  #Author: Divya
  #Date: 23-sep-2021
  @epodmini1
  Scenario Outline: GVCA_ePodPods_02A_TC022
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user clicks on engravable device to select device color as "<DeviceColour>"
    And user select device design style as Mini Icon to select "<Miniicon>"
    And user customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then verify engraving summary page
    When user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text | Flavor             | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Graphite     | Mous     | Horizontal    | Droid     | DXC  | Strawberry Rhubarb |              1.6 | twilight | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |

  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GVCA_ePodPods_02A_TC023
  #Description:The purpose of this Test Case is to verify the Order placed for 'Engravable Epod Device' under specific product details which includes 'Graphite' Colors with Engrave 'Mini Icon' and 'I am Fine' followed by adding Skin 'Fabrichromatic' and add 'valid count' Magnetic USB Charging Cable' and finally place the order.
  #Author: Divya
  #Date: 23-sep-2021
  @epodmini
  Scenario Outline: GVCA_ePodPods_02A_TC023
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user navigates to ePod Device
    And user clicks on engravable device to select device color as "<DeviceColour>"
    And user select device design style as Mini Icon to select "<Miniicon>"
    And user customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then verify engraving summary page
    When user navigates to ePod Device
    And add Cartridges for engraved device with Flavor "<Flavor>" and Nicotine Strength "<NicotineStrength>"
    And user navigates to ePod Device
    And add ePod SkinName as Skin "<Skin>"
    And user navigates to ePod Device
    And add charging cable from Acccersories
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                      | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text    | Flavor     | NicotineStrength | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | Black        | Baby     | Vertical      | Fusterd   | testing | Strawberry |              1.6 | twilight | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |
