package com.liftoff.registrations.models.data;

import com.liftoff.registrations.models.Register;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RegisterDao extends CrudRepository<Register, Integer> {
}
