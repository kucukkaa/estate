package pid.estate.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pid.estate.business.abstracts.DistrictService;
import pid.estate.core.utilities.results.DataResult;
import pid.estate.core.utilities.results.SuccessDataResult;
import pid.estate.dataAccess.abstracts.DistrictDao;
import pid.estate.entities.concretes.District;

@Service
public class DistrictManager implements DistrictService {

	private DistrictDao districtDao;

	@Autowired
	public DistrictManager(DistrictDao districtDao) {
		super();
		this.districtDao = districtDao;
	}

	@Override
	public DataResult<List<District>> getAll() {
		return new SuccessDataResult<List<District>>(this.districtDao.findAll());
	}
	
	
}
