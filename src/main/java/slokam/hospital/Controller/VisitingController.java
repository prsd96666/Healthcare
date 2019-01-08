package slokam.hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import slokam.hospital.Service.VisitingServivce;
import slokam.hospital.entity.Visiting;

@RestController
@RequestMapping("visiting")
public class VisitingController {

	@Autowired
	private VisitingServivce visitingservice;

	@PostMapping
	public void saveVisiting(@RequestBody Visiting visiting){
		visitingservice.saveVisiting(visiting);
		

	}
	
}
