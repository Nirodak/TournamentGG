package ru.netology.tournament;

import java.util.ArrayList;

public class Game {
    protected ArrayList<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    /**
     * @param PlayerName1 - игрок 1
     * @param PlayerName2 - игрок 2
     *                    Определяем раунд
     *                    Вводим имена игроков
     *                    Ищем циклом выбранных игрока
     *                    Проверяем, наличие зарегистрированных игроков, в случае их отсутствия выводит Exception
     */
    public int round(String PlayerName1, String PlayerName2) {
        Player p1 = null;
        Player p2 = null;

        for (Player player : players) {
            if (player.getName().equals(PlayerName1)) {
                p1 = player;
            }
            if (player.getName().equals(PlayerName2)) {
                p2 = player;
            }
        }


        if (p1 == null) {
            throw new NoRegisteredException(PlayerName1 + " не зарегистрирован");
        }
        if (p2 == null) {
            throw new NoRegisteredException(PlayerName2 + " не зарегистрирован");
        }


        if (p1.getStrength() == p2.getStrength()) {
            return 0;
        }
        if (p1.getStrength() > p2.getStrength()) {
            return 1;
        } else {
            return 2;
        }
    }
}



