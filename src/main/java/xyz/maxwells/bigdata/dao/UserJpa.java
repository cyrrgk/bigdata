package xyz.maxwells.bigdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.maxwells.bigdata.domain.User;

public interface UserJpa extends JpaRepository<User,Long> {
}
