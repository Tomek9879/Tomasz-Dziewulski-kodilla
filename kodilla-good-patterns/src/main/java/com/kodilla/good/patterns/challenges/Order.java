package com.kodilla.good.patterns.challenges;

public class Order {
    public static void main(String[] args) {

        ToothbrushProduct toothbrushProduct = new ToothbrushProduct(new User("Jan", "Jan"), "elektryczna", "Parksaid", 4, "");
        ProductOrderService productOrderService = new ProductOrderService(new ToothbrushInformationServices(), new ToothbrushOrderServices(), new ToothbrushOrderResponsitory());
        productOrderService.process(toothbrushProduct);

        System.out.println("                            ");

        Phone phone = new Phone(new User("Anna", "Kozłowska"), "Nokia", "3245", 1);
        ProductOrderService phoneOrder = new ProductOrderService(new PhoneInformationServices(), new PhoneOrderServices(), new PhoneOrderResponsitory());
        phoneOrder.process(phone);

        System.out.println("                            ");

        DogProduct dogProduct = new DogProduct(new User("Kamil", "Kamiński"), "Owczarek Niemiecki", 1);
        ProductOrderService dogOrder = new ProductOrderService(new DogInformationServices(), new DogOrderServices(), new DogOrderResponsitory());
        dogOrder.process(dogProduct);

    }
}
