package slokam.hospital.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slokam.hospital.entity.Complaint;

@Repository
public interface ComplaintDao extends JpaRepository<Complaint, Long> {

}
