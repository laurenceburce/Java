package Moebius.problem4;

public class Bug1 {
    private Integer rating;

    public Integer rating() {
        return rating;
    }

    public static void main(String[] args) {
        System.out.println("rating:"
            + new Bug1().rating());
    }
}