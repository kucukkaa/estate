package pid.estate.business.abstracts;

import java.util.List;

import pid.estate.core.utilities.results.DataResult;
import pid.estate.entities.concretes.EstateType;

public interface EstateTypeService {
	DataResult<List<EstateType>> getAll();
}
