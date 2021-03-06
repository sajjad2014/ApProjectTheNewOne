package src.Cards.Magic;

import src.Cards.MonsterCards.InBattle.MonsterCardsInBattle;
import src.ToDoPackage.Battler;

public class MoveRandomMSToHand extends Magic {
    {
        this.magicType = MagicType.WITHOUTTARGET;
    }

    public void doMagic(Battler currentBattler, Battler enemyBattler) {
            MonsterCardsInBattle monsterCardsInBattle = enemyBattler.getMonsterField().getRandomMonsterCardInBattle();
            enemyBattler.getMonsterField().remove(monsterCardsInBattle);
            currentBattler.getHand().add(monsterCardsInBattle.getCard());
    }
}
