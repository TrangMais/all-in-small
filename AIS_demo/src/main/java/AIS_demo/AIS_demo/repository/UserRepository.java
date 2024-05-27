package AIS_demo.AIS_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AIS_demo.AIS_demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
