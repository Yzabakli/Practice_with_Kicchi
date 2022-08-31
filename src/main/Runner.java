package main;

public class Runner implements Int{
    public static void main(String[] args) {

        Int obj = new Runner();

        obj.apply();
        obj.apply2(2);
    }

    @Override
    public void apply() {

    }

    @Override
    public Boolean apply2(int number) {
        return null;
    }
}
