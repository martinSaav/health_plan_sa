package com.sa.apirest.healthplan.service;

import com.sa.apirest.healthplan.interfaces.HealthPlanService;
import com.sa.apirest.healthplan.model.HealthPlan;
import com.sa.apirest.healthplan.repository.BaseRepository;
import com.sa.apirest.healthplan.repository.HealthPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthPlanServiceImpl extends BaseServiceImpl<HealthPlan, Integer> implements HealthPlanService {

    @Autowired
    private HealthPlanRepository healthPlanRepository;

    public HealthPlanServiceImpl(BaseRepository<HealthPlan, Integer> baseRepository) {
        super(baseRepository);
    }

    public List<HealthPlan> search(String filter) {
        return healthPlanRepository.searchNative(filter);
    }

    @Override
    public Page<HealthPlan> search(String filter, Pageable pageable) {
        return healthPlanRepository.searchNative(filter, pageable);
    }


}
