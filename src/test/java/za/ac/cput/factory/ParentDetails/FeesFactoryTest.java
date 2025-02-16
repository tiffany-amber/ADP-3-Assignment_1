/* FeesFactoryTest.java
Test for FeesFactory
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.factory.ParentDetails;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.factory.StudentDetails.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

class FeesFactoryTest {
    @Test
    public void BuildWithSuccess() {
        Admin admin = adminFactory.createAdmin(
                "2456589",
                "40963 6588 42156");

        Student student = StudentFactory.createStudent("Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        Parent parent = ParentFactory.createParent(student,
                "John",
                "Molten",
                "073 697 1537",
                "johnmolton12@gmail.com");
        Fees fees = FeesFactory.createFees(
                student,
                parent,
                20000.00);
        assertNotNull(fees);
        System.out.println(fees);
    }

    @Test
    public void BuildWithFailure() {
        Admin admin = AdminFactory.createAdmin(
                "2456589",
                "40963 6588 42156");

        Student student = StudentFactory.createStudent("Jack",
                "Molten",
                12,
                "5th January 1999",
                3345,
                "14 Hope Street Cape Town",
                "None",
                54.6);
        Parent parent = ParentFactory.createParent(student,
                "John",
                "Molten",
                "073 697 1537",
                "johnmolton12@gmail.com");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> FeesFactory.createFees(null
                , parent
                , 20000.00));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("staff ID is required!", exceptionMessage);
    }
}
