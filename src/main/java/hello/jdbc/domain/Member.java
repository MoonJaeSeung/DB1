package hello.jdbc.domain;

import lombok.Data;

@Data // EqualsAndHashCode를 자동으로 만들어준다
public class Member {

    private String memberId;
    private int money;

    public Member() {
    }

    public Member(String memberId, int money) {
        this.memberId = memberId;
        this.money = money;
    }
}
