package com.caio.structuralpatterns.proxy;

public class TwitterDemo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline(""));

        service.postToTimeline("screen","some message that  shouldn't go");
    }
}
