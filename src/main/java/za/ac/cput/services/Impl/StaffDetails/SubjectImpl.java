/* SubjectImpl.java
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/
package za.ac.cput.services.Impl.StaffDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.repository.StaffDetailsRepo.ISubjectRepository;
import za.ac.cput.services.Interface.StaffDetails.ISubject;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectImpl implements ISubject {
    private final ISubjectRepository repository;

    @Autowired
    public SubjectImpl(ISubjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public Subject save(Subject subject) {
        return this.repository.save(subject);
    }

    @Override
    public Optional<Subject> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(Subject subject) {
        this.repository.delete(subject);
    }

    @Override
    public List<Subject> findAll() {
        return this.repository.findAll();
    }
}
