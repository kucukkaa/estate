package pid.estate.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pid.estate.business.abstracts.EstateTypeService;
import pid.estate.core.utilities.results.DataResult;
import pid.estate.entities.concretes.EstateType;

@RestController
@RequestMapping("/api/estatetypies")
@CrossOrigin
public class EstateTypeController {
 
	private EstateTypeService estateTypeService;

	public EstateTypeController(EstateTypeService estateTypeService) {
		super();
		this.estateTypeService = estateTypeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<EstateType>> getAll(){
		return this.estateTypeService.getAll();
	}
}
