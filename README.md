# Framework for testing Mail.ru service using Page Object Pattern.
Next tools were used:
- Maven
- Selenium WebDriver
- TestNg
- Hamcrest
#
For current framework I designed next structure:
- Business object (Letter and User business objects).
- Page Objects for all testing pages.
- Resource (necessary drivers for browsers).
- Setup (WebDriver and browser setup).
- Test (testing logic).
- Util (some decorators, actions using JS, screenshot util and random number generator).