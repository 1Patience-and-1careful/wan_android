package com.chinalwb.wanandroid.main.presenter;

import com.chinalwb.wanandroid.base.BasePresenter;
import com.chinalwb.wanandroid.base.BaseView;
import com.chinalwb.wanandroid.main.model.Article;

import java.util.List;

public interface ArticlesContract {

    interface Presenter extends BasePresenter {
        void loadArticles(int page);
        void loadNextPageArticles();
        void refreshArticles();
    }

    interface View extends BaseView<Presenter> {
        void appendArticles(List<Article> articleList);
        void showArticles(List<Article> articleList);
        void showLoading();
        void hideLoading();
    }

}
