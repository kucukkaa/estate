package pid.estate.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pid.estate.business.abstracts.EstateService;
import pid.estate.core.utilities.results.DataResult;
import pid.estate.core.utilities.results.Result;
import pid.estate.core.utilities.results.SuccessDataResult;
import pid.estate.core.utilities.results.SuccessResult;
import pid.estate.dataAccess.abstracts.EstateDao;
import pid.estate.entities.concretes.Estate;

@Service
public class EstateManager implements EstateService {

	private EstateDao estateDao;
	
	@Autowired
	public EstateManager(EstateDao estateDao) {
		super();
		this.estateDao = estateDao;
	}

	@Override
	public DataResult<List<Estate>> getAll() {
		return new SuccessDataResult<List<Estate>>(this.estateDao.findAll(), "Emlak listesi getirildi!");
	}

	@Override
	public Result add(Estate estate) {
		this.estateDao.save(estate);
		return new SuccessResult("Yeni emlak eklendi!");
	}

	@Override
	public DataResult<Estate> getEstateById(Integer id) {
		return new SuccessDataResult<Estate>(this.estateDao.getEstateById(id), "Emlak getirildi!");
	}

	@Override
	public DataResult<List<Estate>> getEstatesByEstateTypeId(int estateTypeId) {
		return new SuccessDataResult<List<Estate>>(this.estateDao.getEstatesByEstateTypeId(estateTypeId), "Kategorideki emlaklar getirildi!");
	}

	@Override
	public DataResult<List<Estate>> getEstatesByEstateTypeIdAndDisrictId(Integer districtId, Integer estateTypeId) {
		return new SuccessDataResult<List<Estate>>(this.estateDao.getEstatesByDistrict_IdAndEstateType_Id(districtId, estateTypeId), "Filtreye göre getirildi!");
	}


}
