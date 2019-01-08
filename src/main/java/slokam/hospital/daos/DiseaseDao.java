package slokam.hospital.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slokam.hospital.entity.Diseases;

@Repository
public interface DiseaseDao extends JpaRepository<Diseases, Long> {

}
