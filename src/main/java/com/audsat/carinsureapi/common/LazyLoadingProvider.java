package com.audsat.carinsureapi.common;

import org.hibernate.proxy.HibernateProxy;
import org.modelmapper.Provider;

public class LazyLoadingProvider implements Provider<Object> {

    @Override
    public Object get(ProvisionRequest<Object> request) {

        if (request.getSource() instanceof HibernateProxy)
            return ((HibernateProxy) request.getSource()).getHibernateLazyInitializer().getImplementation();

        return null;
    }
}