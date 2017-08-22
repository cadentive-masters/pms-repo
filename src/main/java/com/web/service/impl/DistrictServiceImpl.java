package com.web.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entities.District;
import com.jpa.repositories.DistrictRepo;
import com.pmsapp.view.vo.DistrictVO;
import com.web.service.DistrictService;



@Service("districtService")
public class DistrictServiceImpl implements DistrictService{

	@Autowired
	private DistrictRepo districtRepo;

	@Override
	public List<District> findAllDistricts() {
		return districtRepo.findAll();
	}

	@Override
	public List<DistrictVO> findDistrictByCountry(final Long countryId) throws Exception {
		List<DistrictVO> districtVOList = new ArrayList<DistrictVO>();
		List<District> districtList = 	districtRepo.findByCountryId(countryId);
		for(District district:districtList){
			DistrictVO districtVO = new DistrictVO();
			districtVO.setDistrictId(district.getDistrictId());
			districtVO.setDistrictCode(district.getDistrictCode());
			districtVO.setDistrictName(district.getDistrictName());
			districtVOList.add(districtVO);

		}
		return districtVOList ==null?Collections.EMPTY_LIST:districtVOList;
	}




}
