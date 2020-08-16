package com.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.model.*;

@Component
public interface StudentDao extends JpaRepository<Student, Integer> {
	// Begin;
	@Modifying
	@Query(value = "delete from employee  where id=?1", nativeQuery = true)
	void deleteById(int id);
	// Commit;FFFF

	// Begin;
	@Modifying
	@Query(value = "UPDATE employee set name=?1 where id =?2", nativeQuery = true)
	void updateById(String name, int id);
	// Commit;

	Page<Student> findAll(java.awt.print.Pageable pageable);

	List<Student> findAll(Specification<Student> specification);
	List<Student> findAll();


}
