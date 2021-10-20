package pid.estate.business.abstracts;

import java.util.List;

import pid.estate.core.utilities.results.DataResult;
import pid.estate.entities.concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();
	
}
