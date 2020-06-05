package com.example.grad_project.Manager.listener;

import com.example.grad_project.Item.Post;

public interface OnPostChangedListener {
    public void onObjectChanged(Post obj);

    public void onError(String errorText);
}
