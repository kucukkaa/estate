package pid.estate.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pid.estate.business.abstracts.EstateTypeService;
import pid.estate.core.utilities.results.DataResult;
import pid.estate.core.utilities.results.SuccessDataResult;
import pid.estate.dataAccess.abstracts.EstateTypeDao;
import pid.estate.entities.concretes.EstateType;

@Service
public class EstateTypeManager implements EstateTypeService{

	private EstateTypeDao estateTypeDao;
	
	@Autowired
	public EstateTypeManager(EstateTypeDao estateTypeDao) {
		super();
		this.estateTypeDao = estateTypeDao;
	}
	@Override
	public DataResult<List<EstateType>> getAll() {
		return new SuccessDataResult<List<EstateType>>(this.estateTypeDao.findAll());
	}

	

}
