package slokam.hospital.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slokam.hospital.entity.Visiting;

@Repository
public interface VisitingDao extends JpaRepository<Visiting, Long> {

}
