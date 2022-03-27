package com.yufuworks.logic;

import com.yufuworks.player.Player;
/**
 * Doshゲームロジック
 * Mainから呼ばれてゲームの進行をする
 */
public class Logic {
  private int numberOfPlayers;
  private int numberOfCoins;
  private int[] playerTurnArray;

  /**
   * コンストラクタ
   * @param numberOfPlayers プレイヤー人数
   */
  public Logic(int numberOfPlayers, int numberOfCoins) {
    numberOfPlayers = this.numberOfPlayers;
    numberOfCoins = this.numberOfCoins;

    // フィールドのバリデーションチェックをしたい
    // プレイヤー人数からプレイ順番を決める
    this.playerTurnArray = createPlayerTurn(numberOfPlayers);
    // プレイヤー人数分のNPCインスタンスを生成する
    createPlayers();
  }
  private int[] createPlayerTurn(int numberOfPlayers) {
    int[] playerTurnArray = new int[numberOfPlayers];
    for (int i = 0; i < numberOfPlayers; i++) {
      playerTurnArray[i] = i + 1;
    }
    // プレイヤーターン配列の中身をシャッフルする

    return playerTurnArray;
  }

  private void createPlayers() {
    // 自プレイヤーを作成する、シングルトン

    // NPCプレイヤーを作成する
    for (int i = 0; i < numberOfPlayers - 1; i++) {
      int numberOfMyTurn = playerTurnArray[i];
      Player player = new Player("player" + i, numberOfCoins, numberOfMyTurn);
    }
  }
}
