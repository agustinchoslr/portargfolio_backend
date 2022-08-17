package tech.agustinchoslr.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.agustinchoslr.portfolio.exception.UserNotFoundException;
import tech.agustinchoslr.portfolio.model.Skill;
import tech.agustinchoslr.portfolio.repo.SkillRepo;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SkillService {
    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    public Skill addSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public List<Skill> findAllSkills(){
        return skillRepo.findAll();
    }

    public Skill updateSkill(Skill skill) {

        return skillRepo.save(skill);
    }

    public Skill findSkillById(Long id){
        return skillRepo.findSkillById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuario id " + id + " no encontrado"));
    }

    public void deleteSkill(Long id){
        skillRepo.deleteSkillById(id);

    }
}
