package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private ProductInformationService informationService;
    private OrderService orderService;
    private OrderResponsitory orderResponsitory;

    public ProductOrderService(final ProductInformationService informationService, final OrderService orderService, final OrderResponsitory orderResponsitory) {

        this.informationService = informationService;
        this.orderService = orderService;
        this.orderResponsitory = orderResponsitory;

    }

    public OrderDto process(final ProductInformation productInformation) {

        boolean isOrder = orderService.order(productInformation.getUser(), productInformation.getBrand(), productInformation.getType(), productInformation.getVolume(), productInformation.getModel(), productInformation.getAge(), productInformation.getBred());
        if (isOrder) {
            informationService.send(productInformation.getBrand(), productInformation.getType(), productInformation.getVolume(), productInformation.getModel(), productInformation.getAge(), productInformation.getBred());
            orderResponsitory.createProduct(productInformation.getUser(), productInformation.getBrand(), productInformation.getType(), productInformation.getVolume(), productInformation.getModel(), productInformation.getAge(), productInformation.getBred());
            return new OrderDto(productInformation.getUser(), true);
        } else {
            return new OrderDto(productInformation.getUser(), false);

        }
    }
}
