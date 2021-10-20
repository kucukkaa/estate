package pid.estate.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pid.estate.business.abstracts.CompanyService;
import pid.estate.core.utilities.results.DataResult;
import pid.estate.core.utilities.results.Result;
import pid.estate.core.utilities.results.SuccessDataResult;
import pid.estate.core.utilities.results.SuccessResult;
import pid.estate.dataAccess.abstracts.CompanyDao;
import pid.estate.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService {

	private CompanyDao companyDao;
		
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>> getAll() {
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll(),"Firmalar Listelendi");
	}

	@Override
	public Result add(Company company) {
		this.companyDao.save(company);
		return new SuccessResult("Firma eklendi!");
	}

}
