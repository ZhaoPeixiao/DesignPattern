package com.peixiao.flyweight;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        WebsiteFactory factory = new WebsiteFactory();

        Website news = factory.getWebsiteCategory("News");
        User tom = new User("Tom");
        news.use(tom);

        Website blog = factory.getWebsiteCategory("Blog");
        blog.use(new User("Jack"));

        Website blog2 = factory.getWebsiteCategory("Blog");
        blog2.use(new User("Smith"));

        Website blog3 = factory.getWebsiteCategory("Blog");
        blog3.use(new User("King"));

        System.out.println(factory.getWebsiteCount());
    }
}
