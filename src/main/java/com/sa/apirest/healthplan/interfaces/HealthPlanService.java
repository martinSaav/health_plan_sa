package com.sa.apirest.healthplan.interfaces;

import com.sa.apirest.healthplan.model.HealthPlan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HealthPlanService extends BaseService<HealthPlan, Integer> {

    public List<HealthPlan> search(String filter) throws Exception;

    public Page<HealthPlan> search(String filter, Pageable pageable) throws Exception;
}
