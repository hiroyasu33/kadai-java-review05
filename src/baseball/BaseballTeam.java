package baseball;

public class BaseballTeam {
   // フィールド
    private String name; // チーム名
    private int win;     // 勝利
    private int lose;    // 敗北
    private int draw;    // 引き分け

    public BaseballTeam() {
     }

    public BaseballTeam(String name, int win, int lose, int draw) {
       this.name = name;
       this.win = win;
       this.lose = lose;
       this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        double rate = (double)this.win / (double)(this.win + this.lose);
        return rate;
    }

    public void report() {
        double rate = getRate();
        System.out.println(name + " の２０２２年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + rate + "です。");

    }
}