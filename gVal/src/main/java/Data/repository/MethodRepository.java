package Data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Data.model.*;

@Repository
public interface MethodRepository extends JpaRepository<Method, Long> {
	
    @Query("SELECT e from Method e where (e.classs.packagee.project.id =:project_id)")
    List<Method> findByProject_ID(@Param("project_id") long Project_ID);


}
