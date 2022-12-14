package com.caio.structuralpatterns.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println(message);
    }
}
