package org.example.botsettings;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

public class CustomCommand {
    protected final String customCommandName;
    protected final String customParentCommandName;
    protected String customButtonText;
    protected String customCommandResultText;

    public CustomCommand(String customCommandName, String customParentCommandName, String customButtonText, String customCommandResultText) {
        this.customCommandName = customCommandName;
        this.customParentCommandName = customParentCommandName;
        this.customButtonText = customButtonText;
        this.customCommandResultText = customCommandResultText;
    }

    public String getCustomParentCommandName() {
        return customParentCommandName;
    }

    public boolean canExecuteCustom(String commandName) {
        return this.customCommandName.equalsIgnoreCase(commandName);
    }

    public InlineKeyboardButton getCustomButton() {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(customButtonText);
        button.setCallbackData(customCommandName);
        return button;
    }
}
