package tech.agustinchoslr.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.agustinchoslr.portfolio.model.Skill;

import java.util.Optional;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {
    void deleteSkillById(Long id);

    Optional<Skill> findSkillById(Long id);
}