# Demo RP with Junit5

### Issue description

ReportPortal fails to identify retried TestNG tests when class order is changed in XML

### Prerequisites

        cd example-junit5

### Happy path

        # Run tests
        mvn clean test

        # Rerun tests
        mvn clean test -Drp.rerun=true -Dtest=-Dtest=module1.MyFeatureTest,module1.SecondFeatureTest

Result:
- RP correctly recognizes and marks the retried tests:
