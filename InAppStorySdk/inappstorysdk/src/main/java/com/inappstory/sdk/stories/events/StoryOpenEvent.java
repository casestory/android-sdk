package com.inappstory.sdk.stories.events;

/**
 * Created by Paperrose on 15.06.2018.
 */

public class StoryOpenEvent {


    public int getStoryId() {
        return storyId;
    }

    public int storyId;

    public StoryOpenEvent(int storyId) {
        this.storyId = storyId;
    }


}
