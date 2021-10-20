package pid.estate.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.estate.business.abstracts.DistrictService;
import pid.estate.core.utilities.results.DataResult;
import pid.estate.entities.concretes.District;

@RestController
@RequestMapping("/api/districts")
@CrossOrigin
public class DistrictsController {
	
	private DistrictService districtService;
	
	
	public DistrictsController(DistrictService districtServ) {
		super();
		this.districtService = districtServ;
	}
	
	@GetMapping("/getall")
	public DataResult<List<District>> getAll(){
		return this.districtService.getAll();
	}
}
