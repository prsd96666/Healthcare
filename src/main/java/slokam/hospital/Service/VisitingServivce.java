package slokam.hospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import slokam.hospital.daos.VisitingDao;
import slokam.hospital.entity.Visiting;

@Service
public class VisitingServivce {

	@Autowired
	private VisitingDao visitingdao;
	
    public void saveVisiting(Visiting visiting){
		
		visitingdao.save(visiting);
	}
	
}
