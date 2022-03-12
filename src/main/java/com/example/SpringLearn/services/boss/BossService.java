package com.example.SpringLearn.services.boss;

import com.example.SpringLearn.models.Boss;
import com.example.SpringLearn.repositories.boss.BossRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BossService {

    final BossRepo bossRepo;

    @Autowired
    public BossService(BossRepo bossRepo) {
        this.bossRepo = bossRepo;
    }


    public Boss findBossById(Long id) {
        return bossRepo.findById(id).get();
    }

    public void bossOneMinusHealth(Long minusHealth, Long id) {
        bossRepo.bossOneMinusHealth(minusHealth, id);
    }

    public void saveBoss(Boss boss) {
        bossRepo.save(boss);
    }

    public void deleteBoss(Boss boss) {
        bossRepo.delete(boss);
    }


}
