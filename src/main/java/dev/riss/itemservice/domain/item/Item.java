package dev.riss.itemservice.domain.item;

import lombok.*;

@Getter @Setter
public class Item {

    private Long id;
    private String itemName;
    private Integer price;      //int 로 하면 0이라도 들어가야 함, null 이 들어갈 가능성도 있기 때문에 primitive type 쓰지 않음
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
