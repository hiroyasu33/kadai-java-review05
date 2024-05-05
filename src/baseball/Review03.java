package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseballTeam bas01 = new BaseballTeam();
        bas01.setName("東京ヤクルトスワローズ");
        bas01.setWin(80);
        bas01.setLose(59);
        bas01.setDraw(4);
        bas01.report();

        BaseballTeam bas02 = new BaseballTeam();
        bas02.setName("横浜DeNAベイスターズ");
        bas02.setWin(73);
        bas02.setLose(68);
        bas02.setDraw(2);
        bas02.report();

        BaseballTeam bas03 = new BaseballTeam();
        bas03.setName("阪神タイガース");
        bas03.setWin(68);
        bas03.setLose(71);
        bas03.setDraw(4);
        bas03.report();

        BaseballTeam bas04 = new BaseballTeam();
        bas04.setName("読売ジャイアンツ");
        bas04.setWin(68);
        bas04.setLose(72);
        bas04.setDraw(3);
        bas04.report();

        BaseballTeam bas05 = new BaseballTeam();
        bas05.setName("広島東洋カープ");
        bas05.setWin(66);
        bas05.setLose(74);
        bas05.setDraw(3);
        bas05.report();

        BaseballTeam bas06 = new BaseballTeam();
        bas06.setName("中日ドラゴンズ");
        bas06.setWin(66);
        bas06.setLose(75);
        bas06.setDraw(2);
        bas06.report();
    }


}
