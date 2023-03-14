package com.switchfully.petinder;

public class Pet {
    private int id;
    private String name;
    private Kind kind;
    private String profileText;

    public Pet(int id) {
        this.id = id;
        this.name = "test";
        this.kind = Kind.CHICKEN;
        this.profileText = "testPROFILE";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
        return kind;
    }

    public String getProfileText() {
        return profileText;
    }
}
