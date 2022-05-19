package project.manson112.nfcorder.domain.customer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_CUSTOMER", "일반 고객"),
    STORE("ROLE_STORE", "가게");

    private final String key;
    private final String title;
}
