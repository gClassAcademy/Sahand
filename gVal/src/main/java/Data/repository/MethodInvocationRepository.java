package Data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Data.model.*;

@Repository
public interface MethodInvocationRepository extends JpaRepository<MethodInvocation, Long> {
	
    @Query("SELECT e from MethodInvocation e where (e.method_source.classs.packagee.project.id =:project_id AND e.zqualifiedsignature IS NOT NULL)")
    List<MethodInvocation> findByProject_ID(@Param("project_id") long Project_ID);


}
