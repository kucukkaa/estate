package pid.estate.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pid.estate.business.abstracts.EstateService;
import pid.estate.core.utilities.results.DataResult;
import pid.estate.core.utilities.results.Result;
import pid.estate.entities.concretes.Estate;

@RestController
@RequestMapping("/api/estates")
@CrossOrigin
public class EstatesController{

	private EstateService estateService;
	
	@Autowired
	public EstatesController(EstateService estateService) {
		super();
		this.estateService = estateService;		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Estate>> getAll(){
		return this.estateService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Estate estate) {
		return this.estateService.add(estate);
	}
	
	@GetMapping("/getestatebyid")
	public DataResult<Estate> getEstateById(@RequestParam Integer id){
		return this.estateService.getEstateById(id);
	}
	
	@GetMapping("getbyestatetypeid")
	public DataResult<List<Estate>> getEstatesByEstateTypeId(@RequestParam int estateTypeId){
		return this.estateService.getEstatesByEstateTypeId(estateTypeId);
	}
	
	@GetMapping("/getestatesbyestatetypeidanddistrictid")
	public DataResult<List<Estate>> getByFilter(@RequestParam Integer districtId, @RequestParam Integer estateTypeId){
		return this.estateService.getEstatesByEstateTypeIdAndDisrictId(districtId, estateTypeId);
	}
	

}
