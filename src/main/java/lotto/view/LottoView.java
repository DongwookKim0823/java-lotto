package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LottoView {

    public int getMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        int money = Integer.parseInt(Console.readLine());
        validateMoney(money);
        return money;
    }

    private void validateMoney(int money) {
        if (money % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 구입 금액은 1,000원 단위여야 합니다.");
        }
    }

    public List<Integer> getWinningNumber() {
        System.out.println("당첨 번호를 입력해 주세요.");
        List<Integer> numbers = Arrays.stream(Console.readLine().split(",")).map(Integer::parseInt).collect(Collectors.toList());
        return numbers;
    }
}
