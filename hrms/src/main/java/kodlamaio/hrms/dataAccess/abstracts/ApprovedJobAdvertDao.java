package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ApprovedJobAdvert;

public interface ApprovedJobAdvertDao extends JpaRepository<ApprovedJobAdvert, Integer>{

}
