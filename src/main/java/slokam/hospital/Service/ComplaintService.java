package slokam.hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import slokam.hospital.daos.ComplaintDao;
import slokam.hospital.entity.Complaint;
import slokam.hospital.entity.Medication;

@Service
public class ComplaintService {

	@Autowired
	private ComplaintDao complaintdao;
	 
	
	public void saveComplaint(Complaint complaint){
		
		List<Medication>medicatiolist=complaint.getMedication();
		for (Medication medication : medicatiolist) {
			
			medication.setComplaint(complaint);
		}
		
		complaintdao.save(complaint);
	}
	
	public void saveAllComplaint(List<Complaint>complaint){
		
		for (Complaint complaint2 : complaint) {
			List<Medication>medication=complaint2.getMedication();
			for (Medication medication2 : medication) {
				medication2.setComplaint(complaint2);
			}
		
			complaintdao.saveAll(complaint);
		}
	}
	
	
}
