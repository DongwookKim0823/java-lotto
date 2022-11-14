package lotto.domian.statistics;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Prize {
    FIRST(1, 2_000_000_000, "6개 일치 (2,000,000,000원) - "),
    SECOND(2, 30_000_000, "5개 일치, 보너스 볼 일치 (30,000,000원) - "),
    THIRD(3, 1_500_000, "5개 일치 (1,500,000원) - "),
    FOURTH(4, 50_000, "4개 일치 (50,000원) - "),
    FIFTH(5, 5_000, "3개 일치 (5,000원) - ");

    private final int gradeNum;
    private final int price;
    private final String phrase;

    Prize(int gradeNum, int price, String phrase){
        this.gradeNum = gradeNum;
        this.price = price;
        this.phrase = phrase;
    }

    public int gradeNum(){
        return gradeNum;
    }

    public int price(){
        return price;
    }

    public String phrase() {
        return phrase;
    }
}
