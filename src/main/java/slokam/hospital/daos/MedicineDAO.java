package slokam.hospital.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slokam.hospital.entity.Medicine;

@Repository
public interface MedicineDAO extends JpaRepository<Medicine, Long> {

}
