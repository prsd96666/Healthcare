package slokam.hospital.daos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import slokam.hospital.entity.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long>{

	@Query("Select d.name, p.name From Medication m join m.medicne me "
			+"join m.complaint c "
			+ "join c.visiting v "
			+ "join v.appointment a "
			+ "join a.patient p "
			+ "join v.doctor d "
			+ "join c.disease di where me.name=?1")
	public List<Object[]>getPatientByMedicine(String medicineName);
	
	
	@Query("select p.name from Complaint c join c.visiting v "
			+ "join c.disease di "
			+ "join v.appointment a "
			+ "join a.patient p where di.name=?1")
	public List<Object> getPatientBydisease(String diseaseName);

	
	
	@Query("select d.name from Visiting v join v.appointment ap "
			+ "join v.doctor d "
			+ "join ap.patient p where p.name=?1")
	public List<Object>getDoctorBypatient(String patientName);
	
}
