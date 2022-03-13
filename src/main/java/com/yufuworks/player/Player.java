package com.yufuworks.player;

import java.util.Random;

public class Player {
  
  private String name;
  private int countOfCoins;
  private int numberOfMyTurn;

  /**
   * コンストラクタ
   * @param name  プレイヤーの名前
   * @param countOfCoins  プレイヤーの所持するコイン枚数
   * @param numberOfMyTurn  プレイヤーの手番
   */
  public Player(String name, int countOfCoins, int numberOfMyTurn) {
    name = this.name;
    countOfCoins = this.countOfCoins;
    numberOfMyTurn = this.numberOfMyTurn;
  }

  public void setCountOfCoins(int countOfCoins) {
    countOfCoins = this.countOfCoins;
  }
  
  public int getCoutOfCoins() {
    return this.countOfCoins;
  }

  public void setNumberOfMyTurn(int numberOfMyTurn) {
    numberOfMyTurn = this.numberOfMyTurn;
  }

  public int getNumberOfMyTurn() {
    return this.numberOfMyTurn;
  }

  /**
   * 6目のダイスを２つ振り、目の合計値を返す
   * @return ダイスの目の合計値
   */
  public int roll2Dices() {
    
    Random random = new Random();
    
    int dice01 = random.nextInt(6) + 1;
    int dice02 = random.nextInt(6) + 1;
    
    return dice01 + dice02;
  }
}
