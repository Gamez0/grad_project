package com.example.grad_project.Manager.listener;

import com.example.grad_project.Item.PostListResult;

public interface OnPostListChangedListener<Post> {

    public void onListChanged(PostListResult result);

    void onCanceled(String message);
}
