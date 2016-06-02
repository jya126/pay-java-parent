package in.egan.pay.common.bean.outbuilder;

import in.egan.pay.common.bean.PayOutMessage;

/**
 * @author egan
 * @email egzosn@gmail.com
 * @date 2016-6-1 11:40:30
 */
public class TextBuilder extends BaseBuilder<TextBuilder, PayTextOutMessage> {
    private String content;

    public TextBuilder content(String content) {
        this.content = content;
        return this;
    }

    @Override
    public PayTextOutMessage build() {
        PayTextOutMessage message = new PayTextOutMessage();
        setCommon(message);
        message.setContent(content);
        return message;
    }
}
