package animal;

public class Human extends Animal implements Thinkable {
    // フィールド
    private String hobby;

    // コンストラクタ
    public Human() {
    }

    // 引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super.setName(name);
        super.setAge(age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");


    }

}
