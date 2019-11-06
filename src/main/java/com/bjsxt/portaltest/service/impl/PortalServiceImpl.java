package com.bjsxt.portaltest.service.impl;


import com.bjsxt.portaltest.feign.OrderProvider;
import com.bjsxt.portaltest.feign.StoreProvider;
import com.bjsxt.portaltest.pojo.Orders;
import com.bjsxt.portaltest.pojo.Store;
import com.bjsxt.portaltest.service.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortalServiceImpl implements PortalService {
    @Autowired
    private OrderProvider orderProvider;
    @Autowired
    private StoreProvider storeProvider;


    @Override
    public String savePortal() {
        Orders orders = new Orders();
        orders.setId(2);
        orders.setRemark("裤衩");
        orders.setTotal(200);
        orderProvider.saveOrders(orders);

        Store store = new Store();
        store.setId(1);
        store.setNums(1);
        storeProvider.updateStore(store);
        return orders.getId()+""+store.getNums();
    }
}
