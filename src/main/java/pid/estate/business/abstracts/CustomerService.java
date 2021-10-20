package pid.estate.business.abstracts;

import java.util.List;

import pid.estate.core.utilities.results.DataResult;
import pid.estate.core.utilities.results.Result;
import pid.estate.entities.concretes.Customer;

public interface CustomerService {
	DataResult<List<Customer>> getAll();
	Result add(Customer customer);
}
