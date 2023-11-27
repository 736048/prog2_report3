package jp.ac.uryukyu.ie.e235756;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * ウェポンスキルがしっかり攻撃の1.5倍の火力になることを検証
     * 検証手順
     * 　(1)戦士と敵を準備する。ゴブリンの体力を戦士のスキルを全て受け切れるぐらいにする
     * 　(2)戦士が敵を殴り、回数分ダメージを入れる
     * 　(3)最後に敵の残り体力が想定通りかを検証
     */
    @Test
    void attackTest(){
        int finalHP = 25;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 10);
        Enemy goburin = new Enemy("ゴブリン", 100, 30);
        for(int n = 0;n < 5;n++){
            demoWarrior.attackWithWeponSkill(goburin);
        }
        assertEquals(finalHP, goburin.getHitPoint());
        
    }
}