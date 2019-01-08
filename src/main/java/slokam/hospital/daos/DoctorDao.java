package slokam.hospital.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import slokam.hospital.entity.Doctor;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long> {

	@Query("from Doctor d where d.name=?1")
	public List<Doctor> findByName(String name);
	
}
