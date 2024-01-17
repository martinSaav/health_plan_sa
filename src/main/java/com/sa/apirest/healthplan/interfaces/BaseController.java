package com.sa.apirest.healthplan.interfaces;

import com.sa.apirest.healthplan.model.Base;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends Base, ID extends Serializable> {

    public ResponseEntity<?> getAllRecord();

    public ResponseEntity<?> getAllRecord(Pageable pageable);

    public ResponseEntity<?> getRecordById(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    public ResponseEntity<?> delete(@PathVariable ID id);


}
