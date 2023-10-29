package org.example.botsettings.notification;

import org.example.botsettings.ChatRegistry;
import org.example.botsettings.ChatSetting;

public class ReminderNotification {
    protected static final String COMMAND_PREFIX = "/SetRemNot";
    protected  static final String PARENT_COMMAND = ReminderSetting.COMMAND_NAME;
    private final int reminderHour;

    public ReminderNotification(int reminderHour) {
        this.reminderHour = reminderHour;
    }

    public String getCommandName() {
        return COMMAND_PREFIX + reminderHour;
    }

    public String getButtonText() {
        return String.valueOf(reminderHour);
    }

    public String getCommandResultText() {
        return "Ваш час сповіщень - " + reminderHour + " година";
    }

    public void setSetting(ChatSetting chatSetting, ChatRegistry chatRegistry) {
        chatSetting.setReminderTime(reminderHour);
        chatRegistry.addChat(chatSetting.getChatID(), chatSetting);
    }
}
