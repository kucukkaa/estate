package pid.estate.business.abstracts;

import java.util.List;

import pid.estate.core.utilities.results.DataResult;
import pid.estate.core.utilities.results.Result;
import pid.estate.entities.concretes.Estate;

public interface EstateService {
	DataResult<List<Estate>> getAll();
	Result add(Estate estate);
	
	DataResult<Estate> getEstateById(Integer id);	
	DataResult<List<Estate>> getEstatesByEstateTypeId(int estateTypeId);	
	DataResult<List<Estate>> getEstatesByEstateTypeIdAndDisrictId(Integer districtId, Integer estateTypeId);
	
}
