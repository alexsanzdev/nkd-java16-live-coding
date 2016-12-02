package live_coding.lambda;

import java.awt.event.ActionListener;

public class Button {

    private ActionListener actionListener;

    public void push() {
        actionListener.actionPerformed(null);
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
}
