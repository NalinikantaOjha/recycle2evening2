package com.example.recycle2evening2;

public class view {
    private String proffesion;
    private String age;
    private String compny;
    private int image;

    public view(String proffesion, String age, String compny, int image) {
        this.proffesion = proffesion;
        this.age = age;
        this.compny = compny;
        this.image = image;
    }

    public String getProffesion() {
        return proffesion;
    }

    public String getAge() {
        return age;
    }

    public String getCompny() {
        return compny;
    }

    public int getImage() {
        return image;
    }
}
