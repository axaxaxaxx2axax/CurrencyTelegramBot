package org.example.botsettings;

public class ChatSetting {
    private long chatID;
    private int reminderTime;

    public ChatSetting(long chatID) {
        this.chatID = chatID;
    }

    public long getChatID() {
        return chatID;
    }

    public int getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(int reminderTime) {
        this.reminderTime = reminderTime;
    }
}
