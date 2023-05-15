package kr.ac.sahmyook.nicetaste.kiosk.func;

public class User {
    private String uesrName;
    private int americano_num = 0;
    private int cafeLatte_num = 0;
    private int vanillaLatte_num = 0;

    public User() {
    }

    public User(String uesrName, int americano_num, int cafeLatte_num, int vanillaLatte_num) {
        this.uesrName = uesrName;
        this.americano_num = americano_num;
        this.cafeLatte_num = cafeLatte_num;
        this.vanillaLatte_num = vanillaLatte_num;
    }

    public String getUesrName() {
        return uesrName;
    }

    public void setUesrName(String uesrName) {
        this.uesrName = uesrName;
    }

    public int getAmericano_num() {
        return americano_num;
    }

    public void setAmericano_num(int americano_num) {
        this.americano_num = americano_num;
    }

    public int getCafeLatte_num() {
        return cafeLatte_num;
    }

    public void setCafeLatte_num(int cafeLatte_num) {
        this.cafeLatte_num = cafeLatte_num;
    }

    public int getVanillaLatte_num() {
        return vanillaLatte_num;
    }

    public void setVanillaLatte_num(int vanillaLatte_num) {
        this.vanillaLatte_num = vanillaLatte_num;
    }
}
