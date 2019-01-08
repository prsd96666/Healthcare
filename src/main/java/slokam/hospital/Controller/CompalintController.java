package slokam.hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import slokam.hospital.Service.ComplaintService;
import slokam.hospital.entity.Complaint;

@RestController
@RequestMapping("complaint")
public class CompalintController {

	@Autowired
	private ComplaintService complaintservice;

	@PostMapping
	public void saveComplaint(@RequestBody Complaint complaint) {

		complaintservice.saveComplaint(complaint);

	}
	
	@PostMapping("/all")
	public void saveAllComplaint(@RequestBody List<Complaint>complaint){
		complaintservice.saveAllComplaint(complaint);
		
	}
}