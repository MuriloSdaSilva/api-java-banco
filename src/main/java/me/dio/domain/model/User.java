package me.dio.domain.model;

import java.util.ArrayList;

public class User {
    private long id;
    private String name;
    private me.dio.domain.model.Account account;
    private ArrayList<me.dio.domain.model.Feature> features;
    private me.dio.domain.model.Card card;
    private ArrayList<me.dio.domain.model.News> news;

    public User(long id, String name, me.dio.domain.model.Account account, ArrayList<me.dio.domain.model.Feature> features, me.dio.domain.model.Card card, ArrayList<me.dio.domain.model.News> news) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.features = features;
        this.card = card;
        this.news = news;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public me.dio.domain.model.Account getAccount() {
        return account;
    }

    public void setAccount(me.dio.domain.model.Account account) {
        this.account = account;
    }

    public ArrayList<me.dio.domain.model.Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<me.dio.domain.model.Feature> features) {
        this.features = features;
    }

    public me.dio.domain.model.Card getCard() {
        return card;
    }

    public void setCard(me.dio.domain.model.Card card) {
        this.card = card;
    }

    public ArrayList<me.dio.domain.model.News> getNews() {
        return news;
    }

    public void setNews(ArrayList<me.dio.domain.model.News> news) {
        this.news = news;
    }
}
