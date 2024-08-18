package com.group.libraryapp.dto.user.request;

// PUT /user API의 HTTP Body를 위한 새로운 클래스
public class UserUpdateRequest {

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

