package slokam.hospital.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slokam.hospital.entity.Appointment;

@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long> {

}
