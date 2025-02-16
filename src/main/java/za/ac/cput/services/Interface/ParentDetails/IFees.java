/*
IFees.java
Enable services
Author: Tiffany Kiwiets (219322732)
*/

package za.ac.cput.services.Interface.ParentDetails;

import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.services.IService;

import java.util.List;

public interface IFees extends IService<Fees, String> {
    List<Fees> findall();
}
