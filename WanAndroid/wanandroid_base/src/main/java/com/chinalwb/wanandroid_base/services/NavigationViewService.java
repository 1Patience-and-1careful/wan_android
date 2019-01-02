package com.chinalwb.wanandroid_base.services;

import java.util.ArrayList;
import java.util.List;

public class NavigationViewService implements INavigationViewService {

    private NavigationViewService() {
        // Private Inner Constructor
    }

    public static NavigationViewService getInstance() {
        return Inner.navigationViewService;
    }

    private static class Inner {
        private static NavigationViewService navigationViewService = new NavigationViewService();
    }

    private List<NavigationViewItem> navigationViewItemList = new ArrayList<>();

    @Override
    public List<NavigationViewItem> getNavigationViewItemList() {
        return navigationViewItemList;
    }
}
