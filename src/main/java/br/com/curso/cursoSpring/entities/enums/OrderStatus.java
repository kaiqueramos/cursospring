package br.com.curso.cursoSpring.entities.enums;

import br.com.curso.cursoSpring.entities.Order;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    /**
     * Construtor do ENUM
     * @param code
     */
    private OrderStatus(int code){
        this.code = code;
    }

    /**
     * Retorna o código do item no enum
     * @return
     */
    public int getCode(){
        return code;
    }

    /**
     * Retorna o valor do enum recebendo seu código
     * @param code
     * @return
     */
    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }

}
