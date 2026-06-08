package in.kuldeep.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.kuldeep.entity.Consultant;

public interface ConsultantRepository extends JpaRepository<Consultant, Integer>{
	
	@Query(value =
	        "SELECT ID, FIRST_NAME, LAST_NAME, AGE, CLIENT " +
	        "FROM CONSULTANT " +
	        "WHERE ID = :id",
	        nativeQuery = true)
	List<Consultant> findConsultantById(@Param("id") Integer id);
	
}
