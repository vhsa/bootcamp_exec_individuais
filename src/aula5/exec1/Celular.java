package aula5.exec1;

public class Celular implements Precedente<Celular>{
    private Integer number;
    private String holder;

    public Celular(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                '}';
    }

    @Override
    public int precedeA(Celular celular) {
        return celular.getNumber().compareTo(this.number);
    }
}
