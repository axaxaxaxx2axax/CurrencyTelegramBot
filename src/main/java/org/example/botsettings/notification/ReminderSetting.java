package org.example.botsettings.notification;

import org.example.botsettings.ChatRegistry;
import org.example.botsettings.ChatSetting;

public class ReminderSetting {
    protected static final String COMMAND_NAME = "/SetReminder";
    protected static final String BUTTON_TEXT = "Час сповіщень";

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public static String getButtonText() {
        return BUTTON_TEXT;
    }

    public void setReminderTime(ChatSetting chatSetting, ChatRegistry chatRegistry, int reminderTime) {
        chatSetting.setReminderTime(reminderTime);
        chatRegistry.addChat(chatSetting.getChatID(), chatSetting);
    }
}
