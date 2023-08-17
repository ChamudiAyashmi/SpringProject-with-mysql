package edu.icet.MyProject.repo;

import edu.icet.MyProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
