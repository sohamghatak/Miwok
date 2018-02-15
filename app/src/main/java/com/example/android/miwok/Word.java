package com.example.android.miwok;

/**
 * Created by ghataks on 10/26/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceID;
    public static final int NO_IMAGE_SET = -1;
    private int mImageResourceId = NO_IMAGE_SET;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    //Method to return default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Method to return miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;

    }

    //Method to return Image resource ID
    public int getImageResourceID() {
        return mImageResourceId;
    }

    //Check if there is an image resource ID present
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_SET;
    }

    //Return audio resource ID
    public int getAudioResourceID() {
        return mAudioResourceID;
    }
}
