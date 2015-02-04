package com.example.android.wifidirect.discovery;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

/**
 * Created by Stefano Cappa on 04/02/15.
 */
public class ServiceList {

    @Getter
    private List<WiFiP2pService> serviceList;

    private static ServiceList instance = new ServiceList();

    /**
     * Metodo che permette di ottenere l'istanza della classe.
     *
     * @return istanza della classe.
     */
    public static ServiceList getInstance() {
        return instance;
    }

    private ServiceList() {
        serviceList = new ArrayList<>();
    }

}
