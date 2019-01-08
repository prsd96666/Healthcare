package slokam.hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import slokam.hospital.daos.MedicineDAO;
import slokam.hospital.entity.Medicine;

@RestController
public class MedicineController {

	@Autowired
	private MedicineDAO medicinedao;
	
	@RequestMapping("SaveMedicineData")
	public void SaveMedicineData(@RequestBody Medicine med){
		medicinedao.save(med);
	}
	
	@RequestMapping("SaveallMedicineData")
	public void SaveallMedicineData(@RequestBody List<Medicine> med){
		medicinedao.saveAll(med);
	}

}
