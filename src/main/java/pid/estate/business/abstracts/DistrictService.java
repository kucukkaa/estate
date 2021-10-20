package pid.estate.business.abstracts;

import java.util.List;

import pid.estate.core.utilities.results.DataResult;
import pid.estate.entities.concretes.District;

public interface DistrictService {
	DataResult<List<District>> getAll();
}
