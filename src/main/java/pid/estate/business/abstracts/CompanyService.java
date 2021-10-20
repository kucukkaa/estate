package pid.estate.business.abstracts;

import java.util.List;

import pid.estate.core.utilities.results.DataResult;
import pid.estate.core.utilities.results.Result;
import pid.estate.entities.concretes.Company;

public interface CompanyService {
	DataResult<List<Company>> getAll();
	Result add(Company company);
}
