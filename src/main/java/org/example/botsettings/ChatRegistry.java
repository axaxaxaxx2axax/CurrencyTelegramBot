package org.example.botsettings;

import java.util.List;

public interface ChatRegistry {
    boolean isChatRegistered(long chatID);
    void addChat(long chatID, ChatSetting chatSetting);
    void removeChat(long chatID);
    ChatSetting getSetting(long chatID);
    List<ChatSetting> getListOfSettings();
}
