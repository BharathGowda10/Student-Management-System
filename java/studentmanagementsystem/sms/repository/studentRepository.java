package studentmanagementsystem.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentmanagementsystem.sms.entity.student;

@Repository
public interface studentRepository extends JpaRepository<student,Long> {
}
